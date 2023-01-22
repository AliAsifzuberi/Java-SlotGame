import java.util.Random;

public class SlotGame {
    public static void main(String[] args) {
        String[] slotSymbols = {"cherry", "lemon", "orange", "plum", "bell", "bar", "seven", "blank"};
        Random random = new Random();

        System.out.println("Welcome to the Slot Game!");
        System.out.println("Spinning...");

        int firstReel = random.nextInt(slotSymbols.length);
        int secondReel = random.nextInt(slotSymbols.length);
        int thirdReel = random.nextInt(slotSymbols.length);

        System.out.println("Results: " + slotSymbols[firstReel] + " - " + slotSymbols[secondReel] + " - " + slotSymbols[thirdReel]);

        if (firstReel == secondReel && secondReel == thirdReel) {
            System.out.println("Congratulations! You won a jackpot!");
        } else if (firstReel == secondReel || secondReel == thirdReel || firstReel == thirdReel) {
            System.out.println("Congratulations! You won a prize.");
        } else {
            System.out.println("Sorry, try again.");
        }
    }
}
