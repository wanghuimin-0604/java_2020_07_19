package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-19
 * Time:13:09
 * 一万年太久，只争朝夕，加油
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入商人的
        String have=sc.nextLine();
        //输入小红的
        String need=sc.nextLine();

        Map<Character,Integer> havaMap=new HashMap<>();
        Map<Character,Integer> needMap=new HashMap<>();
        //统计商人的
        for(char c: have.toCharArray()){
            if(havaMap.containsKey(c)){
                //表中已经存在的话，就让这个字符的数量+1
                havaMap.put(c,havaMap.get(c)+1);
            }else{
                havaMap.put(c,1);
            }
        }
        //统计用户的
        for(char c:need.toCharArray()){
            if(needMap.containsKey(c)){
                needMap.put(c,needMap.get(c)+1);
            }else{
                needMap.put(c,1);
            }
        }
        //进行比较
        boolean flag=true;
        int lack=0;
        for(Map.Entry<Character,Integer> entry:needMap.entrySet()){
            char c=entry.getKey();
            int amount=entry.getValue();

            if(havaMap.containsKey(c)&&havaMap.get(c)<amount){
                flag=false;
                //数量不够，要计算差多少
                lack+=amount-havaMap.get(c);
            }else if(!havaMap.containsKey(c)){
                flag=false;
                //没有这个珠子，也要计算差多少
                lack+=amount;
            }
        }
        if(flag){
            //能买下的话，要输出多余多少珠子
            System.out.println("Yes "+(have.length()-need.length()));
        }else{
            //不能买的话，要输出差多少珠子
            System.out.println("No "+lack);
        }




    }
}
