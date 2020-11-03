import java.util.Scanner;

public class ThreeEvenOrOdd {
    /*

      ThreeEvenOdd
threeEvenOrOdd  isminde int Array parametre alan bir metod yazınız. Bu metod kendisine
gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
false göndersin.

Örnek:

 intArray([2, 1, 3, 5]) sonuc  true olmalı
 intArray([2, 1, 2, 5]) sonuc   false olmalı
 intArray([2, 4, 2, 5]) sonuc   true olmalı

       */
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Sayilari aralarinda bosluk birakarak giriniz: ");
        String strSayi=sc.nextLine();

        String [] strDizi= strSayi.split(" ");
        int[] intDizi=new int[strDizi.length];

        for(int i=0; i<strDizi.length;i++){

            intDizi[i]=Integer.parseInt(strDizi[i]);

        }

        System.out.println(threeEvenOrOdd(intDizi));
    }

    public static boolean threeEvenOrOdd(int[] array){

        int tekSayi=0;
        int ciftSayi=0;
        for(int i=0; i<array.length;i++){

            if(array[i]%2==0)
                ciftSayi+=1;
            else tekSayi+=1;

        }
        System.out.println(ciftSayi);
        System.out.println(tekSayi);

        if ((ciftSayi==3)||(tekSayi==3))
          return   true;
        else return false;


    }

}
