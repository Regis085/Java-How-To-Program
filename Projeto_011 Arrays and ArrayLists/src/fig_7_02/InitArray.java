package fig_7_02;
//Initializing the elements of an array to default values of zero.
public class InitArray {
	public static void main(String[] args) {
		
		int[] array; // declare array named array
		
		array = new int[10];
		
		System.out.printf("%s%8s\n", "Index", "Value"); // columns headings

		// output each array element's value
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d\n", counter, array[counter]);
	}
}
