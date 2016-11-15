/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author LENOVO_E10
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance
        Hewan hn =new Hewan ();
        
        System.out.println(hn.Nama());
        System.out.println(hn.beranak());
        System.out.println(hn.bertelur());
                
    }
    
}
class Hewan {
    public String Nama (){
        return"nama saya = M. ZAINUL HASAN";
    }
    public String beranak (){
        return"hewan melahirkan = sapi,kambing,kuda";
        
    }    
    public String bertelur (){
        return"hewan bertelur = ayam,itik,burung";
    }
    