import java.math.*;

public class binSearch {


public int[] fill(int A []){
    
    int lastIndex = A.length;

    for(int i = 0; i < A.length; i++){
        A[i] = A[i] + (2 * i);

    }

    System.out.println("The array is: ");
    System.out.print("{");
    for(int j = 0; j < A.length - 1; j++){
        System.out.print(A[j] + ", ");
      
    }
    System.out.print((A[lastIndex - 1]) + "} ");

    return A;
}

int mid;
public int binS(int[] array, int start, int end, int key)
{
    
    mid = Math.round((start + end) / 2);

    if(array[start] != array[end])
    {
        if(array[mid] == key){
            System.out.println("The key position is: " + mid + ". And its values is: " + array[mid]);
        }
        else{
                
            if(key < array[mid]){
                return binS(array ,start, mid-1, key);
            }

            else{
                return binS(array ,mid +1, end, key);
            }

            }
    }
    if(key != array[mid]){
        System.out.println(" The key " + key + " could not be found!");
    }

   

    return mid;
   
}
    
    public static void main(String[] args){

        int[] array = new int[50];

        binSearch bin = new binSearch();
        array=bin.fill(array);
       
        bin.binS(array ,0, array.length - 1, 98);
       // System.out.println("The key position is: " + bin.mid + ". And its values is: " + array[bin.mid]);
    

    }
}
