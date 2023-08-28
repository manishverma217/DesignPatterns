package com.workspace.src;

public class CreateCommand implements ICommand{
    @Override
    public void execute() {
        System.out.println("Creating File !!!");
    }
}
