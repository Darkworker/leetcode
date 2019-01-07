## 2018.11.15
#### LC118. Pascal's Triangle
##### 题目描述：
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
##### 解题思路：
分析问题，每次生成的层，依赖于上一层。同时根据对称，所以每次只需要求一半。

## 2018.11.14
#### LC107 .BinaryTreeLevelOrderTraversal2
##### 题目描述：
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
##### 解题思路：
采用两个队列分别存储：当前层的节点，和下一层的节点

#### LC108 .Convert Sorted Array to Binary Search Tree
##### 题目描述：
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
##### 解题思路：
递归法

TreeNode sortedArrayToBST(int[] nums,int beginIdx,int endIdx)
1. 递归终止条件：endIdx==beginIdx,endIdx-beginIdx==1
2. 否则，取中间节点，左右子树分别构造。
#### L110. Balanced Binary Tree
##### 题目描述：
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
##### 解题思路：
  利用统计树高的方式求解；在统计树高的过程中用一个实力变量isBalance记录是否存在左右子树高度差大于1.
  
#### LC111. Minimum Depth of Binary Tree
##### 题目描述：
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
##### 解题思路：
利用递归求解：在上一题的基础上，改为每次取左右子树中高度比较矮的。

==注意：当左右子树中有一个为null时，这是该节点的最短子路径应该是部位null的子树的高度==

#### LC112. Path Sum
##### 题目描述：
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
##### 解题思路：
利用递归求解：root==null时返回false；当root是叶子节点，比较是否和sum相同；左右取或

