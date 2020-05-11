#coding=utf-8


import cv2
import numpy
from io import BytesIO
from PIL import Image


OriginalImageName = "04.png"
FindImageName = "tanks15.png"

target_img = cv2.imread(OriginalImageName)
find_img = cv2.imread(FindImageName)
find_height, find_width, find_channel = find_img.shape[::]
print (find_height, find_width, find_channel)
# 模板匹配
result = cv2.matchTemplate(target_img, find_img, cv2.TM_CCOEFF_NORMED)
min_val,max_val,min_loc,max_loc = cv2.minMaxLoc(result)
print (min_val, max_val, min_loc, max_loc)
# 计算位置
pointUpLeft = max_loc
pointLowRight = (max_loc[0]+find_width, max_loc[1]+find_height)
pointCentre = (max_loc[0]+(find_width/2), max_loc[1]+(find_height/2))
print pointCentre
flags=cv2.DRAW_MATCHES_FLAGS_DEFAULT
color=(0,255,0)

#参数image代表原始图片
#参数outImage是指输出在哪张图片上
#参数keypoints代表图片的关键点
#参数flags代表关键点的勾画方式
#参数color代表勾画的色彩模式
img = cv2.circle(target_img,pointCentre,5,color,0,0,0)

#显示图片
cv2.imshow('sift_keypoints',img)
cv2.waitKey()

