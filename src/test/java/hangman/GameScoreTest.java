package hangman;

import org.junit.jupiter.api.Test;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;
import junit.framework.Assert;

/**
 * Clases de equivalencia
 * x --> correctCount
 * y --> incorrectCount
 * 1. Calcular de manera correcta OriginalScore (0 < x, 0 < y)
 * 2. Calcular de manera correcta BonusScore (0 < x, 0 < y)
 * 3. Calcular de manera correcta PowerBonusScore (0 < x, 0 < y)
 * 4. Calcular de manera correcta limite inferior OriginalScore (0 < x, 0 < y)
 * 5. Calcular de manera correcta limite inferior BonusScore (0 < x, 0 < y)
 * 6. Calcular de manera correcta limite inferior PowerBonusScore (0 < x, 0 < y)
 * 7. Calcular de manera correcta limite superior PowerBonusScore (0 < x, 0 < y)
 * 8. Probar excepcion de parametros negativos (x < 0, y < 0)
 */

public class GameScoreTest {
    

    @Test
    public void validateScoreOriginalScore() {
        OriginalScore oScore = new OriginalScore();
        try {
            int ans = oScore.calculateScore(10, 6);
            Assert.assertEquals(ans, 40);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }  
    }

    @Test
    public void validateMinScoreOriginalScore() {
        OriginalScore oScore = new OriginalScore();
        try {
            int ans = oScore.calculateScore(10, 12);
            Assert.assertEquals(ans, 0);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }  
    }

    @Test
    public void validateScoreBonusScore() {
        BonusScore bScore = new BonusScore();
        try {
            int ans = bScore.calculateScore(12, 8);
            Assert.assertEquals(ans, 80);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }

    @Test
    public void validateMinScoreBonusScore() {
        BonusScore bScore = new BonusScore();
        try {
            int ans = bScore.calculateScore(12, 24);
            Assert.assertEquals(ans, 0);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }

    @Test
    public void validateScorePowerBonusScore() {
        PowerBonusScore pScore = new PowerBonusScore();
        try {
            int ans = pScore.calculateScore(3, 5);
            Assert.assertEquals(ans, 115);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }   
    }

    @Test
    public void validateMinScorePowerBonusScore() {
        PowerBonusScore pScore = new PowerBonusScore();
        try {
            int ans = pScore.calculateScore(2, 5);
            Assert.assertEquals(ans, 0);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }   
    }

    @Test
    public void validateMaxScorePowerBonusScore() {
        PowerBonusScore pScore = new PowerBonusScore();
        try {
            int ans = pScore.calculateScore(4, 3);
            Assert.assertEquals(ans, 500);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }

    @Test
    public void validateGameScoreException() {
        PowerBonusScore pScore = new PowerBonusScore();
        try {
            int ans = pScore.calculateScore(-4, -1);
            Assert.assertEquals(ans, 500);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
}
