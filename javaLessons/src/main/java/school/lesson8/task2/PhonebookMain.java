package school.lesson8.task2;

public class PhonebookMain {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

// adding numbers
        phonebook.add("Kowalski", "+48485726449");
        phonebook.add("Tarnowski", "+48182663948");
        phonebook.add("Pawlowska", "+48675667493");
        phonebook.add("Kowalski", "+48594440667");
        System.out.println("\n");

// getting numbers
        System.out.println(phonebook.get("Kowalski"));
        System.out.println(phonebook.get("Tarnowski"));
        System.out.println(phonebook.get("Pawlowska"));
        System.out.println("\n");

// no such number
        System.out.println(phonebook.get("Pawlenczak"));
        System.out.println("\n");

// existing number
        phonebook.add("Kowalski", "+48485726449");
    }
}




