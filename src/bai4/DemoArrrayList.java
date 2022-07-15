/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;

/**
 *
 * @author HuyenNK
 */
public class DemoArrrayList {

    /* ArrayList:
    Lớp ArrayList được sử dụng như một mảng động để lưu trữ các phần tử
    ArrayList được tạo với 1 kích cỡ ban đầu.
        - khi thêm và kích cỡ nó bị vượt => collection tự động tăng
        - khi xóa => kích cỡ ArrayList có thể bị giảm
    mảng => kiểu nguyên thủy: int, double
    mảng động => kiểu dữ liệu - lớp wrapper: Integer, Double 
     */
    public static void main(String[] args) {
        // ArrayList: Có định kiểu - Không định kiểu

        // ArrayList Không định kiểu
        //1. Khởi tạo
        ArrayList arrListKDK = new ArrayList();
        // 2. Gán giá trị với phương thức add()
        arrListKDK.add("FPT"); //String
        arrListKDK.add(1);//int
        arrListKDK.add(true);//boolean

        // ArrayList Có định kiểu: Integer
        ArrayList <Integer> arrListCĐKInt = new ArrayList<Integer>();
        arrListCĐKInt.add(1);
        arrListCĐKInt.add(2);
        arrListCĐKInt.add(3);
         ArrayList <String> arrListCĐKString = new ArrayList<String>();
        arrListCĐKString.add("huyen");
        
        //3. Truy xuất phần từ trong danh sách với phương thức get(index)
        System.out.println("số lượng phần tử size= "+ arrListKDK.size());
        //in ra các phần tử trong mảng không định kiểu
        for (int i = 0; i < arrListKDK.size(); i++) {
            System.out.println(arrListKDK.get(i));
        }
        //in ra các phần tử trong mảng có định kiểu Integer
        for (int i = 0; i < arrListCĐKInt.size(); i++) {
            System.out.println(arrListCĐKInt.get(i));
        }
    }
}
