package bangunruang;

public class Tabung {

    // jari jari tabung
    float r;
    float t;

    float luas(){
        float luas = (float) (2 * Math.PI * r * (r + t) );
        System.out.println("Luas permukaan tabung: " + luas);
        return luas;
    }

    float volume(){
        float volume = (float) ( Math.PI * r * r * t);
        System.out.println("Volume Tabung: " + volume);
        return volume;
    }
}
