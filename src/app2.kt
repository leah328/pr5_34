import kotlin.math.pow
fun main()
{
    println("Введите x:")
    var x= readLine()!!.toDouble()
    var f=0.toDouble()
    when
    {
        (x>3.6) -> f=((45*x.pow(2))+5)
        (x<=3)  -> f=((5*x)/((10*x.pow(2)+1)))
    }
  println(f)
}
