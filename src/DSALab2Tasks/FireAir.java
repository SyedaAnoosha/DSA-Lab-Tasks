package DSALab2Tasks;
import java.util.Arrays;

public class FireAir{
    private String[] songs = {"Let Me Down Slowly","Shape of You","Anti-Hero","Sorry","Blank Space"};
    public void menu(){
        System.out.println("1. Display all songs\n2. Search a song \n3. Add a new song\n4. Update the song\n5. Delete any song\n6. Exit");
    }
    public void display_songs(){

        System.out.println(Arrays.toString(songs));

    }
    public void search_songs(String name){

        for (int i = 0; i < songs.length; i++) {
            if (name.equalsIgnoreCase(songs[i])){
                System.out.println("Found");
                break;
            }
        }

    }
    public void add_songs(int pos, String name){

        String[] newSong = new String[songs.length + 1];

        for (int i = 0 , j = 0; i < newSong.length; i++){
            if(pos==i){
                newSong[j] = name;
            }
            else{
                newSong[j]=songs[i+j];
                j++;
            }
        }

        System.out.println(Arrays.deepToString(newSong));
    }
    public void update_songs(String replace_element, String new_element){

        System.out.println();

        for (int i = 0; i < songs.length; i++) {
            if (replace_element.equalsIgnoreCase(songs[i])){
                songs[i]=new_element;
                System.out.println("Updated");
                break;
            }
        }

        System.out.println(Arrays.toString(songs));
    }
    public void delete_songs(String name){

        String[] newSong = new String[songs.length - 1];

        for (int i = 0 , k = 0; i < newSong.length; i++) {
            if(!name.equalsIgnoreCase(songs[i])){
                newSong[k]=songs[i];
            }
        }

        System.out.println(Arrays.toString(newSong));

    }
}