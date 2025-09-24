//Abstraction

package Student;

abstract class Person{
	protected String name;
	
	Person(String name){
		this.name = name;
	}
	abstract String getDetails(); //abstract Method
}

/* java -d .Person . Java
  
  javac  - -- java compiler
  -d     - --  directory
  . | example  -- current directory
*/
