package Assignment1;

public class ConstructorMethod {
    int age ;
    String name;

    //Constructor
    public ConstructorMethod(int age1, String name1){
         age = age1;
         name = name1;

    }
    //Methord
    void add(int x, int y){
        int sum = x+y;
        System.out.println("Sum : "+sum);
    }

    public static void main(String[] args) {
        ConstructorMethod kamal = new ConstructorMethod(20,"kamal");
        System.out.println("age:"+kamal.age+" Name:"+kamal.name);
        System.out.println("age:"+kamal.age+" Name:"+kamal.name);
        kamal.add(212,434);

    }
}
