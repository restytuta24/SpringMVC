
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	int [] shifts = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
//		in the example below, we are using the 'minus' method in an array
		int[] poundStering = {20, 30, 40, 50};
		for(int i: poundStering) {
			System.out.println(i);
			System.out.println(i * 4500);
		}

//	Array Exercise - in this exercise, we will use the loop to find the 
// 	lowest weight.
		int[]patientsWeight = {10, 46, 78, 65, 90, 88, 55};
		int lowestWeight = patientsWeight[0];
		for (int weight = 1; weight < patientsWeight.length; weight++) {
			if(patientsWeight[weight] < lowestWeight){
			lowestWeight = patientsWeight[weight];
				
			}
		}
		System.out.println(lowestWeight);

// 	Array Exercise - in this exercise, we will use the loop to find the 
// 	highest price.
		
		int[]shoePrices = {76, 23, 65, 30, 10, 150, 33, 29, 11, 42};
		int highestPrice = shoePrices[0];
// the loop at line 35 will start counting at index '1' till the end of the
// array until it finds the highest price.
		for(int cost = 1; cost < shoePrices.length; cost++) {
			if(shoePrices[cost] > highestPrice) {
				highestPrice = shoePrices[cost];
			}
		}
		
		System.out.println(highestPrice);
	}
}
