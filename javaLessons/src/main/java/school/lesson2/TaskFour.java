package school.lesson2;

public class TaskFour {
    public static void main(String[] args) {
        printStringNTimes("Autumn in Poland begins on September 23", 5);
    }

    public static void printStringNTimes(String line, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(line);
        }
    }
}
