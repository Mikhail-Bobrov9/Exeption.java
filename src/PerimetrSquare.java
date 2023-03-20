public class PerimetrSquare {

    public void getPerimetr(String str) throws PerimetrException {

        Square square = new Square();

        try {
            double side = Double.parseDouble(str);
            square.setSide(0);
        } catch (NumberFormatException e) {
            throw new PerimetrException("String is incorrect", e);
        } catch (PerimetrException ex) {
            //ex.printStackTrace();
            System.err.println(ex.getMessage());
        }
    }
}
