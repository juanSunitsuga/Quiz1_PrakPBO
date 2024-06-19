public class Darat extends Transportasi {
    public Darat( boolean berharga, float berat) {
        super(berharga, berat);
    }

    @Override
    public double hitungBiaya() {
        return getBerat() * 15000;
    }
}
