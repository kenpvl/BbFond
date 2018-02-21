
package bbfond;

/**
 *
 * @author Ken
 */
public class Kniga {
    
    
     int id;
     String tip;
     String avtor;
     String naimenovanie; 
     String godizd;
     String stranic;
     String izdatelstvo;
     String zhanr;
     String kratkoe;
     String spisokst;
    
    
    public Kniga(int id, String tip, String avtor, String naimenovanie, String godizd, String stranic, String izdatelstvo, String zhanr , String kratkoe, String spisokst ) {
        this.id = id;
        this.tip = tip;
        this.avtor=avtor;
        this.naimenovanie=naimenovanie;    
        this.godizd=godizd;
        this.stranic=stranic;
        this.izdatelstvo=izdatelstvo;
        this.zhanr=zhanr;
        this.kratkoe=kratkoe;
        this.spisokst=spisokst;
    
    
    
    
    }
 
    
        
    public void printFK() {
        System.out.printf("%-7d%-14s%-60s%-22s%-9s%-20s%n",id,tip,naimenovanie,godizd,stranic,izdatelstvo);
    }
    
    public void printIK() {
        System.out.println(id + "     " + avtor+"     " + naimenovanie + "     " + godizd + "     " + stranic + "     " + izdatelstvo + "     " + zhanr + "     " + kratkoe);
    }
    
    
    public void printIJ() {
        System.out.println(naimenovanie + "     " + godizd + "     " + stranic + "     " + izdatelstvo + "     " + spisokst);
    }
    
    
    
   public void printIB() {
        System.out.println(naimenovanie + "     " + godizd + "     " + izdatelstvo + "     " + kratkoe);
    } 
    
    
    
}
