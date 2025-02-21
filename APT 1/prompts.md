**Access Level**
In many computer systems and networks, different users are granted different levels of access to different resources. In this case, you are given a int[] rights, indicating the privilege level of each user to use some system resource. You are also given a int minPermission, which is the minimum permission a user must have to use this resource.

You are to return a String indicating which users can and cannot access this resource. Each character in the return value corresponds to the element of users with the same index. 'A' indicates the user is allowed access, while 'D' indicates the user is denied access.

**DNAMaxNucleotide**
Write code to find which of the strands representing DNA in an array String[] strand representing strands of DNA has the most occurrences of the nucleotide represented by parameter nuc.
If more than one strand has the same maximal number of the specified nucleotide you should return the longest strand with the maximal number. All DNA strands have different lengths in this problem so the maximal strand will be unique when length is accounted for. Return this uniquely maximal strand.

Each String representing a DNA strand will contain only cytosine, guanine, thymine, and adenine, represented by the characters 'c', 'g', 't', and 'a', respectively. If no strand in the array contains the specified nucleotide return the empty string "".

**SandwichBar**
It's time to get something to eat and I've come across a sandwich bar. Like most people, I prefer certain types of sandwiches. In fact, I keep a list of the types of sandwiches I like.
The sandwich bar has certain ingredients available. I will list the types of sandwiches I like in order of preference and buy the first sandwich the bar can make for me. In order for the bar to make a sandwich for me, it must include all of the ingredients I desire.

Given a String[] available, a list of ingredients the sandwich bar can use, and a String[] orders, the types of sandwiches I like, in order of preference (most preferred first), return the 0-based index of the sandwich I will buy. Each element of orders represents one type of sandwich I like as a space-separated list of ingredients in the sandwich. If the bar can make no sandwiches I like, return -1.

**Starter**
Determine how many unique words in an array of words start with a specified letter. Write a method that determines how many different strings in words have a first letter equal to first.

**Totality**
The phrases even keeled, odd job, and total eclipse might come to mind as you solve this APT. Given an array of int values, return the sum of those values that are at odd indexes, even indexes, or every index depending on whether the value of the String stype is "odd", "even", or "all", respectively. See examples for details.
