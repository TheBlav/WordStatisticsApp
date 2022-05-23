package IO;

import Data.Functions;
import Interface.Printer;

import java.util.Scanner;

public class io implements Printer {
    Scanner sc = new Scanner(System.in);
    public String getString(){
        return sc.nextLine();
    }

    public void highestNumber(Character[] array, int counter) {
        int max = Integer.MIN_VALUE;
        if (counter>0) {
            for (Character character : array) {
                if (Character.isDigit(character)) {
                    int current = Character.getNumericValue(character);
                    if (current > max) {
                        max = current;
                    }
                }
            }
            printMix("Największa Cyfra w tekście to: ", max);
        }
        else
            print("Brak cyfr w tekście");

    }

    public void amountOfNumbers(Character[] array, int counter) {

        if (counter>0)
            printMix("Liczba Cyfr w tekście: ", counter);
        else
            print("Brak cyfr w tekście");
    }

    public void amountOfCharacters(String t) {
        printMix("Liczba znaków w tekście: ", t.length());
    }

    public boolean endOfProgram(){
        String text = sc.nextLine();
        return  text.toLowerCase().equals("tak") || text.toLowerCase().equals("t");

    }
}
