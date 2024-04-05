package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Menyalakan kendaraan " + this.getName());
    }

    @Override
    public void Stop() {System.out.println("Mematikan mesin pesawat " + this.getModel());}

    @Override
    public void Brake() {System.out.println("Mengurangi kecepatan pesawat " + this.getModel());}

    @Override
    public void fly() {System.out.println("Pesawat " + this.getModel() + " lepas landas");}
}
