class Student{
    var name = ""
    var familia = ""
    var otchestvo = ""
    var date = 0
    var spisoknagrad = ""
    var history = ""
}
class Pedagog {
    var name = ""
    var familia = ""
    var otchestvo = ""
    var date = 0
}
class Grupp {
    var name = ""
    var array : Array<Student>()
}
class Kvantum {
    var name = ""
    var array : Array<Grupp>()
    var p : Pedagog()
}
class Kvantorium {
    
}