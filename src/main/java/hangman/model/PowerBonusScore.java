package hangman.model;

import hangman.model.exceptions.GameScoreException;

public class PowerBonusScore implements GameScore{

    /**
     * @pre correctCount and incorrectCount must be positive numbers
     * @pos score must be greater or equal to 0 and lower or equal to 500
     * @param correctCount 
     * @param incorrectCount
     * @throws GameScoreException 
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
        if (correctCount < 0 || incorrectCount < 0) {
            throw new GameScoreException(GameScoreException.PARAMETROS_NEGATIVOS);
        }
        int score = 0;
        for(int i = 1; i <= correctCount; i++){
            score += Math.pow(5, i);
        }   
        score = score < incorrectCount * 8 ? 0 : score - incorrectCount * 8;  
        score = score > 500 ? 500 : score; 
        return score;
    }
    
}
