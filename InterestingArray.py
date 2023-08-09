def interesting(arr):
    xorres = 0
    for num in arr:
        xorres ^= num

    return xorres == 0

