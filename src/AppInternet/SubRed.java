/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppInternet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Pepe
 */
public class SubRed {
   public SubRed() {}
   public String getSubred() throws UnknownHostException {
       String sIpAddress = "";
       InetAddress address = InetAddress.getLocalHost();
       byte[] bIpAddress = address.getAddress();
       sIpAddress += bIpAddress[2] & 255;
       return sIpAddress;
   }
}
