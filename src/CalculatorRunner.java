import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, or ^: ");
        String expression = input.nextLine();
        Calculator calc = new Calculator(expression);

        calc.calculate();
    }
}