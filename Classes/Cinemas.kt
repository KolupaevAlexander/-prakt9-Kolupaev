package Cinemas
open class Cinemas(
    private val name: String,
    private val session: String,
    private val price: Float,
    private val hall: Int,
    private val visitors: Int
)
{
    open fun GetInfo()
    {
        println("Название кинотеатра: $name\nСеанс: $session\nЦена: $price\nЗал: $hall\nКол-во зрителей: $visitors")
    }

    fun GetKindOfHall():String
    {
        return if (visitors>=100)  "Большой зал"
        else "Малый зал"
    }

    fun IsThatFilm(filmName:String):Boolean
    {
        return name==filmName
    }
}