import java.util.Scanner;

public class getPopulations {
    /*
      Soru 2:
getPopulation:
    main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
    countryNames Ülke isimleri
    countryPopulations Ülke nüfusları

  populationOfCountry adında bir metod yaznız.
  Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak

  Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
  göndersin.

    Ornegin;

      countryNames = {"USA" ,"Mexico" ,"Canada"}

      countryPopulations = {100000 , 120000 , 130000}

      str = "Mexico"

      return 120000 olmali

      NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali
       */
    public static void main(String[] args) {

        String[] countryNames = {"USA", "Mexico", "Canada"};

        int[] countryPopulations = {100000, 120000, 130000};

        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();

        System.out.println(populationOfCountry(countryNames, countryPopulations, country));

    }

    public static int populationOfCountry(String[] str, int[] sayilar, String country) {
        int nufus = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i].toLowerCase().contains(country))
                nufus = sayilar[i];

        }

        if (nufus<1) { nufus=-1;}

        return nufus;
    }
}