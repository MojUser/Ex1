public class Main5 {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        getVoice(pig);
        getVoice(dog);
        getVoice(cat);
        getVoice(bird);
    }

    public static void getVoice(Animal animal) {
        System.out.println(animal.voice());
    }
}
