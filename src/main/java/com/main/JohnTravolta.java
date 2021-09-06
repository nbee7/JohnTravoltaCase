package com.main;

public class JohnTravolta {

    public int hitungGaji(int waktu) throws JohnOutOfBond {
        double gaji;
        int gajiNormal = 15000;
        int gajiLembur = 15000 * 150 / 100;

        if(waktu < 0){
            throw new IllegalArgumentException("Masukan Bilangan Positif");
        }
        else if(waktu > 168){
            throw new JohnOutOfBond("waktu yang nda masukan lebih dari seminggu");
        }
        else{
            if(waktu > 40){
                int waktuLembur = waktu - 40;
                int waktuKerja = waktu - waktuLembur;
                gaji = (waktuKerja * gajiNormal) + (waktuLembur * gajiLembur);
            }else {
                gaji = waktu * gajiNormal;
            }
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
