package com.ivanfaathirza;

public class Uchiha extends Konoha{
    protected String namaClan = "Uchiha";
    protected String[] kekeGenkai = {"Sharingan", "Mangekyou"};

    public String[] getKekeGenkai() {
        return kekeGenkai;
    }

    public String getNamaClan() {
        return namaClan;
    }

    public void tampil(){
        super.tampil();
        System.out.println("kekeGenkai : ");
        for (String x : getKekeGenkai()) {
            System.out.println("\t"+x);
        }
    }
}
