package Interface;

public interface Printer {

    default void print (String text){
        System.out.println(text);
    }

    default void printInt(int i){
        System.out.println(i);
    }

    default void printMix(String text, int i){
        System.out.println(text + i);
    }
}
