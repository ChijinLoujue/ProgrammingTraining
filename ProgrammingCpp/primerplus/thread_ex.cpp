//
// Created by ChijinLoujue on 2021/1/28.
//


#include <iostream>
#include <vector>
#include <algorithm>
#include <thread>
#include <numeric>
using namespace std;

//线程要做的事情就写在这个线程函数中
void GetSumT(vector<int>::iterator first,vector<int>::iterator last,int &result)
{
    result = accumulate(first,last,0); //调用C++标准库算法
}

int main() //主线程
{
    int result1,result2,result3,result4,result5;
    vector<int> largeArrays;
    for(int i=0;i<100000000;i++)
    {
        if(i%2==0)
            largeArrays.push_back(i);
        else
            largeArrays.push_back(-1*i);
    }
    thread first(GetSumT,largeArrays.begin(),
                 largeArrays.begin()+20000000,std::ref(result1)); //子线程1
    thread second(GetSumT,largeArrays.begin()+20000000,
                  largeArrays.begin()+40000000,std::ref(result2)); //子线程2
    thread third(GetSumT,largeArrays.begin()+40000000,
                 largeArrays.begin()+60000000,std::ref(result3)); //子线程3
    thread fouth(GetSumT,largeArrays.begin()+60000000,
                 largeArrays.begin()+80000000,std::ref(result4)); //子线程4
    thread fifth(GetSumT,largeArrays.begin()+80000000,
                 largeArrays.end(),std::ref(result5)); //子线程5

    first.join(); //主线程要等待子线程执行完毕
    second.join();
    third.join();
    fouth.join();
    fifth.join();

    int resultSum = result1+result2+result3+result4+result5; //汇总各个子线程的结果

    return 0;
}
//
//#include <iostream>
//// 必须的头文件
//#include <pthread.h>
//
//using namespace std;
//
//#define NUM_THREADS 5
//
//// 线程的运行函数
//void* say_hello(void* args)
//{
//    cout << "Hello Runoob！" << endl;
//    return 0;
//}
//
//int main()
//{
//    // 定义线程的 id 变量，多个变量使用数组
//    pthread_t tids[NUM_THREADS];
//    for(int i = 0; i < NUM_THREADS; ++i)
//    {
//        //参数依次是：创建的线程id，线程参数，调用的函数，传入的函数参数
//        int ret = pthread_create(&tids[i], NULL, say_hello, NULL);
//        if (ret != 0)
//        {
//            cout << "pthread_create error: error_code=" << ret << endl;
//        }
//    }
//    //等各个线程退出后，进程才结束，否则进程强制结束了，线程可能还没反应过来；
//    pthread_exit(NULL);
//}
//
///******************************************************************************************/
//#include <iostream>
//
//#include <thread>
//
//std::thread::id main_thread_id = std::this_thread::get_id();
//
//void hello()
//{
//    std::cout << "Hello Concurrent World\n";
//    if (main_thread_id == std::this_thread::get_id())
//        std::cout << "This is the main thread.\n";
//    else
//        std::cout << "This is not the main thread.\n";
//}
//
//void pause_thread(int n) {
//    std::this_thread::sleep_for(std::chrono::seconds(n));
//    std::cout << "pause of " << n << " seconds ended\n";
//}
//
//int main() {
//    std::thread t(hello);
//    std::cout << t.hardware_concurrency() << std::endl;//可以并发执行多少个(不准确)
//    std::cout << "native_handle " << t.native_handle() << std::endl;//可以并发执行多少个(不准确)
//    t.join();
//    std::thread a(hello);
//    a.detach();
//    std::thread threads[5];                         // 默认构造线程
//
//    std::cout << "Spawning 5 threads...\n";
//    for (int i = 0; i < 5; ++i)
//        threads[i] = std::thread(pause_thread, i + 1);   // move-assign threads
//    std::cout << "Done spawning threads. Now waiting for them to join:\n";
//    for (auto &thread : threads)
//        thread.join();
//    std::cout << "All threads joined!\n";
//}