def find_max(N):
    max_x = 0

    for x in range(1, N + 1):
        if N % x == N ^ x:
            max_x = max(max_x, x)

    return max_x


