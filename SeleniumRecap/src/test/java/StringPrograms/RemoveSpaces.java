package StringPrograms;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str = "S  an  k a r Vis   wa    n  ath  an";

		//String cleanedSpace = str.replaceAll("\\s+", "").trim();
		//System.out.println(cleanedSpace);

		String[] words = str.split("\\s+");

		StringBuilder stringBuilder = new StringBuilder();

		for (String string : words) {

			if (!string.isEmpty()) {

				stringBuilder.append(string).append("");
			}


		}
		
		System.out.println(stringBuilder);


	}
} 




