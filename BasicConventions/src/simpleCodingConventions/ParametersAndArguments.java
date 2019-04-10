package simpleCodingConventions;

public class ParametersAndArguments {

	public static void main ( String[] args ) {
		int number = add( 4 );
		System.out.print ( number );
	
		int number2 = subtract ( 10, 5 );
		System.out.println ( number2 );
	}
	
	public static int add ( int num1 ) {
		int answer;
		
		answer = num1 + 5;
		
		return answer;
		
	}
	
	public static int subtract ( int num1, int num2 ) {
		int answer;
		
		answer = num1 - num2;
		
		return answer;
	}
}
