# 1. Two Sum

[View on LeetCode](https://leetcode.com/problems/two-sum/) · [Notes](notes.md)

## Problem summary

Given an integer array `nums` and an integer `target`, return the indices of two distinct elements whose sum equals `target`.

Each input has exactly one valid answer. You may return the indices in either order, but you cannot use the same element twice.

## Examples

### Example 1

```text
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
```

Explanation: `nums[0] + nums[1] = 2 + 7 = 9`.

### Example 2

```text
Input: nums = [3, 2, 4], target = 6
Output: [1, 2]
```

### Example 3

```text
Input: nums = [3, 3], target = 6
Output: [0, 1]
```

## Constraints

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Exactly one valid answer exists.

## Follow-up

Can you find a solution faster than O(n²)?
