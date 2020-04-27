public class Main {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();
        ((Animal)p).eat();
        ((Animal)p).walk();
        a.walk();
        e.eat();
        d.walk();
        System.out.println(c.getName());
        c.setName("Trei");
        System.out.println(c.getName());

    }
}
