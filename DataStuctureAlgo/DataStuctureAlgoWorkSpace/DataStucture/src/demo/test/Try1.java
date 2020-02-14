package demo.test;

public class Try1 {
public static void main(String[] args) {
	 int count[] = new int[256];
     for (int i=0; i<256; ++i){
         count[i] = 0;
     }
     for (int i = 0; i < count.length; i++) {
		System.out.print(i+" ");
	}
}
}