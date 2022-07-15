/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoMath {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
        double a,b,c;
        System.out.println("Nhap a= ");
        a= scanner.nextDouble();
         System.out.println("Nhap b= ");
        b= scanner.nextDouble();
         System.out.println("Nhap c= ");
        c= scanner.nextDouble();
        double delta= Math.pow(b, 2)- 4*a*c; // delta= b^2 -4ac
        System.out.println("detal= "+ delta);
    }
}
