package com.driver;

public class Main {
    //Task 1:
    //create a class Product inside Main class
    public static class Product{
//        Task 3:
//        create a method of following defination
//        public int product(int x, int y) {}
//        call this method from Main using Product class object p
        public int product(int x,int y){
            return x*y;
        }

        //Task 4:
        //create a Overloaded method product of following defination
        //public int product(int x, int y, int z) {}
        //call this method also from Main using Product class object p
        public int product(int x,int y,int z){
            return x*y*z;
        }
//        Task 5:
//        create a Overloaded method product of following defination
//        public double product(double x, double y) {}
        public double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String[] args) {
        //Task 1:
        //create a class Product inside Main class
        Product p= new Product();
        System.out.println(p.product(2,4));
        System.out.println(p.product(2,4,7));
        System.out.println(p.product(2,6));


    }

}