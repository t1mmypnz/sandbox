package ru.home.java.sandbox;

public class MyFirstPrograms {

  public static void main(String[] args) {
    hello("bro");
    hello("Anton");

    double l = 5;
    double a = 4;
    double b = 6;
    System.out.println(area(l));
    System.out.println(area(a,b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody +"!");
  }


  public static double area(double len){
    return len*len;
  }

  public static double area(double a, double b){
    return a * b;
  }




}