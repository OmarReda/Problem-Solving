# Leetcode Problem
# -----------------

# Implement a trie with insert, search, and startsWith methods.

# Example
# ---------
# Trie trie = new Trie();

# trie.insert("apple");
# trie.search("apple");   // returns true
# trie.search("app");     // returns false
# trie.startsWith("app"); // returns true
# trie.insert("app");   
# trie.search("app");     // returns true


class Trie:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.child = {}

    def insert(self, word: str) -> None:
        """
        Inserts a word into the trie.
        """
        current = self.child
        for l in word:
            if l not in current:
                current[l] = {}
            current = current[l]
        current['#']=1
        

    def search(self, word: str) -> bool:
        """
        Returns if the word is in the trie.
        """
        current = self.child
        for l in word:
            if l not in current:
                return False
            current = current[l]
        return '#' in current
        

    def startsWith(self, prefix: str) -> bool:
        """
        Returns if there is any word in the trie that starts with the given prefix.
        """
        current = self.child
        for l in prefix:
            if l not in current:
                return False
            current = current[l]
        return True
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)