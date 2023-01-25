package org.example;
import java.util.Scanner;
class Basic_Shape {
    double length;
    double breadth;
    double radius;
    double side_length1;
    double side_length2;
    double side_length3;
    double base;
    double height;
    double area;
    double perimeter;
    Basic_Shape(double l, double br){
        length=l;
        breadth=br;
    }
    Basic_Shape(double r){

        radius=r;
    }
     Basic_Shape(double s1, double s2,double s3,double b,double h){
        side_length1=s1;
        side_length2=s2;
        side_length3=s3;
        base=b;
        height=h;
    }
    public double Area(String s){
        if(s.equals("triangle")){
            area=0.5*base*height;
            return area;
        }
        else if(s.equals("rectangle")){
            area=length*breadth;
            return area;
        }
        else if(s.equals("circle")){
            area=(3.14)*radius*radius;
            return area;
        }
        return 0.0;
    }
    public double Perimeter(String h){
        if(h.equals("triangle")){
            perimeter=side_length1+side_length2+side_length3;
            return perimeter;
        }
        else if(h.equals("rectangle")){
            perimeter=2*(length+breadth);
            return perimeter;
        }
        else if(h.equals("circle")){
            perimeter=2*3.14*radius;
            return perimeter;
        }
        return 0.0;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Triangle");
            System.out.println("2.Rectangle");
            System.out.println("3.circle");
            System.out.println("4.Exit");
            System.out.print("enter the shape type:");
            String shape_type=sc.next();
            shape_type=shape_type.toLowerCase();
            if(shape_type.equals("triangle")){
                System.out.println("enter the side1");
                double side1=sc.nextDouble();
                System.out.println("enter the side2");
                double side2=sc.nextDouble();
                System.out.println("enter the side3");
                double side3=sc.nextDouble();
                System.out.println("enter the height");
                double height=sc.nextDouble();
                System.out.println("enter the base");
                double base=sc.nextDouble();
                Basic_Shape t=new Basic_Shape(side1,side2,side3,base,height);
                System.out.println(t.Area(shape_type));
                System.out.println(t.Perimeter(shape_type));
            }
            else if(shape_type.equals("rectangle")){
                System.out.println("enter the length");
                double length=sc.nextDouble();
                System.out.println("enter the breadth");
                double breadth=sc.nextDouble();
                Basic_Shape re=new Basic_Shape(length,breadth);
                System.out.println(re.Area(shape_type));
                System.out.println(re.Perimeter(shape_type));
            }
            else if(shape_type.equals("circle")){
                System.out.println("enter the radius");
                double radius=sc.nextDouble();
                Basic_Shape c=new Basic_Shape(radius);
                System.out.println(c.Area(shape_type));
                System.out.println(c.Perimeter(shape_type));
            }
            else{
                break;
            }
        }
        sc.close();
    }

}

