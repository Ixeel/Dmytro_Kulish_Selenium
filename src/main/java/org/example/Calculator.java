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
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
      return a/b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }
}