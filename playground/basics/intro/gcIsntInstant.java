/*
* Problem statement: Consider this snippet:

java
public class GCDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int[] temp = new int[1000];
            temp[0] = i;
        }
        System.out.println("Loop finished.");
    }
}

Explain, in your own words: (a) at what point each temp array becomes eligible for garbage collection, (b) whether it is guaranteed to actually be collected before the loop ends, or even before the program exits, and (c) why Java deliberately does not guarantee immediate reclamation the way manual free() would.

Input format: None. Output format: Three short answers, one per sub-question. Constraints: N/A.

Examples: N/A — analysis exercise. Edge cases to consider: Would wrapping the loop body differently (e.g., reusing one array instead of allocating 1000) change memory pressure? Why might that matter even though correctness is unaffected either way? What this tests: That "unreachable" and "freed" are separate concepts in your mental model — a very common and consequential misconception.
* */