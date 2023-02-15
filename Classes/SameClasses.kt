package Classes

class StartTime(var hour:Int,
                var minute:Int,
                var second:Int)
{
    fun GetTime()
    {
        println("$hour:$minute:$second")
    }
}

class EndTime(var hour:Int,
              var minute:Int,
              var second:Int)
{
    fun GetTime()
    {
        println("$hour:$minute:$second")
    }
}