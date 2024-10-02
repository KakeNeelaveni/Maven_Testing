//Write Program using Junit Testing for   calculate area  for rectangle.
package com.apjfsa;
//required imports
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
//class to calculate area of rectangle
class RectangleArea1 {
    //method to calculate area of rectangle
	public int area(int length, int breadth) {
		int area = length * breadth;
		return area;
	}
}
//Test class for RectangleArea1
public class RectangleAreaTest {
    //creating object for RectangleArea1 class
	RectangleArea1 rectarea = new RectangleArea1();
	// Test method to verify the area calculation
	@Test
	void areaTest() {
		int area = rectarea.area(12, 15);
		assertEquals(180, area);//it checks the area is 180 or not
	}

}
