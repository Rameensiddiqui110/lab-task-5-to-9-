import java.util.scanner

class login{

string un,pass;
scanner s1;
int count;

public login(scanner scr){\
     s1=scr;
}
public setData(){

     system.out.println("enter username >");
     un=s1.next();
     
     system.out.println("enter password >");
     un=s1.next();
     loginPage();
}

public againPass(){

     system.out.println("enter password again >");
     pass=s1.next();
     loginPage();
}
public void loginPage(0{

     if(um.equals("admin")){
     if(pass.equals("admin")){
     welcome w1=new welcome();

}
  
 else{

     count++
     system.out.println("incorrect password!");
     if(count<3){
     againPass();
     }

else{
     system.out.println("app lock!");
     }
    }
  } 
}

class mainclass{
public static void main(string args[]){
scanner scr=new scanner(system.in);

login obj=new login(scr);
obj.setData();

}

}

class welcome{
    public welcome(){
system.out.println("welcome Page");

}

}