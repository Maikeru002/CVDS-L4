package hangman.model;

public class BonusScore implements GameScore {
    
    /**
     * 
     * @param correctCount: Correct Count.
     * @param incorrectCount: Incorrect Count.
     * @return score: Value of the score. 
     */
    public int calculateScore( int correctCount, int incorrectCount) {
        return 1;
    }

}
