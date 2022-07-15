/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoIfElse {

    //psvm+TAB
    public static void main(String[] args) {

        int a = 4;
        int b = 9;
        int min = a > b ? b : a;
        System.out.println("min= " + min);
        boolean test = !(a > b);
        System.out.println("test= " + test);
        /*
        if (điều kiện){
            <câu lệnh => công việc 1>
        }else{
            <câu lệnh => công việc 2>
        }
         */
        //nhập vào số dương => tính căn bậc 2

        try {
            Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner
            System.out.println("Nhập vào số dương: "); //sout+TAB
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Đây là số dương");
                double result = Math.sqrt(number); //kết quả
                System.out.println("Căn bậc 2 của " + number + " là " + result);
            } else {
                System.out.println("Không phải số dương");
            }
        } catch (Exception ex) {
            System.out.println("Bạn phải nhập số dương!");
        }
        /*
        try{
        
        }catch(){
        }
         */
        
        
    }
}
