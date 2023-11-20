package ba.unsa.etf.rpr;
import java.lang.String;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Test1 {
        @Test
        public void testDajNajduzuRijec() {
            subString substringObject = new subString(); // Create an instance of subString

            String proba = "Ja se zovem Nedim";
            String result = substringObject.dajNajduzuRijec(proba);

            assertEquals("Nedim", result);
            assertFalse("zovem".equals(substringObject.dajNajduzuRijec(proba)));
        }
    }

