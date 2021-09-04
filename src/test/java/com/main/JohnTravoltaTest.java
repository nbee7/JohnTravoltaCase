package com.main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("John travolta test")
public class JohnTravoltaTest {

    JohnTravolta johnTravolta = new JohnTravolta();

    @Test
    @DisplayName("Test skenario gagal ketika input gaji minus")
    public void TestCase1Error(){
        assertThrows(IllegalArgumentException.class,() -> johnTravolta.hitungGaji(-52));
    }

    @Test
    @DisplayName("Test skenario gagal ketika input pengeluaran minus")
    public void TestCase2Error(){
        assertThrows(IllegalArgumentException.class,() -> johnTravolta.hitungPengeluaran(-2000000,-2000000));
    }

    @Test
    @DisplayName("Test skenario sukses untuk user.hitungGaji(int) lebih dari 40")
    public void TestCase1Success() {
        double result = johnTravolta.hitungGaji(52);
        assertEquals(870000, result);
    }

    @Test
    @DisplayName("Test Skenario sukser untuk user.hitungGaji(int) kurang dari 40")
    public void TestCase2Success() {
        double result = johnTravolta.hitungGaji(30);
        assertEquals(450000, result);
    }

    @Test
    @DisplayName("Test skenario sukses untuk bisa menabung")
    public void TestCase3Success() {
        String result = johnTravolta.hitungPengeluaran(300000, 20000);
        assertEquals("Bisa Menabung Sebesar: 280000", result);
    }

    @Test
    @DisplayName("Test skenario sukses untuk tidak bisa menabung")
    public void TestCase4Success() {
        String result = johnTravolta.hitungPengeluaran(300000, 300000);
        assertEquals("Tidak Bisa Menabung", result);
    }

    @Test
    @DisplayName("Test skenario sukses untuk cari tambahan")
    public void TestCase5success() {
        String result = johnTravolta.hitungPengeluaran(300000, 320000);
        assertEquals("Cari Tambahan", result);
    }
}
