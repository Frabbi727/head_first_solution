package org.ostad;

class TestArrays {
    public static void main(String [] args) {
        //Animal animal =new  Animal();
//Static method can not be overriden in java
      Animal animal1=new Animal(10);
      Animal animal2=new Animal(20);
      System.out.println(animal1.sum);
      System.out.println(animal2.sum);

    }

    //1. Final class can not be extended
    //2. Final method can not be override
    //3. Final variables can not be changed
    //4. Final variables one change by constructor


    // static method can be overload like same method different parameters
    public static void test(){

    }
    public static  void test(String name){
    }
}