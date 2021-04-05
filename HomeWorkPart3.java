package homeWork4Part2;

public class HomeWorkPart3 {
	static int[]remove(int v, int[] inintv,int[] in) {
		int i, count = 0;
		for (i =0; i<in.length;i++) {
			if (in[i] == v) {
				count ++;
			}
		}
int out[] = new int[in.length-count];
int x=0;
for(i=0;i<in.length; i++) {
	if(in[i]!=v) {
		out[x++] = in[i];
	}
}
 return out;
		
	}

	public static void main(String[] args) {
		int in[] = {0,1,3,2,3,0,3,1};
		int v =3;
		int out[]remove(v,in);
		
		System.out.println("This array will remove all "+v+":");
		
		for (int i=0;i<out.length; i++) {
			System.out.println(out[i]);
		}
		
	}

}
