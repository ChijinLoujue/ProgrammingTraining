# scripts/run_cpp.py
import os
import subprocess

def run_cpp():
    num = input("请输入题目编号（如 1、11、42、1145）: ").strip().zfill(4)
    
    # 自动匹配 cpp/src 目录下的文件（支持 0001_xxx.cpp、1_xxx.cpp 等）
    pattern = f"../cpp/src/{num}*.cpp"
    import glob
    files = glob.glob(pattern)
    if not files:
        pattern = f"../cpp/src/*{num}*.cpp"
        files = glob.glob(pattern)
    
    if not files:
        print(f"没找到题目 {num} 的 C++ 文件！")
        return
    
    cpp_file = files[0]
    exe_name = "a.exe" if os.name == "nt" else "./a.out"
    
    print(f"\n正在编译: {cpp_file}")
    compile_cmd = ["g++", "-std=c++17", "-O2", "-DONLINE_JUDGE", cpp_file, "-o", exe_name]
    result = subprocess.run(compile_cmd, cwd="../cpp/src")
    
    if result.returncode != 0:
        print("编译失败！")
        return
    
    input_file = f"../input/{num.lstrip('0') or '0'}.txt"  # 去掉前导0匹配
    if not os.path.exists(input_file):
        print(f"警告：没找到测试用例 {input_file}，直接运行")
        subprocess.run(exe_name, cwd="../cpp/src")
    else:
        print(f"找到测试用例: {input_file}")
        print("="*50 + " 输入 " + "="*50)
        with open(input_file, encoding="utf-8") as f:
            print(f.read().strip())
        print("="*50 + " 输出 " + "="*50)
        
        with open(input_file, encoding="utf-8") as f:
            subprocess.run(exe_name, stdin=f, cwd="../cpp/src")

if __name__ == "__main__":
    run_cpp()