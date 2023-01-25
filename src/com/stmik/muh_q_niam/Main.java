package com.stmik.muh_q_niam;

public class Main {
    public static void main(String[] args) {
        // BUAT OBJECT
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        Sepeda sepeda = new Sepeda();
        Becak becak = new Becak();
        Meja meja = new Meja();
        Kursi kursi = new Kursi();

        // MOBIL
        mobil.display();
        mobil.hargaJual();

        // MOTOR
        motor.display();
        motor.hargaJual();

        // SEPEDA
        sepeda.display();
        sepeda.hargaJual();

        // BECAK
        becak.display();
        becak.hargaJual();

        // MEJA
        meja.display();
        meja.hargaJual();

        // KURSI
        kursi.display();
        kursi.hargaJual();
    }
}
