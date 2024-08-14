# # s = "1123456"
# # c = list(s)
# # print(type(c))
#
# # print([chr(i) for i in range(48, 48+10) if i % 2 == 0])
# # print([chr(i) for i in range(65, 65+26) if i % 2 == 0])
# # print([chr(i) for i in range(97, 97+26) if i % 2 == 0])
# # print(ord('a'))
#
# s = set()
# print(s)
# s.add('1')
# print(s)
# s.add('1')
# print(s)
# s.add(1)
# print(s)
#
# person/ id me
# 查找重复的
# select email
# from person
# where count(email) > 1
# group by(email)
#
# id name
# name class scares
#
# select count(scares)
# from table
# group by class
# having scares >= 60
#
# aa bb
# grep 'aa' 'bb'
# ps |grep 'xxx'
# netstat |grep 'port'|echo $1| ps xarg

# n  123 走法

# def func(n):
#     # result = 0
#     if n <= 0:
#         return 0
#     if n == 1:
#         return 1
#     if n == 2:
#         return 2
#     if n == 3:
#         return 4
#     return func(n - 1) + func(n - 2) + func(n - 3)
#
#
#
# print(func(4))
def func(lst):
    dct = {}
    for i in lst:
            if i in dct:
                dct[i] = 1
            else:
                dct[i] += 1
