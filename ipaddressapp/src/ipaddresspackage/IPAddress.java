package ipaddresspackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IPAddress {
    public static void main(String[] args) {
        InetAddress ip;
        InetAddress[] ipv6;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            ipv6 = Inet6Address.getAllByName(hostname);
            System.out.println("IP Adress: " + ip);
            System.out.println("Hostname: " + hostname);
            System.out.println(Arrays.toString(ipv6));
        } catch(Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}