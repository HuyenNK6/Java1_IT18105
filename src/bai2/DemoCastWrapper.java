/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author HuyenNK
 */
public class DemoCastWrapper {

    //psvm+TAB
    public static void main(String[] args) {
        int i = 100;
        long l = i;
        double d = l;
        //sout+TAB
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("d= " + d);
        double d2 = 123.456;
        long l2 = (long) d2;
        int i2 = (int) l2;
        System.out.println("d2= " + d2);
        System.out.println("l2= " + l2);
        System.out.println("i2= " + i2);
        //format: Alt+Shift+F

        Integer a = new Integer(2);
        Integer b = 2;
        Integer c = Integer.valueOf(2);
        int num = 2;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("num= " + num);
        int value = a.intValue();
        System.out.println("value= "+a);
    }
}
