package PBO4;

public class Main {
 public static void main(String[] args) {
        
        Bangundatar bangunDatar = new Bangundatar();
        Persegi persegi = new Persegi(7);
        Segitiga segitiga = new Segitiga(10, 8);
        Lingkaran lingkaran = new Lingkaran(55);
        
        // memanggil method luas
        bangunDatar.luas();    

        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        
        
    }
 }
