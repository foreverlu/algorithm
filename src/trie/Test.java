package trie;

public class Test {
    public static void main(String[] args) {
        String[] strs = {"hello","word","world","we","are"};

        Trie trie = new Trie();
        for(String s : strs){
            trie.addString(s);
        }
        System.out.println(trie.findWord("hello"));
        System.out.println(trie.findWord("we"));
        System.out.println(trie.findWord("wor"));
        System.out.println(trie.findWord("area"));
    }
}
