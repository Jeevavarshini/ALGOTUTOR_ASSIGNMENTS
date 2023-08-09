def xormin(nums):
    nums.sort()
    minxor = float('inf')

    for i in range(1, len(nums)):
        minxor = min(minxor, nums[i] ^ nums[i - 1])

    return minxor


