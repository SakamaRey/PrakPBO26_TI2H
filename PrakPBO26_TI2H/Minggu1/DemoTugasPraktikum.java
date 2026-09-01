public class DemoTugasPraktikum {
    public static void main(String[] args) {
        Motor motorGede = new Motor();
        Mobil mobilTuaBanget = new Mobil();
        Mouse mouseGaming = new Mouse();
        Handphone hpDaily = new Handphone();

        System.out.println("--- OBJEK MOTOR ---");
        motorGede.merk = "BMW Motorrad";
        motorGede.warna = "Black carbon";
        motorGede.jenisMotor = "Sport";
        motorGede.kapasitasMesin = 999;
        motorGede.nyalakanMesin();
        motorGede.standarkan();
        motorGede.tarikGas();
        motorGede.cetakInfo();

        System.out.println("\n--- OBJEK MOBIL ---");
        mobilTuaBanget.merk = "Mercedez Benz";
        mobilTuaBanget.warna = "Biru Navy";
        mobilTuaBanget.jumlahPintu = 2;
        mobilTuaBanget.tipeBahanBakar = "Bensin";
        mobilTuaBanget.bukaPintu();
        mobilTuaBanget.nyalakanMesin();
        mobilTuaBanget.nyalakanAC();
        mobilTuaBanget.cetakInfo();

        System.out.println("\n--- OBJEK MOUSE ---");
        mouseGaming.merkMouse = "Fantech";
        mouseGaming.tipeKoneksi = "Wireless";
        mouseGaming.klikKiri();
        mouseGaming.klikKanan();
        mouseGaming.cetakInfo();

        System.out.println("\n--- OBJEK HANDPONE ---");
        hpDaily.merkHp = "Realme";
        hpDaily.ukuranLayar = 6.4;
        hpDaily.nyalakanLayar();
        hpDaily.isiDaya();
        hpDaily.cetakInfo();
    }
}
