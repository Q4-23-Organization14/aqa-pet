package HW7;

import java.util.Scanner;

public class HW7Task1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Введіть слово: ");
            String input = scanner.nextLine();


            char[] charArray1 = input.toCharArray();
            char[] charArray2 = new char[charArray1.length];

            for (int i = 0; i < charArray1.length; i++) {
                charArray2[i] = charArray1[charArray1.length - 1 - i];

            }


            if (charArray1 != charArray2) {
                System.out.println("Рядок не є паліндромом");

            } else {
                System.out.println("Рядок є паліндромом");
            }

            scanner.close();
    }
}
