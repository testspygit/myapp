public class myapp027{
 private String name;
 private String Rollnum;

 public myapp027(String name,String Rollnum){
  this.name=name;
  this.Rollnum=Rollnum;
}
public void displayinfo(){
System.out.println("Name"+ name);
System.out.println("Rollnum" + Rollnum);
}

public static void main(String[] args){
 myapp027 student=new myapp027("Noor-ul-Ain","SP21-BCT-27");
 student.displayinfo();
}
}


