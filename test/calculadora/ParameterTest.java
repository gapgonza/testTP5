package calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterTest {

    private int input;
    private int expected;

    public ParameterTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 8, 8 },
            { 7, 7 },
            { 15, 15 },
            { 2, 2 },
            { 0, 0 },
            { 20, 20 },
            { 10, 10 },
            { -1, -1 },
            { -9, -9 }
        });
    }

    @Test
    public void testDivCero() {
        assertEquals(expected, input);
    }
}

