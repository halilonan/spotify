import org.junit.Test;
import static junit.framework.TestCase.assertTrue;


public class UserTest {

    @Test
    public void registerT() {
        Users users = new Users();
        boolean register = users.registerUser( "Ahmet", 12345 );
        users.registerUser( "ali", 562 );
        assertTrue( register == true );
        System.out.println( "Kayıt başarılı" );

        boolean login = Users.loginUser( "Ali" , 562);
        assertTrue( login == true );
        System.out.println( "giris başarılı" );

    }


}
