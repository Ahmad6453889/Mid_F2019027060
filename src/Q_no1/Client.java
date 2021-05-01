/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_no1;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Muhammad Ahmed
 */
public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",456);
            DataOutputStream  dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Helo ahmed");
            dout.flush();
            dout.close();
            dout.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}
