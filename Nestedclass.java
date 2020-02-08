import java.util.Scanner;

class {
float att=0,def=0,over=0;
Player p[]=new Player[3];
void calc(){
for(int i=0;i<p.length;i++){
att+=p[i].atp;
def+=p[i].defp;
over+=p[i].overp;
}
att/=p.length;
def/=p.length;
over/=p.length;
}

public class Player{
float atp,defp;
float overp;
Player(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the player ratings:");
System.out.println("Attack:");
atp=sc.nextFloat();
System.out.println("Defence:");
defp=sc.nextFloat();
overp=(atp+defp)/2;
}
}//Player class is nested into Team class

void display(){
System.out.println("Attack:" +att+ "\nDefence:"+ def+ "\nOverall:"+ over);
}
}


class Nestedclass{
public static void main(String args[]){
Team t1;
t1.calc();
t1.display();
}
}