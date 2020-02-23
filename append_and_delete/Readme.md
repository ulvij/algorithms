# Append and Delete

**Difficulty** : Easy

**Link** : https://www.hackerrank.com/challenges/append-and-delete/problem

You have a string of lowercase English alphabetic letters. You can perform two types of operations on the string:

- Append a lowercase English alphabetic letter to the end of the string.
- Delete the last character in the string. Performing this operation on an empty string results in an empty string.

Given an integer, __k__, and two strings, __s__ and __t__, determine whether or not you can convert __s__ to __t__ by performing exactly __k__ of the above operations on __s__. If it's possible, print __Yes__. Otherwise, print __No__.

For example, strings __s=[a,b,c]__ and __t=[d,e,f]__ . Our number of moves, __k=6__ . To convert  __s__ to __t__ , we first delete all of the characters in __3__ moves. Next we add each of the characters of __t__ in order. On the __6th__ move, you will have the matching string. If there had been more moves available, they could have been eliminated by performing multiple deletions on an empty string. If there were fewer than __6__ moves, we would not have succeeded in creating the new string.

__Function Description__

Complete the appendAndDelete function in the editor below. It should return a string, either Yes or No.
appendAndDelete has the following parameter(s):

- s: the initial string
- t: the desired string
- k: an integer that represents the number of operations

__Input Format__

- The first line contains a string __s__, the initial string.
- The second line contains a string __t__, the desired final string.
- The third line contains an integer __k__, the number of operations.

__Constraints__

-  1 ≤ |s| ≤ 100
-  1 ≤ |t| ≤ 100
-  1 ≤ k ≤ 100

__Output Format__

Print __Yes__ if you can obtain string __t__ by performing exactly __k__ operations on __s__. Otherwise, print __No__.

#### Sample Input:

```
hackerhappy
hackerrank
9
```

#### Sample Output:

```
Yes
```

#### Explanation:
We perform __4_- delete operations to reduce string __s__ to __hacker__. Next, we perform __4__ append operations (i.e., r, a, n, and k), to get __hackerrank__. Because we were able to convert __s__ to __t__ by performing exactly __k=9__ operations, we print __Yes__.

## SOLUTION IN KOTLIN

```kotlin
fun appendAndDelete(s: String, t: String, k: Int): String {
    if (s.plus(t).length <= k) return "Yes"
    var tempString: String = t

    while (!s.contains(tempString)) {
        tempString = tempString.subSequence(0, tempString.lastIndex).toString()
    }
    val leftS = s.removePrefix(tempString)
    val leftT = t.removePrefix(tempString)
    if (leftS.isEmpty()) {
        return if (leftT.length == k || ((k - leftT.length) % 2 == 0)) "Yes" else "No"
    }

    val diffText = leftS.plus(leftT)
    return if (k >= diffText.length && ((k - diffText.length) % 2 == 0)) "Yes" else "No"
}
```
