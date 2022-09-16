package lambda;

public class Calculator {
    public static void main(String[] args) {

        MathOperation addition = Integer::sum;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation division = (a, b) -> a/b;

        MathOperation multiplication = (a, b) -> a * b;

        System.out.println(calculate(addition, 150, 10));

        System.out.println(calculate(subtraction, 150, 10));

        System.out.println(calculate(division, 150, 10));

        System.out.println(calculate(multiplication, 150, 10));

        int onScreenNumber = calculate(addition, 5, 2);
        onScreenNumber = calculate(subtraction, onScreenNumber, 3);
        onScreenNumber = calculate(multiplication, onScreenNumber, 7);
        onScreenNumber = calculate(addition, onScreenNumber, 2);
        onScreenNumber = calculate(division, onScreenNumber, 3);
        System.out.println(onScreenNumber);
    }

    private static int calculate(MathOperation mathOperation, int a, int b) {
        return mathOperation.operate(a, b);
    }
}
