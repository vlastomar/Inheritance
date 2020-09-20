package RandomArrayListPack;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    private Random rnd;


    public T getRandomElement(){
        Random random = new Random();
         int index = random.nextInt(this.size());

        return this.remove(index);


    }
}
