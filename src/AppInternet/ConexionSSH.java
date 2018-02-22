/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppInternet;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Pepe
 */
public class ConexionSSH {
    private static final String user = "operador";
    private static final String host = "10.0.1.113";
    private static final Integer port = 22;
    private static final String pass = "AAA111aaa";
    public void ConexionSSH() {}
    public void ejecutarComando(String comando) throws JSchException, IOException {
        JSch jsch = new JSch();
        Session session = jsch.getSession(user, host, port);
        UserInfo ui = new SUserInfo(pass, null);
        session.setUserInfo(ui);
        session.setPassword(pass);
        session.connect();
        ChannelExec channelExec = (ChannelExec)session.openChannel("exec");
        InputStream in = channelExec.getInputStream();
        channelExec.setCommand(comando);
        channelExec.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String linea = null;
        int index = 0;
        while ((linea = reader.readLine()) != null) {}
        channelExec.disconnect();
        session.disconnect();
    }
}
