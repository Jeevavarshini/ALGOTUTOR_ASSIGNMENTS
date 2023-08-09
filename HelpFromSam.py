def br(arr, targetsum):
    n = len(arr)
    for i in range(1 << n):
        bitwiseor = 0
        for j in range(n):
            if i & (1 << j):
                bitwiseor |= arr[j]
        if bitwiseor == targetsum:
            return True
    return False

