package RandomArrayListPack;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        RandomArrayList<Person> per = new RandomArrayList<Person>();
        per.add(new Person("Pesho", 12));
        per.add(new Person("Gosho", 34));
        per.add(new Person("Omir", 123));

        System.out.println(per.getRandomElement());

    }
}
