import java.util.Random; 

public class random_numbers {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Genrate ten random number: ");
		int[] array_value = new int[10];
		for(int i = 0; i < 10; i++) {
		   int random_number = rand.nextInt(100);
		   array_value[i] = random_number;
		   System.out.print(" " + random_number);
		}

		int sum_int_value = 0;
		for(int i : array_value) {
			sum_int_value += i;      
		}
		System.out.println(" Total: " + sum_int_value);
	}
}
