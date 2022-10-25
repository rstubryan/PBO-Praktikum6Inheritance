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
        private String nama;
        public double gaji;
    }

public class Manajer extends PercobaanDua {
    public String departemen;
    public String nama; //penambahan public String nama
    public void IsiData(String n, String d) {
        nama=n; //error dikarenakan tidak ada method nama
        departemen=d;
    }
}
}
