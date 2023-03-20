import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        //ErrorExample errEx = new ErrorExample();

        //    errEx.foo();
        PerimetrSquare perimetrSquare = new PerimetrSquare();
        try {
            perimetrSquare.getPerimetr("g");
        } catch (PerimetrException e) {
            e.printStackTrace();
        }


    }


    }

