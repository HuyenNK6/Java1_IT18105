/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class QLSV {

    public static ArrayList<SinhVien> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhapDanhSach();
        xuatDanhSach();
        tim();
        sua();
        sapXep();
        xuatDanhSach();

    }

    public static void nhapDanhSach() {
        //=> nhap()
        String yesNo;
        do {
            SinhVien sv = new SinhVien(); //khởi tạo 1 đối tượng sv
            sv.nhap();// gọi nhap() để nhập thông tin cho sv
            list.add(sv);// thêm đối tượng sv vào list
            System.out.println("Tiếp tục không?  (Y/N)");
            yesNo = sc.nextLine();
        } while (yesNo.equalsIgnoreCase("Y"));
    }

    public static void xuatDanhSach() {
        //=> xuat()
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }

    public static void tim() {
        //tìm theo họ tên
        System.out.println("Nhập tên cần tìm: ");
        String hoTen = sc.nextLine();

        for (SinhVien sv : list) {
            if (sv.getHoTen().equalsIgnoreCase(hoTen)) {
//                sv.xuat();
                System.out.println(sv.toString());
                break;
            }
        }
    }

    public static void sua() {
        //tìm theo mã sinh viên
        //sửa sđt
        System.out.println("Nhập tên cần sửa: ");
        String msv = sc.nextLine();

        for (SinhVien sv : list) {
            if (sv.getMsv().equalsIgnoreCase(msv)) {
//                sv.xuat();
                System.out.println("Nhập sđt mới: ");
                String sdtMoi = sc.nextLine(); //lấy sđt mới
                sv.setSđt(sdtMoi);//sửa sđt cũ bằng sđt mới
                System.out.println(sv.toString());
            }
        }
    }

    public static void xoa() {
        //tìm theo họ tên
        System.out.println("Nhập tên cần xóa: ");
        String hoTen = sc.nextLine();

        for (SinhVien sv : list) {
            if (sv.getHoTen().equalsIgnoreCase(hoTen)) {
//                sv.xuat();
                list.remove(sv);
                break;//thoát khỏi vòng for
            }
        }

    }

    public static void sapXep() {
        //tìm theo họ tên
        System.out.println("Sắp xếp");
//        Collections.sort(list);//list : Integer, DOuble, String
//        Sử dụng Comparator để so sánh
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());//so sánh họ tên
                //compareTo() => lớp Wrapper: Integer, Double, String,...
//                return o1.getTuoi() > o2.getTuoi() ? 1: -1;
                //kiểu nguyên thủy: int, double => ss > < =
            }
        };
        // =0: o1 = o2
        // >0: o1 > o2
        // <o: o1 < o2
        Collections.sort(list, comp);
    }
}
