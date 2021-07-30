package com.company.test;


class MyThreadRun implements Runnable{
    public void run(){
        int i= 0;
        while (i<400){
            System.out.println("My thread1 is running "+i);
            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThreadRun2 implements Runnable{
    public void run(){
        int i= 0;
        while (i<400){
            System.out.println("My thread2 is running "+i);
            System.out.println("i am sad");
            i++;
        }
    }
}

public class ThreadingUsingRunnableInterfase {
    public static void main(String[] args) {
        MyThreadRun bullet1 = new MyThreadRun();
        MyThreadRun2 bullet2 = new MyThreadRun2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        System.out.println(gun1.getPriority());
        System.out.println(gun2.getPriority());
        gun1.start();
        gun2.start();



    }
}
