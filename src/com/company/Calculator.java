package com.company;

public class Calculator {
    public static String ExpRPN(String Exp){
        String current="";
        return null;
    }

    public static double RPNAnsw(String rpn){
        return 0;
    }

    private int getP(char token){
        if(token=='*'|| token =='/')return 3;
        else if (token == '+' || token =='-' )return 2;
        else if( token == '(')return 1;
        else if (token == ')')return -1;
        else return 0;
    }
}
