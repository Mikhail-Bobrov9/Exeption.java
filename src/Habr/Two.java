package Habr;

public class Two {
    public static void main(String[] args) {
        f(null);
    }
    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException ex) {
            f(ex);
        }
    }


}
