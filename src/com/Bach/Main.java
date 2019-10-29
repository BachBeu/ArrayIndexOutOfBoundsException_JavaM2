package com.Bach;

import org.openjsse.sun.security.rsa.RSAUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Nhập chỉ số của một phần tử bất kì: ");
        int x = sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là: " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
