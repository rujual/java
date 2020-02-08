/*the complete banking portal*/
import java.util.Scanner;
class Acc{
int uid,acb;
String pwd;

Acc(){
uid=0;
pwd="0";
acb=0;
}

void newacc(int ui, String p){
uid=ui;
pwd=p;
acb=0;
System.out.println("Account created successfully\n");
}

void deposit(int x,String pwod){
if(pwd==pwod) {
acb+=x;
System.out.println("Amount deposited successfully");}
else System.out.println("Invalid password. Please try again.");
}

void withdraw(int x, String pwod){
if(pwd==pwod) {
acb-=x;
System.out.println("Please collect cash");}
else System.out.println("Invalid password. Please try again.");
}

void balancecheck(String pwod){
if(pwd==pwod) System.out.println("UID: "+uid+"\n"+"Acc Balance: "+acb);
else System.out.println("Invalid password. Please try again.");
}

void resetpwd(String p){
pwd=p;
}

boolean check(int u){
if(uid==u) return true;
else return false;
}
}


class Accessspecifiers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the complete banking portal!!");
Acc acc[]=new Acc[10];
int u=0,s;
int i=0;
String r;
for(u=0;u<10;u++){
acc[u]=new Acc();
}
do{
System.out.println("\n\n\nFor customer press 1:");
int q=sc.nextInt();
if(q==0){
System.out.println("1.New Account:\n2.Customer Deposit");
int w=sc.nextInt();
if(w==1){
System.out.println("Enter UID:");
s=sc.nextInt();
System.out.println("Enter password:");
r=sc.next();
acc[i].newacc(s,r);
i++;
}
else if(w==2){
System.out.println("Enter Uid:");
s=sc.nextInt();
for(u=0;u<10;u++){
if(acc[u].check(s)==true){
System.out.println("Enter deposit amt:");
int depamt=sc.nextInt();
System.out.println("Enter password");
r=sc.next();
acc[u].deposit(depamt,r);
break;
}}
if(u==10){
System.out.println("Invalid uid\nPlease try again31");
}
}
else System.out.println("Please try again21");
}
//now the customer input 
else if(q==1){
System.out.println("1.Withdraw\n2.Balance Check");
int cuschoice=sc.nextInt();
if(cuschoice==1){
System.out.println("Enter UID:");
int useruid=sc.nextInt();
for(u=0;u<10;u++){
if(acc[u].check(useruid)==true){
System.out.println("Enter withdrawal amt:");
int wdramt=sc.nextInt();
System.out.println("Enter password");
r=sc.next();
acc[u].withdraw(wdramt,r); 
break;
}}
if(u==10) System.out.println("Invalid uid\nPlease try again32");
}
else if(cuschoice==2){
System.out.println("Enter UID:");
int useruid=sc.nextInt();
for(u=0;u<10;u++){
if(acc[u].check(useruid)==true){
System.out.println("Enter password");
String qz=sc.next();
acc[u].balancecheck(qz);
break;
}}
if(u==10) System.out.println("Invalid uid\nPlease try again33");
}
else System.out.println("Please try again22");
}
else System.out.println("Please try again1");
}
while(sc.next()!="`");//loop completeed

for(int p=0;p<10;p++){
System.out.println(acc[p].uid+" "+acc[p].pwd);
}
}}
