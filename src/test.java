import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int a,b,c;
        Scanner alıcı =new Scanner(System.in);
        System.out.print("Birinci kenarını giriniz : ");
        a = alıcı.nextInt();
        System.out.print("İkinci kenarını giriniz : ");
        b = alıcı.nextInt();
        System.out.print("İkinci kenarını giriniz : ");
        c = alıcı.nextInt();
        int alan = (a+b+c)/2;
        System.out.println("Üçgenin alanı : "+ alan);

    }
}
