public class Main {
    public static void main(String[] args) {
        int number1 = 40;
        int number2 = 0;
        try {
            if (number2 == 0) {
                throw new MyOwnException("Делить на ноль нельзя!");
            }
            int result = number1 / number2;
            System.out.println("Result: " + result);
            // some code
        } catch (MyOwnException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        }
        finally {
            System.out.println("Done!");
        }
    }
}

class MyOwnException extends RuntimeException {
    public MyOwnException(String message) {
        super(message);
    }
}