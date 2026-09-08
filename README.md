# leetcode-practice

My LeetCode solutions, notes, and algorithm practice.

## About

This repository records my LeetCode practice as I improve my problem-solving skills, data structures knowledge, and algorithmic thinking.

Languages: **Java** (primary for this roadmap), Python (optional).

## 学习路线

依据《LeetCode Study Roadmap | Java》（上传文件 LeetCode_Study_Roadmap(1).pdf）建立。按主题学习，题号仅用于识别。

| Phase | 主题 | 练习条目 |
|---|---|---|
| 1 | [Arrays, Strings, and Hash Maps](phase-01-arrays-strings-hash-maps/README.md) | 8 |
| 2 | [Two Pointers and Sliding Window](phase-02-two-pointers-sliding-window/README.md) | 8 |
| 3 | [Stacks, Queues, and Linked Lists](phase-03-stacks-queues-linked-lists/README.md) | 10 |
| 4 | [Binary Search](phase-04-binary-search/README.md) | 6 |
| 5 | [Trees and Recursion](phase-05-trees-recursion/README.md) | 10 |
| 6 | [Heaps and Priority Queues](phase-06-heaps-priority-queues/README.md) | 5 |
| 7 | [Graphs: BFS and DFS](phase-07-graphs-bfs-dfs/README.md) | 8 |
| 8 | [Backtracking](phase-08-backtracking/README.md) | 7 |
| 9 | [Dynamic Programming](phase-09-dynamic-programming/README.md) | 10 |

共 72 个练习条目、71 道不同题目；#347 在 Phase 6 复习，复用 Phase 1 文件。

## 每次如何使用

1. 打开阶段目录，进入题目的 notes.md，再打开题目链接。
2. 独立思考 20–30 分钟，需要帮助时先看提示。
3. 从 LeetCode 复制 Java 方法签名，在同目录 Solution.java 中自己实现。
4. 在 LeetCode 运行并提交，记录边界情况、复杂度和一行笔记。
5. 更新阶段表格的当前掌握程度，3–7 天后不看旧代码重做。

原路线建议每周 3–5 题；掌握当前模式后即可进入下一阶段，无需完成该阶段所有题。第一里程碑是认真完成 Phase 1–4 中约 25–30 道精选题。

## 文件约定

- 每道题有 notes.md 和 Solution.java，代码文件目前仅含起始注释，尚无实现。
- 笔记可用中文，题目名和代码采用英文。
- PDF 日期保留为原始标注，星形等图形标记含义不作推断；未标注日期不代表没有做过。
- 每题独立在 LeetCode Java 环境运行。此仓库不是可整体编译的 Java 项目；本地调试时单独配置当前题目的测试入口和必要节点类型。
- Min Stack、LRU Cache、Find Median 等设计题需使用题目提供的类名，完成时可相应重命名 Java 文件并更新笔记链接。
- 可按需添加 solution.py，无需为每道题重复实现两种语言。

提交示例：`Add Java solution and notes for Two Sum`。
