package com.workspace.src;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();

        Scanner input = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int first = input.nextInt();
        System.out.print("Input Second Number : ");
        int second = input.nextInt();
        System.out.println("Action is as follows");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int operation = input.nextInt();
        switch(operation){
            case 1 :
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case 2:
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case 3:
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            default:
                throw new IllegalArgumentException("Invalid Input !!!");
        }
        System.out.println(context.executeStrategy(first , second));
    }
}
