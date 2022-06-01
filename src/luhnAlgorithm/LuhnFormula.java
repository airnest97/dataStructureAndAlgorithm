package luhnAlgorithm;

public class LuhnFormula {
    public boolean validate(String input) {
        char[] cardNumber = convertToArrayOfValidChars(input);
        return getSum(cardNumber) % 10 == 0;
    }

    private int getSum(char[] cardNumber) {
        int sum = 0;
        for (int i = 0; i < cardNumber.length; i++) {
            int number = getInReverseOrder(cardNumber, i);
            sum += getElementValue(i, number);
        }
        return sum;
    }

    private int getElementValue(int i, int number) {
        if (i % 2 != 0) {
            return getOddElementValue(number);
        } else {
            return number;
        }
    }

    private int getOddElementValue(int element) {
        int value = element * 2;
        if (value <= 9) {
            return value;
        }
        return value - 9;
    }

    private int getInReverseOrder(char[] cardNumber, int i) {
        int indexInReverseOrder = cardNumber.length - 1 - i;
        char characterValue = cardNumber[indexInReverseOrder];
        return Character.getNumericValue(characterValue);
    }

    private char[] convertToArrayOfValidChars(String input) {
        String checkedInput = input.replaceAll("\\D", "");
        return checkedInput.toCharArray();
    }
}
