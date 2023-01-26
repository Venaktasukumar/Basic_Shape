package org.example;
import java.util.Scanner;
class Basicshape {
    double length;
    double breadth;
    double radius;
    double sidelength1;
    double sidelength2;
    double sidelength3;
    double base;
    double height;
    double area;
    double perimeter;
    Basicshape(double l, double br){
        length=l;
        breadth=br;
    }
    Basicshape(double r){

        radius=r;
    }
     Basicshape(double s1, double s2,double s3,double b,double h){
        sidelength1=s1;
        sidelength2=s2;
        sidelength3=s3;
        base=b;
        height=h;
    }
    public double areA(String s){
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
    public double perimeteR(String h){
        if(h.equals("triangle")){
            perimeter=sidelength1+sidelength2+sidelength3;
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
            String shapetype=sc.next();
            shapetype=shapetype.toLowerCase();
            if(shapetype.equals("triangle")){
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
                Basicshape t=new Basicshape(side1,side2,side3,base,height);
                System.out.println(t.areA(shapetype));
                System.out.println(t.perimeteR(shapetype));
            }
            else if(shapetype.equals("rectangle")){
                System.out.println("enter the length");
                double length=sc.nextDouble();
                System.out.println("enter the breadth");
                double breadth=sc.nextDouble();
                Basicshape re=new Basicshape(length,breadth);
                System.out.println(re.areA(shapetype));
                System.out.println(re.perimeteR(shapetype));
            }
            else if(shapetype.equals("circle")){
                System.out.println("enter the radius");
                double radius=sc.nextDouble();
                Basicshape c=new Basicshape(radius);
                System.out.println(c.areA(shapetype));
                System.out.println(c.perimeteR(shapetype));
            }
            else{
                break;
            }
        }
        sc.close();
    }

}

