
/**
 * Beschreiben Sie hier die Klasse kodierung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class kodierung
{
    
    Queue Sub;
    /**
     * Konstruktor für Objekte der Klasse kodierung
     */
    public kodierung()
    {
        Queue <String> Sub = new Queue<String>();
    }
    
    public Queue befüllen(){
        char a = 65;
        for(int i = 0; i < 26; i++, a++) {
            Sub.enqueue(a);
            System.out.print(a);
         }
        return Sub;
    }
    
    
    
}
