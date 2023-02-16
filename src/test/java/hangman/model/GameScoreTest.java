package hangman.model;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    /*
    * Clase equivalencia: Funciona con valores dentro del rango para originalScore
    * Resultado: Correcto
    * Frontera: score > 0
    */

    @Test
    public void OriginalScoreTest(){
        GameScore original = new OriginalScore();
        int score = original.calculateScore(5,5);
        Assert.assertEquals(score, 50);
    }
    /*
    * Clase equivalencia: Funciona con valores dentro del rango para BonusScore
    * Resultado: Correcto
    * Frontera: score > 0
    */
    @Test
    public void BonusScoreTest(){
        GameScore original = new BonusScore();
        int score = original.calculateScore(5,5);
        Assert.assertEquals(score, 25);
    }
    /*
    * Clase equivalencia: Funciona con valores dentro del rango para powrScore
    * Resultado: Correcto
    * Frontera: 0 < score <= 500
    */
    @Test
    public void PowerScoreTest(){
        GameScore original = new PowerScore();
        int score = original.calculateScore(5,5);
        Assert.assertEquals(score, (5^5)-5*8);
    }

}
