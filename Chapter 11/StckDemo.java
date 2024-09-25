public class StckDemo {
   private int mxSize;
   private long[] stackArray;
   private int top;

   public StckDemo(int s) {
      mxSize = s;
      stackArray = new long[mxSize];
      top = -1;
   }
   public void push(long j) {
	   System.out.println("The item is pushed onto the stack is "+ j );
      stackArray[++top] = j;
   }
   public long pop() {
      return stackArray[top--];
   }
   public long peek() {
      return stackArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == mxSize - 1);
   }
   public static void main(String[] args) {
      StckDemo tStck = new StckDemo(10);
      tStck.push(10);
      tStck.push(20);
      tStck.push(30);
      tStck.push(40);
      tStck.push(50);
       while (!tStck.isEmpty()) {
         long value = tStck.pop();
         System.out.println(" the value is popped "+value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}