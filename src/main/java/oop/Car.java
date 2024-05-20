package oop;

public class Car {

    String carName, model;
    int carNumber;

    void printCarData(){
        System.out.println(carName +" "+model+" "+ carNumber);
    }


//    void setCarData(String name , String Model , int number){
//        carName = name;
//        model = Model;
//        carNumber = number;
//    }
    Car(String name , String Model , int number){
        carName = name;
        model = Model;
        carNumber = number;
    }

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.carNumber = 78235473;
//        car1.model="ac12";
//        car1.carName="Tata";
//        car1.setCarData();
//        car1.setCarData("tata","gdfuytg2",34235);
//        car1.printCarData();


        Car car1 = new Car("tata","djfhd3",643264);
        car1.printCarData();



    }
}
