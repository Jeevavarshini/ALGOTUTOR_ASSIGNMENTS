def addbinstr(a, b):
    
    return bin(int(a, 2) + int(b, 2))[2:]


a = "11"
b = "1"
output = addbinstr(a, b)
print(output)  
