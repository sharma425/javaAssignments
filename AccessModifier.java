package com.company.test;
class C2{
    public int x= 5;
    protected int y= 45;
    int z =23;
    private int w = 32;
    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        System.out.println("HELLO");
        C2 c = new C2();
        //c.math1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.w);

    }
}
