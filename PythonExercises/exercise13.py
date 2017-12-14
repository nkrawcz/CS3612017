import re

def thirteen():
	file = open("emails.txt")
	for line in file:
		if re.findall(r'[\w\d\.\"-]*@[\w\d\.-]+', line):
			print(line)
print(thirteen())