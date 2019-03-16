package question1;

/**
 * classe FahrenheitCelsius sert à convertir une température en echelle Fahrenheit à une température en echelle Celsius.
 * les températures à convertir sont passées des la ligne de commande
 * 
 * @author jalal Hassane
 * @version 16/3/2019
 */
public class FahrenheitCelsius {
    
    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
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
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        double celsius =  5.0/9 * (f - 32);            //conversion de fahrenheit en celsius
        celsius = ((int)(celsius*10))/10.0;            //nombre avec un seul chiffre apres la virgule
        return (float)celsius;
    }
}
