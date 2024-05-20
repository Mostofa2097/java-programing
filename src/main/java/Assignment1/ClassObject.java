package Assignment1;


class Man{
    String name;
    int age;
    char gender;
    public Man(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Man man1 = new Man("Mostofa",24,'M');
        System.out.println("Name:"+man1.name+" age:"+man1.age+" Gender:"+man1.gender);
    }



}
