public class Department{
public static String departmentName="HR";
public String employeeName;
public static void main(String[]args){
Department objref=new Department();
System.out.println("Department:"+Department.departmentName);
objref.employeeName="John";
System.out.println("Employe 1:"+objref.employeeName);
Department objref1=new Department();
objref1.employeeName="Alice";
System.out.println("Employe 2:"+objref1.employeeName);
System.out.println("After modification:");
Department.departmentName="Marketing";
System.out.println("Department:"+Department.departmentName);
System.out.println("Employe 1:"+objref.employeeName);
System.out.println("Employe 2:"+objref1.employeeName);
}
}

