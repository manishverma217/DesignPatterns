package com.workspace.src;

public class DeleteCommand implements ICommand{
    @Override
    public void execute() {
        System.out.println("Deleting file !!!");
    }
}
