import java.util.Random;
import java.util.Scanner;

public final class UserInterface {
    private static final Random random = new Random();
    private static int element;
    private static int n;
    private static int m;

    private UserInterface() {
    }

    public static void randomElement(List list) {
        element = list.length() > 1 ? random.nextInt(list.length() - 1) : 0;
    }

    public static void randomN(List list) {

        n = list.length() > 3 ? random.nextInt(list.length() / 2 - 1) : random.nextInt(1);
    }

    public static void randomM(List list) {
        m = list.length() > 3 ? random.nextInt(list.length() / 2 - 1) + list.length() / 2 : random.nextInt(1);
    }

    public static void userMenu() {
        clearScreen();
        System.out.println("----------------====| MENU |====----------------");
        System.out.println("01. Generate new list");
        System.out.println("02. Print possible student names");
        System.out.println("03. Add first element");
        System.out.println("04. Remove last element");
        System.out.println("05. Get student number " + element);
        System.out.println("06. Change student number " + element);
        System.out.println("07. List length");
        System.out.println("08. Get last element");
        System.out.println("09. Get previous element of " + element);
        System.out.println("10. Cut new list from " + n + " to " + m);
        System.out.println("11. High achiever and sport students");
        System.out.println("00: Exit");

    }

    public static int choice() {
        System.out.print("\nMake your choise: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        return i;
    }

    private static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public static String allStudentNames() {
        String names = "";
        for (int i = 1; i <= Names.values().length; i++) {
            names += Names.values()[i - 1];
            names += i % 5 == 0 ? "\n" : ", ";
        }
        return names;
    }

    public static int getElement() {
        return element;
    }

    public static int getN() {
        return n;
    }

    public static int getM() {
        return m;
    }
}
