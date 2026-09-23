public class ResepObat {
    private String daftarObat;

    public ResepObat(String daftarObat) {
        this.daftarObat = daftarObat;
    }

    public void cetakResep(String pasien) {
        System.out.println("Resep untuk " + pasien + " : " + daftarObat);
    }
}
