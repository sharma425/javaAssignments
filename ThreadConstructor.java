package com.company.test;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i= 0;
        while(i<4){
            System.out.println("My thread2 is running "+i);
            System.out.println("i am sad");
            i++;
        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("name");
        t1.setPriority(1);
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());

    }
}
