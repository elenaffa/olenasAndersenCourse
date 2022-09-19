package school.lesson2;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println(isNumberNegative(-9));
    }

    public static boolean isNumberNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
