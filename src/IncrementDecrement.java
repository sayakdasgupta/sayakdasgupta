
public class IncrementDecrement {
public static void main(String args[]){
	System.out.println("Pre-Increment Operators");
	//increments x first and then assigns the value of x to y
	int x=10;
	int y=++x;
	System.out.println("x:"+x+"y:"+y);
	System.out.println("Post-increment Operators");
	//assigns the value of x to y first and then increases x
	 x=10;
	 y=x++;
	System.out.println("x:"+x+"y:"+y);
	
}
}
