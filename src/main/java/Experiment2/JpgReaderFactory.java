package Experiment2;

public class JpgReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader reader(){
        ImageReader imageReader = new JpgReader();
        return imageReader;
    }
}
