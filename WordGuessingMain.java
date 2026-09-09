public class WordGuessingMain{
    public static void main(String[] args){
        WordGuessing w = new WordGuessing("grape");
        w.update("a");
        System.out.println(w.getUserString());
        w.update("r");
        System.out.println(w.getUserString()); 
        w.update("g");
        System.out.println(w.getUserString());
        w.update("p");
        System.out.println(w.getUserString());
        w.update("e");
        System.out.println(w.getUserString());
    }
}