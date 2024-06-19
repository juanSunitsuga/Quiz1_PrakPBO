public abstract class Transportasi {
    private boolean berharga;
    private float berat;

    public Transportasi(boolean berharga, float berat) {
        this.berharga = berharga;
        this.berat = berat;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public boolean getBerharga() {
        return berharga;
    }

    public void setBerharga(boolean berharga) {
        this.berharga = berharga;
    }

    public abstract double hitungBiaya();
}
