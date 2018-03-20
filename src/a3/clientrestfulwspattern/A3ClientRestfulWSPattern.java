package a3.clientrestfulwspattern;

import org.ClientRestful;

/**
 *
 * @author Queralt
 */

public class A3ClientRestfulWSPattern {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         ClientRestful client = new ClientRestful();
         System.out.print(client.getJson());
    }
}