import java.io.*;
import java.util.Scanner;

public class Bioinformatics {

	public static String sequence[] = new String[20];                  //Input sequences
	public static int maxHammingDistance = 0;
	public static int m=0;
	public static int n=0;
	public static String t = " ";
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		
		int i = 0;
		char characters[]={'A','C','G','T'};
		String start = "";
		Scanner fileIn = new Scanner(new File("input2.txt"));
		String firstLine = fileIn.nextLine();
		
		m = Integer.parseInt(firstLine.substring(0, 2));                    //Number of input strings
		n = Integer.parseInt(firstLine.substring(3, firstLine.length()));   //Length of string
		                          
		while(fileIn.hasNextLine())
		{
			//System.out.println(fileIn.nextLine());
			sequence[i] = fileIn.nextLine();
			i++;
		}
		
		maxHammingDistance = n;
		//To generate permutations of characters A,C,G,T
		printAllPermutations(characters, n, start);
		System.out.println(t);
		System.out.println("d = " + maxHammingDistance);
  
	}
	
	public static void printAllPermutations(char []c, int n, String s)
	{
		if(n == 0){
			//System.out.println(s);
			maxHammingDistance(s, sequence);
			return;
		}
		for(int i=0; i<4; i++){
			printAllPermutations(c, n-1, s+c[i]);
		}
	}
	
	//Function to find the minimum of maximum hamming distance
	public static void maxHammingDistance(String s, String [] sequence){
		
		int distance = 0;
		int maxDistance = 0;
		for(int p = 0; p < m; p++){
			distance = getHammingDistance(s, sequence[p]);
			if(distance > maxDistance)
				maxDistance = distance;
			if(maxDistance > maxHammingDistance){
				//System.out.println("Max iteration : " + p);
				break;
			}
				
		}
		if (maxDistance < maxHammingDistance){
			
			t = s;
			maxHammingDistance = maxDistance;
		}
	}
	
	//Function to find the hamming distance between two strings
	public static int getHammingDistance(String sequence1, String sequence2){
		
        int distance =0;
        for(int i=0;i < sequence1.length();i++)
        {
            if(sequence1.charAt(i)!=sequence2.charAt(i))
            distance++;
            if(distance > maxHammingDistance){
				//System.out.println("Max iteration : " + i);
				break;
            }
        }
        return distance;
        
    }

}


