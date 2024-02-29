import java.util.Scanner;

public class Gameplay {

    public Gameplay() {

    }

    public static void entry() {
        Scanner keyboard = new Scanner(System.in);
        String enterKey;
        boolean loop = true;
        System.out.println(
                "blah blah blah you wake up whatever. Exit and enter the living room.\n\nPress Enter");
        while (loop) {
            enterKey = keyboard.nextLine();
            if (enterKey.isEmpty()) {
                loop = false;
                System.out.println(CenterString("Living Room"));
                printRectangle();
                LivingRoom();
            } else {
                GameStory.newLineLoop();
                System.out.println(
                        "blah blah blah you wake up whatever. Exit and enter the living room.\n\nPress Enter");
                loop = true;
            }
        }
        keyboard.close();
    }

    public static void RoomOptions() {
        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.print(
                    "\nWhere would you like to go?\n" +
                            "1.Living Room\n" +
                            "2.Kitchen\n" +
                            "3.Bathroom" +
                            "\n\nInput: ");
            int choice = keyboard.nextInt();

            switch (choice) {

                case 1:
                    loop = false;
                    GameStory.newLineLoop();
                    System.out.println(CenterString("Living Room"));
                    printRectangle();
                    LivingRoom();
                    break;

                case 2:
                    loop = false;
                    GameStory.newLineLoop();
                    System.out.println(CenterString("Kitchen"));
                    printRectangle();
                    break;

                case 3:
                    loop = false;
                    GameStory.newLineLoop();
                    System.out.println(CenterString("Bathroom"));
                    printRectangle();
                    break;

                default:
                    System.out.println("Not a valid room.");
                    loop = true;

            }
        }
        keyboard.close();

    }

    public static void printRectangle() {
        int height = 5;
        int width = 20;
        for (int i = 1; i <= width; i++)
            System.out.print("*");
        System.out.println();
        for (int j = 1; j <= height - 2; j++) {
            System.out.print("*");

            for (int i = 1; i <= width - 2; i++)
                System.out.print(" ");
            System.out.println("*");

        }

        int w1 = 9;
        String PlayerSpot = "x";
        int padding = (w1 - PlayerSpot.length() / 2);
        String PlayerCentered = String.format("%" + (padding + PlayerSpot.length()) +
                "s", PlayerSpot);
        System.out.println(PlayerCentered);

        for (int i = 1; i <= width; i++)
            System.out.print("*");
        System.out.println();

    }

    public static String CenterString(String location) {
        int w1 = 9;
        int padding = (w1 - location.length() / 2);
        String centeredString = String.format("%" + (padding + location.length()) +
                "s", location);

        return centeredString;
    }

    public static void LivingRoom() {

    }

}