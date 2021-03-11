package com.tugaspbo.abstracts;

/*
Created at Thursday 11 March 2021
Licensed @myaasiinh
Tugas tanggal 4 Februari 2021
 */

abstract class Hewan {

    String nama;

    public abstract void habitatHewan();

    public void namaHewan() {

        System.out.println("\n Method didalam abstract class hewan");
        System.out.println("Nama hewan :"+nama);
    }
}



