/**
 * Created by iyubinest on 5/14/16.
 */
public class Result {
    private final int spades;
    private final int fixed;

    public Result(int spades, int fixed) {
        this.spades = spades;
        this.fixed = fixed;
    }

    public int spades() {
        return spades;
    }

    public int fixed() {
        return fixed;
    }
}
