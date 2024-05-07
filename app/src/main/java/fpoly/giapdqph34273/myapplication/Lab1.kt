package fpoly.giapdqph34273.myapplication

fun main() {

//    bai2()
    bai3()
}

fun phepChia(soA: Int, soB: Float): String {

    if (soB == 0f) {
        return "soB không được = 0"
    }

    val thuong = soA / soB

    return "Thương của số $soA và $soB là $thuong"
}

fun bai2() {
    print("Đỗ Quang Giáp - PH34273\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")

}

fun bai3(){
    var a = 0.0
    var b = 0.0
    print("Nhập a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    print("Nhập b: ")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))

}