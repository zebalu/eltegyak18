package osztalyok;

public class ActivePersonArray {
	private Person[] nums;
	private int head = 0;
	
	public ActivePersonArray(int size) {
		nums = new Person[size];
	}
	
	public void add(Person i) {
		if(head < nums.length) {
			nums[head] = i;
			++head;
		} else {
			doubleIt();
			add(i);
		}
	}
	
	private void doubleIt() {
		Person[] helper = new Person[nums.length*2+1];
		for(int i=0; i<nums.length; ++i) {
			helper[i]=nums[i];
		}
		nums = helper;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Size: "+head+" memory size: "+nums.length+" [ ");
		for(int i=0; i<head; ++i) {
			sb.append(nums[i]);
			sb.append(" ");
		}
		sb.append("]");
		return sb.toString();
	}
}