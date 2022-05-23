package Data;

import IO.io;
import Interface.Printer;

public class Functions implements Printer {

    io inOut = new io();
    public void Functions(String text) {
        Character[] array = getArray(text);
        int counter = numberCounter(array);
        inOut.amountOfNumbers(array, counter);
        inOut.amountOfCharacters(text);
        inOut.highestNumber(array, counter);

    }



    private Character[] getArray(String text) {
        Character[] newArr = new Character[text.length()];
        for (int i=0; i<text.length(); i++){
            newArr[i] =  text.charAt(i);
        }
        return newArr;
    }



    public int numberCounter(Character[] array) {
        int counter = 0;
        for (Character character : array) {
            if (Character.isDigit(character)) {
                counter++;
            }
        }
        return counter;
    }


}
