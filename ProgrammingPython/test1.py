import os, pygame, time, random, uuid, sys

pygame.init()    #初始化

size = width, height = 320, 240    #大小
speed = [2, 2]         #速度
black = 0, 0, 0       #黑色像素

screen = pygame.display.set_mode(size)   #设置窗口大小

ball = pygame.image.load("intro_ball.gif")       #定义加载一个图片
ballrect = ball.get_rect()                       #

while 1:
    for event in pygame.event.get():
        if event.type == pygame.QUIT: sys.exit()

    ballrect = ballrect.move(speed)
    if ballrect.left < 0 or ballrect.right > width:
        speed[0] = -speed[0]
    if ballrect.top < 0 or ballrect.bottom > height:
        speed[1] = -speed[1]

    screen.fill(black)
    screen.blit(ball, ballrect)
    pygame.display.flip()