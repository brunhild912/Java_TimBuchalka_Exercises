package Zoo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals [0] = new Dog();
        animals [1] = new Animal();
        for (int i = 0; i < 2; i++){
            animals[i].Eat();
            System.out.print("\n\n");
        }


    }
}
