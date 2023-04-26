package Experiment2;

public abstract class ImageReaderFactory {
    public void run(){
        ImageReader imageReader =this.reader();
        imageReader.run();
    }
    public abstract ImageReader reader();
}
