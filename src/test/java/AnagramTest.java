import org.junit.*;


/**
 * Created by daaro on 7/21/2016.
 */
public class AnagramTest {

    @Test
    public void someSimpleTests() {
        // True test cases:
        Assert.assertTrue(AreAnagrams.areAnagrams("neural", "unreal"));
        Assert.assertTrue(AreAnagrams.areAnagrams("flow", "wolf"));
        Assert.assertTrue(AreAnagrams.areAnagrams("pintos", "piston"));

        // False test cases:
        Assert.assertFalse(AreAnagrams.areAnagrams("abc", "xyz"));
        Assert.assertFalse(AreAnagrams.areAnagrams("not true", "crap"));
        Assert.assertFalse(AreAnagrams.areAnagrams("bad", "stinky"));

        // False for if a or b is empty:
        Assert.assertFalse(AreAnagrams.areAnagrams("", ""));
        Assert.assertFalse(AreAnagrams.areAnagrams("", "xyz"));
        Assert.assertFalse(AreAnagrams.areAnagrams("abc", ""));

    }

}
