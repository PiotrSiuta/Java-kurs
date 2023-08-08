public class Komputer {
    String rodzajDysku = "SDDDD";
    String wielkośćDysku = "200GB";
    String producentKartyGraficznej = "NVIDIA";
    String pojemnośćkartyGraficznej = "1 GB";
    String pamiecRAM = "2 GB";
    String napęd = "brak napędu";
    Integer iloscPortówUSB = 3;
    String firma = "Dell";

    public void nazwaProducenta() {
        System.out.println("Komputer marki " + firma);
    }

    public void grafikaInfo() {
        System.out.println("Informacje o karcie graficznej: firma: " + producentKartyGraficznej + ", pojemność karty graficznej: " + pojemnośćkartyGraficznej);
    }

    public void pozostaleInfo() {
        System.out.println("Pozostale informacje o komputerze: \nrodzaj i pojemnośc dysku " + rodzajDysku + " " + wielkośćDysku + ", \npamięć RAM: " + pamiecRAM + ", \nnapęd: " + napęd);
    }
}
