package StackOfStringsPack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StackOfStrings {
    private List<String> container;
    private int lastElementIndex;

    public StackOfStrings() {
        this.container = new ArrayList<>();
        this.lastElementIndex = -1;
    }

    public void push(String item){
        this.lastElementIndex++;
    this.container.add(item);
    }

    public String pop(){

        if (this.lastElementIndex < 0){
            throw new NoSuchElementException("No such element");
        }
        return this.container.remove(this.lastElementIndex--);
    }

    public String peek(){

        if (this.lastElementIndex < 0){
            throw new NoSuchElementException("No such element");
        }
        return this.container.get(this.lastElementIndex);
    }

    public boolean isEmpty(){
        return this.container.isEmpty();
    }


}


