/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class PercobaanDelapan {
    String parentName;
    PercobaanDelapan (){}

    PercobaanDelapan(String parentName) {
        this.parentName = parentName;
        System.out.println("Konstruktor parent");
    }
}
    
class Baby extends PercobaanDelapan {
    String babyName;
    
    Baby (String babyName) {
        super ();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
    }
    public void Cry(){
        System.out.println("Owek owek");
    }
}
