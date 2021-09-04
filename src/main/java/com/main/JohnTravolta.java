package com.main;

public class JohnTravolta {

    public int hitungGaji(int waktu){
        double gaji;
        int gajiNormal = 15000;
        int gajiLembur = 15000 * 150 / 100;

        if(waktu >= 0){
            if(waktu > 40){
                int waktuLembur = waktu - 40;
                int waktuKerja = waktu - waktuLembur;
                gaji = (waktuKerja * gajiNormal) + (waktuLembur * gajiLembur);
            }else {
                gaji = waktu * gajiNormal;
            }
        }else{
            throw new IllegalArgumentException("Masukan bilangan postif");
        }
        return (int) gaji;
    }

    public String hitungPengeluaran(int gaji, int pengeluaran){
        String pesan;

        if(gaji >= 0 && pengeluaran >= 0){
            if (gaji > pengeluaran) {
                pesan = "Bisa Menabung Sebesar: " + (gaji - pengeluaran);
            } else if (gaji == pengeluaran) {
                pesan = "Tidak Bisa Menabung";
            } else {
                pesan = "Cari Tambahan";
            }
        }else{
            throw new IllegalArgumentException("Masukan Bilangan Positif");
        }
        return pesan;
    }
}
