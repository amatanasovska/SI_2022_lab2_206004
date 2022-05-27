import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void testEveryStatement()
    {
        IllegalArgumentException illegalArgumentException1 =
                assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(illegalArgumentException1.getMessage().contains("List length should be greater than 0"));
        IllegalArgumentException illegalArgumentException2 =
                assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#")));
        assertTrue(illegalArgumentException2.getMessage().contains("List length should be a perfect square"));

        assertEquals(List.of("#", "#", "#", "#", "4", "#", "#","#","2"), SILab2.function(List.of("#", "#", "#", "#", "0", "#", "#","#","0")) );
    }
    @Test
    void testEveryBranch()
    {
        IllegalArgumentException illegalArgumentException1 =
                assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(illegalArgumentException1.getMessage().contains("List length should be greater than 0"));
        IllegalArgumentException illegalArgumentException2 =
                assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#")));
        assertTrue(illegalArgumentException2.getMessage().contains("List length should be a perfect square"));

        assertEquals(List.of("#", "3", "#", "2", "#", "#", "0","1","1"), SILab2.function(List.of("#", "0", "#", "0", "#", "#", "0","0","0")) );

    }
}
