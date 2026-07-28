public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
