import java.util.ArrayList;

public class PlayList {
    static double total ;


    static ArrayList<String> playList2 = new ArrayList<String>();

    public static boolean createPlaylist(String songName , float duration){

        ArrayList<String> playList = new ArrayList<String>();

        playList.add( songName + "   "+duration );
        total += duration;
        playList2.add( String.valueOf( playList ) );
        return Boolean.parseBoolean( null );
    }

    public  static boolean playListDetails (){

        for(int i = 0; i < playList2.size(); i++){
            System.out.println((i+1)+"-) "+playList2.get( i ));
        }
        System.out.print( total );
        return Boolean.parseBoolean( null );
    }
}
