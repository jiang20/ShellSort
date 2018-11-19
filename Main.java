package ShellSortTest;

public class Main {
    public static void main(String[] args){
        int[] test = {4,2,6,4,1,7,5,8,9,45,13,75,-6,-34};
        ShellSort tested = new ShellSort(test);
        int[] result = tested.shellsort();
        for(int i = 0 ; i < result.length ; i ++){
            System.out.print(result[i]+ "  ");
        }
    }
}
