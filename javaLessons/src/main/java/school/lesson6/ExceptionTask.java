package school.lesson6;

import static school.lesson6.ArrayMethod.arrMethod;

public class ExceptionTask {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"3", "2", "3", "4"},
                {"2", "2", "2", "3"},
                {"1", "2", "1", "2"},
                {"1", "%%%%", "2", "2"},
//                uncomment below to throw MyArraySizeException();
//                {"2", "2", "2", "2"},
        };
        try {
            try {
                int result = arrMethod(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Incorrect array size!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Incorrect array value!");
            System.out.println("Mistake is located in cell: " + e.a + "x" + e.b);
        }

    }

}
