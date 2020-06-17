package Javaps;

	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Set;

	public  class RepeatedCharacters
	{

		public static void main(String[] args) 
		{

			Set<Character> repeatedCharactersSet = new RepeatedCharacters().getRepeatedCharacters("Hello World !!!");
			for (Character character : repeatedCharactersSet) {
				System.out.println(character.charValue());
			}

			Map<Character, Integer> occurrencesMap = new RepeatedCharacters()
					.getOccurrencesOfEveryCharacter("Hello World !!!");
			for (Character key : occurrencesMap.keySet()) {
				System.out.println("Number of times " + key + " occured  is " + occurrencesMap.get(key));
			}

		}

		public Map<Character, Integer> getOccurrencesOfEveryCharacter(String message) 
		{

			
			Map<Character, Integer> map = new HashMap<>();

	        for (char ch : message.toCharArray()) 
	        {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }
	        return map;

		}

		public Set<Character> getRepeatedCharacters(String message) {
			return null;

			
	}



}
