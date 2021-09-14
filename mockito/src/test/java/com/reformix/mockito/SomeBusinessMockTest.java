package com.reformix.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {
	

	@Test
	void testFindGreatestAmongAll() {
		DataServiceStub dataServiceStubmock = mock(DataServiceStub.class);
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStubmock);
		when(dataServiceStubmock.retriveAllData()).thenReturn(new int[] { 24, 19, 99 });
		int result = businessImpl.findGreatestAmongAll();
		assertEquals(99, result);
	}

	@Test
	void testFindGreatestAmongAlldataFor_oneValue() {
		DataServiceStub dataServiceStubmock = mock(DataServiceStub.class);
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStubmock);
		when(dataServiceStubmock.retriveAllData()).thenReturn(new int[] { 5 });
		int result = businessImpl.findGreatestAmongAll();
		assertEquals(5, result);
	}
}
