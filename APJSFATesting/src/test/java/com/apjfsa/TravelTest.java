package com.apjfsa;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class TravelTest {
	@Mock
	Vehicle vehicle=Mockito.mock(Vehicle.class);
	
	@Test
	void testTravelConfirm() {
		Travel travel=new Travel(vehicle);
		when(vehicle.booking()).thenReturn(1);
	assertEquals("confirmed",travel.travelConfirm());
		
		
	}

}
