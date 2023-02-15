package Dogs
open class Dogs (
    private val name: String,
    private val breed: String,
    private val height: Double,
    private val color: String,
    private val weight: Double,
    private val temper: String)
{
    open fun GetInfo()
    {
        println("Кличка: $name\nПорода: $breed\nРост: $height\nОкрас: $color\nВес: $weight\nТемперамент: $temper")
    }

    fun IsThatDog(probablyName: String):Boolean
    {
        return name==probablyName
    }

    fun IsPlayful():Boolean
    {
        return temper=="Игривая"
    }
}
