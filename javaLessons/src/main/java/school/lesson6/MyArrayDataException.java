package school.lesson6;

public class MyArrayDataException extends Exception {

    public int a;
    public int b;

    MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;

    }

}

