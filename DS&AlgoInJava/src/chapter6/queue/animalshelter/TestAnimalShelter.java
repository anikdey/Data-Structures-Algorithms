package chapter6.queue.animalshelter;

public class TestAnimalShelter {

    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter();

        Dog dog1 = new Dog("Dog 1");
        Dog dog2 = new Dog("Dog 2");
        Dog dog3 = new Dog("Dog 3");

        Cat cat1 = new Cat("Cat 1");
        Cat cat2 = new Cat("Cat 2");
        Cat cat3 = new Cat("Cat 3");

        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);
        animalShelter.enqueue(dog1);
        animalShelter.enqueue(cat3);


        animalShelter.printData();
        System.out.println("Size "+ animalShelter.getSize());

        System.out.println(animalShelter.dequeDog().getType());
        animalShelter.printData();
        System.out.println("Size "+ animalShelter.getSize());
    }

}
