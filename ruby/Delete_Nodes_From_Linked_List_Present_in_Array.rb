# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val = 0, _next = nil)
#         @val = val
#         @next = _next
#     end
# end
# @param {Integer[]} nums
# @param {ListNode} head
# @return {ListNode}
def modified_list(nums, head)
  temp = head
  result = []
  while temp
    if not nums.include?(temp.val)
      result << temp.val
    end
    temp = temp.next
  end

  return result
end

nums = [1,2,3], head = [1,2,3,4,5]
modified_list(nums, head)