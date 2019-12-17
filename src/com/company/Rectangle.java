package com.company;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.height=1;
        this.width=1;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
          public double getArea(){
        return height*width;

    }
    public double getPerimeter(){
        return height+width;
    }
    public String toString(){
        return this.height +" " + " "+ this.width + " " + this.getArea() + this.getPerimeter();

    }
}



