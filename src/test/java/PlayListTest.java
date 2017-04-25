import org.junit.Test;

public class PlayListTest {

    @Test
    public void createPlaylistT() {
        PlayList playList = new PlayList();
        PlayList.createPlaylist( "aa" , 100);
        PlayList.createPlaylist( "aaa" , 300);
        PlayList.createPlaylist( "aaaa" , 500);
        PlayList.playListDetails();
    }
}
