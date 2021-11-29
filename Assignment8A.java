import java.util.Scanner; 
import java.util.Random;
class LaserDisc{
private String movieTitle;
private int releaseYear;
private String genre;
private float rating;
public LaserDisc(){
  movieTitle = "Star Wars Holiday Special";
  releaseYear = 1978; 
  genre = "Science Fiction";
  rating = 5.0f;
}
  public LaserDisc(String movieTitle, int releaseYear,String genre,float rating){
    this.movieTitle=movieTitle; 
    this.releaseYear=releaseYear; 
    this.genre=genre;
    this.rating=rating; 
    if(rating<0.0 || rating > 5.0){
      this.rating=0.0f; 
    }
    if(releaseYear < 1978){
      this.releaseYear= 1978; 
    }
  }
  public boolean isItGood(){
    if(this.rating>= 3.0){
      return true;
    }
    else{
      return false; 
    }
  }
  public String get_movieT(){
    return movieTitle; 
  }
  public int get_movier(){
    return releaseYear;
  }
public String get_g(){
  return genre; 
}
public float get_r(){
  return rating; 
}
}
class Assignment8A {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in); 
    Random rand = new Random(); 
    boolean HasUserQuit= false;
  System.out.println("[Laser Disc Collection]"); 
    System.out.print("How many movies do you have? "); 
    int input= s.nextInt(); 
    LaserDisc array1[]= new LaserDisc[input]; 
    for(int i=0; i<input; i++){
      int movieNum = i + 1;
      System.out.println("Movie " + movieNum + ":");
      System.out.print("Enter Title: ");
      String title = s.next();
      System.out.print("Enter Genre: ");
      String gen = s.next(); 
      System.out.print("Enter Release Year: ");
      int year = s.nextInt(); 
      System.out.print("Enter Rating: ");
      float rate = s.nextFloat(); 
      LaserDisc disc = new LaserDisc(title,year,gen,rate);
      array1[i]= disc; 
    }
while(!HasUserQuit){
  System.out.println("[Main Menu]");
System.out.println("1) Movie Info");
System.out.println("2) Recommend a Good Movie");
System.out.println("3) Log off");
  System.out.print("Choice: "); 
  int conditions=s.nextInt();
  switch (conditions){
    case 1: 
    System.out.print("Which Movie do you want? "); 
    int movienum = s.nextInt(); 
    if(movienum < array1.length){
      LaserDisc chosen = array1[movienum]; 
      System.out.println(movienum + ". " + chosen.get_movieT() + ", " +chosen.get_movier());
      System.out.println("Genre: " + chosen.get_g());
      System.out.println("Rating: " + chosen.get_r()); 
    }
    else{
      System.out.println("Sorry, that’s not a valid Movie index"); 
      break;
    }
    case 2: 
int randomNum= rand.nextInt(array1.length-1); 
    int counter = 0;
    while (counter < array1.length){
      LaserDisc randomMovie = array1[randomNum];
      double movieRating = randomMovie.get_r();
  
      if(movieRating >= 3.0){
        System.out.println("You should try: " +  randomMovie.get_movieT());
      }
    }
    System.out.print("No such movie exists");
      break;
    case 3: 
      HasUserQuit= true; 
      System.out.print("Bye!");
        break; 


  }
}
    }
}

