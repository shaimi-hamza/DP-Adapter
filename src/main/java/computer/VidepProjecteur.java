package computer;

public class VidepProjecteur implements Vga{

    @Override
    public void print(String message) {
        System.out.println("---------VP-------------");
        System.out.println(message);
        System.out.println("---------VP-------------");
    }
}