import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number1 = null;
        String number2 = null;
        System.out.println("Введите выражение с двумя числами от 1 до 10, например 2+3");
        String str = sc.nextLine();
        String[] massOfNumbers;
        if (str.contains("+")) {
            massOfNumbers = str.split("[+]");
            number1 = massOfNumbers[0];
            number2 = massOfNumbers[1];
        } else if (str.contains("-")) {
            massOfNumbers = str.split("[-]");
            number1 = massOfNumbers[0];
            number2 = massOfNumbers[1];
        } else if (str.contains("/")) {
            massOfNumbers = str.split("[/]");
            number1 = massOfNumbers[0];
            number2 = massOfNumbers[1];
        } else if (str.contains("*")) {
            massOfNumbers = str.split("[*]");
            number1 = massOfNumbers[0];
            number2 = massOfNumbers[1];
        }

        Romnumbers RomUp = new Romnumbers();

        assert number1 != null;

        int intNum1 = RomUp.getArabicNumberFromRom(number1);
        int intNum2 = RomUp.getArabicNumberFromRom(number2);
        int result = 0;
        if (str.contains("+")) {
            result = intNum1 + intNum2;
        } else if (str.contains("-")) {
            result = intNum1 - intNum2;
        } else if (str.contains("/")) {
            result = intNum1 / intNum2;
        } else if (str.contains("*")) {
            result = intNum1 * intNum2;
        }

        System.out.println(RomUp.getRomNumberFromArabic(result));
    }





}
