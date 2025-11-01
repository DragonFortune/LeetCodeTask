package tasks;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // нет переноса — возвращаем результат
            }
            digits[i] = 0; // 9 → 0, перенос к следующему разряду
        }

        // если все были 9 (например, 999 → 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
