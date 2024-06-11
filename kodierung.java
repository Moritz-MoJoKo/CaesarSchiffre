
/**
 * Beschreiben Sie hier die Klasse kodierung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class kodierung
{
    
    private Queue<String> Sub;
    private int key;
    /**
     * Konstruktor für Objekte der Klasse kodierung
     */
    public kodierung()
    {
        Queue <String> Sub = new Queue<String>();
    }
    
    public Queue<String> befuellen() {
        char a = 65; // ASCII-Wert für 'A'
        for (int i = 0; i < 26; i++) {
            String c = String.valueOf(a);
            Sub.enqueue(c);
            System.out.print(a);
            a++;
        }
        return Sub;
    }
    
    
    
    
    
}
