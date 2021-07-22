package lists;

public class Person {
    int age;
    String name;
    String gender;
    public Person(){
        age = 0;
        gender = "F";
        name = "default";
    }
    public Person(String name, int age, String gender){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    void display(){
        System.out.println("\nName: "+name);
        System.out.println("\nAge: "+age);
        System.out.println("\nGender: "+gender);
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        return gender;
    }
}
