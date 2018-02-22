
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
 * Conexión SSH con servidor Linux
 * @author Pepe
 */
public class ConexionSSH {
        /** Valores de la constantes user, host, pot y pass */
        private static final String user = "operador";
        private static final String host = "10.0.1.113";
        private static final Integer port = 22;
        private static final String pass = "AAA111aaa";
        /** Constructor */
        public void ConexionSSH() {}
        /** Método que ejecuta la conexión 
         * @param comando Script a ejecutar en el servidor Linux
         */
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
