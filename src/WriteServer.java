/**
 * Created by s_chernykh on 03.05.2017.
 */

import java.net.*;

public class WriteServer {
    private static int clientPort = 999;
    private static int buffer_size= 1024;
    private static DatagramSocket ds;
    private static byte buffer[] =new byte[buffer_size];

    private static void TheServer() throws Exception {
        int pos = 0;
        while (true){
            int c = System.in.read();
            switch (c) {
                case -1:
                    System.out.println("Server shutdown.");
                    ds.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    ds.send(new DatagramPacket(buffer,pos,
                            InetAddress.getLocalHost(),clientPort));
                    pos=0;
                    break;
                    default:
                        buffer[pos++]=(byte) c;
            }
        }

    }

    private static void TheClient() throws Exception {
        while (true) {
            DatagramPacket p = new DatagramPacket(buffer,buffer.length);
            ds.receive(p);
            String str =new String(p.getData(),0,p.getLength());

            if(!str.equals("fuckoff"))
                System.out.println(str);
            else
                break;



        }
    }

    public static void main(String[] args) throws Exception {
        if(args.length==1) {
            int serverPort = 998;
            ds = new DatagramSocket(serverPort);
            TheServer();
        }else {
            ds = new DatagramSocket(clientPort);
            TheClient();
        }
    }


}
