/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Mảng
        String hoTen[] = new String[5];
        System.out.println("Độ dài: " + hoTen.length);
        for (int i = 0; i < hoTen.length; i++) {
            System.out.printf("Nhập họ tên [%d]= ", i);
            hoTen[i] = sc.nextLine();
        }
        for (int i = 0; i < hoTen.length; i++) {
            System.out.println("Tôi tên là: " + hoTen[i]);
        }
        System.out.println("Danh sách: " + Arrays.toString(hoTen));
        int tuoi[] = {21, 18, 25, 10, 9};
        int index = Arrays.binarySearch(tuoi, 18);
        System.out.println("Tìm vị trí tuổi 18= "+ index);
        //Sắp xếp tăng dần
        Arrays.sort(tuoi);
        for (int x : tuoi) {
            System.out.println("tuổi = " + x);
        }
        //phải sắp xếp trước khi dùng binarySearch
        int index2 = Arrays.binarySearch(tuoi, 18);
        System.out.println("Tìm vị trí tuổi 18= "+ index2);

    }
}
