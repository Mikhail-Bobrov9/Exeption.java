package Habr;

public class Eight {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
            } catch (Exception e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}
