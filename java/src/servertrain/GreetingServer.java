package servertrain;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetingServer extends Thread{
    private ServerSocket serverSocket;
    private int port ;
    public GreetingServer(int port)throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(1000);
    }

    @Override
    public void run(){
        while (true){
            try {
                Socket server = serverSocket.accept();
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out =new DataOutputStream(server.getOutputStream());
                out.writeUTF("thinks!" + server.getLocalSocketAddress() + "\nGoodbye!");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }



}
