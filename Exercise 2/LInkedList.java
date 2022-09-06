import java.util.LinkedList;

class LInkedList { //LinkedList
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Under the Influence");
        Playlist.add("Die for you");
        Playlist.add("Earned it");
        Playlist.add("Birthday sex");
        Playlist.add("Ride");
        Playlist.add("The Hills");
        Playlist.add("Strawberries and Cigarettes");
        Playlist.add("Love me like you do");
        Playlist.add("Buttons");
        Playlist.add("Crazy In Love");

        // Adds a new song at the front of the Playlist
         Playlist.addFirst("Kiss it better");
         Playlist.addLast("Ride");
         
         System.out.println( "Seth's most favorite song: " + Playlist.get(2));
       

     

        // Replace the last song using the set() method
        Playlist.set(6, "Feel it");

        // Remove the first song using the remove() method
       Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Seth's top 10 playlist: " + Playlist);
    }
}
