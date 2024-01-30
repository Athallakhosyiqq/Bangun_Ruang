
package belajar_inheritance2;

public class Bola extends BangunRuang {
    
     float r;
     
@Override
    float Volume(){
        float Volume = (float) (4/3* Math.PI * r * r* r);
        System.out.println("Volume Bola: " + Volume);
        return Volume;
    }
    
    @Override
    float Luaspermukaan(){
        float Luaspermukaan = (float) (4 * Math.PI * r * r);
        System.out.println("Luaspermukaan Bola: " + Luaspermukaan);
        return Luaspermukaan;
}
    
}
