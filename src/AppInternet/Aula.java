/*
* Obtiene nombre del script del servidor Linux
*  @author Pepe
*/
package AppInternet;

public class Aula {
    /**
    * Constructor Aula()
    */
    public Aula() {}
    /** Método que obtiene el nombre del script 
     * @param red Tercer byte de la dirección IP del aula
     */
    public String getAula(String red) {
        String numaula="";
        
        switch (red) {
            case "6" : numaula = "a06.sh";
                       break; 
            case "19": numaula = "a18.sh";
                       break;
            case "9" : numaula = "b201.sh";
                       break;
            case "11": numaula = "b202.sh";
                       break;
            case "36": numaula = "b203.sh";
                       break;
            case "7" : numaula = "b204.sh";
                       break;
            case "12": numaula = "b305.sh";
                       break;
            case "35": numaula = "c09.sh";
                       break;
            case "22": numaula = "d202.sh";
                       break;
            case "23": numaula = "d203.sh";
                       break;
            case "4" : numaula = "m01.sh";
                       break;
            case "13": numaula = "m02.sh";
                       break;
            case "1": numaula = "b102.sh";
                       break;           
            default:   break;          
        }
        return numaula;
    }
}
