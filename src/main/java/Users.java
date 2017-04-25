import java.util.ArrayList;

public class Users {
    static ArrayList<String> user = new ArrayList<String>();
    static ArrayList<Integer> userPassword = new ArrayList<Integer>();

    static String newUsers;
    static int newPasword;

    public boolean registerUser(String newUsers,int newPassword){

        this.newUsers = newUsers;
        this.newPasword = newPassword;
        user.add(newUsers);
        userPassword.add(newPassword);

        return true;
    }
    public static boolean loginUser(String userName,int userPasword){

        for (int i = 0; i<user.size(); i++){
            System.out.println ("User: " + user.get( i ) +"  Password: " + userPassword.get( i ));
            if(userName.equals( user.get( i )) && userPasword == userPassword.get( i ) ){
                return true;
            }
        }
        return  false;
    }
}
