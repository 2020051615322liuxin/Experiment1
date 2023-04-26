package Experiment1;

public class Circle extends Shape {
    private float Radius;
    Circle(float Radius){
        this.Radius=Radius;
    }
    @Override
    public void draw() {
        System.out.println("创建一个圆形");
        System.out.println("圆形半径为："+Radius);
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形半径为："+Radius+"的圆形");
    }
    @Override
    public boolean equals(Object obj){
        if(getClass()!=obj.getClass())
            return false;
       Circle circle = (Circle) obj;
       return this.Radius==circle.Radius;
    }
}
