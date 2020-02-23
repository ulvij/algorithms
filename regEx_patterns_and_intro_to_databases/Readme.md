# Designer PDF Viewer

**Difficulty** : Easy

**Link** : https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently.

In this challenge, you will be given a list of letter heights in the alphabet and a string. Using the letter heights given, determine the area of the rectangle highlight in __(mm)^2__ assuming all letters are __1 mm__ wide.

For example, the highlighted __word = torn__. Assume the heights of the letters are __t = 2, o = 1, r = 1__ and __n = 1__. The tallest letter is __2__ high and there are __4__ letters. The hightlighted area will be __2 * 4 = 8 (mm)^2__ so the answer is __8__.

__Function Description__

Complete the designerPdfViewer function in the editor below. It should return an integer representing the size of the highlighted area.

designerPdfViewer has the following parameter(s):

- h: an array of integers representing the heights of each letter
- word: a string

__Input Format__

The first line contains __26__ space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].
The second line contains a single word, consisting of lowercase English alphabetic letters.

__Constraints__
-  1 ≤ h[?] ≤ 7, where ? is English lowercase letter
-  __word__ contains no more than __10__ letters

__Output Format__

Print a single integer denoting the area in __(mm)^2__ of highlighted rectangle when the given word is selected. Do not print units of measure.

#### Sample Input:

```
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc
```

#### Sample Output:

```
9
```

#### Explanation:

We are highlighting the word abc:

Letter heights are __a = 1, b = 3__  and __c = 1__. The tallest letter, b, is __3 mm__  high. The selection area for this word is __3 * 1 mm * 3 mm = 9 (mm)^2__.

Note: Recall that the width of each character is __1 mm__.

## SOLUTION IN KOTLIN

```kotlin
fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val asOfA = 'a'.toLong()
    var maxWeight = 0

    for (c in word) {
        val diff = c.toLong() - asOfA
        if (h[(diff).toInt()] > maxWeight)
            maxWeight = h[(diff).toInt()]
    }
    return maxWeight*(word.length)
}
```
