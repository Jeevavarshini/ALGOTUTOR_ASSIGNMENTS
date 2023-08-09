def unset_bits(n, x):
    bitmask = ~(2**x - 1)
    result = n & bitmask
    return result

