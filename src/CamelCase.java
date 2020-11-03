import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Soru 1:
CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.

            Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel
         */

        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(camelcase(text));

    }
    public static String  camelcase(String str){

        String [] kelimeler=str.split(" ");
        String mesaj="";

        for (int i = 0; i < kelimeler.length; i++) {

            kelimeler[i]=kelimeler[i].substring(0,1).toUpperCase()+kelimeler[i].substring(1);

        }

        for (int i = 0; i < kelimeler.length; i++) {
            mesaj+=kelimeler[i];

            if (i<kelimeler.length-1)
                mesaj+=" ";
        }

        return mesaj;
    }
}
