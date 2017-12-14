exercise6

def is_prime(n):
	x = True
	for i in (2, n):
		while x = True:
			if n % i == 0:
				x = false
			else
				x = true
	counter = 1
	add = 6 * counter + 1
	subtract = 6 * counter - 1				


def upto(n):
	primes = []
	add = 6 * counter + 1
	subtract = 6 * counter - 1
	if(n >= 2):
		primes.append(2)
	elif (n >= 3):
		primes.append(3)
	else:
		while (subtract <= n):
			counter = 1
			add = 6 * counter + 1
			subtract = 6 * counter - 1	
			primes.append(subtract)
			if (add <= n):
				primes.append(add)
	return upto()

def first(n):
	counter = 1
	add = 6 * counter + 1
	subtract = 6 * counter - 1
	primes = []
	if (x.is_prime == true):
		primes.append(x)
		x = x + 1
		counter = counter + 1
	else (x.is_prime == false):	
		x = x + 1
	return first()	

