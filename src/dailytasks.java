import java.util.ArrayList;
import java.util.Scanner;
public class dailytasks
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> isCompleted = new ArrayList<>();

        // Örnek görevler ve tamamlanma bilgileri
        tasks.add("Alışveriş yap");
        isCompleted.add(false);

        tasks.add("E-postaları kontrol et");
        isCompleted.add(false);

        tasks.add("Kitap oku");
        isCompleted.add(false);

        // Görevleri listeleme
        System.out.println("\nGörevler:");
        System.out.println("----------");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i) + " - Tamamlandı: " + isCompleted.get(i));
        }

        // Görev güncelleme ve tamamlanan görevleri silme
        while (true) {
            System.out.print("\nGüncellemek istediğiniz görevin numarasını girin (0 çıkış): ");
            int taskNumber = scanner.nextInt();

            if (taskNumber == 0) {
                break;
            }

            // Görevi listeden silme
            tasks.remove(taskNumber - 1);
            isCompleted.remove(taskNumber - 1);

            // Görevleri listeleme
            System.out.println("\nGüncellenen Görevler:");
            System.out.println("---------------------");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i) + " - Tamamlandı: " + isCompleted.get(i));
            }
        }

        scanner.close();
    }
}