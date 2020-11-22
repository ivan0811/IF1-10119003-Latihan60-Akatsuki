package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan daftar anggota Akatsuki
 */

public class Main {

    public static void main(String[] args) {
        Karakter deidara, kisame, hidan, sasori, zetsu;
        Konoha orochimaru;
        Uchiha tobi;
        Ame konan;
        Pain ningendou, jigokudou, shuradou, tendou, gakidou, chikusodou;

        deidara = new Deidara();
        deidara.setNama("Deidara");
        deidara.setJenisKelamin("l");
        deidara.setAsalDesa("Iwa");
        deidara.setElemen(new String[]{"Ledakan", "Tanah"});
        deidara.setKekuatanUtama("C4");
        deidara.setLatarBelakang("Deidara adalah seorang murid di bawah Tsuchikage Ketiga: Ōnoki");
        deidara.tujuan();
        deidara.tampil();
        System.out.println();

        kisame = new Kisame();
        kisame.setNama("Kisame Hoshigaki");
        kisame.setJenisKelamin("l");
        kisame.setAsalDesa("Kiri");
        kisame.setElemen(new String[]{"Air", "Api", "Angin", "Tanah"});
        kisame.setKekuatanUtama("Gelombang Hiu Air Hujan");
        kisame.setTingkatNinja("Anbu");
        kisame.setLatarBelakang("Kisame adalah anggota Cypher Divisi-nin.");
        kisame.tujuan();
        kisame.tampil();
        System.out.println();

        hidan = new Hidan();
        hidan.setNama("Hidan");
        hidan.setJenisKelamin("l");
        hidan.setAsalDesa("Yuga");
        hidan.setElemen(new String[]{"None"});
        hidan.setKekuatanUtama("Curse Technique: Death Controlling Possessed Blood");
        hidan.setLatarBelakang("Dia percaya bahwa shinobi yang tinggal di sana dimaksudkan untuk di dibunuh, dan dibantai negara tetangganya sebelum meninggalkan Yugakure, dan bergabung dengan semacam aliran dikenal sebagai Jashin, agama yang menyembah dewa dengan nama yang sama.");
        hidan.tujuan();
        hidan.tampil();
        System.out.println();

        sasori = new Sasori();
        sasori.setNama("Sasori");
        sasori.setJenisKelamin("l");
        sasori.setAsalDesa("Suna");
        sasori.setElemen(new String[]{"Magnet"});
        sasori.setKekuatanUtama("Puppet Performance: Skilful Achievement with a Human Body");
        sasori.setTingkatNinja("Jonin");
        sasori.setLatarBelakang(" Chiyo mengajari Sasori mengendalikan boneka saat Sasori berumur 5 tahun dan dia terus berlatih cara mengendalikan boneka. ");
        sasori.tujuan();
        sasori.tampil();
        System.out.println();

        zetsu = new Zetsu();
        zetsu.setNama("zetsu");
        zetsu.setJenisKelamin("l");
        zetsu.setAsalDesa("Akatsuki");
        zetsu.setElemen(new String[]{"Kayu", "Api", "Angin", "Petir", "Tanah", "Air", "Yin", "Yang"});
        zetsu.setKekuatanUtama("Teknik Pengganti");
        zetsu.setLatarBelakang("Zetsu adalah salah satu korban Kaguya Ōtsutsuki dalam Tsukuyomi tak terbatas");
        zetsu.tujuan();
        zetsu.tampil();
        System.out.println();

        orochimaru = new Orochimaru();
        orochimaru.setNama("Orochimaru");
        orochimaru.setJenisKelamin("l");
        orochimaru.setElemen(new String[]{"Angin", "Petir", "Tanah", "Air", "Api", "Kayu", "Yin", "Yang"});
        orochimaru.setKekuatanUtama("Juinjutsu Orochimaru");
        orochimaru.setTingkatNinja("Anbu");
        orochimaru.setLatarBelakang("Orochimaru adalah seorang yatim piatu, bersama Jiraiya dan Tsunade menjadi murid dari Hiruzen Sarutobi");
        orochimaru.tujuan();
        orochimaru.tampil();
        System.out.println();

        tobi = new Tobi();
        tobi.setNama("Tobi");
        tobi.setJenisKelamin("l");
        tobi.setElemen(new String[]{"Api", "Angin", "Petir", "Tanah", "Air", "Kayu", "Yin", "Yang", "Yin-Yang"});
        tobi.setKekuatanUtama("Tsukuyomi Tidak Terbatas");
        tobi.setTingkatNinja("Chunin");
        tobi.setLatarBelakang("Obito, Rin, dan Kakashi ditempatkan pada sebuah tim di bawah kepemimpinan Minato Namikaze.");
        tobi.tujuan();
        tobi.tampil();
        System.out.println();

        Itachi itachi = new Itachi();
        itachi.setNama("Itachi "+ itachi.getNamaClan());
        itachi.setJenisKelamin("l");
        itachi.setElemen(new String[]{"Api", "Angin", "Air", "Yin", "Yang"});
        itachi.setKekuatanUtama("Tsukuyomi");
        itachi.setTingkatNinja("Anbu");
        itachi.setLatarBelakang("Itachi adalah anak sulung dari Mikoto dan Fugaku Uchiha.");
        itachi.tujuan();
        itachi.tampil();
        System.out.println();

        konan = new Konan();
        konan.setNama("Konan");
        konan.setJenisKelamin("p");
        konan.setElemen(new String[]{"Angin", "Tanah", "Air", "Yang"});
        konan.setKekuatanUtama("Teknik Orang Kertas Dewa");
        konan.setLatarBelakang("Ketika dia masih muda, keluarga Konan terbunuh selama Perang Dunia Shinobi Kedua, dan dia dibiarkan berjuang sendiri. [3] Beberapa waktu kemudian, Yahiko menemukannya, dan keduanya bekerja bersama untuk bertahan hidup. Tidak lama setelah itu, Konan berjalan-jalan dan menemukan Nagato yang masih muda dan anjingnya, Chibi.");
        konan.tujuan();
        konan.tampil();
        System.out.println();

        ningendou = new Ningendou();
        ningendou.setNama("Ningendou");
        ningendou.setKekuatan("Menarik Arwah dan membaca pikiran");

        jigokudou = new Jigokudou();
        jigokudou.setNama("Jigokudou");
        jigokudou.setKekuatan("Gedou Rinne Tensei no Jutsu");

        shuradou = new Shuradou();
        shuradou.setNama("Shuradou");
        shuradou.setKekuatan("mengeluarkan rudal maupun mengeluarkan senjata api lain");

        tendou = new Tendou();
        tendou.setNama("Tendou");
        tendou.setKekuatan("Shinra Tensei sebagai teknik menghempaskan apa pun, Bansho Tensei sebagai teknik menarik apa pun dan Chibaku Tensei");

        gakidou = new Gakidou();
        gakidou.setNama("Gakidou");
        gakidou.setKekuatan("menghisap chakra");

        chikusodou = new Chikusodou();
        chikusodou.setNama("Chikusodou");
        chikusodou.setKekuatan("kemampuan Kuchiyose");

        String[] pain = {ningendou.getNama(), jigokudou.getNama(), shuradou.getNama(), tendou.getNama(), gakidou.getNama(), chikusodou.getNama()};
        String[] kekuatan = {ningendou.getKekuatan(), jigokudou.getKekuatan(), shuradou.getKekuatan(), tendou.getKekuatan(), gakidou.getKekuatan(), chikusodou.getKekuatan()};

        Nagato nagato = new Nagato();
        nagato.setNama("Nagato");
        nagato.setJenisKelamin("l");
        nagato.setElemen(new String[]{"Api", "Angin", "Petir", "Tanah", "Air", "Yang"});
        nagato.setKekuatanUtama("Rinne Tensei");
        nagato.setLatarBelakang("Nagato tinggal bersama orang tuanya di sebuah desa di pinggiran Amegakure. Ketika ia masih sangat muda, Madara Uchiha diam-diam mentransplantasikan Rinnegan-nya ke Nagato tanpa sepengetahuan atau orang tuanya.");
        nagato.tujuan();
        nagato.tampil(pain, kekuatan, tendou.getDoujutsu());
    }
}
