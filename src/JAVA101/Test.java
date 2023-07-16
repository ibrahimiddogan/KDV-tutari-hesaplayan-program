package JAVA101;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double tutar ;
        Scanner alici= new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar = alici.nextDouble();
        boolean kosul1= tutar>1000;
        String str = String.valueOf(kosul1? ("KDV li tutarınız"+tutar*0.8):("Kdv'li tutarınız"+tutar*1.8));
        System.out.println(str);
    }
}
