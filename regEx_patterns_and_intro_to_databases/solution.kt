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