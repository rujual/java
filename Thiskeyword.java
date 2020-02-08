class Box{
int l,b,h;
int vol;
String name;
Box(String nam, int x, int y, int z){
name=nam;
l=x;
b=y;
h=z;
}
void calcvol(){
vol=l*b*h;
}
void print(){
System.out.println("Volume:"+vol);
}
void compare(Box b){
if(this.h<b.h && this.vol<b.vol){
System.out.println("Box "+ b.name + " is taller and bigger than our box");}
else if(this.h>b.h && this.vol<b.vol){
System.out.println("Box "+ b.name +" is bigger but shorter than ours");}
else if(this.h<b.h && this.vol>b.vol){
System.out.println("Box "+ b.name+ " is taller but smaller than ours");}
else{
System.out.println("Box "+ b.name +" is smaller and shorter!");
}}
};

class Thiskeyword{
public static void main(String args[]){
Box b1=new Box("b1",3,4,5);
Box b2=new Box("b2",2,3,7);
b1.calcvol();
b2.calcvol();
b1.print();
b2.print();
b1.compare(b2);
}
}
