fun main()
{
    var int:Int=10
    var double:Double=20.2
    var str:String="30"
    println("Iteger: $int")
    println("Double: $double")
    println("String: $str")
    double = int.toDouble()
    println("String to Integer : $int")
    double = str.toDouble()
    println("String to Double: $double")
}