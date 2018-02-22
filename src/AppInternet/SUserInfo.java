package AppInternet;

import com.jcraft.jsch.UserInfo;

/**
 * Parametros del usuario para realizar la conexión
 * @author Pepe
 */
public class SUserInfo implements UserInfo{
    /** Variables password y passPhrase */ 
    private String password;
    private String passPhrase;
    /** Constructor SUserInfo
     * @param password Password de usuario linux
     * @param  passPhrase Passphrase
     */
    public SUserInfo (String password, String passPhrase) {
        this.password = password;
        this.passPhrase = passPhrase;
    }
    /** Método get para obtener passphrase
     * @return passPhrase passPhrase : Valor del Passphrase
     */
    public String getPassphrase() {
        return passPhrase;
    }
    /** Método get para obtener passphrase
     * @return password Password: Valor de la clave del usuario linux
     */
    public String getPassword() {
        return password;
    }
 
    public boolean promptPassphrase(String arg0) {
        return true;
    }
 
    public boolean promptPassword(String arg0) {
        return false;
    }
 
    public boolean promptYesNo(String arg0) {
        return true;
    }
 
    public void showMessage(String arg0) {
        System.out.println("SUserInfo.showMessage()");
    }  
}
