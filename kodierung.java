
/**
 * Beschreiben Sie hier die Klasse kodierung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class kodierung
{
    
    private Queue<Character> Sub;
    private int key;
    /**
     * Konstruktor für Objekte der Klasse kodierung
     */
    public kodierung()
    {
        Queue <Character> Sub = new Queue<Character>();
    }
    
    public Queue<Character> befuellen() {
        Sub = this.Sub;
        char a = 65; // ASCII-Wert für 'A'
        for (int i = 0; i < 26; i++) {
            Sub.enqueue(a);
            System.out.print(a);
            a++;
        }
        return Sub;
    }
    
    
    
    
    
}
