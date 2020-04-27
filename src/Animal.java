public abstract class Animal {
    protected int legs;
    protected Animal(int l){
        this.legs=l;
    }
    public void walk(){
        System.out.println("The animal walks on "+legs+" legs");
    }
    public abstract void eat();
}

