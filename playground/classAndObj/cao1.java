/*
* Exercise 1.1 — Declaring Fields and Reading Object State

Difficulty: Beginner Concepts Tested: class definition, fields of multiple types, new, direct field assignment (no constructor), reading fields back out

Problem Statement: Define a class representing a room, with fields for its width in meters (double), length in meters (double), a name (String), and whether it's currently occupied (boolean). Read four values, create one object, assign all four fields directly, then print them in the exact format below.

Input Format: double widthMeters, double lengthMeters, String roomName, boolean isOccupied Output Format: four lines:

Room: <name>
Width: <width>
Length: <length>
Occupied: <true/false>

Constraints: 0 < width, length <= 1000

Examples:

4.5, 6.0, "Study", true →
Room: Study
Width: 4.5
Length: 6.0
Occupied: true
3.0, 3.0, "Closet", false →
Room: Closet
Width: 3.0
Length: 3.0
Occupied: false
10.25, 8.0, "Hall", true →
Room: Hall
Width: 10.25
Length: 8.0
Occupied: true

Important Edge Cases: width equal to length (still just prints normally — no special handling exists at this level); isOccupied = false.

This Exercise Tests: declaring fields of several different types on one class, creating an object and setting its state through direct field access rather than a constructor, and reading that state back.
* */