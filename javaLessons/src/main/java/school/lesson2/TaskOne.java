package school.lesson2;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(isSumWithin10To20(2, 11));
    }

    public static boolean isSumWithin10To20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}


