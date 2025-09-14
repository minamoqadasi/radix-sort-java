import java.util.*;

public class RadixSortMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many names would you like to sort? ");
        int size = input.nextInt();
        input.nextLine();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
          System.out.print("Name " + (i + 1) + ": ");
          names[i] = input.nextLine();
        }

        System.out.println("\nBefore sorting: " + Arrays.toString(names));

        RadixSort.sortNames(names);

        System.out.println("After sorting:  " + Arrays.toString(names));
    }
}
