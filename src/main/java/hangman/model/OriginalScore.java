package hangman.model;

import hangman.model.exceptions.GameScoreException;

public class OriginalScore implements GameScore{

    /**
     * @pre correctCount and incorrectCount must be positive numbers
     * @pos score must be greater or equal to 0
     * @param correctCount 
     * @param incorrectCount
     * @throws GameScoreException 
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
        if (correctCount < 0 || incorrectCount < 0) {
            throw new GameScoreException(GameScoreException.PARAMETROS_NEGATIVOS);
        }
        int score = 100;
        score = score < incorrectCount * 10 ? 0 : score - incorrectCount * 10;

        return score;
    }
    
}
