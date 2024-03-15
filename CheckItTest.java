import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//Clause Coverage
//CACC
//RACC

public class CheckItTest {
    // Predicate Coverage
    @Test
    public void predicateCoverageTrueP() {
        assertEquals(CheckIt.checkIt(true, true, true), true);
    }

    @Test
    public void predicateCoverageFalseP() {
        assertEquals(CheckIt.checkIt(false, false, true), false);
    }

    // Clause Coverage
    @Test
    public void clauseCoverageTrue() {
        assertEquals(CheckIt.checkIt(true, true, true), true);
    }

    @Test
    public void clauseCoverageFalse() {
        assertEquals(CheckIt.checkIt(false, false, false), false);
    }

    // Correlated Active Clause Coverage (CACC)
    @Test
    public void ClauseA() {
        assertEquals(CheckIt.checkIt(true, true, false), true);
        assertEquals(CheckIt.checkIt(false, true, false), false);
    }

    @Test
    public void ClauseB() {
        assertEquals(CheckIt.checkIt(false, true, true), true);
        assertEquals(CheckIt.checkIt(false, false, true), false);
    }

    @Test
    public void ClauseC() {
        assertEquals(CheckIt.checkIt(false, true, true), true);
        assertEquals(CheckIt.checkIt(false, true, false), false);
    }

    // Restricted Active Clause Coverage (RACC)
    @Test
    public void RACCClauseA() {
        assertEquals(CheckIt.checkIt(true, false, false), true);
        assertEquals(CheckIt.checkIt(false, false, false), false);
    }

    @Test
    public void RACCClauseB() {
        assertEquals(CheckIt.checkIt(true, true, false), true);
        assertEquals(CheckIt.checkIt(false, true, false), false);
    }

    @Test
    public void RACCClauseC() {
        assertEquals(CheckIt.checkIt(true, false, true), true);
        assertEquals(CheckIt.checkIt(false, false, true), false);
    }
}
