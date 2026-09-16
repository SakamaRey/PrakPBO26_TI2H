public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
            beratMuatanSaatIni += berat;
        } else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
    }

    public void turunkanMuatan(double berat) {
        double batasMaksimalBongkar = beratMuatanSaatIni * 0.5;
        if (berat > batasMaksimalBongkar) {
            System.out.println("Maaf, demi alasan keamanan, sekali bongkar muat tidak boleh melebihi 50% dari total muatan saat ini!");
        } else if (beratMuatanSaatIni - berat >= 0) {
            beratMuatanSaatIni -= berat;
        } else {
            System.out.println("Maaf, muatan tidak mencukupi untuk dibongkar.");
        }
    }
}
