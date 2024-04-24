import java.util.Scanner;
public class basket
{
    public static void main(String[] args)
    {
        String[] urunAdlari = {"Ürün 1", "Ürün 2", "Ürün 3"};
        double[] urunFiyatlari = {10.5, 20.0, 15.75};
        int[] sepetMiktarlari = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < urunAdlari.length; i++) {
            System.out.print(urunAdlari[i] + " ürününden kaç tane eklemek istiyorsunuz? ");
            sepetMiktarlari[i] = scanner.nextInt();
        }

        System.out.println("Sepetinizdeki Ürünler:");
        for (int i = 0; i < urunAdlari.length; i++) {
            double toplamFiyat = urunFiyatlari[i] * sepetMiktarlari[i];
            System.out.println(urunAdlari[i] + " - " + sepetMiktarlari[i] + " adet - Toplam Fiyat: " + toplamFiyat + " " + "TL");
        }
    }
}