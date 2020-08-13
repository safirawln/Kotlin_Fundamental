fun main() {
    var word : String? = "SMK Telkom"
    val wordLength = word?.length ?:10

    print("Jumlah kata dari String $word sebanyak $wordLength")
}