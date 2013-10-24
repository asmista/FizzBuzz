public class FizzBuzz {
    public static void main(String[] args) {
    	
		int count = 0;
		String liste = "";
		
        for (int i = 1; i <= 100; i++) {
        	if (i % 5 == 0 && i % 3 == 0){
				liste += "Fizzbuzz ";
			} else if(i % 5 == 0){
				liste += "Buzz ";
			} else if (i % 3 == 0){
				liste += "Fizz ";
			} else {
				liste += i + " ";
			}

			count ++;
			
			if (count >= 9){
				liste += "\n";
				count = 0;
			}
        }
        System.out.print(liste);
    }
}