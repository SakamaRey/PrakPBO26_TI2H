public class Mobil extends Kendaraan {
    public int jumlahPintu;
    public String tipeBahanBakar;

    public void bukaPintu() {
        System.out.println("Pintu mobil dibuka");
    }

    public void nyalakanAC() {
        System.out.println("AC mobil dihidupkan, suhu menjadi dingin");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Bahan bakar: " + tipeBahanBakar);
    }
}
