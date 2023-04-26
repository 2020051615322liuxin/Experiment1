package Experiment2;

public class GifReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader reader(){
        ImageReader imageReader = new GifReader();
        return imageReader;
    }
}
