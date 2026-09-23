public class RumahSakit {
    private String namaRS;
    private Dokter dokterJaga;
    private Ruangan ruangIGD;

    public RumahSakit(String namaRS) {
        this.namaRS = namaRS;
        this.ruangIGD = new Ruangan("IGD-01");
    }

    public void setDokterJaga(Dokter dokter) {
        this.dokterJaga = dokter;
    }

    public void infoRumahSakit() {
        System.out.println("Rumah Sakit: " + namaRS);
        System.out.println(ruangIGD.getInfo());
        if (dokterJaga != null) {
            System.out.println("Dokter Jaga: Dr. " + dokterJaga.getNama());
        }
    }
}
