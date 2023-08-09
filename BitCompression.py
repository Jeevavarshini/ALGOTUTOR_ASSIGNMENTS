def compressarray(nums):
    binarystring = ''.join(format(num, 'b') for num in nums)
    compressedstring = ''
    prevchar = None
    for char in binarystring:
        if char != prev_char:
            compressedstring += char
            prevchar = char
        elif char == '1':
            compressedstring += char
            prevchar = char
    
    return len(compressedstring)


