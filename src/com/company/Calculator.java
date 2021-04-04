package com.company;

import java.util.Stack;

public class Calculator {
    public static String ExpRPN(String Exp) {
        String current = "";
        MyStack<Character> stack = new MyStack<>(20);
;        int priority;
        for (int i = 0; i < Exp.length(); i++) {
            priority = getP(Exp.charAt(i));
            if (priority == 0) current += Exp.charAt(i);
            if (priority == 1) stack.addElementToStack(Exp.charAt(i));
            if (priority > 1) {
                while (!stack.isEmpty()) {
                    if (getP((char) stack.readTop()) >= priority) current += stack.deleteElementFromStack();
                    else break;
                }
                stack.addElementToStack(Exp.charAt(i));
            }
            if (priority == -1) {
                current += ' ';
                while (getP((char) stack.readTop()) != 1) current += stack.deleteElementFromStack();
                stack.deleteElementFromStack();

            }
        }
        while(stack.isEmpty())current+=stack.deleteElementFromStack();

        return current;
}



    public static double RPNAnsw(String rpn){
        return 0;
    }

    private static int getP(char token){
        if(token=='*'|| token =='/')return 3;
        else if (token == '+' || token =='-' )return 2;
        else if( token == '(')return 1;
        else if (token == ')')return -1;
        else return 0;
    }
}
