## Challenge : Data Types

**"The Silent Corruption"**

You inherit a program that computes a running total over what's *supposed* to be a small dataset, but under certain inputs it produces a value that's obviously wrong — negative, when it logically can't be. It never crashes. It never throws. It just quietly returns nonsense some of the time.

Without being shown the code, list every distinct mechanism from this concept that could cause "silently wrong, never crashing" numeric behavior in Java (there is more than one, and they are not all the same root cause), and for each one, describe the specific symptom that would let you tell it apart from the others if you were handed the actual buggy code. Then write one minimal Java program per mechanism that reproduces that exact symptom on purpose.