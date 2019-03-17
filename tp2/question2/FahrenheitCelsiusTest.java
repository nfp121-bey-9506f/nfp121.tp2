package question2;


/**
 * Classe-test FahrenheitCelsiusTest.
 *
 * @author  Jalal Hassane
 * @version 17/3/2019
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document © 2002 Robert A. Ballance intitulé
 * «JUnit: Unit Testing Framework».
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le même paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class FahrenheitCelsiusTest extends junit.framework.TestCase
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    private int fahrenheitTest1,fahrenheitTest2,fahrenheitTest3,fahrenheitTest4,fahrenheitTest5;
    private int fahrenheitTest6,fahrenheitTest7,fahrenheitTest8,fahrenheitTest9,fahrenheitTest10;
    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        fahrenheitTest1 = 5;
        fahrenheitTest2 = 202;
        fahrenheitTest3 = -100;
        fahrenheitTest4 = -1;
        fahrenheitTest5 = 10000;
        fahrenheitTest6 = 33;
        fahrenheitTest7 = 92;
        fahrenheitTest8 = 37;
        fahrenheitTest9 = 0;
        fahrenheitTest10 = 2;
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
        fahrenheitTest1=0;
        fahrenheitTest2=0;
        fahrenheitTest3=0;
        fahrenheitTest4=0;
        fahrenheitTest5=0;
        fahrenheitTest6=0;
        fahrenheitTest7=0;
        fahrenheitTest8=0;
        fahrenheitTest9=0;
        fahrenheitTest10=0;
    }

    /**
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test.
     * Ces méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient débuter par "test".
     * Vous pouvez ébaucher le corps grâce au menu contextuel "Enregistrer une méthode de test".
     */
public void test_fahrenheitEnCelcius1(){
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest1) == -15.0);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest2) == 94.4);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest3) == -73.3);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest4) == -18.3);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest5) == 5537.7);

    }
    public void test_fahrenheitEnCelcius2(){
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest5) == 0.5);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest6) == 33.3);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest7) == 2.7);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest8) == -17.7);
        assertTrue(question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheitTest9) == -16.6);

    }
}
