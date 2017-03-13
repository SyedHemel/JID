package oca;

public class ControlFlowsAndLoops {
	
	int intNum = 4;
	String str;
	long lx = 10;

	public static void main(String[] args) {

		ControlFlowsAndLoops oCFL = new ControlFlowsAndLoops();
	//	oCFL.eatCheese(2);		
	//	onlyWhile();
	//	doAndWhile();		
	//	oCFL.nestedForLoop();		
	//	searchSample();		
	//  switchSample();	
	//	brackets();
	//	setContinue();
	//	theTernaryTester();
	//	trickySnippet();
	// //	infiniteLoop();
	//	anArithmeticSample();
	//	rowLoop();
		switchSnippet();
	//	System.out.println("\nThe instance variable 'intNum' is initialized with: " + oCFL.intNum); 		

	}
	
	int roomInBelly = 8;
	public void eatCheese(int bitesOfCheese) {
	  while (bitesOfCheese > 0 && roomInBelly > 0) {
	    bitesOfCheese--;
	  roomInBelly--;
	  System.out.println(bitesOfCheese + " " + roomInBelly);
	  System.out.println(bitesOfCheese + " pieces of cheese left");
	    }
	  System.out.println(bitesOfCheese + " pieces of cheese left at last");
	}
	
	public static void onlyWhile(){
		int x=1;
		while(x<6){
			System.out.println("x is: " + x);
			x++;
			}	
			
		}
	
	public static void doAndWhile(){
		int w=20;
		do{
			System.out.println("w is: " + w);
			w--;
		} while(w>9);
		
	}
	
	public void nestedForLoop(){
	
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray : myComplexArray) {
		  for(int i=0; i<mySimpleArray.length; i++) {
		    System.out.print(mySimpleArray[i]+"\t");
		  }
		    System.out.println();
		}
	}
	
	public static void searchSample(){
		{
		    int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		    int searchValue = 2;
		    int positionX = -1;
		    int positionY = -1;
		    PARENT_LOOP: for(int i=0; i<list.length; i++) {
		      for(int j=0; j<list[i].length; j++) {
		        if(list[i][j]==searchValue) {
		          positionX = i;
		          positionY = j;
		          break PARENT_LOOP;
		        }
		      }
		    }
		    if(positionX==-1 || positionY==-1) {
		      System.out.println("Value "+ searchValue +" not found");
		    } else {
	System.out.println("Value "+ searchValue +" found at: " + "("+positionX+","+positionY+")");
		        }
		      }
	}
	
	public static void switchSample() {
		  
		    FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
		      for (char x = 'a'; x <= 'c'; x++) {
		        if (a == 2 || x == 'b')
		          continue FIRST_CHAR_LOOP;
		        System.out.print(" " + a + x);
		      }
		    }		  
		}
	
	public static void setContinue(){
		char chA[] = {'a','d','h','j','m','p'};
		
		CharFor: for(char ch: chA){
			System.out.println(ch);
			if(ch=='j'){
				break CharFor;				
				}			
		}
		
		System.out.println("\nCharacters are: ");
		CharFor2: for (char cx='a'; cx<='r'; cx++){						
			if(cx=='m' || cx=='p' || cx=='o'){
					continue CharFor2;										
			} 
			System.out.print(cx + "\t");			
		}						
	}
	
	
	public static void brackets(){
		int y=6;
		if(y>6) System.out.println("y is greater");
		else System.out.println("y is not greater");		
	}
	
	public static void theTernaryTester() {	 
		 int x = 5;
		     System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
		 	 }
	
	public static void trickySnippet(){
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z=false);   //Exclusive OR ---> It gives the output true if the inputs are alternative 
		System.out.println(x+", "+y+", "+z);
	}
	
	public static void infiniteLoop(){
		for(int i=0; i<10 ; ) {
			//  i = i++;
			   System.out.println("Hello World");
			 }
	}
	
	public static void anArithmeticSample() {
		     int x = 5 * 4 % 3;
		     int y = 1%2;
		    System.out.println(x);
		    System.out.println(y);
		 }
	
	public static void rowLoop(){
		int count = 0;
		 ROW_LOOP: for(int row = 1; row <=3; row++)
		   for(int col = 1; col <=2 ; col++) {
		     if(row * col % 2 == 0) continue ROW_LOOP;
		     count++;
		}
		System.out.println(count);
	}
	
	public static void switchSnippet(){
		final char a = 'A', d = 'D';
		char grade = 'B';
		switch(grade) {
		case a:
		case 'B': System.out.print("great");
		case 'C': System.out.print("good"); break;
	    case d:
	    case 'F': System.out.print("not good");
		 }
	}

}
