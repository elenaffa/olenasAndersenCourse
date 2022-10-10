package school.lesson8.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    final HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (book.containsKey(surname)) {
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Number %s added for %s", number, surname));
            } else {
                System.out.println(String.format("Number %s already exists for %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Number %s added for %s", number, surname));
        }
    }

    public List<String> get(String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        } else {
            System.out.println(String.format("No number entry for %s", surname));
            return new ArrayList<>();
        }
    }
}



