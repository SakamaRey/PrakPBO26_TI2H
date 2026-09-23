public class MainRumahSakit {
    public static void main(String[] args) {
    RumahSakit rsakit = new RumahSakit("RS Saiful Anwar");
    Dokter doc = new Dokter("Budi", "Umum");

    rsakit.setDokterJaga(doc);
    rsakit.infoRumahSakit();

    System.out.println("----------------");

    ResepObat resepPanadol = new ResepObat("Panadol 500mg, Amoxicilin");

    doc.tulisResep(resepPanadol, "Andi");
    }
}
