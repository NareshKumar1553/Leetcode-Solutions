def subarraysDivByK(nums, k):
    count = 0
    prefix_sum = 0
    remainder_count = [0] * k
    remainder_count[0] = 1

    for num in nums:
        prefix_sum = (prefix_sum + num) % k
        count += remainder_count[prefix_sum]
        remainder_count[prefix_sum] += 1

    return count