public class TestBarangTugas {
    public static void main(String[] args) {
        BarangTugas b1 = new BarangTugas();
        b1.kode = "BRG-001";
        b1.namaBarang = "Sepatu Sneakers";
        b1.hargaDasar = 200000;
        b1.diskon = 0.15f; // 15% diskon
        b1.tampilData();
    }
}
