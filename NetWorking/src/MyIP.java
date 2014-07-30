import java.net.InetAddress;


public class MyIP {

    public void getIP() {
      try {
      InetAddress IP = InetAddress.getLocalHost();
      System.out.println("my IP is: " + IP.getHostAddress());                
      }
      catch(Exception e){e.printStackTrace();}
    }
    
    public static void main(String[] args) {
        new MyIP().getIP();
        }
   }