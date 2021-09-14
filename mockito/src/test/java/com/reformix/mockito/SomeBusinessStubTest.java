package com.reformix.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void testFindGreatestAmongAll() {

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findGreatestAmongAll();
		
		 assertEquals(24, result);

	}

}
