import java.util.Arrays;

public class Assignment1_Main {
    public static void main(String[] args) {
        int []  intArr={3,44,56,7,8,9,4,2,44,2,3,56,1,4};
        int [] tempArr=new int[14];
        int tempFirstIndex=0;
        int tempLastIndex=13;
        for(int i=0;i<intArr.length;i++){

            if(intArr[i]==2) {
               tempArr[tempFirstIndex++]=intArr[i];
               intArr[i]=0;
            } else if (intArr[i]==4) {
                tempArr[tempLastIndex--]=intArr[i];
                intArr[i]=0;
            }else{
             //   tempArr[i]=intArr[i];
            }
        }


        int intArrayIndex=0;
        for(int i=0;i<tempArr.length;i++){
            if(tempArr[i]==0){
                if(intArr[intArrayIndex]!=0) {
                    tempArr[i] = intArr[intArrayIndex++];
                }else {
                    for(int j=intArrayIndex;j<intArr.length;j++) {
                        if(intArr[j]==0) {
                            intArrayIndex++;
                        }else {
                            break;
                        }
                    }
                    tempArr[i] = intArr[intArrayIndex++];
                }
            }

        }
        Arrays.stream(tempArr).forEach( a->System.out.printf(","+a));
        System.out.println("");
        Arrays.stream(intArr).forEach( a->System.out.printf(","+a));

    }

}