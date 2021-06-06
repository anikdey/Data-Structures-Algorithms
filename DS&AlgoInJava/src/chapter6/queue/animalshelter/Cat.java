package chapter6.queue.animalshelter;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return name;
    }
}
