package basicAlgorithm;

public class bubble {
    public static void main(String args[]){
        int [] numArr= new int[10];

        for (int i = 0; i < numArr.length ; i++) {
            numArr[i] = (int)(Math.random()* 10);
        }
        for (int i = 0; i < numArr.length-1; i++) {
            boolean change =false;

            for (int j = 0; j <numArr.length-1 ; j++) {
                if(numArr[j] > numArr[j+1]){
                    int temp= numArr[j];
                    numArr[j] = numArr[j+1];

                    numArr[j+1] = temp;
                }

            }
            if (!change) break;
        }

        for (int j = 0; j <numArr.length ; j++) {
            System.out.print(" "+ numArr[j]);
        }
        System.out.println("");
    }
}
