import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by iyubinest on 5/14/16.
 */
public class MasterMindTest {

    private MasterMind masterMind;

    @Before
    public void before() {
        masterMind = new MasterMind() {
            @Override
            public String magicNumber() {
                return "1234";
            }
        };
    }

    @Test
    public void first_try_is_one_spades() {
        Result result = masterMind.attempt("0157");
        Assert.assertEquals(1, result.spades());
    }

    @Test
    public void first_try_is_two_spades() {
        Result result = masterMind.attempt("0125");
        Assert.assertEquals(2, result.spades());
    }

    @Test
    public void first_try_is_three_spades() {
        Result result = masterMind.attempt("0123");
        Assert.assertEquals(3, result.spades());
    }

    @Test
    public void first_try_is_four_spades() {
        Result result = masterMind.attempt("4123");
        Assert.assertEquals(3, result.spades());
    }

    @Test
    public void first_try_is_one_fixed() {
        Result result = masterMind.attempt("1567");
        Assert.assertEquals(1, result.fixed());
    }

    @Test
    public void first_try_is_two_fixed() {
        Result result = masterMind.attempt("1267");
        Assert.assertEquals(2, result.fixed());
    }

    @Test
    public void first_try_is_three_fixed() {
        Result result = masterMind.attempt("1237");
        Assert.assertEquals(3, result.fixed());
    }

    @Test
    public void first_try_is_four_fixed() {
        Result result = masterMind.attempt("1234");
        Assert.assertEquals(4, result.fixed());
    }

    @Test
    public void lose_game() {
        masterMind.attempt("1235");
        masterMind.attempt("1235");
        masterMind.attempt("1235");
        masterMind.attempt("1235");
        masterMind.attempt("1235");
        Result result = masterMind.attempt("1235");
        Assert.assertTrue(result.finished());
        Assert.assertFalse(result.winner());
    }

    @Test
    public void finished_game() {
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertTrue(masterMind.attempt("1235").finished());
        Assert.assertTrue(masterMind.attempt("1235").finished());
    }

    @Test
    public void winner_game() {
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Assert.assertFalse(masterMind.attempt("1235").finished());
        Result result = masterMind.attempt("1234");
        Assert.assertTrue(result.finished());
        Assert.assertTrue(result.winner());
    }


}
