
// En enda instans av objektet, det ska ej gå att göra fler objekt.
// Om man har en klass som man vill komma åt överallt 

public final class Singelton { //final kan ej extendas!

    private static Singelton instance; // privat, ej utifrån, staic till klassen, av typen sig själv
    
    private Singelton() {}  // hade vi inte haft nån sådan hade den blvit public
    
    // SYNKRONISERADE ANROP: (asyncronous programming) förhindrar att köra samtidigt
    // skapas första gången, annars returnerar den som finns
    public static synchronized Singelton getInstance(){
        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }
}




// static -> tillhör klassen och inte objektet
// Math finns i java: 
// Math.cos()   (där math är klassen och är static!)
// Behöver ej skriva Math m = new Math() (här tillhör den objektet vilknet den ej gör)

// Class Math(){
// Public static double cos()  //static
// }

// FINAL
// ett final attribut kan inte ändras
// en final class kan ej extendas



