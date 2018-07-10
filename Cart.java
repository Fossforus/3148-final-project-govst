//Code by Dupe and Kevin
//This is class named cart that contains the information about the product that has been purchased.


public class Cart
{
  private boolean transactionSuccessful; //To check if the product is successfully purchased.
  String productName,shippingAddress;   //Name of the product bought and the shipping address.
  double price,shippingPrice,tax,finalPrice;    //The price of the product, shipping price, tax and the final price.
  int quantity;         //How many products are bought.
  double creditCardNumber;      //      The credit card of the user to buy the product.
  int expirationMonthandYear,cvv;       //Expiration month and year of the credit card of the user and CVV on the back of the card.


  //Constructor of class cart.
  public Cart(String newProductName, String newShippingAddress, int newQuantity)
{
  productName = newProductName;     //assigning the name of the product.
    shippingAddress = newShippingAddress;       //      Update the shipping address
    quantity = newQuantity;                 //Set the number of quantities for user to buy.

  transactionSuccessful = false;
}


  

  