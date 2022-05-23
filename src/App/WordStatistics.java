package App;

import Data.Functions;
import IO.io;
import Interface.Printer;

public class WordStatistics implements Printer {
    io inOut = new io();
    Functions functions = new Functions();
    public void WordStatistics(){
        boolean endOfApp = false;
        while (!endOfApp) {
            print("Wpisz dowolny tekst z literami oraz cyframi");
        String text = inOut.getString();

            print("podano tekst:");
            print(text);
            functions.Functions(text);
            print("Czy zakończyć program?: ");
            endOfApp = inOut.endOfProgram();

        }
    }
}
