package nouri;

import java.util.ArrayList;

public class Users {

public static 	ArrayList<Person> users= new ArrayList<>();
	
public static ArrayList<Person> getUsers() {
	return users;
}




public static void setUsers(ArrayList<Person> users) {
	Users.users = users;
}







static{
	users.add(new Person ("mohamed","nouri@gmail.vom","24924841",12));
	 
	users.add(new Person ("Aamal","Amaltayeb@gmail.vcom","23457841",9));
	users.add(new Person ("bader","bader@gmail.vom","0000002",12));
	users.add(new Person ("Marwa","Marwabensalh@yahoo","23457841",6));
	users.add(new Person ("ahmed","Ahmed@hotmail.com","23457841",9));
}



	

 
	public static void addUser( String j, String k,String E,double m) {
	    users.add(new Person(j,k,E,m) );
	}

	
	
	
	public static String findUsername(String a,String b)  
	{    
	    for (int i=0 ; i<users.size();i++) {
	    	
	    	
	        if ( (Users.users.get(i).username.equals(a)) && ( Users.users.get(i).password.equals(a)) ){
	             return "This user already exists in our database.";
	        }
	    }
	    return "User is not founded."; // no Customer found with this ID; maybe throw an exception
	}
	
	
	
	
	
	
	
	public static boolean deleteUser(String email){
		boolean m=false;
		   for (int i=0 ; i<users.size();i++) {
			  
			   if (users.get(i).email.equals(email)){
			        users.remove(i);
		             m= true;
		        } 
			   
		      
		   } return m;
		   }
	
	

}



  