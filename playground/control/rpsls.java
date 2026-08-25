/*
* Difficulty: Advanced Concepts Tested: exhaustive branch coverage over a large but finite combinatorial space, structuring nested switch/if to avoid missing cases

Problem Statement: Given two Strings, each one of "ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK", determine the winner under standard RPSLS rules (Scissors cuts Paper, Paper covers Rock, Rock crushes Lizard, Lizard poisons Spock, Spock smashes Scissors, Scissors decapitates Lizard, Lizard eats Paper, Paper disproves Spock, Spock vaporizes Rock, Rock crushes Scissors). Equal picks → TIE. Otherwise → PLAYER 1 WINS or PLAYER 2 WINS.

Input Format: String player1, String player2 Output Format: one line Constraints: each guaranteed to be one of the five valid moves

Examples:

"SCISSORS", "PAPER" → PLAYER 1 WINS
"ROCK", "ROCK" → TIE
"LIZARD", "SPOCK" → PLAYER 1 WINS (lizard poisons Spock)
"SPOCK", "LIZARD" → PLAYER 2 WINS (same pair, reversed — result must flip)

Important Edge Cases: all 5 tie cases; verify that swapping any winning pair's order always flips the result (a built-in self-check); all 25 total combinations must be covered — none should silently fall to an unintended default. This Exercise Tests: stamina and discipline for exhaustive branch coverage over a real combinatorial space — a very CP-flavored exercise, plus using symmetry as a self-verification technique.
* */