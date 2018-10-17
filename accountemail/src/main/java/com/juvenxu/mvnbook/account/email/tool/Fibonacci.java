package com.juvenxu.mvnbook.account.email.tool;

import java.util.Scanner;

public class Fibonacci  {
    private static int fib(int i){
        if (i<2) {
            return 1;
        }
        return fib(i-2)+fib(i-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入数字：");
        int count =sc.nextInt();
        for(int n=0; n<count; n++){
            System.out.print(fib(n)+" ");
        }
    }
}
