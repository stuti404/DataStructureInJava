package Oops.First;

public class Student {
    String name;
    int age;
    public void Introduction(){
        System.out.println("My name is "+this.name+" and my age is "+this.age);
    }
    public  void SayHi(String name){
        System.out.println(name+" Say Hi to "+ this.name);
    }
    static {
        System.out.println("Welocome");
    }
}
