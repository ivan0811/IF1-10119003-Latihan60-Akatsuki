package com.ivanfaathirza;

public class Karakter {
    protected String nama, latarBelakang, jenisKelamin, tingkatNinja, kekuatanUtama, asalDesa;
    protected String[] elemen;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin.equals("l") ? "Laki-laki" : "Perempuan";
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setLatarBelakang(String latarBelakang) {
        this.latarBelakang = latarBelakang;
    }

    public String getLatarBelakang() {
        return latarBelakang;
    }

    public void setTingkatNinja(String tingkatNinja) {
        this.tingkatNinja = tingkatNinja;
    }

    public String getTingkatNinja() {
        return tingkatNinja;
    }

    public void setKekuatanUtama(String kekuatanUtama) {
        this.kekuatanUtama = kekuatanUtama;
    }

    public String getKekuatanUtama() {
        return kekuatanUtama;
    }

    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public void setElemen(String[] elemen) {
        this.elemen = elemen;
    }

    public String[] getElemen() {
        return elemen;
    }

    public void tujuan(){
        System.out.println("Tujuan : Perdamian dengan mugen tsukuyomi");
    }

    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Latar Belakang : "+getLatarBelakang());
        System.out.println("Jenis Kelamin : "+getJenisKelamin());
        System.out.println("Tingkat Ninja : "+getTingkatNinja());
        System.out.println("Elemen : ");
        for (int i = 0; i < getElemen().length; i++) {
            System.out.println("\t"+getElemen()[i]);
        }
        System.out.println("Kekuatan Utama : "+getKekuatanUtama());
        System.out.println("Asal Desa : "+getAsalDesa());

    }
}
