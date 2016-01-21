# Closest-sequence-problem

The objective is to find a closest sequence t of length n out of a given m DNA sequences each of length n, such that maximum hamming distance between t and all the given DNA sequences are minimized. An optimum solution to this problem is implemented using a branch and bound algorithm.

Programming 

	The algorithm is implemented using Java. The input is given in a text file. The program initially reads the input text file parses the text to appropriate variables. For example, the first line contains integers m (number of input sequences) and n (length of each sequence) which is stored into the respective variables. The remaining are the input sequences which is stored in an array called ‘sequence’. The output of the code is the closest sequence t and the maximum hamming distance.

Algorithm 

	The required output string contains characters from the set {A, C, G, T}. Initially all permutations of the characters, say Ki from the set is formed. The permutations are calculated for a length of t. Each of these strings are compared with each of the input strings to find the maximum hamming distance. So maximum hamming distance is found between each combination Ki and all the input strings.
	The goal is to minimize the maximum hamming distance. So initially we define a variable ‘maxHammingDistance’ which is initialized to n. Now the maximum hamming distance between K¬i and the input sequences are found in a loop. When we check for the maximum hamming distance between K¬i and the inputs if we find a value greater than the maxHammingDistance then the remaining input sequences are not compared. We eliminate the remaining choices basically. This will be the lower bound. In the worst case or upper bound is all the input sequences being compared for each Ki. 
Now for the minimization condition we compare the maximum hamming distance obtained from each K¬i with the variable maxHammingDistance. If that distance is less than the maxHammingDistance we essentially make that distance as our target maxHammingDistance. Thus we are minimizing the maximum hamming distance.
For optimization we add a condition in the function which calculates the hamming distance. If the hamming distance exceeds the maxHammingDistance then the distance calculation is not continued.

Output

For input1.txt the output is 
AAAAC
d = 3
For input2.txt the output is 
AAAACCACCC
d = 6

Running the code
The program is run on eclipse IDE. To change the input to the program the name of the .txt file should be changed in the code in the line “ Scanner fileIn = new Scanner(new File("input2.txt")); “
