package trie;

//单词查找树
public class Trie {
    private TrieNode root;

    private static final char a = 'a';

    public Trie() {
        root = new TrieNode('/');
    }

    public void addChars(char[] chars) {
        if (null == chars || chars.length == 0) {
            return;
        }

        TrieNode p = root;
        for (char c : chars) {
            int index = c - a;
            TrieNode[] children = p.children;
            if (children[index] == null) {
                TrieNode trieNode = new TrieNode(c);
                children[index] = trieNode;
            }
            p = children[index];
        }
        p.isEndChar = true;
    }

    public void addString(String str) {
        if (null == str || str.length() < 1) {
            return;
        }
        addChars(str.toCharArray());
    }

    public boolean findWord(String str) {
        if (null == str || str.length() < 1) {
            return false;
        }
        return findWord(str.toCharArray());
    }

    public boolean findWord(char[] chars) {
        if (null == chars || chars.length == 0) {
            return false;
        }

        TrieNode p = root;
        for (char c : chars) {
            int index = c - a;
            TrieNode[] children = p.children;
            if (children[index] == null) {
                return false;
            }
            p = children[index];
        }
        if(p.isEndChar){
            return true;
        }else {
            return false;
        }
    }

    class TrieNode {
        char val;
        TrieNode[] children = new TrieNode[26];
        boolean isEndChar;

        public TrieNode(char val) {
            this.val = val;
        }
    }
}
