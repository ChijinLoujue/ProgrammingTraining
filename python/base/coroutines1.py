import time


def func1():
    for i in range(11):
        yield
        print('这是我第%s次打印啦' % i)
        time.sleep(1)


def func2():
    g = func1()
    next(g)
    for k in range(10):
        print('哈哈，我第%s次打印了' % k)
        time.sleep(1)
        next(g)


# 不写yield，下面两个任务是执行完func1里面所有的程序才会执行func2里面的程序，有了yield，我们实现了两个任务的切换+保存状态
func1()
func2()

# coroutines1.py

# https://blog.csdn.net/weixin_41599977/article/details/93656042
# https://www.cnblogs.com/russellyoung/p/python-zhi-xie-cheng.html
