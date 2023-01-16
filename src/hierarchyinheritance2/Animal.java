package hierarchyinheritance2;

public class Animal {
    String  name;
    String gender;

    void getInfo(){
        System.out.println("Name is "+ name);
        System.out.println("Gender is "+gender);
    }

    void eat(String food){
        System.out.println(name + " eat "+food);
    }

}
