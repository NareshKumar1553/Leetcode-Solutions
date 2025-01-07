class Solution:
    def minMovesToSeat(self, seats: List[int], stu: List[int]) -> int:
        stu.sort()
        seats.sort()
        a = []
        for i in range(0,len(stu)):
            a.append(abs(stu[i]-seats[i]))
        return sum(a)