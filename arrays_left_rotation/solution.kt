fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    var list = a.toCollection(ArrayList())
    var fullList = ArrayList<Int>()
    var leftList = list.subList(0,d)
    var rightList = list.subList(d,list.size)
    fullList.addAll(rightList)
    fullList.addAll(leftList)
    val array = arrayOfNulls<Int>(fullList.size)
    return fullList.toArray(array)
}