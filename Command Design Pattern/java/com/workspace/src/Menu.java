package com.workspace.src;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String,ICommand> menuItems = new HashMap<>();

    public void setCommand(String operation , ICommand command){
        menuItems.put(operation , command);
    }

    public void runCommand(String operation){
        menuItems.get(operation).execute();
    }
}
