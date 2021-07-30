package test;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddingDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String first = sc.next();
    String second = sc.next();
    SimpleDateFormat sdf = SimpleDateFormat("dd/MM/yyyy");
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
        c1.setTime(sdf.parse(first));
        c2.setTime(sdf.parse(second));
        c1.add(Calendar.DATE, c2.get(Calendar.DATE));
        c1.add(Calendar.MONTH, c2.get(Calendar.MONTH));
        c1.add(Calendar.YEAR, c2.get(Calendar.YEAR));
    String newDate = sdf.format(c1.get);
}
}
