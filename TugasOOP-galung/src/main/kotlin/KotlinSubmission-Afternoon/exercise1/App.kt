package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Galung"
    val lastName: String = "Wendi Wijaya"
    val umur: Number = 21
    val status: Boolean = true

            println("Nama Depan Anda: $firstName")
            println("Nama Belakang Anda: $lastName")
            println("Umur: $umur tahun")
            println("Status: ${if (status) "Single" else "tidak"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val idgrup = "Kuda Terbang"
    val membergrup = listOf("Galung Wendi Wijaya", "oktariza dwi putri", "elrida eldaa","reza yahya pahlevi","messy w","andre","kukuh","hary")
    val session = "Afternoon"

            println("Grup ID = $idgrup")
            println("Group Member = $membergrup")
            println("Session = $session")
            return "Unit"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val membergrup = listOf("oktariza dwi putri", "elrida eldaa","reza yahya pahlevi","messy Wirdianti","galung wendi wijaya")
    val namaku = groupMember [4]
    println("Nama Saya adalah $namaku")
    return membergrup
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentorku = arrayOf<String>("Malik","Reynaldi")
    val countOfGroup = arrayOf<String>("galung wendi wijaya", "oktariza dwi putri", "elrida eldaa","reza yahya pahlevi","messy w","andre","kukuh","hary")
    val total = mentorku.size + countOfGroup.size
    return total
}

fun main() {
    myProfile()
    val myTeam = myTeam()
    println("Tim ku adalah: $myTeam")
    val totalMember = totalMember()
    println("Total anggota dalam grup ku : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("", listOf(), "")

}