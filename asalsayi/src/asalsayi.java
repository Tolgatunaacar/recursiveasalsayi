import java.util.Scanner;

public class asalsayi {
    static void asal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
        asal();
    }

    public static void main(String[] args) {
        asal();
    }
}
