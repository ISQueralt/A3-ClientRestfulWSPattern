package a3.clientrestfulwspattern;

/**
 *
 * @author Queralt
 */

public class A3ClientRestfulWSPattern {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.print(getActualTime());
    }

    private static String getActualTime() {
        restfulwspattern.Time_Service service = new restfulwspattern.Time_Service();
        restfulwspattern.Time port = service.getTimePort();
        return port.getActualTime();
    } 
}