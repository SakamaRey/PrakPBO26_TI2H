public class Motor extends Kendaraan {
    public String jenisMotor;
    public int kapasitasMesin;

    public void standarkan() {
        System.out.println("Standar motor diturunkan");
    }

    public void tarikGas() {
        System.out.println("Motor berjalan maju");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}
