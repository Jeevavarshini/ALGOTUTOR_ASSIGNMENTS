

def findnum(nums):
    countdict = {}
    for num in nums:
        countdict[num] = countdict.get(num, 0) + 1

    
    result = []
    for num, count in countdict.items():
        if count == 1:
            result.append(num)
    return result


