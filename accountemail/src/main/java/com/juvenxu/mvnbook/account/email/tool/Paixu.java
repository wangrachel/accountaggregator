package com.juvenxu.mvnbook.account.email.tool;

import java.util.Arrays;

/**
 * java排序方法：
 * 1.快速排序方法
 * 冒泡排序：比较O(N2) 数据交换O(N2)
 * 选择排序：比较O(N2) 数据交换O(N)
 * 插入排序：比较O(N2) 复制数据O(N)
 */

public class Paixu {
    public static String kuaiSuPaixu(){
      int  [] arr={9,20,4,3,7,5,100};
        Arrays.sort(arr);//默认为升序排列
//        System.out.println( Arrays.toString(arr));
        return  Arrays.toString(arr);
    }


    public static String maoPao(){
        int  [] arr={9,20,4,3,7,5,100,34,67,43,5,10,200,500,500};
        for (int i=0; i<arr.length-1; i++){
              for(int j=i+1; j<arr.length; j++){
                  if (arr[i]<arr[j]){
                        int temp = arr[j];//降序
                        arr[j]=arr[i];
                        arr[i]=temp;
                  }
              }
        }
        return Arrays.toString(arr);
    }
    public static String xuaZepaixu(){
        int  [] arr={9,20,4,3,7,5,100,34,67,43,5,10,200,500,500};
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
               if(arr[min]<arr[j]){
                   min = j;
               }
            }
            if(min!=i){
                int temp =  arr[i];
                arr[i] = arr[min];
                arr[min]=temp;
            }
        }
        return Arrays.toString(arr);
    }

    public static String chaRuPaixu(){
        int  [] arr={9,20,4,3,7,5,100,34,67,43,5,10,200,500,500};
            for(int i=1;i<arr.length;i++){
                for(int j=i;j>0;j--){
                 if(arr[j]<arr[j-1]){
                    int temp =arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]= temp;
                 }else {
                     break;
                 }
                }
            }
            return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        System.out.println("1.快速排序"+kuaiSuPaixu());
        System.out.println("2.冒泡排序"+maoPao());
        System.out.println("3.选择排序"+xuaZepaixu());
        System.out.println("4.插入排序"+chaRuPaixu());
    }
}
