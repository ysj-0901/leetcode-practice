
from typing import List

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # check each row
        for row in board:
            nums = [x for x in row if x != "."]
            if len(nums) != len(set(nums)):
                return False

        #check each column
        for col in range(9):
            nums = []

            for row in range(9):
                if board[row][col] != ".":
                    nums.append(board[row][col])

            if len(nums) != len(set(nums)):
                return False
        
        # check each box
        for row_start in range(0, 9, 3):
            for col_start in range(0, 9, 3):

                nums = []

                for row in range(row_start, row_start + 3):
                    for col in range(col_start, col_start + 3):

                        if board[row][col] != ".":
                            nums.append(board[row][col])

                if len(nums) != len(set(nums)):
                    return False

        return True

            

                
            
        