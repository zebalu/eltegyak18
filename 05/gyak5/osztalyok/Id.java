package osztalyok;

public class Id {

	private final int number;
	private final String letters;
	
	public Id(int num, String let) {
		if(num<=0) {
			throw new IllegalArgumentException("num should be positive!");
		}
		if(num/100_000 == 0 || num/1_000_000 != 0) {
			throw new IllegalArgumentException("num should have 6 figures!");
		}
		if(let.length() != 2) {
			throw new IllegalArgumentException("let should have 2 characters!");
		}
		this.number=num;
		this.letters=let;
	}
	
	public String getAsString() {
		return number+letters;
	}
	
	@Override
	public String  toString() {
		return number+" "+letters;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Id)) {
			return false;
		}
		Id i = (Id)o;
		return number==i.number && letters.equals(i.letters);
	}
	
	@Override
	public int hashCode() {
		return number;
	}

}