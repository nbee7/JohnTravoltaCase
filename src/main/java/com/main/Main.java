package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JohnTravolta johnTravolta = new JohnTravolta();
        System.out.print("Masukan Waktu Kerja Anda Berapa Jam Dalam Seminggu:");
        int waktu = in.nextInt();
        int gaji = johnTravolta.hitungGaji(waktu);
        System.out.println("Gaji anda minggu ini: "+gaji);

        System.out.print("Masukan Pengeluaran Anda Dalam Seminggu:");
        int pengeluaran = in.nextInt();
        System.out.println(johnTravolta.hitungPengeluaran(gaji,pengeluaran));
    }
}