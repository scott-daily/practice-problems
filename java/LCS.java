/*
Given two strings a & b, return the longest common subsequence that occurs in both.   
The common subsequence differs from the longest common substring problem: unlike substrings, subsequences are not required to occupy consecutive positions 
within the original sequences.

Example:
String a = "XMJYAUZ"  String b = "MZJAWXU".  The LCS is "MJAU".
*/
public class LCS {
    public static String lcs(String a, String b) {
	    int NEITHER = 0;
	    int UP = 1;
	    int LEFT = 2;
        int UP_AND_LEFT = 3;
        
        int n = a.length();
        int m = b.length();
        
		int S[][] = new int[n+1][m+1];
		int R[][] = new int[n+1][m+1];
        int i;
        int j;
        
		for(i = 0; i <= n; ++i) {
			S[i][0] = 0;
			R[i][0] = UP;
		}
		for(j = 0; j <= m; ++j) {
			S[0][j] = 0;
			R[0][j] = LEFT;
		}

		for (i = 1; i <= n; ++i) {
			for (j = 1; j <= m; ++j) { 

				if ( a.charAt(i-1) == b.charAt(j-1) ) {
					S[i][j] = S[i-1][j-1] + 1;
					R[i][j] = UP_AND_LEFT;
				}

				else {
					S[i][j] = S[i-1][j-1] + 0;
					R[i][j] = NEITHER;
				}

				if ( S[i-1][j] >= S[i][j] ) {	
					S[i][j] = S[i-1][j];
					R[i][j] = UP;
				}

				if ( S[i][j-1] >= S[i][j] ) {
					S[i][j] = S[i][j-1];
					R[i][j] = LEFT;
				}
			}
		}

		i = n; 
		j = m;
		int pos = S[i][j] - 1;
		char lcs[] = new char[ pos+1 ];

		while ( i > 0 || j > 0 ) {
			if ( R[i][j] == UP_AND_LEFT ) {
				i--;
				j--;
				lcs[pos--] = a.charAt(i);
			}
	
			else if ( R[i][j] == UP ) {
				i--;
			}
	
			else if ( R[i][j] == LEFT ) {
				j--;
			}
		}
		return new String(lcs);
    }
    public static void main(String[] args) {
        String aTest = "abcdefghijklmnopq";
        String bTest = "apcdefghijklmnobq";

         System.out.println(lcs(aTest, bTest));
    }
}