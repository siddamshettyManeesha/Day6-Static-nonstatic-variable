public class Computer{
public static String os="Windows";
public String ram;
public static void main(String[]args){
System.out.println("OS:"+Computer.os);
Computer objref=new Computer();
objref.ram="8 GB";
System.out.println("Computer 1 RAM:"+objref.ram);
Computer objref1=new Computer();
objref1.ram="16 GB";
System.out.println("Computer 2 RAM:"+objref1.ram);
}
}


