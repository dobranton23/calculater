public class ConvertArabToRoma {

    public static String arabToRoma(int num) {
        String[] numRom = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String result = "";
        if (num <= 0) {
            result = "Результат не возможно записать римскими цифрами";
        } else if (num == 10) {
            result = "X";
        } else if (num < 40) {
            result = "";
            for (int i = 0; i < num / 10; i++) {
                result += "X";
            }
            result += numRom[(num % 10)];
        } else if (num < 50) {
            result = "XL" + numRom[(num % 10)];
        } else if (num == 50) {
            result = "L";
        } else if (num < 90) {
            result = "L";
            for (int i = 0; i < (num - 50) / 10; i++) {
                result += "X";
            }
            result += numRom[(num % 10)];
        } else if (num < 100) {
            result = "XC" + numRom[(num % 10)];
        } else result = "C";
        return result;
    }
}