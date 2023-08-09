def count_set_bits(N):
    count = 0

    for i in range(1, N + 1):
        num = i
        while num > 0:
            count += num & 1
            num >>= 1

    return count

