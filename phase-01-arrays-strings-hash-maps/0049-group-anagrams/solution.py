class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for word in strs:
            key = ''.join(sorted(word))

            if key not in groups:
                groups[key] = []

            groups[key].append(word)

        return list(groups.values())

# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         result_list = []

#         while strs:  #keep looping while strs is not empty.
#             result = [strs[0]]

#             for word in strs[1:]:
#                 if Counter(strs[0]) == Counter(word):
#                     result.append(word)

#             result_list.append(result)
#             strs = [word for word in strs if word not in result]

#         return result_list

            
        