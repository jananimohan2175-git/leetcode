class Solution {
    public List<String> removeAnagrams(String[] words) {
     List<String> result = new ArrayList<>();
     result.add(words[0]);
     String lastword= sortWord(words[0]);
     for(int i=1;i<words.length;i++)
     {
        String currentWord=sortWord(words[i]);
        if(!currentWord.equals(lastword))
        {
            result.add(words[i]);
            lastword=currentWord;
        }
     }
       return result;
    }
    private String sortWord(String word)
    {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters); 
    }
}