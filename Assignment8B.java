import java.util.Scanner;
class Player{
private int width; 
private int height;
private int xpos;
private int ypos; 

public int get_width(){
  return width; 
}
public int get_height(){
  return height;
}
public void set_width(int w){
  width = w;
}
public void set_height(int h){
  height = h;
}
public int get_x(){
  return xpos;
}
public int get_y(){
  return ypos; 
}
public void set_x(int x){
  xpos = x;
}
public void set_y(int y){
  ypos = y;
}
public void MoveHorizontal(int x_delta){
  xpos+=x_delta; 
}
public void MoveVertical(int y_delta){
  ypos+=y_delta; 
}
public boolean DidTheyCollide(Player otherPlayer){ 
  if((xpos < (otherPlayer.width + xpos)) && 
  ((width + xpos) > (otherPlayer.xpos)) && 
  (ypos < (otherPlayer.height + ypos)) && 
  ((height + ypos) > (otherPlayer.ypos))){
  System.out.println("They collided!");
  return true; 
  }
else{
  return false; 
}
}
}

class Assignment8B {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    Player player1= new Player(); 
    Player player2= new Player(); 

    System.out.println("[Collision Tester]");
    System.out.println("Create Player 1");
    System.out.print("Enter X position: ");
    int x1= s.nextInt(); 
    player1.set_x(x1); 
    System.out.print("Enter Y position: ");
    int y1= s.nextInt();
   player1.set_y(y1); 
    System.out.print("Enter Player Hitbox Width: "); 
    int w1=s.nextInt(); 
    player1.set_width(w1); 
    System.out.print("Enter Player Hitbox Height: ");
    int h1= s.nextInt(); 
    player1.set_height(h1); 

    System.out.println("Create Player 2");
    System.out.print("Enter X position: ");
    int x2= s.nextInt(); 
    player2.set_x(x2); 
    System.out.print("Enter Y position: ");
    int y2= s.nextInt();
   player2.set_y(y2); 
    System.out.print("Enter Player Hitbox Width: "); 
    int w2=s.nextInt(); 
    player2.set_width(w2); 
    System.out.print("Enter Player Hitbox Height: ");
    int h2= s.nextInt(); 
    player1.set_height(h2); 

    while(!player1.DidTheyCollide(player2)){
    System.out.println("Player 1 is at (" +x1+ "," +y1+ ") and Player 2 is at (" +x2+ "," +y2+ ")");      
    System.out.println("Which one do you want to move?");
    int moveOption = s.nextInt();
    System.out.println("Which direction should Player 1 move (up, down, left, or right)?");
    String direcOption = s.next();
    System.out.println("How far should Player 1 move?");
    int distance = s.nextInt();

    if(moveOption == 1){
      if(direcOption.equals("up")){
        player1.MoveVertical(distance);
        x1 = player1.get_x();
        y1 = player1.get_y();
      }else if(direcOption.equals("down")){
        player1.MoveVertical(distance);
        x1 = player1.get_x();
        y1 = player1.get_y();
      }else if(direcOption.equals("left")){
        player1.MoveHorizontal(distance);
        x1 = player1.get_x();
        y1 = player1.get_y();
      }else if(direcOption.equals("right")){
        player1.MoveHorizontal(distance);
        x1 = player1.get_x();
        y1 = player1.get_y();
      }
    }
    else if(moveOption == 2){
      if(direcOption.equals("up")){
        player2.MoveVertical(distance);
        x2 = player2.get_x();
        y2 = player2.get_y();
      }else if(direcOption.equals("down")){
        player2.MoveVertical(distance);
        x2 = player2.get_x();
        y2 = player2.get_y();
      }else if(direcOption.equals("left")){
        player2.MoveHorizontal(distance);
        x2 = player2.get_x();
        y2 = player2.get_y();
      }else if(direcOption.equals("right")){
        player2.MoveHorizontal(distance);
        x2 = player2.get_x();
        y2 = player2.get_y();
      }
    }
    player1.DidTheyCollide(player2);
    }
  }
}
