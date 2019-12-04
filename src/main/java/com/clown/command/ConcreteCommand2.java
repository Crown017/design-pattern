package com.clown.command;

public class ConcreteCommand2 implements Command{
    @Override
    public void execute() {
        System.out.println("执行 Command 2");
    }
}
