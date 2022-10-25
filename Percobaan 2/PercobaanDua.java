/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class PercobaanDua {
    public class Pegawai {
        String nama;
        public double gaji;
    }

public class Manajer extends Pegawai {
    public String departemen;
    public void IsiData(String n, String d) {
        nama=n; //error dikarenakan tidak ada modifier nama bertipe private yang tidak dapat diakses child classnya
        departemen=d;
    }
}
}
