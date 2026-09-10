# LeetCode 36 — Valid Sudoku

## Skills
- 2D array traversal
- Nested loops
- `set` / `HashSet`
- Duplicate detection
- Row and column indexing
- 3×3 box traversal

## Main idea
A valid Sudoku must have:
- no duplicate digits in each row
- no duplicate digits in each column
- no duplicate digits in each 3×3 box
- `"."` should be ignored

## Useful patterns

### Row
Fix the row, loop through columns.

### Column
Fix the column, loop through rows.

```python
board[row][col]