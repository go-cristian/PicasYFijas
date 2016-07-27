/**
 * Created by iyubinest on 5/14/16.
 */
public class Result {
    private final int spades;
    private final int fixed;
    private final int currentTry;

    public Result(int spades, int fixed, int currentTry) {
        this.spades = spades;
        this.fixed = fixed;
        this.currentTry = currentTry;
    }

    public int spades() {
        return spades;
    }

    public int fixed() {
        return fixed;
    }

    public boolean finished() {
        return currentTry >= MasterMind.TRIES;
    }

    public boolean winner() {
        return fixed == 4;
    }
}
