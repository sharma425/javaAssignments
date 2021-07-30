package com.company.test;

class MyThread extends Thread{
    @Override
    public void run(){
        int i= 0;
        while (i<4){
            System.out.println("My thread is running "+i);
            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i= 0;
        while (i<4){
            System.out.println("My thread2 is running "+i+10000000);
            System.out.println("i am sad");i++;
        }
    }
}
public class Multithread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());


    }
}
