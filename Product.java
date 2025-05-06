public class Product{
public static  String category="Electronics";
public String productName;
public static void main(String[]args){
System.out.println("Category:"+Product.category);
Product objref=new Product();
objref.productName="Laptop";
System.out.println("Prodct 1:"+objref.productName);
Product objref1=new Product();
objref1.productName="SmartPhone";
System.out.println("Prodct 1:"+objref1.productName);
}
}

