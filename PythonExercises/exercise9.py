def concatlists():
	theList = [[1,3],[3,6],[6,9]]
	newList = []
	for i in theList:
		newList = theList[0] + theList[1] + theList[2]
	print(newList)	
concatlists()	