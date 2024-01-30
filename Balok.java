package belajar_inheritance2;

public class Balok extends BangunRuang {

    float p, l, t;

    @Override
    float Volume() {
        float Volume = (float) (p * l * t);
        System.out.println("Volume Balok " + Volume);
        return Volume;
    }

    @Override
    float Luaspermukaan() {
        float Luaspermukaan = (float) (p * l + p * t + l * t);
        System.out.println("Luaspermukaan Balok: " + Luaspermukaan);
        return Luaspermukaan;

    }

}
