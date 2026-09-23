public class Dokter {
    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getNama() {
        return nama;
    }

    public void tulisResep(ResepObat resep, String namaPasien) {
        System.out.println("Dr. " + this.nama + " sedang meresepkan...");
        resep.cetakResep(namaPasien);
    }
}
