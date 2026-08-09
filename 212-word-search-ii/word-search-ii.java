import java.util.*;

class Solution {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word; // Stores the complete word when this node represents one
    }

    private TrieNode root = new TrieNode();
    private int rows, cols;
    private char[][] board;
    private List<String> result;

    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        this.rows = board.length;
        this.cols = board[0].length;
        this.result = new ArrayList<>();

        // Build Trie
        for (String word : words) {
            insert(word);
        }

        // DFS from every cell
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                dfs(r, c, root);
            }
        }

        return result;
    }

    private void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }

            node = node.children[index];
        }

        node.word = word;
    }

    private void dfs(int r, int c, TrieNode parent) {
        char ch = board[r][c];
        int index = ch - 'a';

        TrieNode node = parent.children[index];

        // No word has this prefix
        if (node == null) {
            return;
        }

        // Found a complete word
        if (node.word != null) {
            result.add(node.word);

            // Prevent finding the same word again
            node.word = null;
        }

        // Mark current cell as visited
        board[r][c] = '#';

        // Up
        if (r > 0 && board[r - 1][c] != '#') {
            dfs(r - 1, c, node);
        }

        // Down
        if (r < rows - 1 && board[r + 1][c] != '#') {
            dfs(r + 1, c, node);
        }

        // Left
        if (c > 0 && board[r][c - 1] != '#') {
            dfs(r, c - 1, node);
        }

        // Right
        if (c < cols - 1 && board[r][c + 1] != '#') {
            dfs(r, c + 1, node);
        }

        // Restore cell
        board[r][c] = ch;
    }
}
