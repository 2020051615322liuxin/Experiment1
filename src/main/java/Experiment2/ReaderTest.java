package Experiment2;

public class ReaderTest {
    public static void main(String[] args) {
        ImageReaderFactory gifReaderFactory = new GifReaderFactory();
        ImageReaderFactory jpgReaderFactory = new JpgReaderFactory();

        ImageReader gifReader = gifReaderFactory.reader();
        ImageReader jpgReader = jpgReaderFactory.reader();

        gifReader.run();
        jpgReader.run();
    }
}