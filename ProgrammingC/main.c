#include <stdio.h>
#include <mem.h>

int main() {
    char str[70];
    printf("input string:");
    scanf("%s",str);
    printf("str = %s \n",str);
    char *index1;
    index1 = str;

    for(int i =0;i<18;++i){
        index1++;
    }
    printf("index1 = %s\n",index1);
    char *index2;
    index2=index1;
    for(int i =0;i<12;++i){
        index2++;
    }
    printf("index2 = %s\n",index2);
    char str1[10];
    char str2[11];
    strncpy(str1,index1,9);
    //printf("N=%s \n E= %s\n",str1,str2);
    strncpy(str2,index2,10);
    printf("N= %s \n E= %s\n",str1,str2);
    return 0;
}
//$GPGGA,065545.789,2109.9551,N,12023.4047,E,1,9,0.85,18.1,M,8.0,M,,*5E