a = [2,5,7,4,3]
b = a
b[1] = 6
c = a[:]
c[2] = 9

print(a)
print(b)
print(c)

def set_first_elem_to_zero(l):
	a[0] = 0
	print(a)
set_first_elem_to_zero(a)	