public class Calculator {
    private String expression;
    private double firstNum;
    private double secondNum;
    private String operation;
    private String result;

    public Calculator(String expression){
        this.expression = expression;
        firstNum = Double.parseDouble(expression.substring(0,expression.indexOf(" ")));
        secondNum = Double.parseDouble(expression.substring(expression.indexOf(" " + 2)));
        operation = expression.substring(expression.indexOf(" ")+1,expression.indexOf(" ")+2);
    }

    public void calculate() {
        if (operation.equals("+")) {
            System.out.println(add());
        }
        if (operation.equals("-")) {
            System.out.println(subtract());
        }
        if (operation.equals("*")) {
            System.out.println(multiply());
        }
        if (operation.equals("/")) {
            System.out.println(divide());
        }
        if (operation.equals("%")) {
            System.out.println(mod());
        }
        if (operation.equals("^")) {
            System.out.println(exponent());
        }
    }

    public String add() {
        result = firstNum + secondNum + "";
        if ((firstNum+secondNum)%1==0) {
            return result.substring(0,result.indexOf("."));
        }
        else {
            return result;
        }
    }

    public String subtract() {
        result = firstNum - secondNum + "";
        if ((firstNum+secondNum)%1==0) {
            return result.substring(0,result.indexOf("."));
        }
        else {
            return result;
        }
    }

    public String multiply() {
        result = firstNum * secondNum + "";
        if ((firstNum+secondNum)%1==0) {
            return result.substring(0,result.indexOf("."));
        }
        else {
            return result;
        }
    }

    public String divide() {
        result = firstNum / secondNum + "";
        if ((firstNum+secondNum)%1==0) {
            return result.substring(0,result.indexOf("."));
        }
        else {
            return result;
        }
    }

    public String mod() {
        result = firstNum % secondNum + "";
        if ((firstNum+secondNum)%1==0) {
            return result.substring(0,result.indexOf("."));
        }
        else {
            return result;
        }
    }

    public String exponent() {
        result = Math.pow(firstNum,secondNum) + "";
        if ((Math.pow(firstNum,secondNum))%1==0) {
            return result.substring(0,result.indexOf("."));
        }
        else {
            return result;
        }
    }
}
