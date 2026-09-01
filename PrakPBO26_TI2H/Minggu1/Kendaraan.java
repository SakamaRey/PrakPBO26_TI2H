public class Kendaraan {
    public String merk;
    public String warna;

    public void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan");   
    }

    public void matikanMesin() {
        System.out.println("Mesin Kendaraan dimatikan");
    }

    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
    }
}
