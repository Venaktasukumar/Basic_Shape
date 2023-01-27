package org.example;
import java.util.Scanner;
import java.util.logging.*;

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
    String tr="triangle";
    String rec="rectangle";
    String cir="circle";
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
        if(s.equals(tr)){
            area=0.5*base*height;
            return area;
        }
        else if(s.equals(rec)){
            area=length*breadth;
            return area;
        }
        else if(s.equals(cir)){
            area=(3.14)*radius*radius;
            return area;
        }
        return 0.0;
    }
    public double perimeteR(String h){
        if(h.equals(tr)){
            perimeter=sidelength1+sidelength2+sidelength3;
            return perimeter;
        }
        else if(h.equals(rec)){
            perimeter=2*(length+breadth);
            return perimeter;
        }
        else if(h.equals(cir)){
            perimeter=2*3.14*radius;
            return perimeter;
        }
        return 0.0;

    }
    public static void main(String[] args){
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        while(true){
            l.info("1.Triangle");
            l.info("2.Rectangle");
            l.info("3.circle");
            l.info("4.Exit");
            l.info("enter the shape type:");
            String shapetype=sc.next();
            shapetype=shapetype.toLowerCase();
            if(shapetype.equals("triangle")){
                l.info("enter the side1");
                double side1=sc.nextDouble();
                l.info("enter the side2");
                double side2=sc.nextDouble();
                l.info("enter the side3");
                double side3=sc.nextDouble();
                l.info("enter the height");
                double height=sc.nextDouble();
                l.info("enter the base");
                double base=sc.nextDouble();
                Basicshape t=new Basicshape(side1,side2,side3,base,height);
                double x=t.areA(shapetype);
                l.info("the area of triangle:"+String.valueOf(x));
                double y=t.perimeteR(shapetype);
                l.info("the perimeter of triangle:"+String.valueOf(y));
            }
            else if(shapetype.equals("rectangle")){
                l.info("enter the length");
                double length=sc.nextDouble();
                l.info("enter the breadth");
                double breadth=sc.nextDouble();
                Basicshape re=new Basicshape(length,breadth);
                double z=re.areA(shapetype);
                l.info("the area of rectangle:"+String.valueOf(z));
                double k=re.perimeteR(shapetype);
                l.info("the perimeter of rectangle:"+String.valueOf(k));
            }
            else if(shapetype.equals("circle")){
                l.info("enter the radius");
                double radius=sc.nextDouble();
                Basicshape c=new Basicshape(radius);
                double q=c.areA(shapetype);
                l.info("the area of circle:"+String.valueOf(q));
                double i=c.perimeteR(shapetype);
                l.info("the perimeter of circle:"+String.valueOf(i));
            }
            else{
                break;
            }
        }
        sc.close();
    }

}

