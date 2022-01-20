package Homework1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "Барсик","white",2 );

        System.out.println(cat1);

        Cat cat2 = new Cat("Moris", "black", 1);
        Cat cat3 = new Cat("Moris", "black", 1);

        System.out.println(cat2.equals(cat3));

        cat1.setAge(15);
        System.out.println(cat1);

        Wolf wolf = new Wolf("Trevor", "grey", 6);
        Animal cat4 = new Cat("Rupert", "red", 10);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        }

        wolf.voice();
        System.out.println(wolf);

        Cat cat5 = new Cat("Max", "black", 5);
        Cat cat6 = new Cat("Max", "black", 5);

        cat5.setWild(true);

        System.out.println(cat5.hashCode());
        System.out.println(cat6.hashCode());

    }


}
