package leetcode;

public class ImplementTriePrefixTree_208 {
    class Trie {
        class TrieNode{
            boolean isComplete;
            TrieNode[] children;
            public TrieNode(){
                isComplete= false;
                children = new TrieNode[26];
            }
        }
        TrieNode root;
    public Trie() {
        root =new TrieNode();
        }

        public void insert(String word) {
            TrieNode node =root;
            for (char ch :word.toCharArray()){
                if (node.children[ch-'a']==null){
                    node.children[ch-'a']=new TrieNode();
                }
                node= node.children[ch-'a'];
            }
            node.isComplete=true;
        }

        public boolean search(String word) {
            TrieNode node=root;
            for (char ch:word.toCharArray()){
                if (node.children[ch-'a']==null){
                    return false;
                }
                node= node.children[ch-'a'];
            }
            return node.isComplete;
        }

        public boolean startsWith(String word) {
            TrieNode node=root;
            for (char ch:word.toCharArray()){
                if (node.children[ch-'a']==null){
                    return false;
                }
                node= node.children[ch-'a'];
            }
            return true;
        }
    }
}
