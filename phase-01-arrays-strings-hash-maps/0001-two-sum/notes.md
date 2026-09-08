# 1. Two Sum

[Problem](https://leetcode.com/problems/two-sum/) · [Description](description.md) · [Java solution](Solution.java) · [Python solution](solution.py) · [Phase index](../README.md)

- Date annotated in the original PDF: 2026-07-02 (does not automatically indicate current proficiency)
- Current status: To be recorded
- Practice date:
- Next review date (in 3–7 days):

## One-line note

Pattern: hash map for complement lookup; invariant: before processing index `i`, `seen` maps previously encountered values to earlier indices; key insight: check for the complement before inserting the current value to avoid reusing the same element.

## Thinking notes (optional)

- Baseline approach: check every pair using nested loops, starting the inner loop at `i + 1`; this takes O(n²) time and O(1) extra space.
- Why the solution works: for each value `num`, look for `target - num` in `seen`. If found, its stored index is earlier than the current index, so the two indices are distinct and their values sum to the target. Otherwise, store the current value and index. When the later element of the valid pair is reached, its complement is already available.
- Time complexity and reasoning: expected O(n), with one traversal and expected O(1) hash-map lookup and insertion per element.
- Auxiliary space complexity and reasoning: O(n), since the map can store up to O(n) distinct values.
- Edge cases and expected outputs:
  - Duplicate values: `[3, 3]`, target `6` → `[0, 1]`.
  - Negative values: `[-3, 4, 3, 90]`, target `0` → `[0, 2]`.
  - Zero values: `[0, 4, 3, 0]`, target `0` → `[0, 3]`.
  - Minimum length: `[2, 7]`, target `9` → `[0, 1]`.

## Review log

| Date | Solved independently? | Difficulty encountered / next step |
|---|---|---|

Suggested statuses: Not attempted / Solved with hints / Solved independently / Needs review.
