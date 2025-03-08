import java.util.Scanner;

public class TipDonusumu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.println("Girdiğiniz sayı : " + sayi1);

        double ondalikliSayi = sayi1;  //Double'a çevirme işlemi
        System.out.println("Dönüşüm : " + ondalikliSayi);

        scanner.nextLine();

        System.out.println("Ondalıklı bir sayı giriniz : ");
        double sayi2 = scanner.nextDouble();
        System.out.println("Girdiğiniz sayı : " + sayi2);

        int sayi3 = (int) sayi2; //Integer'a çevirme işlemi
        System.out.println("Dönüşüm : " + sayi3);

        scanner.close();








    }
}
