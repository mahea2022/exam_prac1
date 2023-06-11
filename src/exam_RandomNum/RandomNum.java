package exam_RandomNum;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
public static void main(String[] args) {
		
		int[] randomNumbers = new int [500];
		 Random random =new Random();
		  for(int i=0; i<500; i++) {
		  randomNumbers[i]=random.nextInt(1000);
		  }
		 
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter the n :");   
		  int n =scanner.nextInt();
		  
		  Arrays.sort(randomNumbers);
		  if(n>=1 && n<=500 ) {
			  int nthSmallest = randomNumbers[n-1];
			  System.out.println(n +"smallest numer is:"+ nthSmallest);
		  }else {
			  System.out.println("invalid");
		  }

	}
}
