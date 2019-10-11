package sockettrain;

import java.io.*;
import java.net.Socket;

public class SocketTest {
    public static void main(String []args){
        String clientName = new String("169.254.190.134");
          int port = 8089;
        try{
            Socket client = new Socket(clientName,port);
            OutputStream client2Server = client.getOutputStream();
            DataOutputStream out  = new DataOutputStream(client2Server);
            out.writeUTF(client.getLocalSocketAddress().toString());
            InputStream fromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(fromServer);
            System.out.println("Message from Server:"+in.readUTF());
            client.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
