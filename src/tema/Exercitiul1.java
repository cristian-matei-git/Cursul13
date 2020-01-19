package tema;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercitiul1 {
	
	public static int[][] createMatrix(int matrixDimension,int mainDiagValue, 
			int sndDiagValue, int centerValue, int leftValue, int upValue,
			int rightValue, int bottomValue){
		
		int[][] array = new int[matrixDimension][matrixDimension];
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				if(i == array.length/2 && j == array.length/2) {
					
					array[i][j] = centerValue;
					
				}else if(i == j) {
					
					array[i][j] = mainDiagValue;
					
				}else if(i + j == array.length - 1) {
					
					array[i][j] = sndDiagValue;
					
				}else if(i > j && i + j < array.length - 1) {
					
					array[i][j] = leftValue;
					
				}else if(i < j && i + j < array.length - 1) {
					
					array[i][j] = upValue;
					
				}else if(i < j && i + j > array.length - 1) {
					
					array[i][j] = rightValue;
					
				}else if(i > j && i + j > array.length - 1) {
					
					array[i][j] = bottomValue;
					
				}
			}
		}
		
		return array;
	}
	
	public static void printMatrix(int[][] array) {
		
		for(int i=0; i<array.length; i++) {
			
			  for (int j = 0; j < array[i].length; j++) {
				  
			    System.out.print(array[i][j] + "\t");
			    
			  }
			  
			  System.out.println();
			}
	}
	
	public static ArrayList<ArrayList<Integer>> createArrayListMatrix(int matrixDimension,int mainDiagValue, 
			int sndDiagValue, int centerValue, int leftValue, int upValue,
			int rightValue, int bottomValue) {
		
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>(matrixDimension); // reserve n elements for efficiency
		for (int i=0; i<matrixDimension; i++) {
		  ArrayList<Integer> newRow = new ArrayList<Integer>(matrixDimension); // new row
		  for (int j=0; j<matrixDimension; j++) {
		    newRow.add(0);
		  }
		  array.add(newRow);
		}
		 
		for(int i = 0; i < matrixDimension; i++) {
			
			for(int j = 0; j < matrixDimension; j++) {
				
				if(i == array.size()/2 && j == array.size()/2) {
					
					array.get(i).set(j, centerValue);
					
				}else if(i == j) {
					
					array.get(i).set(j, mainDiagValue);
					
				}else if(i + j == array.size() - 1) {
					
					array.get(i).set(j, sndDiagValue);
					
				}else if(i > j && i + j < array.size() - 1) {
					
					array.get(i).set(j, leftValue);
					
				}else if(i < j && i + j < array.size() - 1) {
					
					array.get(i).set(j, upValue);
					
				}else if(i < j && i + j > array.size() - 1) {
					
					array.get(i).set(j, rightValue);
					
				}else if(i > j && i + j > array.size() - 1) {
					
					array.get(i).set(j, bottomValue);
					
				}
			}
		}
		
		return array;
	}
	
	public static void printArrayListMatrix(ArrayList<ArrayList<Integer>> array) {
		
		for(int i=0; i<array.size(); i++) {
			
			  for (int j = 0; j < array.get(i).size(); j++) {
				  
			    System.out.print(array.get(i).get(j) + "\t");
			    
			  }
			  
			  System.out.println();
			  
			}
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int matrixDimension = sc.nextInt();
		int mainDiagValue = sc.nextInt();
		int sndDiagValue = sc.nextInt();
		int centerValue = sc.nextInt();
		int leftValue = sc.nextInt();
		int upValue = sc.nextInt();
		int rightValue = sc.nextInt();
		int bottomValue = sc.nextInt();
		System.out.println();
		
		printMatrix(createMatrix(matrixDimension, mainDiagValue, sndDiagValue, 
				centerValue, leftValue, upValue, rightValue, bottomValue));
		
		System.out.println();
		
		printArrayListMatrix(createArrayListMatrix(matrixDimension, mainDiagValue, 
				sndDiagValue, centerValue, leftValue, upValue, rightValue, bottomValue));
		
		}
}
