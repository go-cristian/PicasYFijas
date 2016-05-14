import org.junit.Assert;
import org.junit.Test;

/**
 * Created by iyubinest on 5/14/16.
 */
public class MasterMindTest {

    public static final MasterMind MASTER_MIND = new MasterMind() {
        @Override
        public String magicNumber() {
            return "1234";
        }
    };

    @Test
    public void first_try_is_one_spades() {
        Result result = MASTER_MIND.attempt("0157");
        Assert.assertEquals(1, result.spades());
    }

    @Test
    public void first_try_is_two_spades() {
        Result result = MASTER_MIND.attempt("0125");
        Assert.assertEquals(2, result.spades());
    }

    @Test
    public void first_try_is_three_spades() {
        Result result = MASTER_MIND.attempt("0123");
        Assert.assertEquals(3, result.spades());
    }

    @Test
    public void first_try_is_four_spades() {
        Result result = MASTER_MIND.attempt("4123");
        Assert.assertEquals(3, result.spades());
    }

    @Test
    public void first_try_is_one_fixed() {
        Result result = MASTER_MIND.attempt("1567");
        Assert.assertEquals(1, result.fixed());
    }
}
