import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
        
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        
        System.out.print("\nMasukkan berat muatan baru yang ingin ditambah (kg): ");
        double muatanTambah1 = input.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + muatanTambah1 + " kg...");
        kontainerAlfa.tambahMuatan(muatanTambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.print("\nMasukkan berat muatan baru yang ingin ditambah (kg): ");
        double muatanTambah2 = input.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + muatanTambah2 + " kg...");
        kontainerAlfa.tambahMuatan(muatanTambah2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.print("\nMasukkan berat muatan yang ingin dibongkar (kg): ");
        double muatanTurun1 = input.nextDouble();
        System.out.println("Membongkar muat/menurunkan barang seberat " + muatanTurun1 + " kg...");
        kontainerAlfa.turunkanMuatan(muatanTurun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        input.close();
    }
}
