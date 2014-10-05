import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WC {

	public static void WordCount(String file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		int count = 0;
		while (line != null) {
			String[] parts = line.split(" ");
			for (String s : parts)
				count++;
			line = reader.readLine();
		}
		System.out.println("Words: " + count);
		reader.close();
	}

	public static void LineCount(String file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int lines = 0;
		while (reader.readLine() != null)
			lines++;
		System.out.println("Lines: " + lines);
		reader.close();
	}

	public static void CharsCount(String file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String lines;
		int chars = 0;
		String content = "";
		while ((lines = reader.readLine()) != null)
			content += lines;
		chars = content.length();
		System.out.println("Characters:" + chars);
		reader.close();

	}

	public static void main(String[] args) throws IOException {
		/*
		 * System.out.print("Path :"); Scanner in = new Scanner(System.in);
		 */

		// C:\\Users\\IVAN\\Desktop\\WCtest.txt

		System.out.println("Enter file + command: :p  :D ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String[] arg = reader.readLine().split(" ");
		String command = "";
		if (arg.length > 1) {
			command = arg[1];
		}
		if (command.equals("-l")) {
			LineCount(arg[0]);
		} else if (command.equals("-w")) {
			WordCount(arg[0]);
		} else if (command.equals("-c")) {
			CharsCount(arg[0]);
		} else {
			WordCount(arg[0]);
			LineCount(arg[0]);
			CharsCount(arg[0]);
		}
		reader.close();

		/*
		 * WordCount(); LineCount(); CharsCount();
		 */
	}
}
