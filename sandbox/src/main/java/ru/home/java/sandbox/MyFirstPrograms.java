package ru.home.java.sandbox;

public class MyFirstPrograms {

  public static void main(String[] args) {
    hello("bro");
    hello("Anton");

    Square s = new Square(5);
    System.out.println(s.area());

    Rectangle r = new Rectangle(12,15);

    System.out.println(r.area());

    Point a = new Point(4,4);
    Point b = new Point(0,0);

    System.out.println(a.distance(b));
    System.out.println(Math.sqrt(8));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody +"!");
  }











}