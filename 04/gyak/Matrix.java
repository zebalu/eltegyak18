package gyak;

public class Matrix {
	
	private int[][] m;
	
	public Matrix(int size){
		m = new int[size][];
		for(int i=0; i<size; ++i) {
			m[i]= new int[size];
		}
	}
	
	public void setAt(int i, int j, int k) {
		m[i][j]=k;
	}
	
	public int getAt(int i, int j) {
		return m[i][j];
	}

	public void print() {
		for(int i=m.length-1; i>=0; --i) {
			for(int j=0; j<m[i].length; ++j) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m.length; ++i) {
			for(int j=0; j<m[i].length; ++j) {
				sb.append(m[i][j]+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Matrix) {
			Matrix other = (Matrix)o;
			if(other.m.length != m.length) {
				return false;
			}
			for(int i=0; i<m.length; ++i) {
				for(int j=0; j<m[i].length; ++j) {
					if(m[i][j] != other.m[i][j]) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
	public Matrix plus(Matrix mat) {
		if(mat.m.length != m.length) {
			throw new IllegalArgumentException(
				"The two matrices should have the same length!"
			);
		}
		Matrix result = new Matrix(m.length);
		for(int i=0; i<m.length; ++i) {
			for(int j=0; j<m[i].length; ++j) {
				//result.m[i][j] = m[i][j] + mat[i][j];
				result.setAt(i, j, m[i][j] + mat.getAt(i,j));
			}
		}
		return result;
	}
}