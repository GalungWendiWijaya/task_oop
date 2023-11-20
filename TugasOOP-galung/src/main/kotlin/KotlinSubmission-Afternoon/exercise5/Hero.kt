package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 21

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("Profile")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Dari mana $name barusan? ")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name lagi jalan sama orang lain")
        health -= 4
    }
    fun lari() {
        checkHealth()
        println("$name lagi mengikuti lomba balap lari")
        health -= -2
    }

    fun makan() {
        checkHealth()
        println("$name lagi makan sama bebebnya")
        health -= +2
    }

    fun minum() {
        checkHealth()
        println("$name lagi minum mixue")
        health -= +2
    }

    fun lompat() {
        checkHealth()
        println("$name melompati pagar")
        health -= -2
    }

    fun duduk() {
        checkHealth()
        println("$name lagi duduk dipelaminan sama doi")
        health -= +1
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    
}

