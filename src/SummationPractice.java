import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SummationPractice {

    public static int sumArray(ArrayList<Integer> numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(32);
        nums.add(234);
        nums.add(1);
        nums.add(9);
        nums.add(92364);

        int sum = sumArray(nums);

        System.out.println(sum);

    }
}