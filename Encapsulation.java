package test;

import java.util.Scanner;

class Featur1{
    private int wifiRange ;

    public void setWifiRange(int wifiRange) {
        this.wifiRange = wifiRange;
    }

    public int getWifiRange() {
        return wifiRange;
    }


}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
     Featur1 fe = new Featur1();
     fe.setWifiRange(6);
//     int x = sc.nextInt();
     if(sc.hasNext()){
         int x= sc.nextInt();
         System.out.println(x);
     }

        System.out.println(fe.getWifiRange());
//     fe.getWifiRange();
    }
}
