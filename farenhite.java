import java.util.*;
 class farenhite {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        while(S<=E){
            int C = (S-32)*5/9;
            System.out.println (S+"\t"+C);
            S=S+W;
        }

		
	}

}

