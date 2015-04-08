// Java Code
// Generate and count all the possible permutaions of a given string
class Solution {  
    static int count=0;
    public static void permutation(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) {System.out.println(prefix);count++;}
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}
     
    public static void main(String args[]){
    
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        permutation(str);
        System.out.println(count);
        }

    }
