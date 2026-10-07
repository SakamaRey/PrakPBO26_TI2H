package percobaan2;

public class ClassB extends ClassA {
    private int z;
    
    public void setZ(int z) {
        this.z = z;
    }
    
    public void getNilaiZ() {
        System.out.println("nilai z:" + z);
    }
    
    public void getJumlah() {
        // Menggunakan getter untuk memanggil nilai x dan y yang berstatus private di superclass
        System.out.println("jumlah:" + (getX() + getY() + z));
    }
}
