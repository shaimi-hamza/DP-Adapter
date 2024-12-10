import computer.Ecran;
import computer.TV;
import computer.UniteCentrale;
import computer.VidepProjecteur;
import computer.adapter.HdmiVgaAdapter;

public class App {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new VidepProjecteur());
        uniteCentrale.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonjour Hshaimi SDIA");

    }
}