import java.util.Scanner;

public class SubtractionSquare {
    /*
SubtractionSquare:
  getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları
  toplayıp çıkan sonucun karesini döndüren bir metod yazınız.

  substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.

  main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de
  getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
  main metodundan yazdırınız.

Örnek:

   int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir

   int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

   3025 + 225 = 3250

   return 3250
   main()
{
   substSquare(5,10);
}

substSquare(int a, int b)
{
  getSumOfSquares(a);
  getSumOfSquares(b);

return int;
}

getSumOfSquares(int a)
{

return int;
}
        */
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        System.out.print("1.sayiyi giriniz: ");
        int sayi1 =sc.nextInt();

        System.out.print("2.sayiyi giriniz: ");
        int sayi2 =sc.nextInt();


        System.out.println(substSquare(sayi1,sayi2));
    }

    public static int substSquare(int s1,int s2){

        int kare1= getSumOfSquares(s1);
        int kare2= getSumOfSquares(s2);

        return kare1+kare2;
    }
    public static int getSumOfSquares(int s1){

        int tplm=0;

        for (int i=1; i<=s1; i ++){

            tplm+=i;

        }
        return tplm*tplm;
    }

}
