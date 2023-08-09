def divide(dividend, divisor):
    INT_MAX = 2**31 - 1
    INT_MIN = -2**31

    
    if divisor == 0:
        return INT_MAX
    if dividend == 0:
        return 0
    if dividend == INT_MIN and divisor == -1:
        return INT_MAX

   
    negative = (dividend < 0) ^ (divisor < 0)

    dividend = abs(dividend)
    divisor = abs(divisor)

    quotient = 0
    while dividend >= divisor:
        dividend -= divisor
        quotient += 1

    return -quotient if negative else quotient


