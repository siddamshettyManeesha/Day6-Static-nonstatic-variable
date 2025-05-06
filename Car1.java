public class Car1{
public static String companyName="Honda";
public String carModel="Civic";
public static void main(String[]args){
System.out.println("Company:"+Car1.companyName);
Car1 objref=new Car1();
System.out.println("Car 1 Model:"+objref.carModel);
Car1 objref1=new Car1();
objref1.carModel="Accord";
System.out.println("Car 1 Model:"+objref1.carModel);
}
}

