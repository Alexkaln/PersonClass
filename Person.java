package Model;

public class Person {
    private String name;
    private int age;
    public Person()
    {
        this("Undefined",18);
    }
    public Person(String n){
        this(n, 18);
    }
    public Person(String n, int a){
        this.name=n;
        this.age=a;
    }

    public void DisplayInfo(){
        System.out.printf("Name: %s\t Age:%d\n", name,age);
    }



}
