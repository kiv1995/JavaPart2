package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //TODO: main() is missing
    // strg + j
    public static void main(String[] args)
    {
        Main main = new Main();
        main.doIt();
    }
    private void doIt()
    {
        List<GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);
        printList(shapeList);
        List<Circle> circleList = new ArrayList<>();
        for (GeometricShape shape : shapeList)
        {
            if (shape instanceof Circle)
            {
                //called casting
                circleList.add((Circle)shape);
            }
        }
        System.out.println("------------------------------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }
    public void fillList(List<GeometricShape> shapeList) {
		//TODO: Implement
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.1));
        shapeList.add(new Circle(1,2,3.2));
        shapeList.add(new Circle(1,2,3.5));

        shapeList.add(new Rectangle(3,4,5.0,2.0));
        shapeList.add(new Rectangle(3,4,5.0,3.0));
        shapeList.add(new Rectangle(3,4,5.0,4.0));
        shapeList.add(new Rectangle(3,4,5.0,5.0));

        shapeList.add(new RightTriangle(55,44,3.3,1.4));
    }
    public void printList(List<GeometricShape> shapeList) {
		//TODO: Implement
        System.out.println("--------- for --------");
        for (int pos=0;pos < shapeList.size();pos++){
            System.out.println(shapeList.get(pos));
        }
        System.out.println("--------- foreach --------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }
        System.out.println("--------- stream 1 --------");
        shapeList.stream().forEach(shape -> System.out.println(shape));
        System.out.println("--------- for --------");
        shapeList.stream().forEach(System.out::println);
    }
}
