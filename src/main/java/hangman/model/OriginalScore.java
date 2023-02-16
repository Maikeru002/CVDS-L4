package hangman.model;

public class OriginalScore implements GameScore {
    
    /**
     * 
     * @param correctCount : Correct Count
     * @param incorrectCount : Incorrect Score
     * @return  score: Value of the score.
     */
    public int calculateScore( int correctCount, int incorrectCount) {
        int score = 100;
        score -= incorrectCount*10;
        return score;
    }
}
