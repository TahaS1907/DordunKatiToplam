import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi=4;
        int toplam=0;
        while (sayi%2==0 && sayi%4==0){
            System.out.println("Lütfen sayı giriniz:");
            sayi= scanner.nextInt();
            if(sayi%2!=0 && sayi%4!=0){break;}
         else if(sayi%2==0 && sayi%4==0) { toplam+=sayi;}
        }
        System.out.println("Tek sayı veya dördün katı olmayan sayı girildiğinden program sonlandı");
        System.out.println("Toplam:"+toplam);
    }
}