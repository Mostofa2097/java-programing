package com.bd;

public class LocalVariable {

    public class Example {
        public void someMethod() {
            int x = 10; // x is a local variable
            System.out.println(x); // accessible within this method
        }

//        public static void main(String[] args) {
////            Example example = new Example();
////            example.someMethod();
//
//            // The following line would result in a compilation error
//            // System.out.println(x); // x is not accessible outside someMethod
//        }
    }
}
