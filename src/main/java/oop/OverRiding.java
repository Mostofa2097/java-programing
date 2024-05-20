package oop;


class Bank{

    double x(){
        return 0;
    }
}
class Icici{
    double x(){
        return 10.1;
    }
}

class SBI extends Bank{
    double x(){
        return 12.2;
    }
}

public class OverRiding {

    public static void main(String[] args) {
        Icici ic = new Icici();
        System.out.println(ic.x());
        SBI sb = new SBI();
        System.out.println(sb.x());
    }

}
