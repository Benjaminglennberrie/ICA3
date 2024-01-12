import java.util.Random;

public class BinaryCounter {

    public static void main(String[] args) {

        // Create an array with a size of 52 like a deck of cards
        int[] myArray = new int[8];

        // Populate the array with numbers from 1 to 52
        for (int i = 0; i < myArray.length; i++) {

            Random random = new Random();

            // Generate a random number that is either 0 or 1
            int randomNumber = random.nextInt(2);
            myArray[i] = randomNumber;

        }

        // Print the array
        System.out.print("\nArray elements: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        int i = 0;

        while (i <= myArray.length-1 && myArray[i] == 1) {
                myArray[i] = 0;
            i++;
        }
        if (i < myArray.length-1) {;
            myArray[i] = 1;
        }

        // Print the array
        System.out.print("\nArray elements: ");
        for ( i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

  }

}
