package Experiment1;

public class Rectangle extends Shape{
    private float Long;
    private float Wide;

    Rectangle(float Long,float Wide){
        this.Long=Long;
        this.Wide=Wide;
    }

    @Override
    public void draw() {
        System.out.println("创建一个矩形");
        System.out.println("长为："+Long+"   宽为:"+Wide);
    }

    @Override
    public void erase() {
        System.out.println("擦除长为："+Long+"   宽为:"+Wide+"的矩形");
    }

    @Override
    public boolean equals(Object obj){
        if(getClass()!=obj.getClass())
            return false;
        Rectangle rectangle = (Rectangle) obj;
        return this.Long==rectangle.Long&&this.Wide==this.Wide;
    }
}
