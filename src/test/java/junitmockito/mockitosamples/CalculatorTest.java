package junitmockito.mockitosamples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator c = null;
	CalculatorService serviceMock = mock(CalculatorService.class);
	
	@Before
	public void setUp(){
		System.out.println("inside before");
		c = new Calculator();
		c.setService(serviceMock);
	}

	@Test
	public void testAddition() {
		doNothing().when(serviceMock).sum(2, 3);
		System.out.println("inside testAddition");
		c.add(2, 3);		
		verify(serviceMock).sum(2, 3);
	}
	
	@Test
	public void testSubtraction() {
		when(serviceMock.minus(3, 2)).thenReturn(1);
		System.out.println("inside testSubtraction");
		assertEquals(1, c.subtract(3, 2));
		verify(serviceMock).minus(3, 2);
	}
	
	@After
	public void post() {
		System.out.println("inside post");		
	}

}
