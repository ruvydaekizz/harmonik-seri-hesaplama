import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        //Harmonik ortalama= 1+ (1/2) + (1/3) + (1/4) + ... + (1/n)

        Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int n = scanner.nextInt();

        double result = 0.0;

        for (int i = 1; i <= n; i++) {    // i int yerine double tanımlanmalı yada aşağıdaki gibi yazılmalı
            result += (1.0 / i);         //1.0 yazdık double olarak
        }

        //1.Döngü, i=1; result=0  + (1/1)= 1;
        //2.Döngü, i=2; result=1  + (1/2)= 1.5;  //result toplam sonucu yazdıracağı için 1.5 olur

        System.out.print(result);
    }
}
