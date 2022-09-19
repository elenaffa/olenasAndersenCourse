package school.lesson2;

public class ArraysTask {
    public static void main(String[] args) {
        change0and1InArray();
        System.out.println("\n");
        fillOutArray();
        System.out.println("\n");
        multiplyBy2ifLessThan6();
        System.out.println("\n");
        fillDiagonal();
    }

    // Array task 1: change 1 to 0, 0 to 1
    public static void change0and1InArray() {
        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < firstArr.length; i++) {
            String invertedArray = (firstArr[i] == 0) ? "1" : "0";
            System.out.print(invertedArray + ", ");
        }
    }

    /*
     Array task 2:
     Задать пустой целочисленный массив длиной 100.
     С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void fillOutArray() {
        int[] secondArr = new int[100];
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = i + 1;
            System.out.print(secondArr[i] + " ");
        }
    }

    /* Array task 3:
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void multiplyBy2ifLessThan6() {
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < thirdArr.length; i++) {
            if (thirdArr[i] < 6) {
                thirdArr[i] = thirdArr[i] * 2;
            }
            System.out.print(thirdArr[i] + ", ");
        }
    }


    /* Array task 4:
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void fillDiagonal() {
        int[][] fourthArr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    fourthArr[i][j] = 1;
                }
                System.out.print(fourthArr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}


