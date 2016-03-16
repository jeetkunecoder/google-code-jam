/**
 *  Google Code Jam 2008
 *  Round 1A
 *  Problem: Saving the Universe
 *  Solution by: Dario Carrasquel
 */

import java.io.*;
import java.util.*;

public class SavingTheUniverse{

	private void print(int T, int switches, FileWriter o){
		
		try {
			o.write("Case #" + T + ": " + switches + "\n");
			System.out.println("Case #" + T + ": " + switches);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void solver(Scanner sc, FileWriter o){
		
		int T = Integer.parseInt(sc.nextLine());
	    int switches;
		HashSet<String> engines = new HashSet<String>();
		HashSet<String> partition = new HashSet<String>();
	    for (int i = 1; i <= T; i++) {
	    	switches = 0;
		    int S = Integer.parseInt(sc.nextLine());
		    for (int j = 0; j < S; j++) engines.add(sc.nextLine());
		    int Q = Integer.parseInt(sc.nextLine());
		    for (int k = 0; k < Q; k++) {
		    	String q = sc.nextLine(); partition.add(q);
		    	if(partition.size() == engines.size()) 
		    	{ switches++; partition.clear(); partition.add(q);}
			}
		    print(i, switches, o);
		    engines.clear();
		    partition.clear();
		}
	    
	}
	
	public static void main(String args[]){
		
		File inFile = new File("input.txt");
		File outFile = new File("output.txt");	
		
		try{
			Scanner sc = new Scanner(inFile);
			FileWriter o = new FileWriter(outFile);
			SavingTheUniverse s = new SavingTheUniverse();
			s.solver(sc, o);
		    sc.close();
		    o.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}	
	
}

