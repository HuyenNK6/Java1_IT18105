/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoDoWhile {
    //psvm
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //While
        int i=0;
        while (i<10){
            System.out.println("i= "+i);
            i++;
        }
        //điểm từ 0-10
        //do-while sẽ thực hiện ít nhất 1 lần
        //sau đó mới kiểm tra điều kiện
        double diem=5;
        do{
            System.out.print("Nhập điểm= ");
            diem= sc.nextDouble();
        }while (diem < 0 || diem >10);
        System.out.println("điểm= "+diem);
        sc.nextLine(); // loại bỏ ký tự xuống dòng
        //while (true)
        String maSinhVien;
        while(true){
            System.out.print("Nhập mã sinh viên: ");
            maSinhVien= sc.nextLine();
            
            if(maSinhVien.equalsIgnoreCase("PH29147") ){
                System.out.println("Mã Sinh Viên: "+ maSinhVien);
                break;             
            }
            
        }
        
    }
}
