/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoMangHaiChieu {

    //vna-zvbm-cme
    public static void main(String[] args) {
        //Array int [] a;
        //Mảng 2 chiều:
        // <kiểu dữ liệu> [][] <tên mảng>= new <kiểu dữ liệu>[row][col];
        // row: số hàng
        // col: số cột

        //1. Khởi tạo
        //Mảng 2 chiều gồm 2 hàng 3 cột
        int[][] arr = new int[2][3];
        //2. Gán giá trị
        //Gán hàng số 1 
        arr[0][0] = 5;
        arr[0][1] = 7;
        arr[0][2] = 2;
        //Gán hàng số 2 
        arr[1][0] = 8;
        arr[1][1] = 6;
        arr[1][2] = 3;
        //3. Lấy giá trị
        System.out.println("arr[0][1]= "+ arr[0][1]);
        for (int i = 0; i < 2; i++) {
            //2: số hàng - i: vị trí của hàng
            for (int j = 0; j < 3; j++) {
                //3: số cột - j: vị trí của cột
                System.out.printf("hàng %d | cột %d = ", i,j);
                System.out.println(arr[i][j]);// hàng i cột j
            }
        }
        //in ma trận
        for (int i = 0; i < 2; i++) {
            //2: số hàng - i: vị trí của hàng
            for (int j = 0; j < 3; j++) {
                //3: số cột - j: vị trí của cột
                // \t: tab
                System.out.print(arr[i][j]+"\t");// hàng i cột j
            }
            System.out.println("");
        }
        //ĐB: Cho người dùng tạo mảng 2 chiều
        // người dùng đc nhập số hàng và số cột
        Scanner sc= new Scanner (System.in);
        System.out.print("Nhập số hàng row= ");
        int row= sc.nextInt();
        System.out.print("Nhập số cột cột= ");
        int col= sc.nextInt();
        //khởi tạo
        int [][] arrNumber= new int [row][col];
        //gán giá trị
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //nhập giá trị theo hàng i cột j
                System.out.printf("Nhập [%d][%d]= ",i,j);
                arrNumber [i][j]= sc.nextInt();
            }
        }
        //Xuất dữ liệu
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //nhập giá trị theo hàng i cột j
                System.out.printf("Giá trị [%d][%d] = %d"
                        ,i,j, arrNumber[i][j]);   
                System.out.println("");
            }
        }
    }
}
