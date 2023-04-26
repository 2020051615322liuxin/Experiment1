package Experiment1;

public class Triangle extends Shape{
    private float side1,side2,side3;

    Triangle(float side1,float side2,float side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public void draw() {
        System.out.println("创建一个三角形");
        System.out.println("边1长为："+side1+"    边2长为："+side2+"    边3长为："+side3);
    }

    @Override
    public void erase() {
        System.out.println("擦除边1长为："+side1+"    边2长为："+side2+"    边3长为："+side3+"三角形");
    }

    @Override
    public boolean equals(Object obj){
        if(getClass()!=obj.getClass())
            return false;
        Triangle triangle = (Triangle) obj;
        return this.side1== triangle.side1&&this.side2==triangle.side2&&this.side3== triangle.side3;
    }
}
