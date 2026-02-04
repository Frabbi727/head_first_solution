package org.ostad;

class TestArrays {
    public static void main(String [] args) {
        //Animal animal =new  Animal();
//Static method can not be overriden in java
        Dog dog= new Dog();
        dog.sound();

    }

    // static method can be overload like same method different parameters
    public static void test(){

    }
    public static  void test(String name){
    }
}