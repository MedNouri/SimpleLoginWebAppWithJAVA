package nouri;

public class Person {
 

		String username;
		String password;
		String email;
		double moy;
	 
		
		public Person(String username,String email,String password , double moy ){
			this.username=username;
			this.password=password;
			this.email=email;
			this.moy=moy;
		 
		}

		public double getMoy() {
			return moy;
		}

		public void setMoy(double moy) {
			this.moy = moy;
		}

	 

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		
		
		
		
		
		
	}
