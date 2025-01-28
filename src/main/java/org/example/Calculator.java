package org.example;

public class Calculator {

    public static void main(String[] args){
        System.out.println(add(5,1));
        System.out.println(subtract(5,1));
        System.out.println(divide(13,0));
        System.out.println(multiply(13,5));
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
            return 0;
        }
    }

    public static int multiply(int a, int b){
        return a*b;
    }
}