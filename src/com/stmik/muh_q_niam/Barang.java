package com.stmik.muh_q_niam;

class Barang {
    String nama;
    // int hargaJual;
    int hargaBeli;
    int untung;

    String setName() {
        return this.nama;
    }

    int setHargaBeli() {
        return this.hargaBeli;
    }

    int setUntung() {
        return this.untung;
    }

    void hargaJual() {
        System.out.println("Harga jual: " + (hargaBeli + untung));
        System.out.println();
    }

    void display() {
        System.out.println("Barang: " + setName());
        System.out.println("Harga barang: " + setHargaBeli());
        System.out.println("Ambil keuntungan: " + setUntung());
    }

}

// A
class Mobil extends Barang {
    @Override
    String setName() {
        return this.nama = "Mobil";
    }

    @Override
    int setHargaBeli() {
        return this.hargaBeli = 150000000;
    }

    @Override
    int setUntung() {
        return this.untung = 12000000;
    }
}

// B
class Motor extends Barang {

    @Override
    String setName() {
        return this.nama = "Motor";
    }

    @Override
    int setHargaBeli() {
        return this.hargaBeli = 12000000;
    }

    @Override
    int setUntung() {
        return this.untung = 1000000;
    }
}

// C
class Sepeda extends Barang {
    @Override
    String setName() {
        return this.nama = "Sepeda";
    }

    @Override
    int setHargaBeli() {
        return this.hargaBeli = 2000000;
    }

    @Override
    int setUntung() {
        return this.untung = 300000;
    }
}

// D
class Becak extends Barang {
    @Override
    String setName() {
        return this.nama = "Becak";
    }

    @Override
    int setHargaBeli() {
        return this.hargaBeli = 500000;
    }

    @Override
    int setUntung() {
        return this.untung = 100000;
    }
}

// E
class Meja extends Barang {
    @Override
    String setName() {
        return this.nama = "Meja";
    }

    @Override
    int setHargaBeli() {
        return this.hargaBeli = 300000;
    }

    @Override
    int setUntung() {
        return this.untung = 50000;
    }
}

// F
class Kursi extends Barang {
    @Override
    String setName() {
        return this.nama = "Kursi";
    }

    @Override
    int setHargaBeli() {
        return this.hargaBeli = 150000;
    }

    @Override
    int setUntung() {
        return this.untung = 20000;
    }
}
