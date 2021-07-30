package com.company.test;

import java.util.Scanner;

class NegativeRadiusException extends Exception {
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return  "Radius cannot be negativeMessage";
    }
}
public class ExceptionClasses_83 {
    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
        }

    public static void main(String[] args) {
        int r ;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
//        double p = area(r);
        try {
            double ar = area(r);
            System.out.println(ar);
        } catch (NegativeRadiusException e) {
            e.printStackTrace();
        }

    }
}
