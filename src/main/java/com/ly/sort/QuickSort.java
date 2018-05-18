package com.ly.sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] input = new int[]{12, 1, 50, 8, 9, 8, 6, 7, 10, 3};
        sort1(input, 0, input.length - 1);
        for (int i : input) {
            System.out.println(i);
        }
    }

    public static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描

            while (i < j && a[i] < index) {
                i++;
            }
            if (i < j) { // 用比基准大的记录替换高位记录
                a[j--] = a[i];
            }
            while (i < j && a[j] >= index) {
                    j--;
            }
            if (i < j) {
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            }

        }
        a[i] = index;// 将基准数值替换回 a[i]
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序

    }



    public static void sort1(int[] b,int i,int j){
        int start,end,key;
        if (i > j) {
            return;
        }
        key=b[i];
        start=i ;
        end =j ;

        while(start<end){
            while (start<end && b[start]<key){
                start++;
            }
            if (start<end){
                b[end--]=b[start];
            }

            while (start<end && b[end]>=key){
                end--;
            }
            if (start<end){
                b[start++]=b[end];
            }
        }

        b[start]=key;
        sort1(b,i,start-1);
        sort1(b,start+1,j);
    }

}
