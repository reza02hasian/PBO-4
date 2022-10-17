package PBO4;

public class Persegi extends Bangundatar{
    int sisi;
    
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }    
}
