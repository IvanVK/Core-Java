import Utils.Utils;

public class FaultyProblem3 {
	public String reverseEveryWordInString(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder sen = new StringBuilder();
		for (String word : words) {
			word = reverse(word).toString();
			sen = sen.append(word).append(" ");
		}
		sen = sen.deleteCharAt(sen.length() - 1);
		return sen.toString();
	}

	private CharSequence reverse(String word) {
		return Utils.reverseMe(word);
	}
}