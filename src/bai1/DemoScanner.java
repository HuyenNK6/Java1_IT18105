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
public class DemoScanner {
    public static void main(String[] args) {
        //psvm+TAB
        System.out.println("Hello"); //sout+TAB
        //khai báo biến
        //<kiểu dữ liệu> <tên biến> [=giá trị]
        int a1=5;
        int b1=9;
        int c1;
        double d,e;
        // + - * /
        c1= a1+b1;
        System.out.print("A= "+a1);//Cach 1
        System.out.printf("B= %d", b1);//Cach 2
        System.out.println("C= "+c1);// Cach 3
        System.out.println("Bye bye");
        
        Scanner scanner= new Scanner(System.in);// khai báo đối tượng Scanner
        System.out.print("Họ và tên: ");
        String hoTen= scanner.nextLine(); //cho phép nhập 1 dòng từ bàn phím
        System.out.println("Xin chào "+hoTen);
        
        System.out.print("Tuổi: ");
        int tuoi= scanner.nextInt(); //cho phép nhập 1 số nguyên từ bàn phím
        System.out.println(hoTen+ " tuổi "+ tuoi);
      
        
        System.out.print("Cân nặng: ");
        double canNang= scanner.nextDouble(); // số thực từ bàn phím
        System.out.println(hoTen+ " tuổi "+ tuoi + " nặng "+ canNang +"(kg)");
        
        scanner.nextLine();
        System.out.println("Quê Quán: ");
        String address= scanner.next();
        System.out.println(address);
       
        
        
    }
}
