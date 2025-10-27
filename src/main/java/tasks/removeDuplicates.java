package tasks;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // индекс следующего уникального элемента

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // сохраняем уникальный элемент
                k++;
            }
        }

        return k;
    }
}
