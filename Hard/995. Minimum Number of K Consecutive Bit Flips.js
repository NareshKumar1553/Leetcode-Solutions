/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minKBitFlips = function (nums, k) {
    var flag = 0;
    var res = 0;
    var n = nums.length;

    for (var i = 0; i < n; i++) {
        var cur = nums[i] ^ flag;
        if (cur === 0) {
            if (i + k > n) return -1;
            flag ^= 1;
            res++;
        }
        nums[i] = 1 - cur;
        if (i + 1 - k >= 0) flag ^= nums[i + 1 - k];
    }
    return res;
};