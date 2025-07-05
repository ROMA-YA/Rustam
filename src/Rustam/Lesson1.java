package Rustam;

public class Lesson1 {
    public class Main {
        public static void main(String[] args) {
        var bmw = new Car(2);
        var airbus = new Plane(2);

        System.out.println(bmw.getMoveSound());
        System.out.println(airbus.getMoveSound());

            var dog = new Dog();
            var cat = new Cat();
            var sparrow = new Sparrow();

            makeVoice(dog);
            makeVoice(cat);
            makeVoice(sparrow);
        }

        public static void makeVoice(AnimalAction animalAction) {
            animalAction.voice();
        }
    }
}
interface AnimalAction {
    void voice();
}

class Dog implements AnimalAction {
    @Override
    public void voice() {
        System.out.println("Gav gav gav");
    }
}

class Cat implements AnimalAction {
    @Override
    public void voice() {
        System.out.println("Meow meow meow");
    }
}

class Sparrow implements AnimalAction {

    @Override
    public void voice() {
        System.out.println("Chirik chirik chirik");
    }
}
abstract class Transport {
    public int gasVolume; // Объем бензина
    public int engineVolume; // Объем двигателя

    abstract public String getMoveSound();

    public Transport() {
        init();
    }

    public void init() {
        System.out.println("init");
    }
}

class Plane extends Transport {
    public int wingsCount; // Количество крыльев

    public Plane(int wingsCount) {
        this.wingsCount = wingsCount;
    }

    @Override
    public String getMoveSound() {
        return ".....";
    }

    @Override
    public void init() {
        System.out.println("init plane");
    }
}

class Car extends Transport {
    public int diskCount;

    @Override
    public String getMoveSound() {
        return "hrrr hrrr hrr hrrr";
    }

    public Car(int diskCount) {
        this.diskCount = diskCount;
    }
}