
import org.junit.Test;

public class SingerTest {

    @Test
    public void SingerT() {
        boolean SingerList;
        SingerList = Singer.singer();
    }
    @Test
    public void AlbumT() {
        boolean AlbumList;
        AlbumList = Singer.albums();
    }
    @Test
    public void AlbumAndSingerT() {
        Users AlbumList = new Users();
        AlbumList = Singer.singerAndAlbums("lale");
    }

}