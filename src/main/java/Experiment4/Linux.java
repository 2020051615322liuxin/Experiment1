package Experiment4;

public class Linux extends ComputerSystem{
    @Override
    public void image(){
        System.out.print("Linux系统:");
        imageReader.run();
    }
}
