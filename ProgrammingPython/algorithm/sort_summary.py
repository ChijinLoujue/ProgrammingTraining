import random


class SortWag:

    def bubbleSort(self, nums):
        if not nums:
            return nums
        length = len(nums)
        for i in range(length):
            for j in range(length - i - 1):
                if nums[j + 1] < nums[j]:
                    (nums[j], nums[j + 1]) = (nums[j + 1], nums[j])
        return nums

    def quickSort(self, nums, left, right):
        if not nums:
            return nums
        if left < right:
            mid = self.partition(nums, left, right)
            self.quickSort(nums, left, mid - 1)
            self.quickSort(nums, mid + 1, right)
        return nums

    def partition(self, nums, left, right):
        key = left
        while left < right:
            while left < right and nums[right] >= nums[key]:
                right -= 1
            while left < right and nums[left] <= nums[key]:
                left += 1
            (nums[left], nums[right]) = (nums[right], nums[left])

        (nums[left], nums[key]) = (nums[key], nums[left])
        return left

    def insertSort(self, nums):
        n = len(nums)
        if n <= 1:
            return nums
        for i in range(1, n):
            j = i
            target = nums[i]
            while j > 0 and target < nums[j - 1]:
                nums[j] = nums[j - 1]
                j = j - 1
            nums[j] = target
        return nums

    def selectSort(self, nums):
        n = len(nums)
        if n <= 1:
            return nums
        for i in range(n - 1):
            minIndex = i
            for j in range(i + 1, n):
                if nums[j] < nums[minIndex]:
                    minIndex = j
            if i != minIndex:
                (nums[minIndex], nums[i]) = (nums[i], nums[minIndex])
        return nums

    def mergeSort(self, nums, left, right):
        if left >= right:
            return
        mid = (left + right) // 2
        self.mergeSort(nums, left, mid)
        self.mergeSort(nums, mid + 1, right)
        self.merge(nums, left, mid, right)
        return nums

    def merge(self, nums, left, mid, right):
        temp = []
        i = left
        j = mid + 1
        while i <= mid and j <= right:
            if nums[i] <= nums[j]:
                temp.append(nums[i])
                i = i + 1
            else:
                temp.append(nums[j])
                j = j + 1
        while i <= mid:
            temp.append(nums[i])
            i = i + 1
        while j <= right:
            temp.append(nums[j])
            j = j + 1
        for i in range(left, right + 1):
            nums[i] = temp[i - left]


if __name__ == '__main__':
    lst = [random.randint(0, 100) for i in range(20)]
    print(lst)
    sortway = SortWag()
    result = sortway.bubbleSort(lst)
    print("bubbleSort:", result)
    result = sortway.quickSort(lst, 0, len(lst) - 1)
    print("quickSort:", result)
    result = sortway.insertSort(lst)
    print("insertSort:", result)
    result = sortway.selectSort(lst)
    print("selectSort:", result)
    result = sortway.mergeSort(lst, 0, len(lst) - 1)
    print("mergeSort:", result)