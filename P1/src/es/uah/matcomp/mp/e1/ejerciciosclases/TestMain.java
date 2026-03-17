package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.A.Circle.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclases.A.Employee.Employee;
import es.uah.matcomp.mp.e1.ejerciciosclases.A.InvoiceItem.InvoiceItem;
import es.uah.matcomp.mp.e1.ejerciciosclases.A.Rectangle.Rectangle;

public class TestMain {
    public static void main(String[] args){

//es.uah.matcomp.mp.e1.ejerciciosclases.Circle.Circle

        Circle c1 = new Circle(1.1);
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is "+c1.getRadius());

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());


//es.uah.matcomp.mp.e1.ejerciciosclases.Rectangle.Rectangle

        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);

        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6f);
        r1.setWidth(7.8f);

        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());


//es.uah.matcomp.mp.e1.ejerciciosclases.Employee.Employee

        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);

        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);

// es.uah.matcomp.mp.e1.ejerciciosclases.InvoiceItem.InvoiceItem

        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        System.out.println("The total is: " + inv1.getTotal());

// es.uah.matcomp.mp.e1.ejerciciosclases.Account








    }
}






