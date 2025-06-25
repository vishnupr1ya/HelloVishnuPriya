package javamethod;

public class PatternPrinting {

	public static void main(String[] args) {
		/*for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*for(int i = 0; i <5; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//pyramid pattern - spaces should also taken in to consideration 3 loops one each for rows,columns andspaces
		int n = 5;
        for(int i = 0; i < n; i++ ) {
        	for (int j = n-i; j> 1; j--) {
        		System.out.print(" ");
        		for(int k = 0; k <= i; k++) {
        			System.out.print("*");
        		}
        	
        	}
        	System.out.println();
        }
    
	}

}
