public class Laut extends Transportasi implements hitungVolume {
    private float panjang;
    private float lebar;
    private float tinggi;
    private boolean asuransi;
    public Laut(boolean berharga, float berat, float panjang, float lebar, float tinggi, boolean asuransi) {
        super(berharga, berat);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.asuransi = asuransi;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public boolean getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    @Override
    public float hitungVolume(){
        return getPanjang() * getLebar() * getTinggi();
    }

    @Override
    public double hitungBiaya() {
        double result;
        if(hitungVolume() <= 2500){
            result = hitungVolume() * 100;
        }else{
            result = hitungVolume() * 75;
        }
        if(getBerharga()){
            result = result + result * 5/100;
        }
        if(getAsuransi()){
            result = result + result * 1.5/100;
        }
        return result;
    }
}
