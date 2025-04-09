public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n) {
		if (n <= 0) {
			return new int[0];
		}
		int[] sequence = new int [n + 1];
		sequence[0] = 0;
		recamanHelper(sequence,1, n);
		
		int [] result = new int[n];
		for (int i = 1; i <= n; i++){
			result [i - 1] = sequence[i];
		}
		return result; 
	}
	private static void recamanHelper(int[] sequence, int index, int n){
		if (index > n) {
			return;
		}
		int prev = sequence[index - 1];
		int current = prev - index;

		if (current > 0 && !used(sequence, index, current)){
			sequence[index] = current;
		}
		else {
			sequence[index] = prev + index;
		}
		recamanHelper(sequence, index + 1, n);
	}
	private static boolean used (int[] sequence, int index, int current){
		for (int i = 0; i < index; i++){
			if (sequence[i] == current){
				return true;
			}
		}
		return false;
	}

}
