# scripts/new.py
import os, sys

if len(sys.argv) < 3:
    print("用法: python new.py 1 "两数之和"")
    exit()

num = sys.argv[1].zfill(4)
title = sys.argv[2]

# Java
java_dir = f"java/src/leetcode"
os.makedirs(java_dir, exist_ok=True)
java_code = f"""public class P{num}_{title.replace(' ', '_')} {{
    public static void main(String[] args) {{
        Solution s = new Solution();
        // 测试代码
    }}
}}

class Solution {{
    // 在这里写题解
}}
"""
open(f"{java_dir}/P{num}_{title.replace(' ', '_')}.java", "w", encoding="utf-8").write(java_code)

# C++
cpp_code = f"""#include <bits/stdc++.h>
using namespace std;

class Solution {{
public:
    // 在这里写题解
}};

int main() {{
    Solution s;
    // 测试代码
    return 0;
}}
"""
open(f"cpp/src/{num}_xxx.cpp", "w", encoding="utf-8").write(cpp_code)

# Python
py_code = f'''"""
{num}. {title}
"""
class Solution:
    def solve(self):
        pass

# 测试
if __name__ == "__main__":
    s = Solution()
    s.solve()
'''
open(f"python/p{num}_xxx.py", "w", encoding="utf-8").write(py_code)

print(f"成功创建 {num} {title} 三语言模板！")