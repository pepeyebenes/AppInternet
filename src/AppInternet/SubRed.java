package AppInternet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Obtiene el tercer byte de la dirección ip del aula
 * @author José M. Yébenes
 */
public class SubRed {
    /** Constructor SubRed()  */
    public SubRed() {}
    /** Método que obtiene la dirección IP
     *  @return sIpAddress sIpAddress: String con el tercer byte de 
     *  la dirección IP del aula
     */
    public String getSubred() throws UnknownHostException {
       String sIpAddress = "";
       InetAddress address = InetAddress.getLocalHost();
       byte[] bIpAddress = address.getAddress();
       sIpAddress += bIpAddress[2] & 255;
       return sIpAddress;
   }
}
