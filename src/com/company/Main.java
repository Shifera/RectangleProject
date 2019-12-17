package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle=new Rectangle();

        rectangle.setWidth(4.0);
        rectangle.setHeight(40.0);
        //rectangle.getArea();
        //System.out.println(rectangle.getArea());
        //System.out.println(rectangle.getPerimeter());

        String x= rectangle.toString();
        System.out.println(x);

    }
}
