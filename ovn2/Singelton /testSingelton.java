public class testSingelton {
    public static void main(String[] args) { // även om metoden är inne i metoden singelton måte man ite skapa ett objekt
        // Singelton s new Singelton(); fukar ej hehe
        Singelton s1 = Singelton.getInstance;
        Singelton s2 = Singelton.getInstance;

        System.out.println(s1 == s2);
    }
}
