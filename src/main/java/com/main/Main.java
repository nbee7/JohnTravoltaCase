package com.main;

import com.main.JohnTravolta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Waktu Kerja Anda Berapa Jam Dalam Seminggu:");
        int waktu = in.nextInt();
        System.out.print("Masukan Pengeluaran Anda Dalam Seminggu:");
        int pengeluaran = in.nextInt();

        JohnTravolta johnTravolta = new JohnTravolta();
        int gaji = johnTravolta.hitungGaji(waktu);
        System.out.print("Gaji anda minggu ini: ");
        System.out.println(gaji);
        System.out.println(johnTravolta.hitungPengeluaran(gaji,pengeluaran));
    }
}