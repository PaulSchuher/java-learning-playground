class CharSequenceTest implements CharSequence {
	String str;

	public CharSequenceTest(String s) {
		str = s;
	}

	public char charAt(int index) {
		return str.charAt(fromEnd(index));
	}

	public int length() {
		return str.length();
	}

	public CharSequence subSequence(int start, int end) {
		if (start < 0) { throw new StringIndexOutOfBoundsException(start); }
		if (end >= length()) { throw new StringIndexOutOfBoundsException(end); }
		if (start > end) { throw new StringIndexOutOfBoundsException(start - end); }

		CharSequence revSubsequence = str.subSequence(fromEnd(end), fromEnd(start));
		return new StringBuilder(revSubsequence).reverse();
	}

	public String toString() {
		return new StringBuilder(str).reverse().toString();
	}

	private int fromEnd(int index) {
		int revIndex = length() - 1 - index;
		if (revIndex < 0 || revIndex >= length()) { 
			throw new StringIndexOutOfBoundsException(revIndex);
		}
		return revIndex;
	}

	public static void main(String[] args) {
		CharSequenceTest cs = new CharSequenceTest("Suppose that you have written a time server, which periodically notifies its clients of the current date and time.");
		System.out.println(cs.charAt(5));
		System.out.println(cs.length());
		System.out.println(cs.subSequence(5, 15));
		System.out.println(cs.toString());
	}
}
