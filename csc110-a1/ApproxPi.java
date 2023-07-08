/*
Raegan Schofield
CSC110 Assignment #1
2018, Spring Term

Description: Approximate pi using the first 400 terms of a provided series:
a.) Create a variable called nextTerm and assign it (initially) the value 1.
b.) Create a variable called denominator and assign it (initially) the value 1.
c.) Create a variable called series and assign it (initially) the value 0.
d.) Do the following 400 times:
    i.) Add (nextTerm\denominator) to the series.
    ii.) Add 2 to the denominator.
    iii.) Multiply the nextTerm by -1.
e.) Multiply the series by 4 then output the result.

*/

public class ApproxPi{
	public static void main(String [] args){
		double nextTerm = 1;
		double denominator = 1;
		double series = 0;

		for(int i=0; i<400; i++){
			series = series + (nextTerm/denominator);
			denominator = denominator + 2;
			nextTerm = nextTerm * -1;
		}
		series = series * 4;
		System.out.println("The value of pi is " + series);
	}
}