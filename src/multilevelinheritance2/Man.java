package multilevelinheritance2;

public class Man extends Human{
    public static void main(String[] args) {
        Man m1=new Man();
        m1.name="Willain";
        m1.gender="Male";
        m1.nrc="1234556";
        m1.eat("Rice & Meat & Vegetable");
        m1.drink("Beer","Night");
        m1.work("Software Engineer");
    }


}
