# Java-RekeningBank-

Penjelasan Sistem Informasi Akun Bank (Rekening) - PBO


1. Enkapsulasi (Encapsulation)

- Semua atribut pada class RekeningBank diset menjadi private (noRekening, namaPemilik, saldo).

- Akses data menggunakan method Getter (getSaldo(), getNamaPemilik()) dan Setter (setSaldo()).

- Terdapat validasi pada Constructor dan Setter agar saldo awal minimal Rp 50.000 dan saldo tidak bernilai negatif.

2. Static Keyword

- Menggunakan atribut public static int totalRekening.

- Variabel ini bertindak sebagai pemegang nilai global yang menghitung berapa kali instance/objek RekeningBank dibuat. Nilai ini bertambah otomatis (+1) pada constructor.

3. Logika Bisnis (Transfer Saldo)

- Method transfer(double nominal, RekeningBank tujuan) menangani proses pemindahan saldo antar-rekening.

- Dilengkapi validasi untuk mencegah transfer jika nominal lebih besar dari saldo pengirim atau nominal bernilai negatif/nol.

Struktur File

- RekeningBank.java: Class utama yang menyimpan atribut, constructor, enkapsulasi, dan metode bisnis.

- MainBank.java: Class yang berisi main() method untuk menjalankan pengujian dan simulasi skenario.

Skenario Pengujian (MainBank.java)

- Inisialisasi Objek: Membuat 2 objek RekeningBank (Roki & Ncep) dan secara otomatis menambah hitungan totalRekening.

- Uji Validasi Transfer (Gagal): Mencoba melakukan transfer dari rekening Budi melebihi saldo yang dimiliki untuk membuktikan sistem menolak transaksi tersebut.

- Uji Transfer Berhasil: Melakukan transfer dengan nominal yang sah, lalu memeriksa pengurangan saldo pengirim dan penambahan saldo penerima.

- Cetak Saldo Akhir & Total Rekening: Menampilkan saldo terbaru dari kedua rekening serta mengakses variabel RekeningBank.totalRekening untuk memverifikasi jumlah akun yang telah dibuat.
