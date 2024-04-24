import java.util.ArrayList;
import java.util.Scanner;
public class assay {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> firstnames = new ArrayList<>();
        ArrayList<String> lastnames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();


        usernames.add("user1");
        emails.add("user1@example.com");
        firstnames.add("User");
        lastnames.add("One");
        passwords.add("password1");

        usernames.add("user2");
        emails.add("user2@example.com");
        firstnames.add("User");
        lastnames.add("Two");
        passwords.add("password2");


        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();


        boolean isLoggedIn = false;
        for (int i = 0; i < usernames.size(); i++)
        {
            if (usernames.get(i).equals(inputUsername) && passwords.get(i).equals(inputPassword))
            {
                isLoggedIn = true;
                break;
            }
        }


        if (isLoggedIn)
        {
            System.out.println("Giriş başarılı. Hoş geldiniz, " + inputUsername + "!");
        }
        else
        {
            System.out.println("Giriş bilgileri hatalı.");
        }

    }
}