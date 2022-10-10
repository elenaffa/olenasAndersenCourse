package school.lesson8.task1;

import java.util.*;

public class ArrayMain {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Oak", "Pine", "Ironwood", "Jute", "Mango Tree",
                "Guava Tree", "Pine", "Jute", "Banana Tree", "Walnut",
                "Ebony", "Mango Tree", "Walnut", "Oak", "Eucalyptus",
                "Ironwood", "Pine", "Eucalyptus", "Bamboo", "Eucalyptus"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Initial array: " + "\n" + words + "\n");
        System.out.println("Unique words: " + "\n" + unique + "\n");
        System.out.println("Frequency of words usage: ");
        for (String key : unique) {
            System.out.println(key + " - " + Collections.frequency(words, key));
        }
    }
}

