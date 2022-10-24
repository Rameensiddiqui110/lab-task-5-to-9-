import java.*;
import java.util.*;
class menu
{
public static void main(string[]args)
{
int choice;
string order;
scanner sc=new scanner(system.in);
system.out.println("menu");
system.out.println("1.tea");
system.out.println("2.coldrink");
system.out.println("3.burger");

system.out.println("enter choice(1-3):");

choice=sc.nextInt();

//logic
switch(choice)
{
case 1:
      order="tea";
      break;
case 2:
      order="cold drinks";
      break;
case 3:
     order="burger";
     break;
    default;
     order="not in menu";

}
//output
system.out.println("your order":+order);

   }
}