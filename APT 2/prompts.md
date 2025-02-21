**StringCuts**
Filtering data often requires determining which data elements satisfy a specific criterion. Write method filter which has two parameters: a String[] of data to be filtered and an int parameter indicating the minimum acceptable length for the string data.
Return a String[] array of the unique strings in list whose lengths are greater than or equal to minLength.

The string values in the returned array should be in the same order they appear in list. The strings in the returned array should be unique, so conceptually only the first of any duplicate elements in list that pass the length requirement is in the returned array. See the examples for details.

**True Space**
In some filesystems, the disk space used by a file is not always equal to the file's size. This is because the disk is divided into clusters of equal size, and each cluster can only be used by a single file. For example, if the cluster size is 512 bytes, and we have a file of size 600 bytes, it would have to be stored in two clusters. Those two clusters cannot be shared with any other files, so the file ends up using 1024 bytes of disk space.
You are given a int[] sizes, where each element is the size of a single file, and an int clusterSize, the cluster size of the filesystem. Return the total disk space used by the given files.


**SimpleWordGame**
The Simple Word Game is a game where a player tries to remember as many words as possible from a given dictionary. The score for each distinct word that the player remembers correctly is the square of the word's length.
You are given a String[] player, each element of which is a word remembered by the player. There may be duplicate words, but if the same word appears multiple times, it should only be counted once. You are given the dictionary in the String[] dictionary, each element of which is a single distinct word. Return the player's total score.

**TxMsg**
Strange abbreviations are often used to write text messages on uncomfortable mobile devices. One particular strategy for encoding texts composed of alphabetic characters and spaces is the following:

Spaces are maintained, and each word is encoded individually. A word is a consecutive string of alphabetic characters.
If the word is composed only of vowels, it is written exactly as in the original message.
If the word has at least one consonant, write only the consonants that do not have another consonant immediately before them. Do not write any vowels.
The letters considered vowels in these rules are 'a', 'e', 'i', 'o' and 'u'. All other letters are considered consonants.
For instance, "ps i love u" would be abbreviated as "p i lv u" while "please please me" would be abbreviated as "ps ps m". You will be given the original message in the string parameter original. Return a string with the message abbreviated using the described strategy.
