/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author HuyenNK
 */
public class DemoFor {
    public static void main(String[] args) {
        //for(khởi tạo; điều kiện; bước nhảy)
        int sum=0;
        for (int i=0; i< 10; i++){
            if(i%2==0){
                sum+=i;
            }
            System.out.println("i= "+i);
            if(i==7){
                break;//ngắt vòng lặp
            }       
        }
        System.out.println("sum= "+sum);
        for(int j=0; j<10; j++){
            if(j%2!=0){
                continue;//thực hiện luôn vòng lặp tiếp theo
            }
            System.out.println("Xin chào "+j);
        }
    }
}
