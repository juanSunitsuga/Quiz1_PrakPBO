public class Udara extends Transportasi implements hitungVolume {
    private float panjang;
    private float lebar;
    private float tinggi;
    private boolean asuransi;
    private tipePengirimanUdara tipePengiriman;
    public Udara(boolean berharga, float berat, float panjang, float lebar, float tinggi, boolean asuransi, tipePengirimanUdara tipePengiriman) {
        super(berharga, berat);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.asuransi = asuransi;
        this.tipePengiriman = tipePengiriman;
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

    public tipePengirimanUdara getTipePengiriman() {
        return tipePengiriman;
    }

    public void setTipePengiriman(tipePengirimanUdara tipePengiriman) {
        this.tipePengiriman = tipePengiriman;
    }

    @Override
    public float hitungVolume(){
        return getPanjang() * getLebar() * getTinggi();
    }

    @Override
    public double hitungBiaya() {
        double result;
        if(getTipePengiriman() == tipePengirimanUdara.EXPRESS){
            result = 45 * hitungVolume();
        }else{
            result = 60 * hitungVolume();
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
