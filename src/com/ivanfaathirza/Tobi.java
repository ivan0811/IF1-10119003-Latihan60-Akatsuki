package com.ivanfaathirza;

public class Tobi extends Uchiha{
    protected String namaAsli = "Obito"+getNamaClan();

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama Asli : "+namaAsli);
    }
}
