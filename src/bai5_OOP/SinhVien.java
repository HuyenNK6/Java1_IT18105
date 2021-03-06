/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
/*
        - Tạo ra 1 Class (Lớp) đối tượng sinh viên
        - Tên đối tượng phải viết hoa toàn bộ các chữ cái đầu tiên từng từ
 */
public class SinhVien {

    //1. Liệt kê các thuộc tính (thông tin) mà đối tượng cần có
    private String msv; //private các thuộc tính
    private String hoTen;// khi private thì chỉ đc sử dụng trong class
    private String diaChi;
    private int tuoi;
    private String sdt;

    // 2. Constructor: hàm tạo
    /*
    - Constructor: có tên giống vs tên class => public
    - chạy đầu tiên 
    - Nếu khi khởi tạo đối tượng mà đối tượng ko có hàm constructor 
    => thì chương trình sẽ tự động khởi tạo cho đối tượng 1 hàm constructor 
    mặc đinh, đó là Constructor không tham số
     */
    // 2 Constructor 
    //Tự tạo ra= Ctrl+ cách+Enter
    //Constructor không tham số
    public SinhVien() {
    }

    // Constructor có tham số
    //Kích chuột phải + Insert code (Alt+Insert)=> Constructor 
    public SinhVien(String msv, String hoTen, String diaChi, int tuoi, String sdt) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }

    //3. Getter và Setter
    // Vì khi thuộc tính bị private 
    //=> muốn lấy và gán giá trị cho nó thì phải sử dụng Getter và Setter
//Kích chuột phải + Insert code (Alt+Insert)=>  Getter and Setter
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSđt() {
        return sdt;
    }

    public void setSđt(String sdt) {
        this.sdt = sdt;
    }
// chuột phải + Insert COde+ toString() + select All

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", tuoi=" + tuoi + ", s\u0111t=" + sdt + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin: ");
        System.out.print("Nhập mã sinh viên: ");
        msv = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập sđt: ");
        sdt = sc.nextLine();
    }
    public void xuat() {
        System.out.println("Thông tin của Sinh Viên");
        System.out.println("MSV: " + msv);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("SĐT: " + sdt);
    }

}
