# leetcode-practice

My LeetCode solutions, notes, and algorithm practice.

## About

This repository records my LeetCode practice as I improve my problem-solving skills, data structures knowledge, and algorithmic thinking.

Languages: **Java** (primary for this roadmap), Python (optional).

## Study roadmap

Based on *LeetCode Study Roadmap | Java* (provided as LeetCode_Study_Roadmap(1).pdf). Learn by topic; problem numbers serve as identifiers.

| Phase | Topic | Practice entries |
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

There are 72 practice entries covering 71 unique problems. Phase 6 revisits #347 using its Phase 1 files.

## Study workflow

1. Open a phase index, select a problem's notes.md, and follow the problem link.
2. Attempt the problem independently for 20–30 minutes. Start with a hint if you need help.
3. Copy the Java method signature from LeetCode into Solution.java and implement the solution yourself.
4. Run and submit on LeetCode. Record edge cases, complexity, and a one-line note.
5. Update your proficiency in the phase index. Redo the problem after 3–7 days without looking at your earlier code.

The original roadmap recommends 3–5 problems per week. Move on when a pattern feels solid; completing every problem in a phase is optional. The first milestone is to work carefully through around 25–30 selected problems from Phases 1–4.

## File conventions

- Each problem has notes.md and Solution.java. Java files currently contain starter comments only; solutions have not been implemented.
- Use English for notes, problem titles, and code comments.
- PDF dates are preserved as original annotations. Symbols such as stars are not interpreted; a missing date does not mean the problem has never been attempted.
- Run each solution independently in LeetCode's Java environment. This repository is not a single compilable Java project. For local debugging, configure a test entry point and any required node definitions for the current problem.
- Design problems such as Min Stack, LRU Cache, and Find Median require the class name supplied by the problem. Rename the Java file and update its notes link as appropriate when implementing it.
- Add solution.py when useful; implementing every problem in both languages is optional.

Example commit: `Add Java solution and notes for Two Sum`.
