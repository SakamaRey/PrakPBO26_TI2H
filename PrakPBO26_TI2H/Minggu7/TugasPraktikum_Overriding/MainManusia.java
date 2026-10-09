public class MainManusia {
    public static void main(String[] args) {
        Manusia objekManusia = new Manusia();
        Manusia objekDosen = new Dosen();
        Manusia objekMahasiswa = new Mahasiswa();
        
        System.out.println("--- Perilaku Makan (Overriding) ---");
        objekManusia.makan();
        
        objekDosen.makan(); 
        
        objekMahasiswa.makan();
    }
}
