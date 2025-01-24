# Unexpected List Modification with removeIf in Kotlin

This repository demonstrates a potential pitfall when using the `removeIf` function with `mutableListOf` in Kotlin.  The `removeIf` function modifies the list in place, which can lead to unexpected behavior if the programmer doesn't account for this side effect. 

The `bug.kt` file contains the buggy code. The `bugSolution.kt` file shows how to correctly handle the list modification to avoid unexpected results.

This issue is subtle and might not be immediately apparent to less experienced Kotlin developers.  This example highlights the importance of understanding the mutable nature of lists and how in-place operations can affect the original data.