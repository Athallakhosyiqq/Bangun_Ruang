package belajar_inheritance2;

public class Limassegitiga extends BangunRuang {

    float p, l_alas, t, k_alas, s_miring;

    @Override
    float Volume() {
        float Volume = (float) (1 / 3 * l_alas * t);
        System.out.println("Volume Balok " + Volume);
        return Volume;
    }

    @Override
    float Luaspermukaan() {
        float Luaspermukaan = (float) (l_alas + 1 / 2 * k_alas * s_miring);
        System.out.println("Luaspermukaan Balok: " + Luaspermukaan);
        return Luaspermukaan;

    }

}
