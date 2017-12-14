import numpy as np
import matplotlib.pyplot as plt

def main():
	x = np.linspace(0, 2, 100)
	y = np.linspace(0, 2, 100)

	plt.figure()
	plt.plot(x, (np.sin(x-2) ** 2) * (np.e ** (-x ** 2)))
	plt.xlabel("x")
	plt.ylabel("y")
	plt.title("Exercise 10 Plot")


	plt.show()
main()	


