fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

//This code will compile and run without any errors. However, it might not behave as expected if you're not familiar with the behavior of the removeIf function.  The removeIf function modifies the list in place.  If you expect to keep the original list intact, you will need to copy it before calling removeIf.