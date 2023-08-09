def reverse_binary(n):
    binarystr = bin(n)[2:]  
    rbs = binarystr[::-1] 
    return int(rbs, 2)  


