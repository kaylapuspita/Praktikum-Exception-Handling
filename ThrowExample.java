/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author ACER
 */
public class ThrowExample {
    static void demo() {
        NullPointerException t = new NullPointerException("Coba Throw");
        throw t;
        // Baris di bawah tidak bisa dijalankan, jadi harus dihapus
        // System.out.println("Ini tidak lagi dicetak");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai"); // Ini juga tidak dicetak karena throw langsung ke catch
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}

