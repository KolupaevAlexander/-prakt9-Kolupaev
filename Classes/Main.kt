import Dogs.*
import Cinemas.*
import Classes.StartTime as StartTimer
import Classes.EndTime as EndTimer

fun main()
{
    //Инициализация объектов
    val dog = Dogs( "Жучка", "Овчарка", 50.0, "Черная", 10.0, "Спокойная")
    val film = Cinemas("Космос", "Летят журавли", 300f, 1, 150)
    val domesticDog = DomesticDogs( "Ласка", "Борзая", 50.0, "белая", 10.0, "Игривая", "Виктор")
    val multfilm = Multfilms("Космос", "PONYO", 300f, 1, 150, "GHIBLI")
    var start = StartTimer(10,10,10)
    var end = EndTimer(11,11,11)
    

    //Функции с вызовом методов
    FirstClass(dog)
    SecondClass(film)
    ThirdClass(domesticDog)
    FourthClass(multfilm)
}

fun FirstClass(dog: Dogs)
{
    dog.GetInfo()
    println( dog.IsThatDog("Жучка"))
    println( dog.IsPlayful())
}

fun SecondClass(film:Cinemas)
{
    film.GetInfo()
    println(film.IsThatFilm("Виридиана"))
    println(film.GetKindOfHall())
}

fun ThirdClass(dog:DomesticDogs)
{
    dog.SetWeight(-90.0)
    dog.GetInfo()
    dog.WhoIsOwner()
}

fun FourthClass(multfilm: Multfilms)
{
    multfilm.SetPrise(-100f)
    multfilm.GetInfo()
    println(multfilm.IsThatStudio("Random"))
}