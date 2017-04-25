import org.junit.Test;


public class SearchTest {

    @Test
    public void singerSearchT() {

        boolean SingerList = Singer.searchSinger("Ayşe");

        if (SingerList  == true) {
            System.out.println( "Bulundu" );
        }
        else {
            System.out.println("Aranan Singer bulunamadı");
        }
    }
    @Test
    public void albumSearchT() {

        boolean AlbumList = Singer.searchAlbum("aaa");

        if (AlbumList  == true) {
            System.out.println( "Bulundu" );
        }
        else {
            System.out.println("Aranan Album bulunamadı");
        }
    }

}
