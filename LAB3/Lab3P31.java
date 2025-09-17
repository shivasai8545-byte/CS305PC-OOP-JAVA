import java.util.Scanner;
class Lab3P3{
	public static void main(String...args){
	       Scanner sc = new Scanner(System.in){
		Lab3P3 l = new Lab3P3();
		Lab3P3 l1 = new Lab3P3(a);
		Lab3P3 l2 = new Lab3P3(b);
		Lab3P3 l3 = new Lab3P3(a,b);
		l.show(); l.show(10);l.show("String");l.show(10,"String");
	   
	}
	
	Lab3P3 (){
		System.out.println("Construct without parama");
	}
	Lab3P3(int x){
		System.out.println("Construct with int params" +x);
		
	}
	Lab3P3(String s){
		System.out.println("Construct with String params" +s); 
	}
	Lab3P3(int x, String s){
		System.out.println("Construct with two params int and String: " + x +" "+ s);
	}
	   	
	   }
