import java.util.Arrays;

public class UpdateRange {
    /*
UpdateRange
URange isminde bir metod yazınız,
Bu metod parametre olarak int Array ve 2 adet int almalı.
Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

Örnek:

int array = 1,6,12,15,22,18,30,16

int 1 = 10

int 2 = 20

sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.


10 ve 20 dahil degil
 */
    public static void main(String[] args) {

        int[] array= {1,6,12,15,22,18,30,16};

        int sayi1=10;
        int sayi2=20;

        System.out.println(Arrays.toString(URange(array,sayi1,sayi2)));

    }

    public static int[] URange(int[] dizi, int s1,int s2){

        for(int i=0; i<dizi.length;i++){

          if ((dizi[i]>s1) && (dizi[i]<s2))
              dizi[i]=-1;
        }
        return dizi;


    }
}
