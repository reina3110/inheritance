package singleInheritance2;

public class Animal {

    String name;
    String gender;
    int age;


    void bark(String voice){ //method  for voice
        System.out.println(name+"Bark as "+voice);
    }
    void eat(String food,String place){ // method for food
        System.out.println(name +" eat "+food);
        System.out.println("Live in the "+place);
    }

}
