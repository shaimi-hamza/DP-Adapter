package computer;

public class TV implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("#######_HDMI_#######");
        String message = new String(data);
        System.out.println(message);
        System.out.println("#######_HDMI_#######");
    }
}
