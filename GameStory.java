import java.util.Scanner;

public class GameStory {

    public GameStory() {
    }

    public static void newLineLoop() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }

    public static void gameDisplay() {
        Scanner keyboard = new Scanner(System.in);
        String start;
        newLineLoop();
        System.out.println("Title here\n\n\tPress / to start.");
        start = keyboard.nextLine();

        if (start.equals("/")) {
            gameStart();
        } else {
            gameDisplay();
        }
        keyboard.close();
    }

    public static void gameStart() {
        newLineLoop();
        boolean loop = true;
        System.out.println(
                "Welcome to [insert game title here]. This is a text-based horror game that will test the limits of your mental state."
                        +
                        "\nExplore every corner and object around you." +
                        "\nYou never know what you may find, or lurks in dark.\nGoodluck.");

        System.out.println("\n\nPress Enter");
        while (loop) {
            Scanner keyboard = new Scanner(System.in);
            String enterKey;
            enterKey = keyboard.nextLine();
            if (enterKey.isEmpty()) {
                gameRun();
                loop = false;
            } else {
                gameStart();
            }
            keyboard.close();
        }
    }

    public static void gameRun() {
        newLineLoop();
        boolean loop = true;
        System.out.println("The year is 2003." +
                "\n\nIt is your first day of highschool." +
                "\nYou find yourself walking down the same path you have come to love and dread for the past seven years, but today you are forced to take a left at the second stop sign."
                +
                "\nNew sights emerge on this unfamiliar street: a tree much too skinny and much too short for your liking, flowers with petals tattered and ruinous from the bugs that chew on them, grass that hangs too far over the pavement and brushes the sides of your shoes as you walk."
                +
                "\nThe air feels heavier here than it ever has before. "
                +
                "\nThe worst offence is approaching you, a building much larger than you are accustumed to. "
                +
                "You walk until you reach the front doors." +
                "\n\nIt's your big day. Open them." +
                "\n\nPress Enter");
        while (loop) {
            Scanner keyboard = new Scanner(System.in);
            String enterKeyPressed;
            String run;
            String hide;
            enterKeyPressed = keyboard.nextLine();
            if (enterKeyPressed.isEmpty()) {
                newLineLoop();
                boolean enterKeyLoop = true;
                while (enterKeyLoop) {
                    newLineLoop();
                    System.out.println("You open the doors and are met with the sea of other unfortunate souls." +
                            "\nSome of them appear to be in groups, some in pairs, and some alone like you are. You feel yourself drowning in all the chatter that floods the halls."
                            +
                            "\nThere are bundles of laughter and smiles around you, but you know that it is a farce, you know that deep down everyone else is just as miserable as you are today."
                            +
                            "\nYou swim through the halls and find your locker, though you have nothing to store in it yet."
                            +
                            "\nYou miss the homely little shelves of your elementary school. "
                            +
                            "\nThe screeching of the school bell brings you back to where you are, and the swarms of other students begin moving."
                            +
                            "\nYou need to find your class." +
                            "\n\nPress Enter");
                    enterKeyPressed = keyboard.nextLine();

                    if (enterKeyPressed.isEmpty()) {
                        newLineLoop();
                        System.out.print(
                                "You roam the baren hallways, the room numbers getting higher and lower in a sequential fashion. You are getting closer to your destination."
                                        + "\nYou feel your legs begin to slow, walking on the linolium floor begins to feel like dragging your ankles through thick and unforgiving mud."
                                        +
                                        "\nThe hall is empty now, you are the last person that needs to find their place."
                                        +
                                        "\nYou find the door to your class left ajar , the sound of only your teachers voice leaking out of the small space. It's quiet."
                                        +
                                        "\nYou grab the door knob, slowly pulling the door towards you and leaning to peek into the class."
                                        +
                                        "\nThere are rows of other students all seated and prepared for the lesson, each space between each desk is equal."
                                        +
                                        "\nIt's perfect." +
                                        "\nThey notice your presence. Each of them with two eyes and two ears, all fixated on you."
                                        + "\nYou are out of place." +
                                        "\nYour heartbeat deafens you."
                                        + "\nThey are all going to start laughing in a minute." +
                                        "\n\nType Run: ");
                        enterKeyLoop = false;
                    } else {
                        enterKeyLoop = true;
                    }

                }

                run = keyboard.nextLine();
                boolean runloop = true;
                while (runloop) {
                    if (run.equalsIgnoreCase("Run")) {
                        newLineLoop();
                        System.out.print(
                                "you bolt from the classroom door, the world becoming a blur as you sprint down the halls of the school."
                                        +
                                        "\nIn your escape from prying eyes you find an empty classroom, the door left open and waiting for your hand. In your desperation you enter, slipping between the rows of desks and chairs.' "
                                        +
                                        "\nYou pause for a moment, your breathe rapid and your heart racing." +
                                        "\nEverything is too cold and too hot all at once, the lights of the classroom too bright and the silence  too deafening. "
                                        +
                                        "\nSuddenly, you are startled by the sound of footsteps. Someone must be looking for you. You're in big trouble. You have to hide."
                                        +
                                        "\n\nType Hide: ");
                        runloop = false;
                        hide = keyboard.nextLine();
                        if (hide.equalsIgnoreCase("Hide")) {
                            gameHide();
                        } else {
                            newLineLoop();
                            System.out.print(
                                    "you bolt from the classroom door, the world becoming a blur as you sprint down the halls of the school."
                                            +
                                            "\nIn your escape from prying eyes you find an empty classroom, the door left open and waiting for your hand. In your desperation you enter, slipping between the rows of desks and chairs.' "
                                            +
                                            "\nYou pause for a moment, your breathe rapid and your heart racing." +
                                            "\nEverything is too cold and too hot all at once, the lights of the classroom too bright and the silence  too deafening. "
                                            +
                                            "\nSuddenly, you are startled by the sound of footsteps. Someone must be looking for you. You're in big trouble. You have to hide."
                                            +
                                            "\n\nType Hide: ");
                            hide = keyboard.nextLine();
                            runloop = true;
                            if (hide.equalsIgnoreCase("Hide")) {
                                gameHide();
                            }
                        }
                    } else {
                        newLineLoop();
                        System.out.print(
                                "You roam the baren hallways, the room numbers getting higher and lower in a sequential fashion. You are getting closer to your destination."
                                        + "\nYou feel your legs begin to slow, walking on the linolium floor begins to feel like dragging your ankles through thick and unforgiving mud."
                                        +
                                        "\nThe hall is empty now, you are the last person that needs to find their place."
                                        +
                                        "\nYou find the door to your class left ajar , the sound of only your teachers voice leaking out of the small space. It's quiet."
                                        +
                                        "\nYou grab the door knob, slowly pulling the door towards you and leaning to peek into the class."
                                        +
                                        "\nThere are rows of other students all seated and prepared for the lesson, each space between each desk is equal."
                                        +
                                        "\nIt's perfect." +
                                        "\nThey notice your presence. Each of them with two eyes and two ears, all fixated on you."
                                        + "\nYou are out of place." +
                                        "\nYour heartbeat deafens you."
                                        + "\nThey are all going to start laughing in a minute." +
                                        "\n\nType Run: ");
                        run = keyboard.nextLine();
                        runloop = true;

                    }

                }
                loop = false;
            } else {
                gameRun();
            }
            keyboard.close();
        }
        

    }

    public static void gameHide() {
        newLineLoop();
        boolean loop = true;
        Scanner keyboard = new Scanner(System.in);
        String enterKeyPressed;
        while (loop) {
            newLineLoop();
            System.out.println("You scan the empty classroom for a place to hide, finding a storage closet. "
                    + "\nFrantically, you run to the door handle and twist."
                    + "\nBefore you even registered that the door was unlocked you had already swung inside the closet and slammed the door shut."
                    + "\nDarkness envelops you, a blanket shielding you from the cold. You let go of a breath you didn’t know you were holding, and begin to feel lightheaded as you start to slow your breathing again."
                    + "\nThe muscles in your legs that had been contracted for so long finally relax, you feel yourself stumble."
                    + "\nYou are met with only the sound of your own heart beating, a slowing metronome grounding you in place."
                    + "\nAs your adrenaline falls, you feel yourself getting fatigued. You sink to the ground, leaning on the shelf behind you for support."
                    + "\nIt has been such a long day already."
                    + "\nYou close your eyes, and gradually feel yourself being pulled into unconsciousness. You fall asleep."
                    + "\n\nPress Enter"

            );
            loop = false;
            enterKeyPressed = keyboard.nextLine();

            if (enterKeyPressed.isEmpty()) {

                Gameplay.entry();

            } else {
                newLineLoop();
                System.out.println("You scan the empty classroom for a place to hide, finding a storage closet. "
                        + "\nFrantically, you run to the door handle and twist."
                        + "\nBefore you even registered that the door was unlocked you had already swung inside the closet and slammed the door shut."
                        + "\nDarkness envelops you, a blanket shielding you from the cold. You let go of a breath you didn’t know you were holding, and begin to feel lightheaded as you start to slow your breathing again."
                        + "\nThe muscles in your legs that had been contracted for so long finally relax, you feel yourself stumble."
                        + "\nYou are met with only the sound of your own heart beating, a slowing metronome grounding you in place."
                        + "\nAs your adrenaline falls, you feel yourself getting fatigued. You sink to the ground, leaning on the shelf behind you for support."
                        + "\nIt has been such a long day already."
                        + "\nYou close your eyes, and gradually feel yourself being pulled into unconsciousness. You fall asleep."
                        + "\n\nPress Enter"

                );
                loop = true;
            }

        }
        keyboard.close();
    }

}
