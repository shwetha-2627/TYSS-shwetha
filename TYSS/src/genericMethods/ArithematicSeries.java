package genericMethods;

public class ArithematicSeries {
	 // Function to find sum of series. 
    static float sumOfAP(float a, float d,  
                                  int n) 
    { 
        float sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
            sum = sum + a; 
            a = a + d; 
        } 
        return sum; 
    } 
      
    // Driver function 
    public static void main(String args[]) 
    { 
        int n = 20; 
        float a = 2.5f, d = 1.5f; 
        System.out.println(sumOfAP(a, d, n)); 
    } 
}
