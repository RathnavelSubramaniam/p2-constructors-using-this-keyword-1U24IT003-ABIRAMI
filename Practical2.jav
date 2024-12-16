class Product {
int productid,
String productName:
double price;
//Define instance variables: productid (int), productName (String), price
//(double)
static int count;
Product(){
 productName null;
}
Product(int productid, String productName.double price)
{
this.productid= productid,
this.productName-productName;
 this.price=price;
  count++;
}
//Static variable for product count
//Constructor to initialize product attributes 
double discount(double Price, double Discount)
{
return ((100-Discount)/100) *Prices
}
//Calculate and return the discounted price
 void display ProductInfo()
 System.out.println("Product Id:"+productid);
System.out.println("Product Namel: "productName);
System.out.println("Product Id: "+productid);
System.out.println("Product Name:"+productName);
 System.out.println("ProductPrice:"+price);
}
//Display product information
//Static method to retrieve total product count
public class Practical2
{
public static void main(String[]args)
{
Product product1 =new Product (101,"Laptop" 999.99);
 Product product2=new Product(202,"Smart Phone", 499.95);
  Product product3=new Product (303, "Tablet" 299.50);
Product CaleDiscount: new Prod Product();
//Create three Product with different data
product1.displayProductInfo();
 product2.displayProductInfo();
  Product3.display ProductInfo():
product display ProductInfo()
// Display product informations
double DiacoumedPrice=caleDiscount.discount(product1.price,10) ;
System.out.println("DiscountedPrice :"+DiscountedPrice); 
System.out.println(Product.count);
}}
//Calculate ant display discounted pece // Display total product count