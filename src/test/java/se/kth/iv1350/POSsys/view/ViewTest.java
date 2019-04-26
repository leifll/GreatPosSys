package se.kth.iv1350.POSsys.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.POSsys.controller.Controller;

public class ViewTest {
    private View instance;
    ByteArrayOutputStream printout;
    PrintStream originalSysOut;
    
    @BeforeEach
    public void setUp() {
        Controller contr = new Controller();
        instance = new View(contr);
        
        printout = new ByteArrayOutputStream();
        PrintStream inMemSysOut = new PrintStream(printout);
        originalSysOut = System.out;
        System.setOut(inMemSysOut);
    }
    
    @AfterEach
    public void tearDown() {
        System.setOut(originalSysOut);
        printout = null;
    }

    @Test
    public void testRunFakeSale() {
        instance.runFakeSale();
        String result = printout.toString();
        String expResult = "started";
        assertTrue(result.contains(expResult), "Wrong printout after calling startNewSale().");
    }
    
}