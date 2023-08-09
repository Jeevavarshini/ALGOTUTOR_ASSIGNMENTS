def find_single_element(arr):
    result = 0
    for num in arr:
        result ^= num
    return result
print(find_single_element([2,4,6,2,4]))