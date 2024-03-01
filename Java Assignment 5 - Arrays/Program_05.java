package Assignment_05;

import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of persons : ");
        int n = s.nextInt();
        
        if(n < 0) {
        	s.close();
        	return;
        }
        
        int[][] weights = new int[n][];
        boolean isExit = true;
        addWeightsForPerson(n, weights);       

        do {
        	
        	System.out.println("select option : ");
        	System.out.println("1 -> Add weight to person");
        	System.out.println("2 -> Get Person Age : ");
        	System.out.println("3 -> Show all Records : ");
        	System.out.println("4 -> Exits : ");
        	int option = s.nextInt();
        	
        	switch (option) {
				case 1:
					int userIndex = getUserIndex(s, n);
					
					if(userIndex == -1) 
						break;
					
					System.out.println("Enter User Weight : ");
					int userWeight = s.nextInt();
					
					addWeightBasedOnIndex(userIndex-1, userWeight, weights);				
					System.out.println("User Weight added successfully...");
					break;
				case 2:				 
					
					int userIndex1 =  getUserIndex(s, n);					
					if(userIndex1 == -1) 
						break;
					
					int weight_ = findMinValue(userIndex1-1, weights);
					System.out.println("Weight is : "+weight_);
			        break;
				case 3:		
					System.out.println("Weights of persons:");
			        printJaggedArray(weights);
			        break;
				case 4:				 
					isExit = false;
			        break;
				default:
					System.out.println("Incorrect selection...");
			}
			
		} while (isExit);
              
        s.close();
	}
	
	static int getUserIndex(Scanner s, int n) {
		
		System.out.println("Enter User Index Start from 1 : ");
		int userIndex = s.nextInt();
		
		if(userIndex > n || userIndex < 0) {
			System.out.println("User index is not present...");
			userIndex = -1;
		}
		
		return userIndex;
		
	}
		
	static void addWeightBasedOnIndex(int index, int weight, int[][] weights) {
		
//		System.out.println("index "+ index);	
		int indexs = weights[index].length;
		int[] temp = new int[indexs+1];
		temp = weights[index];
		weights[index] = new int[indexs+1];
		
		System.out.println("weights[index] "+weights[index].length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println("indexs "+ indexs + " "+weights[index][i]);
			temp[i] = weights[index][i] = temp[i];
		}
		System.out.println(index);
		
//		weights[index] = temp;
		weights[index][weights[index].length-1] = weight;
	}
	

    public static int findMinValue(int index, int[][] weights) {
    	
        int min = Integer.MAX_VALUE;
        
        for (int j = 0; j < weights[index].length; j++) {
            if (weights[index][j] < min) {
                min = weights[index][j];
            }
        }
        
        return min;
    }
	
	static void addWeightsForPerson(int n, int[][] weights) {
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			
            System.out.print("Enter the number of weights for person " + (i + 1) + ": ");
            int numWeights = s.nextInt();
            weights[i] = new int[numWeights];

            System.out.print("Enter the weights for person " + (i + 1) + ": ");
            for (int j = 0; j < numWeights; j++) {
                weights[i][j] = s.nextInt();
            }
        }	
		s.close();
	}
	
	public static void printJaggedArray(int[][] arr) {
		
        for (int i = 0; i < arr.length; i++) {
        	
            System.out.print("Person " + (i + 1) + " weights: ");            
            for (int j = 0; j < arr[i].length; j++) {            	
                System.out.print(arr[i][j] + " ");
            }            
            System.out.println();
        }
	 }
}
