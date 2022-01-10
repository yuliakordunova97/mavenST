public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Cat say " + cat.catSay());
        System.out.println("Dog say " + dog.dogSay());
    }
}
