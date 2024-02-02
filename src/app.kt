fun main()
{
    println("Введите возраст")
    var a= readLine()!!.toDouble()
    when
    {
        (a>0&&a<2)-> println("Младенец")
        (a>2&&a<4)-> println("Малыш")
        (a>3&&a<9)-> println("Ребенок")
        (a>8&&a<13)-> println("Ребенок постарше")
        (a>12&&a<19)-> println("Подросток")
        (a>18&&a<25)-> println("Молодежь")
        (a>24&&a<60)-> println("Взрослый")
        (a>59&&a<90)-> println("Пенсионер")
        (a>89&&a<130)-> println("Престарелый человек")
        (a>129)-> println("Маловероятно")
    }


}
