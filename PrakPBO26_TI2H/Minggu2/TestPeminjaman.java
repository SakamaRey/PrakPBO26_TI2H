public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.id = "TRX001";
        p1.namaMember = "Andi";
        p1.namaGame = "FIFA 24";
        p1.lamaSewa = 3;
        p1.hargaPerHari = 25000;
        p1.tampilDataPeminjaman();
    }
}
