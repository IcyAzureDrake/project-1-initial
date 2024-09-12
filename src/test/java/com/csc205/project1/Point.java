package com.csc205.project1;

public class Point {

    private double x;

    private double y;

    public Point(){

    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void shiftX(double i){
        x = x + i;
    }

    public void shiftY(double i){
        y = y + i;
    }

    public double distance(Point b){
        double numX = Math.pow((x - b.x), 2);
        double numY = Math.pow((y - b.y), 2);

        return Math.sqrt((numX + numY));
    }

    public void rotate(double angle){
        double y2 = (x * (Math.sin(angle)) + y * (Math.cos(angle)));
        double x2 = (x * (Math.cos(angle)) - y * (Math.sin(angle)));

        x = x2;
        y = y2;
    }

    public String toString(Point i) {

        return "The point coordinates are ( " + i.x + " , " + i.y + " )";
    }
}
