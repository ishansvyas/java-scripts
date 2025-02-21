**Anonymous**
If you want to write a message anonymously, one way to do it is to cut out letters from headlines in a newspaper and paste them onto a blank piece of paper to form the message you want to write. Given several headlines that you have cut out, determine how many messages from a list you can write using the letters from the headlines. You should only consider each message by itself and not in conjunction with the others, see example 2.
Write the method howMany which takes as parameters a String[] headlines containing the headlines which you have cut out as well as a String[] messages with the messages you may want to write, and returns an int which is the total number of messages you can write.

**BigWord**
In days of yore, aka BG (Before Google), search engines ranked webpages in part by the number of occurrences of a word on the page. You should write method most to determine and return the word that occurs most often in an array of sentences. This most frequently occurring word will be unique --- that is you don't need to worry about two words both occuring more often than any other word. The word returned should be all lower-case regardless of the case of leters in sentences.
Each string in sentences represents several words, each word is delimited by spaces from other words. Words should be considered the same without respect to case, so BIG is the same word as big, for example.

**Encryption**
John is obsessed with security. He is writing a letter to his friend Brus and he wants nobody else to be able to read it. He uses a simple substitution cipher to encode his message. Each letter in the message is replaced with its corresponding letter in a substitution alphabet. A substitution alphabet is a permutation of all the letters in the original alphabet. In this problem, the alphabet will consist of only lowercase letters ('a'-'z').
For example, if John's message is "hello" and his cipher maps 'h' to 'd', 'e' to 'i', 'l' to 'p' and 'o' to 'y', the encoded message will be "dippy". If the cipher maps 'h' to 'a', 'e' to 'b', 'l' to 'c' and 'o' to 'd', then the encoded message will be "abccd".

Given the original message, determine the cipher that will produce the encoded string that comes earliest alphabetically. Return this encoded string. In the example above, the second cipher produces the alphabetically earliest encoded string ("abccd").

**MemberCheck**
A health club chain allows its members to visit any of its many health club locations an unlimited number of times per day. The only constraining rule is, a customer can only visit one health club location per day, even though he or she may return to that location an unlimited number of times for the rest of that day.
Although the honor system has always worked quite well, the club wants to run some tests to see how many people really follow the rules. You are to write a program that takes the entrance log files from three different clubs (all logging the same day) and return a sorted list of the people who are not honest and went to more than one health club location in the same day.

The log files are represented as String[]'s where each element is the member name of a customer who entered that day. For example, if a customer showed up three times to one of the club locations that day, the member's name would appear three times in the corresponding String[].
