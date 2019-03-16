package question1;

/**
 * classe FahrenheitCelsius sert � convertir une temp�rature en echelle Fahrenheit � une temp�rature en echelle Celsius.
 * les temp�ratures � convertir sont pass�es des la ligne de commande
 * 
 * @author jalal Hassane
 * @version 16/3/2019
 */
public class FahrenheitCelsius {
    
    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        for(int i =0;i<args.length;i++){
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        }
    }

    /**
     * 
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        double celsius =  5.0/9 * (f - 32);            //conversion de fahrenheit en celsius
        celsius = ((int)(celsius*10))/10.0;            //nombre avec un seul chiffre apres la virgule
        return (float)celsius;
    }
}
