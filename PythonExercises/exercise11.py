theList = [1,2,3,4,5,6,7]
product = 1

def iter(theList):
	if len(theList) == 0:
		return 0
	for i in theList:
		product = product * theList[i:]
	return product
print(product)	

def recur(theList):
	if len(theList) == 0:
		return 0
	for i in theList:
		product = recur(theList[0]) * recur(theList[i:])
	return product
print(product)


