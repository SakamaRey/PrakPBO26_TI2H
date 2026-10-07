package Tugas;

public class TiketInternasional extends TiketPesawat{
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        System.out.println("====== Tiket Pesawat Internasional ======");
        super.tampilPesawat();
        System.out.println("Nomor Paspor\t\t= " + nomorPaspor);
        System.out.println("Asuransi\t\t= " + asuransi);
        System.out.println("Total Bayar\t\t= " + (hargaDasar + hitungBiayaBagasi() + asuransi));
    }
}
