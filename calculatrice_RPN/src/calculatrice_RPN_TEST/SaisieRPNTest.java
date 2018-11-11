package calculatrice_RPN_TEST;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import calculatrice_RPN.SaisieRPN;

public class SaisieRPNTest {
	SaisieRPN test;
	String a;
	String B;
	@Before
	public void setUp() throws Exception {
		test= new SaisieRPN();
		 
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRun() {
		
		System.out.println(test.isDouble(a));
		
		System.out.println(test.isDouble(B));
	}
	
	@Test (expected=EmptyStackException.class)
	public void pile_vide() {
		
		test.recuperer_donnees(); 
	}

}
