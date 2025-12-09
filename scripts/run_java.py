# scripts/run_java.py
import os
import subprocess
import glob

def run_java():
    num = input("请输入题目编号（如 1、11、42、1145）: ").strip()
    if not num.isdigit():
        print("编号必须是数字！")
        return

    # 查找对应的 Java 文件（支持 P0001_TwoSum.java 或 P1_TwoSum.java 等多种命名）
    pattern = f"../java/src/leetcode/P{num}*.java"
    files = glob.glob(pattern)
    if not files:
        pattern2 = f"../java/src/leetcode/*{num}*.java"
        files = glob.glob(pattern2)
    
    if not files:
        print(f"没找到题目 {num} 的 Java 文件！检查文件名是否包含 {num}")
        return
    
    java_file = files[0]
    class_name = os.path.basename(java_file).replace(".java", "")
    
    print(f"\n正在编译: {java_file}")
    compile_result = subprocess.run(
        ["javac", java_file],
        cwd="../java/src/leetcode"
    )
    
    if compile_result.returncode != 0:
        print("编译失败！")
        return
    
    input_file = f"../input/{num}.txt"
    if not os.path.exists(input_file):
        print(f"警告：没找到测试用例 {input_file}，直接运行无输入")
        os.system(f"java {class_name}")
    else:
        print(f"找到测试用例: {input_file}")
        print("="*50 + " 输入 " + "="*50)
        with open(input_file, encoding="utf-8") as f:
            print(f.read().strip())
        print("="*50 + " 输出 " + "="*50)
        
        # 运行并传入输入
        subprocess.run(
            ["java", class_name],
            cwd="../java/src/leetcode"
        )

if __name__ == "__main__":
    run_java()