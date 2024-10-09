<h2><a href="https://www.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/0">Level of a Node in Binary Tree</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a Binary Tree and a target key, you need to find the level of the target key in the given Binary Tree.<br></span><span style="font-size: 14pt;"><strong>Note:</strong> The level of the root node is 1. If no such key exists then return 0.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:
&nbsp;       </strong>1
&nbsp;     /   \
&nbsp;    2     3
target = 4<strong>
Output: </strong>0

</span><span style="font-size: 14pt;"><strong>Input:</strong>
&nbsp;        3
&nbsp;      /   \
&nbsp;     2     5
&nbsp;   /   \
&nbsp;  1     4
target = 4<strong>
Output: </strong>3
</span></pre>
<p><span style="font-size: 14pt;"><strong>Expected Time Complexity:&nbsp;</strong>O(n).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(H).<br><strong>Note:</strong> H is the height of the tree and this space is used implicitly for the recursion stack.</span></p>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1 &lt;= number of nodes&lt;= 10<sup>5</sup></span><br><span style="font-size: 14pt;">1 &lt;= data of a node&lt;= 10<sup>5</sup></span><br><span style="font-size: 14pt;">1 &lt;= target &lt;= 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;