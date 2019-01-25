import java.util.ArrayList;

/**
 * Created by moham on 16/03/2017.
 */
public class Users {

 ArrayList<Person> users =new ArrayList();


    public  Users(String username,String password){
        Person e;
        int i = 0;
        users.add(i, e = new Person(username,password));


    }

     void addusers(Person person){
        users.add(person);

     }


     void ShowUsers(String Username){
         for(int i = 0; i < users.size(); i++){

                 System.out.println("donnée à l'indice " + i + " = " + users.get(i));


         }
     }




}
