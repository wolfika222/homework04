package hu.helixlab;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

/**
 * Created by Hp_Workplace on 2017.04.05..
 */
public class UserRegistry {

    private User[] users;
    private boolean bool = false;

    public UserRegistry() {
        this.users = new User[10];
        users[0] = new User("Béla");
    }

    public void run() {
        int operation = -1;
        while (operation != 0) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adja meg a menüpontot(0-5): ");
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    printAllUser();
                    break;
                case 2:
                    addNewUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    countUser();
                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("nincs ilyen menüpont!");
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("*********************");
        System.out.println("**       Menü      **");
        System.out.println("**Get All User(1)  **");
        System.out.println("**Add new User(2)  **");
        System.out.println("**Update User(3)   **");
        System.out.println("**Delete User(4)   **");
        System.out.println("**Count User(5)    **");
        System.out.println("**Exit(0)          **");
        System.out.println("*********************");
    }

    private void printAllUser() {
        for (int i = 0; i < users.length; ++i) {
            if (users[i] != null) {
                System.out.println(users[i].toString());
            }
        }
    }

    private void addNewUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a felhasználónevet: ");
        String name = scanner.next();
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = new User(name);
                break;
            }
        }
    }

    private void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a user ID-t: ");
        int id = scanner.nextInt();
        for (int i = 0; i < users.length; ++i) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
                System.out.println("User törölve!");
                break;
            } else {
                bool = true;
            }
        }
        if (bool = true) {
            System.out.println("Nincs ilyen ID!");
        }
    }

    private void updateUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy User ID-t: ");
        int id = scanner.nextInt();
        System.out.println("Kérek egy új User-t: ");
        String name = scanner.next();
        for (int i = 0; i < users.length; ++i) {
            if (users[i] != null && users[i].getId() == id) {
                users[i].setUsername(name);
                users[i].setPassword(PasswordGenerator.generatePassword(8));
                break;
            } else {
                bool = true;
            }
        }
        if (bool == true) {
            System.out.println("Nem találtam ilyen ID-ju Usert!");
        }
    }

    private void countUser() {
        int users_number = 0;
        for (int i = 0; i < users.length; ++i) {
            if (users[i] != null) {
                users_number++;
            }
        }
        System.out.println("A userek száma: " + users_number);
    }
}
