package Experiment4;

public abstract class ComputerSystem {
    protected ImageReader imageReader;
    public void setImage(ImageReader imageReader){
        this.imageReader = imageReader;
    }

    public abstract void image();
}
