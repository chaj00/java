package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest01 {
	public static void main(String[] args){
		try {
			InetAddress ia = InetAddress.getByName(args[0]);
			System.out.println("����Ϸ�");
			System.out.println("ia.getHostName()=>"+ia.getHostName());
			System.out.println("ia.getHostAddress()=>"+ia.getHostAddress());
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
