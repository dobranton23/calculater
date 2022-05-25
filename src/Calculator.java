public class Calculator {

    static String res(int one, int two, String operator) {
        int res = 0;
        switch (operator) {
            case "+":
                res = one + two;
                break;
            case "-":
                res = one - two;
                break;
            case "*":
                res = one * two;
                break;
            case "/":
                res = one / two;
                break;
        }
        return Integer.toString(res);
    }

}