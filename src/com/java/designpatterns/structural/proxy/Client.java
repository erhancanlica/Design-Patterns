package com.java.designpatterns.structural.proxy;

public class Client {

    public static void main(String[] args) {
        CommandExecutor executorProxy = new CommandExecutorProxy("Test", "1234");
        try {
            executorProxy.runCommand("ls -ltr");
            executorProxy.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+ e.getMessage());
        }

    }
}
