This Java program takes a DNA sequence as input, validates it, reverses it, finds its complementary strand, and then translates it into a sequence of amino acids. 🧬 This project demonstrates the use of recursion for string manipulation and processing biological data.

The program performs the following steps:

    Validates the input to ensure it's a valid DNA sequence (composed of A, C, G, T and its length is a multiple of three).

    Reverses the validated DNA sequence.

    Inverts the reversed sequence to find its complementary strand (A becomes T, T becomes A, C becomes G, and G becomes C).

    Translates the resulting sequence into amino acids based on codon triplets.
Class Overview

    Assignment5.java: This is the main class that drives the program. It takes user input for a DNA sequence and uses the DNALib class to process it. It prints the final translated amino acid sequence or an error message if the input is invalid.

    DNALib.java: This class contains the core logic for all DNA operations, implemented using recursive methods.

        validator(String sequence): Checks if the input string is a valid DNA sequence.

        reverser(String sequence): Reverses the order of the characters in the DNA string.

        inverser(String sequence): Creates the complementary DNA strand by replacing each base with its pair (A↔T, C↔G).

        translator(String sequence): Translates the DNA sequence into an amino acid sequence by reading it in three-character chunks (codons).
