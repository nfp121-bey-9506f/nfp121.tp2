package question2;


/**
 * Classe-test FahrenheitCelsiusTest.
 *
 * @author  Jalal Hassane
 * @version 17/3/2019
 *
 * Les classes-test sont document�es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont bas�es sur le document � 2002 Robert A. Ballance intitul�
 * �JUnit: Unit Testing Framework�.
 *
 * Les objets Test (et TestSuite) sont associ�s aux classes � tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le m�me paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque m�thode Test � ex�cuter.  Il peut y avoir
 * plus d'une m�thode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ d�couvrira automatiquement (par introspection) les m�thodes
 * Test de votre classe Test et g�n�rera la TestSuite cons�quente.
 * Chaque appel d'une m�thode Test sera pr�c�d� d'un appel de setUp(),
 * qui r�alise les engagements, et suivi d'un appel � tearDown(), qui les
 * d�truit.
 */
public class FahrenheitCelsiusTest extends junit.framework.TestCase
{
    // D�finissez ici les variables d'instance n�cessaires � vos engagements;
    // Vous pouvez �galement les saisir automatiquement du pr�sentoir
    // � l'aide du menu contextuel "Pr�sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pr�sentoir (les objets sans constructeur, comme int, float, etc.).
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
     * M�thode appel�e avant chaque appel de m�thode de test.
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
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Lib�rez ici les ressources engag�es par setUp()
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
     * Il ne vous reste plus qu'� d�finir une ou plusieurs m�thodes de test.
     * Ces m�thodes doivent v�rifier les r�sultats attendus � l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient d�buter par "test".
     * Vous pouvez �baucher le corps gr�ce au menu contextuel "Enregistrer une m�thode de test".
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
