public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double hargaPerHari;

    public double hitungHargaBayar() {
        return lamaSewa * hargaPerHari;
    }
    public void tampilDataPeminjaman() {
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Total Bayar   : Rp" + hitungHargaBayar());
        System.out.println("-----------------------------");
    }
}
