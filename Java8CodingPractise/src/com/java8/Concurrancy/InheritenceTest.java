package com.java8.Concurrancy;
class A{

    public void method1() {
        System.out.println("calss A method1 =====>");
    }

    public static void add(int a,int b){
        System.out.println("add method from A"+(a+b));
    }

    private static int multiple(int a,int b){
       return a*b;
    }

    private static String multiple(String a,String b){
        return a.concat(b);
    }

}

class B extends A {

    public void method1() {
        System.out.println("class B method1 ======>");
    }

    public void method2() {
        System.out.println("class B method2 =====>");
    }

    public static void add(int a,int b){
        System.out.println("add method from B"+(a*b));
    }
}

public class InheritenceTest {
    public static void main(String[] args) {

        A a = new B();
        a.method1(); // method B
        a.add(10,20); //static context the reference is A so it will be Called A class add method
        A a1 = new A();
        a1.method1(); // method A
        a1.add(10,20); //here object created for A as well as Reference also A so it calls the A class add method
        B b = new B();
        b.method1(); // method B
        b.add(10,20); // B class add method

    }
}
