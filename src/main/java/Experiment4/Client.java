package Experiment4;

public class Client {
    public static void main(String[] args){
        ComputerSystem computerSystem1 = new Windows();
        computerSystem1.setImage(new JpgReader());
        computerSystem1.image();

        ComputerSystem computerSystem2 = new Android();
        computerSystem2.setImage(new GifReader());
        computerSystem2.image();

        ComputerSystem computerSystem3 = new Linux();
        computerSystem3.setImage(new GifReader());
        computerSystem3.image();
    }
}
