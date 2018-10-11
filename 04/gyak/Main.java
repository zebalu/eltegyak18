package gyak;

public class Main {
	
	public static void main(String[] args) {
		Matrix mat = new Matrix(2);
		mat.setAt(0,0,0);
		mat.setAt(0,1,1);
		mat.setAt(1,0,2);
		mat.setAt(1,1,3);
		/* 0 1
		   2 3 */
		System.out.println(mat);
		//mat.print();
		
		Matrix mat2 = new Matrix(2);
		mat2.setAt(0,0,0);
		mat2.setAt(0,1,1);
		mat2.setAt(1,0,2);
		mat2.setAt(1,1,3);
		
		System.out.println(mat2);
		System.out.println(mat == mat2);
		System.out.println(mat.equals(mat2));
		System.out.println("-----------------------");
		System.out.println(mat.plus(mat2).plus(mat));
		System.out.println(mat2);
		System.out.println(mat);
		
	}
	
}