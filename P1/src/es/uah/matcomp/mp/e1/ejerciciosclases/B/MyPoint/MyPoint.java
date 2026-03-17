package es.uah.matcomp.mp.e1.ejerciciosclases.B.MyPoint;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint(){}
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXY() {

    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) ^ 2 + (y - this.y)^2);
    }

    public double distance(MyPoint another){

    }

    public double distance() {
        return Math.sqrt(x^2 + y^2);
    }



}
