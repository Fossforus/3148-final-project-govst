import pymysql

#This function displays everything in the table using the loop.
def countrow():
    
    conn = pymysql.connect(host='localhost',user='root',password='P@$$w0rd',db='test')

    a = conn.cursor()

    sql = 'SELECT * FROM `product`;'

    a.execute(sql)

    countrow = a.execute(sql)
    print("Number of rows:",countrow)
    data = a.fetchall()
    for d in data:
        print(d,'\n','--------------------------------------------------')

def getDVDNameAndPrice():
    conn = pymysql.connect(host='localhost',user='root',password='P@$$w0rd',db='test')

    a = conn.cursor()

    sql = 'SELECT productID, name,price FROM `product`;'

    a.execute(sql)
    
    #countrow = a.execute(sql)
    #print("Number of records:",countrow)
    data = a.fetchall()
    for d in data:
        print('Name of DVD:',d)

#This a function that creates new table in the database 
def createTable():
    conn = pymysql.connect(host='localhost',user='root',password='P@$$w0rd',db='test')
    a = conn.cursor()

    a.execute("""CREATE TABLE produc
        (
        productID int primary key,
        name varchar(20)
        )
        """)
    conn.commit()
    conn.close()

#This function adds new row to the database. The parameters are passed from addNewDVD fuction.
def insertData(productID,name,price,description,rating,dvdtype):
    conn = pymysql.connect(host='localhost',user='root',password='P@$$w0rd',db='test')
    a = conn.cursor()
    
    a.execute("INSERT INTO product(productID,name,price,description,rating,type) VALUES(%s,%s,%s,%s,%s,%s)",
             (productID,name,price,description,rating,dvdtype))
    print("success")

    conn.commit()
    conn.close()

#Asks user to input the data to add new DVD to the database.
def addNewDVD():
    dvdID = input("Enter the DVD id:")
    name = input("Enter DVD name: ")
    price = input("Enter the price of DVD :$")
    description = input("Enter the DVD description:")
    rating = input("Enter IMDB rating out of 10 points:")
    dvdType = input("Enter DVD type (Blu-Ray or DVD):")
    insertData(dvdID,name,price,description,rating,dvdType)

#Delete an entry from the database
def deleteRow():
    conn = pymysql.connect(host='localhost',user='root',password='P@$$w0rd',db='test')
    a = conn.cursor()
    productID = input("Enter the productID that you want to delete:")
    
    a.execute("DELETE FROM product WHERE productID = %s",(productID))
    print("successfully deleted")

    conn.commit()
    conn.close()
    countrow()

def mainMenu():
        c = Cart()
        print ("1. List all items and their prices")
        print ("2. List cart items")
        print ("3. Add an item to the cart")
        print ("4. Remove a item from the cart")
        print ("5. Checkout")
        print ("6. Exit")
        choice = int(input("Enter your choice: "))
        if choice==6:
            exit()
        elif choice == 1:
            #list_all_items()
            #Delete the code above
            getDVDNameAndPrice()
        elif choice == 2:
            c.list_cart_items()
        elif choice == 3:
            name = input("Enter the item name: ")
            quantity = int(input("Enter the quantity: "))
            q = Quantity(name, quantity)
            c.addItem(q)
        elif choice == 4:
            name = input("Enter the name of the item to remove from cart: ")
            c.removeItem(name)
        elif choice == 5:
            total = c.getTotal()
            tax = total*0.07
            grand_total = total+tax
            print("Your subtotal: %.2f$" %(total))
            print("Your tax: %.2f$" %(tax))
            print("Your total: %.2f$" %(grand_total))

class Cart:
    def __init__(self):
        self.products = []

    def addItem(self, quant):
        self.products.append(quant)

    def getTotal(self):
        total = 0
        price = 0
        for item in self.products:
            name = item.name
            for it in all_items:
                if name == it.name:
                    price = it.price
            quantity = item.quantity
            total = total + (price * quantity)
        return total

    def getNumItems(self):
        count = 0
        for c in self.products:
            count = count + 1
        return count
    def removeItem(self, name):
    #removes the item from the cart's item Products
        for it in self.products:
            if name == it.name:
                self.products.remove(it)
    def list_cart_items(self):
        print("Items available in your shopping cart:")
        for it in self.products:
            print("%s %i"%(it.name,it.quantity))

class Quantity:
        # Initialize the function and its attributes
    def __init__(self, name, quantity):
        self.name = name
        self.quantity = quantity
        
    def getPrice(self):
        return self.quantity
    
    def getName(self):
        return self.name
    
def exit():
    print("Thank you for shopping with us today.Have a great day!")
def main():
    
    #createTable()
    #addNewDVD()
    #countrow()
    #deleteRow()
    mainMenu()
    
main()
