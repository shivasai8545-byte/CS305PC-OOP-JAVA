//Encapsulation and inheritance
 package Student;
 
 class Student extends Person{
 	 private String name, id, branch, password;
		Student(String n){
		super(n);
		this.name = n;
		}
		public  void getid(String id){
	this.id = id;
}	
	public  void getBranch(String branch){
	this.branch = branch;	 
	}
	public  void getPassword(String password){
	this.password = password;
	}	 
	
	@Override
	public void getDetails(){
		return(id +" , "+name+", "+branch+", "+password);
		}
		 
		
 }
