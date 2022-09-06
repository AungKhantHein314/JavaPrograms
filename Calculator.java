import java.math.BigDecimal;

public class Calculator {
    BigDecimal num1;
    String condition;
    BigDecimal num2;

    Calculator(BigDecimal num1, String condition, BigDecimal num2) {
        this.num1 = num1;
        this.condition = condition;
        this.num2 = num2;
        calculate(this.num1, this.num2);
    }

    public static void main(String[] args) {
        try {
            new BigDecimal(args[0]);
            new BigDecimal(args[args.length-1]);
        } catch (Exception e) {
            System.out.println("Please Enter Numbers in only number format (eg. 1.1 + 2)");
            System.exit(0);
        }

        try {
            new Calculator(new BigDecimal(args[0]), args[1], new BigDecimal(args[2]));
        } catch (Exception e) {
            new Calculator(new BigDecimal(args[0]), "*", new BigDecimal(args[args.length - 1]));
        }
    }

    public void calculate(BigDecimal num1, BigDecimal num2) {
        switch (this.condition) {
            case "+":
                System.out.println("Result: " + num1.add(num2));
                break;
            case "-":
                System.out.println("Result: " + num1.subtract(num2));
                break;
            case "*":
                System.out.println("Result: " + num1.multiply(num2));
                break;
            case "/":
                System.out.println("Result: " + num1.divide(num2));
                break;
            default:
                System.out.println("Enter condition only one of (+, -, *, /)");
        }
    }
}
