import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;
import static org.junit.contrib.java.lang.system.SystemOutRule.*;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class TestCli{

    private final double TOL = 0.05;
    
    @Rule
    public final TextFromStandardInputStream systemInMock
	= emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule
	= new SystemOutRule().muteForSuccessfulTests();
    
    @Test
    public void testCliStart(){
	assertNotNull("Should not be null", new Cli());
    }

    @Test
    public void testGetUserInt(){
	Cli tCli = new Cli();
	systemInMock.provideLines("1");
	assertEquals(1, tCli.getUserInt());
    }
    
    @Test
    public void testGetUserFloat(){
	Cli tCli = new Cli();
	systemInMock.provideLines("2");
	assertEquals(2.0, tCli.getUserFloat(), TOL);
    }

    @Test
    public void testSetOneDim(){

	Cli tCli = new Cli();
	systemInMock.provideLines("5");
	tCli.setOneDim("Enter dim 1");
	assertEquals(5.0, tCli.getDim1(), TOL);
    }

    @Test
    public void testSetTwoDims(){

	Cli tCli = new Cli();
	systemInMock.provideLines("4","6");
	tCli.setTwoDims("Enter dim 1","Enter dim 2");
	assertEquals(4.0, tCli.getDim1(), TOL);
	assertEquals(6.0, tCli.getDim2(), TOL);

    }

    

}//end TestCli
