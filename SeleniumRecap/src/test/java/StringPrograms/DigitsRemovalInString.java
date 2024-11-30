package StringPrograms;

public class DigitsRemovalInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Sa123nk@8ar";

		StringBuilder builder = new StringBuilder();

		for (char character : str.toCharArray()) {

			if (Character.isAlphabetic(character)) {

				builder.append(character);

			}


		}

		String result = builder.toString();

		System.out.println(result);

	}

}
