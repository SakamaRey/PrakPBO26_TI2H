public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        
        System.out.println("--- Tes Overloading Method totalSudut ---");
        System.out.println("Total Sudut (1 param): " + sgt.totalSudut(90));
        System.out.println("Total Sudut (2 param): " + sgt.totalSudut(90, 45));
        
        System.out.println("\n--- Tes Overloading Method keliling ---");
        System.out.println("Keliling (3 sisi): " + sgt.keliling(10, 15, 20));
        System.out.println("Keliling (2 sisi penyiku): " + sgt.keliling(3, 4));
    }
}
