/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedprojectrentalgames;

/**
 *
 * @author ASUS
 */
public class Membership {
    String idMember, namaMember, jenisMember;
    
    Membership(String id, String nama, String jenis){
        this.idMember = id;
        this.namaMember = id;
        this.jenisMember = jenis;
    }
    void printMembership(){
        System.out.println("ID Member: " + this.idMember);
        System.out.println("Nama Member: " + this.idMember);
        System.out.println("Jenis Member: " + this.idMember);
    }
}