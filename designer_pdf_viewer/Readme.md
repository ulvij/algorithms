# RegEx, Patterns, and Intro to Databases
      
**Difficulty** : Medium

**Link** : https://www.hackerrank.com/challenges/30-regex-patterns/problem

__Objective__

Today we're learning about running time! Check out the Tutorial tab for learning materials and an instructional video!

__Task__

Consider a database table, Emails, which has the attributes First Name and Email ID. Given __N__ rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in __@gmail.com__.

__Note:__ If possible, try to come up with a __O(sqrt(n))__  primality algorithm, or see what sort of optimizations you come up with for an __O(n)__ algorithm. Be sure to check out the Editorial after submitting your code!

__Input Format__

The first line contains an integer,__N__ , total number of rows in the table.
Each of the __N__ subsequent lines contains __2__ space-separated strings denoting a person's first name and email ID, respectively.

__Constraints__
-  2 ≤ N ≤ 30
-  Each of the first names consists of lower case letters __[a-z]__ only.
-  Each of the email IDs consists of lower case letters , __[a-z],@__ and __.__ only.
-  The length of the first name is no longer than 20.
-  The length of the email ID is no longer than 50.

__Output Format__

Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.

#### Sample Input:

```
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
```

#### Sample Output:

```
julia
julia
riya
samantha
tanya
```

## SOLUTION IN KOTLIN

```kotlin
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val regex = "[a-zA-Z0-9._-]+@gmail.com".toRegex()
    val N = scan.nextLine().trim().toInt()
    val list  = mutableListOf<String>()

    for (NItr in 1..N) {
        val firstNameEmailID = scan.nextLine().split(" ")

        val firstName = firstNameEmailID[0]

        val emailID = firstNameEmailID[1]

        if (regex.matches(emailID)){
            list.add(firstName)
        }
    }
    list.sort()
    list.forEach(::println)
}
```
