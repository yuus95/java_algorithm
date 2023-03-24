package dynamic.b12865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static class Bag {
        private int weight;
        private int value;

        public Bag(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int size = Integer.parseInt(s[0]);
        int valueSize = Integer.parseInt(s[1]);
        int[] result = new int[valueSize + 1];

        for (int i = 0; i < size; i++) {
            String[] tempValue = bufferedReader.readLine().split(" ");
            int weight = Integer.parseInt(tempValue[0]);

            if (weight > valueSize) {
                continue;
            }

            int value = Integer.parseInt(tempValue[1]);
            if (result[weight] < value) {
                result[weight] = value;
            }
        }

        for (int i = valueSize; i >= valueSize / 2; i--) {
            System.out.println("i " + i + "valueSize - i " + (valueSize - i));
            int tempValue = result[i] + result[valueSize - i];
            System.out.println("tempValue " + tempValue);
            if (result[valueSize] < tempValue) {
                result[valueSize] = tempValue;
            }
        }

        System.out.println(result[valueSize]);
    }
}
