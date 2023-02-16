package hangman.model;

public class PowerScore implements GameScore {
    
    /**
     * 
     * @param correctCount: Correct Count.
     * @param incorrectCount: Incorrect Count.
     * @return score: Value of the score. 
     */
    public int calculateScore( int correctCount, int incorrectCount) {
        int score = 0;
        score += 5^correctCount;
        score -= incorrectCount*8;
        return score;
    }
}
