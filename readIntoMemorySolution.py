#you can use this to go through the whole file and get names and prices
#if you store these in a list or something you can use them as parameters for your item objects
#in a csv file there is always a comma between the elements so I sliced the strings by finding the commas
#everytime there is a comma it will take the thing before the comma and store it as the name
#and then takes everything after the comma and uses it for the price
#you could also just make objects as you go through the list and store them in a list and then have it print the list of objects for the inventory

file = open('products.csv', 'r')
line = file.readline()
while line != '':#iterates through all lines
	print(line)
	delim = line.find(',')#finds the comma in every line and uses it to split up the string
	price = line[delim+1:]#takes everything after the first comma and stores it as the "price"
	name = line[:delim]#takes everything before the comma and stores it as "name"
	print(name) #these two print lines show that slicing the string works
	print(price)
	line = file.readline()#iterates to the next line

	