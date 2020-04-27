public class Cat extends Animal implements Pet {
    private String name;
    public Cat(String n){
        super(4);
        this.name=n;
    }
    public Cat(){
        this("");
    }
    public void eat(){
        System.out.println("The cat eats her food");
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void play(){
        System.out.println("The cat plays with her owner");
    }
}
