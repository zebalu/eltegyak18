package osztalyok;

public class ActiveArray {
	
	private int[] nums;
	private int head = 0;
	
	public ActiveArray(int size) {
		nums = new int[size];
	}
	
	public void add(int i) {
		if(head < nums.length) {
			nums[head] = i;
			++head;
		} else {
			doubleIt();
			add(i);
		}
	}
	
	private void doubleIt() {
		int[] helper = new int[nums.length*2+1];
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