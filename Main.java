package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(in);
        int a= scanner.nextInt();
        int[] arr=new int[a];


        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
            if (arr[i]%2==1){
                sum+=arr[i];
            }
        }
        System.out.println(sum);

    }
}
