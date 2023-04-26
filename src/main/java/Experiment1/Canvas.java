package Experiment1;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Shape> shapes = new ArrayList<>();

    public void drawCircle(float radius) {
        Circle circle = new Circle(radius);
        circle.draw();
        shapes.add(circle);

    }

    public void drawTriangle(float side1, float side2, float side3) {
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.draw();
        shapes.add(triangle);
    }

    public void drawRectangle(float Long, float Wide) {
        Rectangle rectangle = new Rectangle(Long, Wide);
        rectangle.draw();
        shapes.add(rectangle);
    }

    public void eraseCircle(float radius) {
        Shape circle = new Circle(radius);
        int i = -1;
        int k = 0;
        for (int j = 0; j < shapes.size(); j++) {
            if (circle.equals(shapes.get(j))) {
                k=j;
                i = 0;
                break;
            }
        }

        if (i != -1) {
            shapes.remove(k);
            System.out.println("该圆已删除");
        } else {
            System.out.println("不存在该半径的圆");
        }
    }

    public void eraseTriangle(float side1, float side2, float side3) {
        Shape triangle = new Triangle(side1, side2, side3);
        int i = -1;
        int k = 0;
        for (int j = 0; j < shapes.size(); j++) {
            if (triangle.equals(shapes.get(j))) {
                k=j;
                i = 0;
                break;
            }
        }

        if (i != -1) {
            shapes.remove(k);
            System.out.println("该三角形已删除");
        } else {
            System.out.println("不存在该三角形");
        }
    }

    public void eraseRectangle(float Long, float Wide) {
        Shape rectangle = new Rectangle(Long, Wide);
        int i = -1;
        int k = 0;
        for (int j = 0; j < shapes.size(); j++) {
            if (rectangle.equals(shapes.get(j))) {
                k=j;
                i = 0;
                break;
            }
        }

        if (i != -1) {
            shapes.remove(k);
            System.out.println("该矩形已删除");
        } else {
            System.out.println("不存在该矩形");
        }
    }



}
