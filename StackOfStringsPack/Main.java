package StackOfStringsPack;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

       try {
           StackOfStrings sos = new StackOfStrings();
           sos.push("one");
           sos.push("two");
           sos.push("three");

           System.out.println(sos.isEmpty());
           System.out.println(sos.peek());

           System.out.println(sos.pop());
           System.out.println(sos.pop());
           System.out.println(sos.pop());
       }catch (NoSuchElementException e){
           System.out.println(e.getMessage());
       }



    }
}
