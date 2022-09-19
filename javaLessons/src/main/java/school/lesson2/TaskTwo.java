package school.lesson2;

public class TaskTwo {
    public static void main(String[] args) {
        isNumberPositiveOrNegative((-7));
    }

    public static void isNumberPositiveOrNegative(int a) {
        String result = (a >= 0) ? "Положительное число" : "Отрицательное число";
        System.out.println(result);
    }
}
