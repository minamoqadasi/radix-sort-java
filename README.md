# radix-sort-java

## Problem Statement

Write a program that sorts a given list of names in descending order using Radix Sort with bins.
- Use Radix = 27 (26 capital letters A–Z + 1 blank space).
- Each bin is implemented using a Queue ADT.
- Input names consist of only capital letters (A–Z).
- Pad names with trailing blank spaces so all names are equal length before sorting.
- After each pass (per character position), display:
- The contents of all bins
- The partially sorted list
- After the final pass, display the fully sorted list.

## Input Data

The program sorts the following names:

- OLIVIA
- EMMA
- AMELIA
- CHARLOTTE
- AVA
- SOPHIA
- MIA
- ISABELLA
- EVELYN
- LUNA
- LIAM
- NOAH
- OLIVER
- JAMES
- ELIJAH
- HENRY
- WILLIAM
- LUCAS
- BENJAMIN
- THEODORE


## Approach

1. Preprocessing
- Find the maximum length among all names.
- Pad shorter names with spaces ' ' to match this length.
2. Radix Sort with Bins
- Process names from rightmost character to leftmost.
- Map each character (A–Z and ' ') to a bin index (0–26).
- Place names into queues (bins) based on the current character.
- Collect names from bins in reverse order (since sorting is descending).
- Repeat for each character position.
3. Output
- Show bins after every pass.
- Show the partially sorted list after each pass.
- Show the fully sorted list after the final pass.

## Files
- RadixSort.java
- RadixSortMain.java
