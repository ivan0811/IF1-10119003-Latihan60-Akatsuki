package com.ivanfaathirza;

public class Nagato extends Ame{
    public void tampil(String[] pain, String[] kekuatan, String Doujutsu) {
        super.tampil();
        System.out.println();
        System.out.println("Ke-6 Pain");
        for (int i = 0; i < pain.length; i++) {
            System.out.println("Nama Pain : "+pain[i]);
            System.out.println("Kekuatan : "+kekuatan[i]);
            System.out.println(Doujutsu);
            System.out.println();
        }
    }
}
