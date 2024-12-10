package computer.adapter;

import computer.Hdmi;
import computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("__________Adapter__________");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("__________Adapter__________");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
