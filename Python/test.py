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

def deleteRow():
    conn = pymysql.connect(host='localhost',user='root',password='P@$$w0rd',db='test')
    a = conn.cursor()
    productID = input("Enter the productID that you want to delete:")
    
    a.execute("DELETE FROM product WHERE productID = %s",(productID))
    print("successfully deleted")

    conn.commit()
    conn.close()
    countrow()
    
def main():
    #createTable()
    #addNewDVD()
    countrow()
    #deleteRow()
main()
