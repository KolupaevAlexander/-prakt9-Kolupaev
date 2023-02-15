import Cinemas.*
class Multfilms(name:String,
                session:String,
                private var price:Float = 250f,
                hall:Int,
                visitors: Int,
                private val studio: String)
                :Cinemas(name, session, price, hall, visitors)
{
    fun IsThatStudio(studio: String):Boolean
    {
        return this.studio==studio
    }

    override fun GetInfo()
    {
        super.GetInfo()
        println("Студия: $studio")
    }

    fun SetPrise(price: Float)
    {
        if (price<0) println("Цена не может быть отрицательный")
        else this.price = price
    }
}