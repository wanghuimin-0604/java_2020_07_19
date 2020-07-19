package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char[] arr=str.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]>='A'&&arr[i]<='Z'){
                    //转换
                    arr[i]=(char)(arr[i]>'E'?(arr[i]-5):(arr[i]+21));
                }
            }
            System.out.println(new String(arr));

        }
    }
}
