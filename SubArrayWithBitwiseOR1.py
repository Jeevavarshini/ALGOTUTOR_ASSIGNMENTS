def one(nums):
    count = 0
    windowor = 0

    left = 0
    for right in range(len(nums)):
       
        windowor |= nums[right]
        while windowor != 1 and left <= right:
            windowor ^= nums[left]
            left += 1
        count += (right - left + 1)
    return count

