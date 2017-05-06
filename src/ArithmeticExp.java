import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticExp {

	public int add(int x, int y) {

		if(x>=11){
			x = 0;
		}
		
		return x + y;
	}

	//test for X<10
	@Test
	public void testExe1() {

		// Arrange
		int x = 9;
		int y = 20;
		int expected = 29;

		// Act
		int result = new ArithmeticExp().add(x, y);

		// Assert
		Assert.assertEquals(result, expected);
	}
	
	//test for X=10
		@Test
		public void testExe2() {

			// Arrange
			int x = 10;
			int y = 20;
			int expected = 20;

			// Act
			int result = new ArithmeticExp().add(x, y);

			// Assert
			Assert.assertEquals(result, expected);
		}
		
		//test for X>10
				@Test
				public void testExe3() {

					// Arrange
					int x = 11;
					int y = 20;
					int expected = 20;

					// Act
					int result = new ArithmeticExp().add(x, y);

					// Assert
					Assert.assertEquals(result, expected);
				}
}
