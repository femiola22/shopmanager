package tech.target.shopmanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ShopManagerApplicationTests {

	Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}

	void itShouldAddTwoNumbers() {
		//given
		int firstNumber = 20;
		int secondNumber = 30;

		//when
		int result = calculator.addTwoNumbers(firstNumber, secondNumber);

		//then
		int correctResult = 50;
		assertThat(result).isEqualTo(correctResult);
	}

	public class Calculator{
		public int addTwoNumbers(int a, int b){
			return a+b;
		}
	}

}
