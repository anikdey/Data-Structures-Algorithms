package chapter6.queue.animalshelter;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return name;
    }
}
