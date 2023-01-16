package multilevelinheritance2;

public class Car {

    String Brand;
    int Speed;

    void Model(String year){
        System.out.println("Year is "+year);
        System.out.println("Brand is "+Brand);
    }
    void price(int price,String something){
        System.out.println("The price is "+ price );
        System.out.println(Speed +"The car is "+ something);
    }
}
