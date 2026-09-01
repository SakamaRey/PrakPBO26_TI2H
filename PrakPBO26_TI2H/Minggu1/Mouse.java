public class Mouse {
    public String merkMouse;
    public String tipeKoneksi;

    public void klikKiri() {
        System.out.println("Klik kiri mouse ditekan");
    }

    public void klikKanan() {
        System.out.println("Klik kanan mouse ditekan, menampilkan opsi");
    }

    public void cetakInfo() {
        System.out.println("Merk Mouse: " + merkMouse);
        System.out.println("Tipe Koneksi: " + tipeKoneksi);
    }
}
