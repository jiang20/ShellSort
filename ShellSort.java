package ShellSortTest;

import java.lang.reflect.Array;

public class ShellSort {
    private int[] ints;
    ShellSort(int[] ints){
        this.ints = ints;
    }
    public int[] shellsort(){
        for(int gap = ints.length / 2 ; gap >= 1 ; gap /= 2 ){
            for(int i = gap ;i < ints.length ; i ++){
                int j;
                int tmp = ints[i];
                for( j = i ; j >=gap&&tmp < ints[j - gap] ; j -= gap){
                    ints[j] = ints[j - gap];
                    //是往前找，所以j >= gap
                }
                // 前面的先开始排序，到最后若j - gap - gap 仍然 > 0时，前面的是已经排好序的
                //此时若小于前面的某值时，会慢慢地向前推进，推进过程中的中间值每一个都会发生改变
                //知道不在小于，找到正确位置，循环退出，正确位置赋值即可
                ints[j] = tmp;
            }
        }
        return ints;
    }
}
