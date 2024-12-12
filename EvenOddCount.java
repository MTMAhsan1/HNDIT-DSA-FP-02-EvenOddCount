public class EvenOddCount {

	public static void main(String[] args) {
		
        int[] array = {1, 2, 3, 4, 5};

        
        int evenCount = 0;
        int oddCount = 0;

        
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++;
            }
        }

        
        System.out.println("Even Count = " + evenCount );
        System.out.println("odd Count =" + oddCount);

	}

}
