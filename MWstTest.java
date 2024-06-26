import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;

class MWstTest {

	@Test
	void numberConversion() {
		assertFalse(MwSt.checkInput(""));
		assertFalse(MwSt.checkInput(" "));
		assertFalse(MwSt.checkInput("abc"));
		assertFalse(MwSt.checkInput("ABC123"))
		;
		assertTrue(MwSt.checkInput("123"));
		assertTrue(MwSt.checkInput("123.321"));
	}
	
	@Test
	void choiceValidation() {
		assertFalse(MwSt.validRange(1, 2, ""));
		assertFalse(MwSt.validRange(1, 2, " "));
		assertFalse(MwSt.validRange(1, 2, "abc"));
		assertFalse(MwSt.validRange(1, 2, "ABC123"));
		assertFalse(MwSt.validRange(1, 2, "0"));
		assertFalse(MwSt.validRange(1, 2, "3"));
		
		assertTrue(MwSt.validRange(1, 2, "1"));
		assertTrue(MwSt.validRange(1, 2, "2"));
	}
	
	@Test
	void testException() {
		NumberFormatException e = assertThrows(NumberFormatException.class, () -> MwSt.validRange(1, 2, "1.5"));
	}
	
	@Test 
	void dummyFunction() {
		FinalOutput foMock = mock(FinalOutput.class);
		
		when(foMock.print(5.43)).thenReturn("Das Ergebnis betraegt 5.43 Euro.");		
	}
}
