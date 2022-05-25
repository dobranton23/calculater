import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Calc {
    static String [] numRom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String [] numArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static void main(String[] args) throws IOException, InvalidOperation {
        ArrayList<String> words;
        String res = "";
        System.out.print("Введите выражение: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numStr = reader.readLine();
        words = Checker.divisor(numStr);
        boolean isArab = Checker.checkArab(words.get(0), words.get(1));
        boolean isRoma = Checker.checkRoma(words.get(0), words.get(1));
        if (!isArab && !isRoma){
            throw new InvalidOperation("Неправильно введённые символы!");
        }
        else {
            if (isArab)
                System.out.println(Calculator.res(Integer.parseInt(words.get(0)), Integer.parseInt(words.get(1)), words.get(2)));
            if (isRoma) {
                int one = 0;
                int two = 0;
                for (int i = 0; i < numRom.length; i++) {
                    if (numRom[i].equals(words.get(0))) one = i + 1;
                    if (numRom[i].equals(words.get(1))) two = i + 1;
                }
                res = Calculator.res(one, two, words.get(2));
                String resul = ConvertArabToRoma.arabToRoma(Integer.parseInt(res));
                System.out.println(resul);
            }
        }
    }
}