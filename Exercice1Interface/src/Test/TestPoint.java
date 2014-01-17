package Test;
import Direction.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestPoint {

	@Test
	public void test() {
		InterfacePoint ip = new Point();
		ip.setAbs(2);
		ip.setOrd(1);
		InterfacePoint ipa = new Point();
		ipa.setAbs(3);
		ipa.setOrd(4);
		InterfacePoint res = ip.add(ipa); 
		assertTrue(res.getAbs() == 5 && res.getOrd() == 5);
	}



}
