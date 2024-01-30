
package belajar_inheritance2;

public class Kubus extends BangunRuang {
    float s;
     
@Override
    float Volume(){
        float Volume = (float) (s*s*s);
        System.out.println("Volume Kubus : " + Volume);
        return Volume;
    }

    
    
    
}
