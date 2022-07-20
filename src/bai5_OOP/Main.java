/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.ArrayList;

/**
 *
 * @author HuyenNK
 */
public class Main {

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("PH12345", "Khanh Huyen", "Ha Noi",
                18, "0978462151");
        SinhVien sv2 = new SinhVien();
        sv2.setMsv("PH84512"); //gán giá trị
        sv2.setHoTen("Duc Anh");
        sv2.setDiaChi("Thai Binh");
        sv2.setTuoi(20);
        sv2.setSđt("0154942665");

        System.out.println("Sinh Vien 1: " + sv1);
        System.out.println("Sinh Vien 2: " + sv2.toString());

        SinhVien sv3 = new SinhVien();
        sv3.nhap();
        sv3.xuat();
        //ArrayList chứa các đối tượng Sinh Viên
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(sv1); //thêm các đối tượng SV vào list
        listSinhVien.add(sv2);
        listSinhVien.add(sv3);
        //fore+ ctrl+ cách
        System.out.println("Danh Sách Sinh Viên");
        for (SinhVien sv : listSinhVien) {
//            sv.xuat();
            System.out.println(sv.toString());
        }
        System.out.println("Danh Sách Mã Sinh Viên");
        for (SinhVien sv : listSinhVien) {
            System.out.println(sv.getMsv());
        }
    }
}
