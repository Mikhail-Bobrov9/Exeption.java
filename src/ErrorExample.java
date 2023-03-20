import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {
    private ABC abc = new ABC();

    public void foo() {
        FileInputStream fileInputStream = null;



        try {
           fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }










        /*
        //System.out.println(1/0);
        //int arra[] ={1, 2, 3};
        //arra[5] = 3;
        try {
            abc.show();
            System.out.println(1/0);
        } catch (NullPointerException | ArithmeticException e) {
            //System.err.println("Деление на 0.");
            e.printStackTrace();
        //} catch ( ArithmeticException ex) {
          //  ex.printStackTrace();
        }
*/

    }

}
