import java.util.Scanner;
class Gettinginputs
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the year: ");
       int year = input.nextInt();
       
       Scanner input2 = new Scanner(System.in);
       
       System.out.print("Enter the genre: ");
       String genre = input2.nextLine();
       System.out.print("Enter the album: ");
       String album = input2.nextLine();
       System.out.print("Enter the song title: ");
       String songt = input2.nextLine();
       System.out.print("Enter the artist: ");
       String artist = input2.nextLine();
       
       System.out.println("-------------------------");
       System.out.println("SONG DETAILS");
       System.out.println("-------------------------");
       
       System.out.println("Year Released: " + year);
       System.out.println("Genre: " + genre);
       System.out.println("Album: " + album);
       System.out.println("Title: " + "\"" + songt + "\"");
       System.out.println("Artist: " + artist);
       input.close();
       input2.close();
    }
}