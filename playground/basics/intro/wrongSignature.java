/*
* Problem statement: For each of the following main method variants, determine whether the class compiles, and separately, whether the JVM will treat it as a runnable entry point when you run java ClassName. The two answers are not always the same.

java
public static void main(String[] args)       // A
public static void Main(String[] args)       // B
static void main(String[] args)               // C
public void main(String[] args)               // D
public static void main(String args)          // E
public static int main(String[] args)         // F
public static void main(String... args)       // G

Input format: None — reasoning exercise, verify empirically afterward. Output format: For each of A–G: "Compiles: yes/no", "Runnable as entry point: yes/no", one-line reason. Constraints: Consider each in isolation, as if it were the only method in an otherwise valid public class.

Examples: N/A — analysis exercise. Edge cases to consider: Which of these compile fine as an ordinary method but simply aren't recognized as the entry point? That distinction is the entire point of this exercise. What this tests: That you know the entry-point contract precisely (public, static, void, exactly String[] or varargs-compatible), rather than "something like public static void main."
* */