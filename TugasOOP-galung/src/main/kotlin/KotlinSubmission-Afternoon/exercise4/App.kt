package id.infinitelearning.KotlinSubmission.exercise4




    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun main() {
        val inputuser = "10"
        try {
            val nomor = inputuser.toInt()
            println("Masukan data yang valid: $nomor")
        } catch (e: NumberFormatException) {
            println("Data yang Anda masukan tidak valid, harap masukkan angka yang benar")
        }
    }