import java.util.ArrayList;


public class Checker {
    static ArrayList <String> word = new ArrayList<>(3);
    static String[] words;

    public static ArrayList <String> divisor(String str) throws InvalidOperation {

        str = str.replaceAll(" ", "");
        String operator =  "";
        int isAdd = 0;
        if (str.contains("/")) {
            operator = str.substring(str.indexOf("/"), str.indexOf("/") + 1);
            words = str.split(operator);
            isAdd ++;
        }
        if (str.contains("*")) {
            operator = str.substring(str.indexOf("*"), str.indexOf("*") + 1);
            words = str.split("\\*");
            isAdd ++;
        }
        if (str.contains("+")) {
            operator = str.substring(str.indexOf("+"), str.indexOf("+") + 1);
            words = str.split("\\+");
            isAdd ++;
        }
        if (str.contains("-")) {
            operator = str.substring(str.indexOf("-"), str.indexOf("-") + 1);
            words = str.split("\\-");
            isAdd ++;
        }
        if (isAdd > 1 || isAdd == 0){
            throw new InvalidOperation("Неправильно введённые символы!");
        }
        word.add(words[0]);
        word.add(words[1]);
        word.add(operator);
        return word;
    }

    public static boolean checkArab (String one, String two) throws InvalidOperation {
        int isCeck = 0;
        for (String arab: Calc.numArab){
            if (one.equals(arab)){
                isCeck ++;
            }
        }
        for (String arab: Calc.numArab){
            if (two.equals(arab)){
                isCeck ++;
            }
        }
        if (isCeck == 2) {
            return true;
        }
        return false;
    }
    public static boolean checkRoma (String one, String two) throws InvalidOperation {
        int isCeck = 0;
        for (String roma: Calc.numRom){
            if (one.equals(roma)){
                isCeck ++;
            }
        }
        for (String roma: Calc.numRom){
            if (two.equals(roma)){
                isCeck ++;
            }
        }
        if (isCeck == 2) {
            return true;
        }
        return false;
    }
}
