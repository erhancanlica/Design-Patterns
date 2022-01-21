package structural.patterns.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String password) {
        this.isAdmin = false;
        if ("Erhan".equals(user) && "123456".equals(password)) {
            this.isAdmin = true;
        }
        this.commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            commandExecutor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                commandExecutor.runCommand(cmd);
            }
        }
    }
}
