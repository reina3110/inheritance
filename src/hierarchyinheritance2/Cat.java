package hierarchyinheritance2;

public class Cat extends Animal{
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.name="kitty";
        c1.gender="Female";

        c1.getInfo();
        c1.eat("fishes ");
    }
}
