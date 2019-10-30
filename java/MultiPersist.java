/*
Multiply all the digits of a number N by each other, repeating with the product until a single digit is obtained. 
The number of steps required is known as the multiplicative persistence.  
Return the number of steps required for any integer N.
*/
class MultiPersist {
	public static int persistence(long n) {

        if (n <= 9) {
            return 0;
        }

        Counter count = new Counter();
        long sum = 1;
        for (long num : Long.toString(n).chars().map(c -> c-'0').toArray()) {
            sum *= num;
        }
        count.increment();

        if (sum > 9) {
             persistence(sum);
             count.increment();
        }
        return count.value();
    }

    public static class Counter {
        static int count;
            public Counter() {
                count = 0;
            }

            public void increment() {
                count++;
            }

            public int value() {
                return count;
        }
    } 
    public static void main(String[] args) {
        System.out.println(persistence(492397));
    }
}