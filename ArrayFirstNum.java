// public class ArrayFirstNum {
    
    
//     public static int firstIndex(int[] input, int x, int s)
//     {
//         if(s == input.length - 1)
//         {
//             if(input[s] == x)
//             {
//                 return s;
//             }
//             else 
//             {
//                 return -1;
//             }
//         }
        
//         if(input[s] == x)
//         {
//             return s;
//         }
        
//         int smallOp = firstIndex(input, x, s+1);
//         return smallOp;
//     }

// 	public static int firstIndex(int input[], int x) {
// 		/* Your class should be named Solution
// 		 * Don't write main().
// 		 * Don't read input, it is passed as function argument.
// 		 * Return output and don't print it.
// 	 	 * Taking input and printing output is handled automatically.
// 		*/
		
//         return firstIndex(input, x, 0)  ;  
// 	}
//     public static void main (String agrs [])
//     {

//     }
// }


import java.util.Scanner;

public class ArrayFirstNum {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		//System.out.println(Solution.firstIndex(input, x));
        System.out.println(input);
	}
}
