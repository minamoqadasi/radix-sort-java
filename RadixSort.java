import java.util.*;

public class RadixSort {

  public static void sortNames(String[] names) {
    int maxLength = 0;
    for (String name : names) {
      if (name.length() > maxLength) {
                maxLength = name.length();
      }
    }

    for (int i = 0; i < names.length; i++) {
            while (names[i].length() < maxLength) {
                names[i] += " ";
            }
        }

        for (int pos = maxLength - 1; pos >= 0; pos--) {

            List<Queue<String>> bins = new ArrayList<>();
            for (int i = 0; i < 27; i++) {
                bins.add(new LinkedList<>());
            }

            for (String name : names) {
                char letter = name.charAt(pos);
                int index = getBinIndex(letter);
                bins.get(index).add(name);
            }

            int i = 0;
            for (Queue<String> bin : bins) {
                while (!bin.isEmpty()) {
                    names[i++] = bin.poll();
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
        }
    }

    private static int getBinIndex(char c) {
        if (c == ' ') return 0;
        return Character.toLowerCase(c) - 'a' + 1;
  }

}
