import Dogs.*
class DomesticDogs(name: String,
                   breed: String,
                   height:Double,
                   color:String,
                   private var weight:Double = 10.0,
                   temper:String,
                   private val owner: String
)
                   :Dogs(name, breed, height, color, weight, temper)
{
    fun WhoIsOwner()
    {
        println(owner)
    }

    override fun GetInfo()
    {
        super.GetInfo()
        println("Хозяин: $owner")
    }

    fun SetWeight(weight: Double)
    {
        if (weight<0) println("Вес не может быть отрицательным")
        else this.weight = weight
    }
}