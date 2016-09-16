//方法三：还是书上这个方法最好，时间O（n），空间O（1）
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||length<=0){
            return false;
        }
        for(int i=0;i<length;i++){
            if(numbers[i]<0||numbers[i]>length-1){
                return false;
            }
        }
        for(int i=0;i<length;i++){
            while(numbers[i]!=i){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }
                int tmp=numbers[i];
                numbers[i]=numbers[tmp];
                numbers[tmp]=tmp;
            }
        }
        return false;
    }
}



//方法一：时间O（n^2），空间O（1）
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    StringBuffer sb = new StringBuffer(); 
        for(int i = 0; i < length; i++){
                sb.append(numbers[i] + "");
            }
        for(int j = 0; j < length; j++){
            if(sb.indexOf(numbers[j]+"") != sb.lastIndexOf(numbers[j]+"")){
                duplication[0] = numbers[j];
                return true;
            }
        }
        return false;
    }
}

//方法二：这个方法有限制，当元素值很大时，int类型相加可能会超过范围

public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    //不需要额外的数组或者hash table来保存，题目里写了数组里数字的范围保证在0 ~ n-1 之间，
    //所以可以利用现有数组设置标志，当一个数字被访问过后，可以设置对应位上的数 + n，
    //之后再遇到相同的数时，会发现对应位上的数已经大于等于n了，那么直接返回这个数即可。
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||length<=0){
            return false;
        }
        for(int i=0;i<length;i++){
            if(numbers[i]<0||numbers[i]>length)
                return false;
        }
        for(int i=0;i<length;i++){
            if(numbers[i]>=length){
                numbers[i] -=length;
                //这里要注意
                if(i==numbers[i]){
                    duplication[0]=numbers[i];
                    return true;
                }
            }
            if(numbers[numbers[i]]>=length){
                duplication[0]=numbers[i];
                return true;
            }else{
                numbers[numbers[i]] +=length;
            }
        }
        return false;
    }
}