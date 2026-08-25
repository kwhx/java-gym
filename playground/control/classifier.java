/*
* Difficulty: Intermediate Concepts Tested: exhaustive case-label coverage discipline in switch

Problem Statement: Read a single alphabetic char (may be upper or lower case). Using a traditional switch with grouped case labels covering both cases of every vowel (10 labels total: a,A,e,E,i,I,o,O,u,U), print VOWEL. Anything else (via default) → CONSONANT.

Input Format: char letter Output Format: one line Constraints: guaranteed alphabetic

Examples:

'e' → VOWEL
'E' → VOWEL
'k' → CONSONANT

Important Edge Cases: every one of the 5 vowels in both cases — if you forget even one case label (e.g. only list 'a' but not 'A'), that specific input silently falls to default and misclassifies.

This Exercise Tests: discipline around exhaustive case coverage — a very realistic source of silent bugs when a switch "looks complete" but is missing one label.
* */