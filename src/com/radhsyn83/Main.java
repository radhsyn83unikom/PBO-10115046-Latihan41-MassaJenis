package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        Kubus k = new Kubus();

        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        k.setSisi(s.nextInt());
        System.out.print("Massa : ");
        k.setMassa(s.nextInt());
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+k.hitungVoulume(k.getSisi()));
        System.out.println("Massa Jenis : "+k.hitungMassaJenis(k.getMassa(), k.hitungVoulume(k.getSisi())));
    }
}
