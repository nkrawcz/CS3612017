def main():
	y = int(0);
	x = int(5);	
	while y < 20:
		if (x%5==0) and (x%7==0) and (x%11==0):
			print(x);
			print(x / 5);
			print(x / 7);
			print(x / 11);
			x = x + 1;
		y = y + 1;
print(main())		