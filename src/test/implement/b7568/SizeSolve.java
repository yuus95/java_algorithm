package implement.b7568;

import java.util.List;

public class SizeSolve {
    public void solve(List<Human> humanList) {
        for (int i = 0; i < humanList.size(); i++) {
            for(int j = 0; j < humanList.size(); j++){
                if(i == j){
                    continue;
                }
                if (humanList.get(i).compareTo(humanList.get(j)) == 0 ) {
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
