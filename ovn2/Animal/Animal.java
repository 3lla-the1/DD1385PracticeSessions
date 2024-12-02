package Animal;
// övning 2 (abstrakta klasser)
// funkar likt interfaces
// man kan ha konstruktorer attribut och implementarede metoder
// man kan bara extenda en klass! (men man kan extenda hur många interfaces som helst)

public abstract class Animal{
    public boolean hungry = true;

    public boolean isHungry(){
        // alla har metoden
        return hungry;
    }

    //Ick implementarad metod.
    public abstract void feed();

}