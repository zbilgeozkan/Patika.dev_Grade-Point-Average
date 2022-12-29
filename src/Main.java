
/* Not Ortalaması Hesaplayan Program

Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
 küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // İlk adım: Değişkenleri tanımla
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Kullanicidan değişkenlerin değeri alınmalı
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
            // System.out.println(mat);

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
            // System.out.println(fizik);

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
            // System.out.println(kimya);

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = inp.nextInt();
            // System.out.println(turkce);

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();
            // System.out.println(tarih);

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();
            // System.out.println(muzik);


        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println("\n Ortalamanız: " + ortalama);

        boolean sonuc = ortalama >= 60;
        String str = sonuc ? "\n Sınıfı Geçtiniz!" : "Sınıfta Kaldınız.";
        System.out.println(str);

    }
}