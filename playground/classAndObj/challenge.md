## Study Group Session Tracker
**Difficulty:** Capstone
**Concepts Tested:** multiple independent objects, instance methods modifying state, a reference field used deliberately for aliasing, an explicit identity-vs-state contrast, and the difference between a live reference link and a one-time value copy

**Problem Statement:**

Design a class representing a student in a study group, with a name, a count of sessions attended, a total number of study minutes logged, and a reference field that can point to another student of the same class (their "study buddy", initially referring to no one). Provide:
- a method to log a session, taking a minutes value and adding to both the session count and the total minutes;
- a method returning the average minutes per session as a double, correctly guarding against dividing by zero when no sessions have been logged yet (returning `0` in that case);
- a method to set another student object as this student's buddy;
- a method that copies a buddy's *current* session count and total minutes onto this student (a one-time value copy, not an ongoing link),  if no buddy has been set, this method should do nothing.
  Create three student objects by reading three names. For the first two, read two session-minutes values each, logging both sessions on each and printing that student's average immediately after. Print the third student's average before anything else happens to them (it must be `0.00`, since they have no sessions yet). Then set the third student's buddy to the first student, and have the third student copy the buddy's stats; print the third student's session count, total minutes, and average immediately after. Then read one more minutes value and log it as an additional session on the *first* student; print the first student's new average. Then print the third student's average **again**, to show it did not change automatically. Finally, print two identity checks: whether the third student's buddy reference is the exact same object as the first student, and whether the third student itself is the exact same object as the first student.

**Input Format:** name1, then two minutes values for student1; name2, then two minutes values for student2; name3; then one more minutes value (the extra session logged on student1 after the buddy match)
**Output Format:** exactly ten lines, in this order:
```
Student1 Average: <avg>
Student2 Average: <avg>
Student3 Average Before Match: 0.00
Student3 Sessions: <count>
Student3 Minutes: <total>
Student3 Average After Match: <avg>
Student1 Average After Extra Session: <avg>
Student3 Average Still: <avg>
Buddy Is Student1: <true/false>
Student3 Is Student1: <true/false>
```
(all averages and minutes formatted to 2 decimal places)

**Constraints:** `0 <= minutes values <= 1000`

**Examples:**
- `"Maya", 30, 45, "Leo", 20, 20, "Zoe", 15` →
```
Student1 Average: 37.50
Student2 Average: 20.00
Student3 Average Before Match: 0.00
Student3 Sessions: 2
Student3 Minutes: 75.00
Student3 Average After Match: 37.50
Student1 Average After Extra Session: 30.00
Student3 Average Still: 37.50
Buddy Is Student1: true
Student3 Is Student1: false
```
- `"Ada", 10, 10, "Bo", 5, 15, "Cy", 0` →
```
Student1 Average: 10.00
Student2 Average: 10.00
Student3 Average Before Match: 0.00
Student3 Sessions: 2
Student3 Minutes: 20.00
Student3 Average After Match: 10.00
Student1 Average After Extra Session: 6.67
Student3 Average Still: 10.00
Buddy Is Student1: true
Student3 Is Student1: false
```
- `"Ivo", 100, 0, "Nia", 0, 0, "Ori", 50` →
```
Student1 Average: 50.00
Student2 Average: 0.00
Student3 Average Before Match: 0.00
Student3 Sessions: 2
Student3 Minutes: 100.00
Student3 Average After Match: 50.00
Student1 Average After Extra Session: 50.00
Student3 Average Still: 50.00
Buddy Is Student1: true
Student3 Is Student1: false
```

**Important Edge Cases:** the average-before-any-sessions guard (division by zero must never actually be attempted, handle it before it happens, not after); the third example, where student1's average *coincidentally* ends up at the same value (`50.00`) both before and after the extra session, and separately matches what student3 copied, do not mistake this numeric coincidence for evidence of a live link between the two objects; verify your reasoning structurally (did you write an ongoing reference-based link, or a one-time copy?) rather than by matching numbers in one example. The `Buddy Is Student1` check must reflect that the buddy reference field, once set, continues pointing at that exact object even though the *copied stats* themselves are not automatically kept in sync afterward.

**This Exercise Requires:** three independent objects with separately tracked state; instance methods that both mutate state (`logSession`) and compute derived values without storing them (`averageMinutes`); a reference field used deliberately to link one object to another (the buddy field), demonstrating that a stored reference is not the same as a stored copy of values; and two explicit identity (`==`) checks that require you to reason correctly about which of two very similarly-worded questions ("is the buddy the same object as X" vs. "is this object the same object as X") is actually true.