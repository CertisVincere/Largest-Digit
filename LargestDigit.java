public class LargestDigit {
    public static int maxDigit(int n){
    	if(n == 0) {
    		return 0;
    	}
    	else if(n/10 == 0) {
    		return n;
    	}
    	else if ((n % 10)>(maxDigit(n/10))) {
    		return n % 10;
    	}
    	else {
    		return maxDigit(n/10);
    	}
    }
    public static void main(String[] args) {
      System.out.println(maxDigit(15664687854651321));
      System.out.println("The above should print 8, 8 being the largest digit.");
    }
}
