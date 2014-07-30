 import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class AllHosts {

	public void checkHosts(String subnet){
		   int timeout = 1000;
		   for (int i = 1;i<254;i ++){
		       String host = subnet + "." + i;
		       try {
				if (InetAddress.getByName(host).isReachable(timeout)){
				       System.out.println(host);
				   }
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		}
}
