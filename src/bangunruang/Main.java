package bangunruang;

public class Main {

    public static void main(String[] args) {
	// membuat objek Tabung
        Tabung tabung = new Tabung();
        tabung.r = 6;
        tabung.t = 15;

    // memanggil method luas dan volume
        tabung.luas();
        tabung.volume();
    }
}
