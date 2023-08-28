package com.workspace.src;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setCommand("CREATE" , new CreateCommand());
        menu.setCommand("DELETE" , new DeleteCommand());

        menu.runCommand("CREATE");
        menu.runCommand("DELETE");
    }
}
