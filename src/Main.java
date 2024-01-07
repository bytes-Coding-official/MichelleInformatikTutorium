import java.lang.reflect.UndeclaredThrowableException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gib deinen Namen ein: ");
        var scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.println("Hallo " + name);
        System.out.println("Gib dein Alter ein: ");
        var alter = scanner.nextInt();
        System.out.println("Du bist " + alter*365 + " Tage alt");
        
        
        //read in an amount of some seconds and convert that into years, month, days, hours, minutes and seconds
        System.out.println("Gib eine Anzahl an Sekunden ein: ");
        var sekunden = scanner.nextInt();
        
        var jahre = sekunden / (365 * 24 * 60 * 60);
        var monate = (sekunden % (365 * 24 * 60 * 60)) / (30 * 24 * 60 * 60);
        var tage = (sekunden % (30 * 24 * 60 * 60)) / (24 * 60 * 60);
        var stunden = (sekunden % (24 * 60 * 60)) / (60 * 60);
        var minuten = (sekunden % (60 * 60)) / 60;
        var sekundenRest = sekunden % 60;
        
        System.out.println("Das sind " + jahre + " Jahre, " + monate + " Monate, " + tage + " Tage, " + stunden + " Stunden, " + minuten + " Minuten und " + sekundenRest + " Sekunden");
        
        
        //berechne die jahre in dem format
        /*
        das sind 0 jahre
        das sind 3 monate
        das sind 2 tage
        etc.
        schreibe den code dafür in die main methode
        * */
        
        
        
        
        
     
        
        /*  var geburtstag = scanner.
                nextLine();
  
        //berechne das genaue alter in tagen abhängig vom geburtstag im format dd.mm.yyyy
        
        var date = geburtstag.split("\\.");
        var tag = Integer.parseInt(date[0]);
        var monat = Integer.parseInt(date[1]);
        var jahr = Integer.parseInt(date[2]);
        
        var currentDate = new java.util.Date();
        var currentDay = currentDate.getDate();
        var currentMonth = currentDate.getMonth() + 1;
        var currentYear = currentDate.getYear() + 1900;
        
        //berechne das alter in tagen
        var alterInTagen = 0;
        
        //berechne das alter in tagen
        alterInTagen = (currentYear - jahr) * 365;
        alterInTagen += (currentMonth - monat) * 30;
        alterInTagen += (currentDay - tag);
        
        System.out.println("Du bist " + alterInTagen + " Tage alt");
*/
    }
    
    
    
    
    
    
    
    
    


    public void putzen() {
        //putze raum 1
        //putze raum 2
        //putze raum 3
        autobauen();
    }

    public boolean autobauen() {

        var autofertig = false;
        //baue teil 1
        //baue teil 2
        //baue teil 3
        //baue teil 4


        //Datentyp Name = Wert;
        //Sub(Upper)typ Name = new Datentyp();

        autofertig = true;

        return autofertig;
    }


    public void putze2(){
        
     var array = new Integer[3];
     
     
        
    }
    
    
    
    
    
    public static void begruesseKunde(String vorname, String nachname){
        System.out.println("Hallo " + vorname + " " + nachname);
    }

    /**
     * Addiert zwei Zahlen
     * @param zahl1 wird addiert mit zahl2
     * @param zahl2 wird addiert mit zahl1
     * @return gibt die Summe von zahl1 und zahl2 zurück
     */
    public int addiere(int zahl1, int zahl2){
        return zahl1 + zahl2; 
    }
}
