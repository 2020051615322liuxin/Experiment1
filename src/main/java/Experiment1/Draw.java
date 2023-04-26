package Experiment1;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args){

        Draw Draw = new Draw();
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("请选择操作,1: 圆形,2：矩形,3：三角形,4: 擦除圆形,5：擦除矩形,6：擦除三角形,7：查看目前绘制的图形");
        int i = scanner.nextInt();
        Draw.drawAnderase(i);

        }

    }

    Canvas canvas = new Canvas();
    public void drawAnderase(int i){
        Scanner scanner = new Scanner(System.in);
        if(i==1){
            System.out.println("请输入圆形的半径");
            float radius = scanner.nextFloat();
            canvas.drawCircle(radius);
        }
        if(i==2){
            System.out.println("请输入矩形长、宽");
            float Long = scanner.nextFloat();
            float Wide = scanner.nextFloat();
            canvas.drawRectangle(Long,Wide);
        }
        if(i==3){
            System.out.println("请输入三角形三边长");
            float side1 = scanner.nextFloat();
            float side2 = scanner.nextFloat();
            float side3 = scanner.nextFloat();
            canvas.drawTriangle(side1,side2,side3);
        }
        if(i==4){
            System.out.println("请输入擦除圆形的半径");
            float radius = scanner.nextFloat();
            canvas.eraseCircle(radius);
        }
        if(i==5){
            System.out.println("请输入擦除矩形的长、宽");
            float Long = scanner.nextFloat();
            float Wide = scanner.nextFloat();
            canvas.eraseRectangle(Long,Wide);
        }
        if(i==6){
            System.out.println("请输入擦除三角形的三边长");
            float side1 = scanner.nextFloat();
            float side2 = scanner.nextFloat();
            float side3 = scanner.nextFloat();
            canvas.eraseTriangle(side1,side2,side3);
        }
        if(i==7){
            for (int j = 0; j <canvas.shapes.size() ; j++) {
                System.out.println("目前绘制的图形有：");
                System.out.println(canvas.shapes.get(j));
            }
        }
    }


}
