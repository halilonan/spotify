import java.util.ArrayList;

public class Singer {
    static String[] singers = {"ayşe", "lale", "sedat"};
    static String[] ayseAlbums = {"güvercin" ,"serce"};
    static String[] laleAlbums = {"cikcik" ,"martı"};
    static String[] sedatAlbums = {"kartal" ,"şahin"};
    static String[] albums = {"aaa", "bbb", "ccc"};

    static ArrayList<String[]> singerAndAlbumList = new ArrayList<String[]>();

    public static boolean singer() {
        for (int i = 0; i < singers.length; i++) {
            System.out.println( (i + 1) + "-) " + "Singer: " + singers[i] );
        }
        return true;
    }

    public static boolean albums() {
        for (int i = 0; i < albums.length; i++) {
            System.out.println( (i + 1) + "-) " + "Album: " + albums[i] );
        }
        return Boolean.parseBoolean( null );
    }

    public static Users singerAndAlbums(String singerName) {

        if ((singerName.toLowerCase()).equals( "ayşe" )) {
            for (int i = 0; i < ayseAlbums.length; i++) {
                System.out.println( (i + 1) + "-) " + "Albums: " + ayseAlbums[i] );
            }
        }
        else if ((singerName.toLowerCase()).equals( "lale" )) {
            for (int i = 0; i < laleAlbums.length; i++) {
                System.out.println( (i + 1) + "-) " + "Albums: " + laleAlbums[i] );
            }
        }
        else if ((singerName.toLowerCase()).equals( "lale" )) {
            for (int i = 0; i < sedatAlbums.length; i++) {
                System.out.println( (i + 1) + "-) " + "Albums: " + sedatAlbums[i] );
            }
        }
        return null;
    }





    public static boolean searchSinger(String aranan){

        for (int i = 0; i < singers.length; i++) {
            if((aranan.toLowerCase()).equals( singers[i] )){
                System.out.println("Aranan Singer: "+singers[i]);
                return true;
            }
        }
        return false;
    }
    public static boolean searchAlbum(String aranan){

        for (int i = 0; i < albums.length; i++) {
            if((aranan.toLowerCase()).equals( albums[i] )){
                System.out.println("Aranan Album: "+albums[i]);
                return true;
            }
        }
        return false;
    }

}