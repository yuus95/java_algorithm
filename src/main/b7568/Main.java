package main.b7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        List<SizeSolve.Human> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] s = br.readLine().split(" ");
            list.add(new SizeSolve.Human(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }

        SizeSolve.solve(list);
        list.forEach(item -> System.out.println(item.getRank()));
    }

    public static class SizeSolve {
        public static void solve(List<Human> humanList) {
            for (int i = 0; i < humanList.size(); i++) {
                for (int j = 0; j < humanList.size(); j++) {
                    if (i == j) {
                        continue;
                    }
                    if (humanList.get(i).compareTo(humanList.get(j)) == 0) {
                        humanList.get(i).plusRank();
                    }
                }
            }
        }

        public static class Human implements Comparable<Human> {
            private int weight;
            private int height;
            int rank = 1;

            public Human(int weight, int height) {
                this.weight = weight;
                this.height = height;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getRank() {
                return rank;
            }

            public void plusRank() {
                this.rank += 1;
            }

            @Override
            public int compareTo(Human human) {
                if (this.height > human.getHeight() && this.weight > human.getWeight()) {
                    return 1;
                } else if (this.height < human.getHeight() && this.weight < human.getWeight()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        }
    }
}
