public class Handphone {
    public String merkHp;
    public double ukuranLayar;

    public void nyalakanLayar() {
        System.out.println("Layar hp dinyalakan");
    }

    public void isiDaya() {
        System.out.println("Kabel charger dicolokkan, baterai hp terisi");
    }

    public void cetakInfo() {
        System.out.println("Merk Hp: " + merkHp);
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }
}
