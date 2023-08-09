def countgood(prices):
    gooddays = 0
    n = len(prices)

    for i in range(n - 1):
        if prices[i] & prices[i + 1] > 0:
            gooddays += 1

    return gooddays

