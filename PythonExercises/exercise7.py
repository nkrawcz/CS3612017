def lprinter():
	newList = []
	newList.insert(1,3)
	newList.insert(2,2)
	newList.insert(3,1)
	print(*newList, sep ='\n')
lprinter()

def rprinter():
	revList = []
	revList.insert(1,3)
	revList.insert(2,2)
	revList.insert(3,1)
	revList.reverse()
	print(*revList, sep ='\n')
rprinter()

def length():
	theList = [1,2,3,4]
	count = 0
	for i in theList:
		count = count + 1
	print(count)
length()