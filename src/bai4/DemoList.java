/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HuyenNK
 */
public class DemoList {
    /*
    List là 1 interface trong Java
    List Interface trong Java kế thừa Collection và nó cung cấp các 
    phương thức để thao tác với các phần từ trong mảng
    */
    public static void main(String[] args) {
        // List: Có định kiểu - Không định kiểu

        // List Không định kiểu
        //1. Khởi tạo
        List listKDK = new ArrayList(); //để sửa tên biến => bôi đen+ Ctrl +R
        // 2. Gán giá trị với phương thức add()
        listKDK.add("FPT"); //String
        listKDK.add(1);//int
        listKDK.add(true);//boolean

        // List Có định kiểu: Integer
        List <Integer> listCĐKInt = new ArrayList<Integer>();
        listCĐKInt.add(9);
        listCĐKInt.add(2);
        listCĐKInt.add(5);
         ArrayList <String> arrListCĐKString = new ArrayList<String>();
        arrListCĐKString.add("huyen");
        
        //3. Truy xuất phần từ trong danh sách với phương thức get(index)
        System.out.println("số lượng phần tử size= "+ listKDK.size());
        //in ra các phần tử trong mảng không định kiểu
        for (int i = 0; i < listKDK.size(); i++) {
            System.out.println(listKDK.get(i));
        }
        //in ra các phần tử trong mảng có định kiểu Integer
        for (int i = 0; i < listCĐKInt.size(); i++) {
            System.out.println(listCĐKInt.get(i));
        }
        //4. Sắp xếp
        Collections.sort(listCĐKInt);// sắp xếp tăng dần
        Collections.reverse(listCĐKInt); //đảo ngược lại arrayList
        System.out.println("sau sắp xếp");
        //for-each: fore+ ctrl+ cach
        for (Integer num : listCĐKInt) {
            System.out.println(num);
        }
        //5. Các phương thức khác
        System.out.println(listCĐKInt.isEmpty());//arrayList có rỗng hay ko?
        
        listCĐKInt.remove(0); //xóa phần tử tại vị trí index
        listCĐKInt.add(0, 7);//chèn phần tử mới vào vị trí index
        listCĐKInt.clear();//xóa hết mảng
        
        for (Integer num : listCĐKInt) {
            System.out.println(num);
        }
        if (listCĐKInt.isEmpty()){
            System.out.println("Danh sách trống");
        }
        
        
    }
}
