public abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
} 
