fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.toMutableList()
    newList.removeIf { it % 2 == 0 }
    println(list) //Original list remains unchanged
    println(newList) //Modified list
}

//Alternatively, create a new list with only odd numbers:
fun main(){
    val list = mutableListOf(1,2,3,4,5)
    val oddList = list.filter {it % 2 != 0}.toMutableList()
    println(oddList)
}