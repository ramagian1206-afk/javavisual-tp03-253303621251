# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi
Project Character Manager merupakan program Java sederhana yang digunakan untuk mengelola data karakter dalam sebuah game. Project ini menerapkan konsep class, object, constructor, enum, encapsulation, getter, setter, dan method. Pada tugas ini juga ditambahkan fitur mana dan pengecekan status hidup karakter.

## Fitur
- Membuat karakter menggunakan dua constructor.
- Menggunakan enum CharacterType untuk menentukan jenis karakter.
- Menggunakan getter dan setter untuk mengakses atribut.
- Melakukan level up dengan memperbarui HP dan attack.
- Menambahkan atribut mana dengan validasi nilai negatif.
- Mengecek status karakter menggunakan method isAlive().
- Menampilkan informasi karakter menggunakan toString().

## Screenshot Output

![Output Character Manager] ![alt text](Hasil3.png) ![alt text](Hasil1.png) ![alt text](Hasil2.png)
## Struktur Folder

```text
CharacterManager/
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── model/
│               │   ├── Character.java
│               │   └── CharacterType.java
│               └── Main.java
├── screenshot/
│   └── output.png
└── README.md
```

## Identitas Mahasiswa

- Nama: [Rahmat Hinsah Suya Putra]
- NIM: [253303621251]
- Mata Kuliah: Java Visual
- Tugas: TP3 AP3 Character Manager Sprint #1

## Google Docs

Link Analisis Desain dan Ekosistem Java:

https://docs.google.com/document/d/1Oa6fH4OMlWYu9dQ9HGzbVMp7Wm_wkmgGlA37yg_No-w/edit?usp=sharing


======================================================================


# Character Manager — Java Visual SIH-6406

## TP3 — Sprint #1
Implementasi dasar Character Manager menggunakan Java dengan class, object, constructor, enum, encapsulation, getter, setter, level up, mana, dan isAlive().

## TP5 — Sprint #2
Pada tugas TP5, project Character Manager dikembangkan dengan menambahkan pengelolaan karakter melalui class CharacterManager. Fitur yang ditambahkan meliputi:

- equals() untuk membandingkan karakter berdasarkan nama.
- addCharacter() untuk menambahkan karakter.
- findByName() untuk mencari karakter.
- removeCharacter() untuk menghapus karakter.
- getTotalCharacters() untuk menghitung karakter.
- getAllCharacters() untuk mengembalikan salinan ArrayList.
- getAverageLevel() untuk menghitung rata-rata level.
- findByType() untuk mencari karakter berdasarkan jenis.
- findStrongest() untuk mencari karakter dengan attack tertinggi.

### Screenshot TP5

![Output TP5 Character Manager] (![alt text](hasilC.png) ![alt text](hasilA.png) ![alt text](hasilB.png))

### Penjelasan Fitur Analitik

Fitur tambahan yang dibuat adalah findStrongest(). Method ini digunakan untuk mencari karakter dengan nilai attack tertinggi dari seluruh karakter yang tersimpan dalam CharacterManager.

Fitur ini berguna untuk mengetahui karakter yang memiliki kemampuan serangan paling tinggi. Method menggunakan getter getAttack() untuk mengambil nilai attack sehingga atribut tetap terlindungi melalui encapsulation.

Method mengembalikan null jika belum terdapat karakter dalam manager. Dengan demikian, program dapat menghindari error ketika melakukan pencarian pada ArrayList kosong.

### Struktur Folder

```text
CharacterManager/
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── Main.java
│               └── model/
│                   ├── Character.java
│                   ├── CharacterType.java
│                   └── CharacterManager.java
├── screenshot/
│   ├── tp3-output.png
│   └── tp5-output.png
└── README.md
```

### Identitas Mahasiswa

- Nama: [Rahmat Hinsah Surya Putra]
- NIM: [253303621251]
- Kelas: [SI PagiB]
- Mata Kuliah: Java Visual

### Google Docs TP3
[https://docs.google.com/document/d/1Oa6fH4OMlWYu9dQ9HGzbVMp7Wm_wkmgGlA37yg_No-w/edit?usp=sharing]

### Google Docs TP5
[https://docs.google.com/document/d/1U3hpXcdxr9esQDYQ1wy4motyVTr7KuZ83ZJXvpA68B4/edit?usp=sharing]


======================================================================

## TP8 — Character Manager Sprint #3

### Screenshot MainWindow

**Sebelum perubahan data:**

![Screenshot sebelum penambahan karakter](c:\Users\Admin\OneDrive\Pictures\Screenshots\tp8-sebelum.png.png)

**Sesudah perubahan data:**

![Screenshot sesudah penambahan karakter](c:\Users\Admin\OneDrive\Pictures\Screenshots\tp8-sesudah.png.png)

### Aliran Data dan MVC

Pada TP8, Main.java berfungsi sebagai titik awal program yang membuat objek CharacterManager dan menambahkan data karakter. CharacterManager bertugas mengelola data karakter, kemudian data tersebut diambil melalui method getAllCharacters() dan dikirimkan ke MainWindow. MainWindow sebagai View bertugas menampilkan data karakter dalam bentuk GUI menggunakan JLabel. Pemisahan ini sesuai dengan konsep MVC karena pengelolaan data berada di Model, sedangkan View bertanggung jawab terhadap tampilan antarmuka.

### Karakter Baru

| Nama | Tipe | Level | Alasan |
|---|---|---:|---|
| Thor | WARRIOR | 7 | Dipilih sebagai karakter petarung dengan level tinggi. |
| Elena | MAGE | 6 | Dipilih sebagai karakter penyihir dengan level menengah. |

### Analisis GUI dan MVC

Link Google Docs: https://docs.google.com/document/d/1jIVM8vXER15CM1TDyKs1shFwCmI-wVbKZDxcKYb78LI/edit?usp=sharing


======================================================================


## TP10 — Character Manager Sprint #4

### Screenshot Tampilan

**Sebelum (MainWindow v0.3):**

![Tampilan sebelum tema TP10](c:\Users\Admin\OneDrive\Pictures\Screenshots\SEBELUM EUH.png)

**Sesudah (MainWindow v0.4):**

![Tampilan sesudah tema TP10](c:\Users\Admin\OneDrive\Pictures\Screenshots\SESUDAH EUH.png)

### Implementasi AppTheme

Pada TP10, pengaturan warna, font, dan border dipisahkan ke dalam kelas AppTheme. Hal ini dilakukan agar pengaturan tampilan aplikasi lebih terpusat dan mudah diubah tanpa harus mengedit banyak bagian kode MainWindow. Warna karakter ditentukan berdasarkan role menggunakan method colorFor(). Pengaturan tampilan tidak dimasukkan ke dalam Character karena kelas tersebut bertugas mengelola data karakter, bukan mengatur tampilannya.

### Properti Tambahan

1. **Tooltip:** Menampilkan informasi nama, role, dan level karakter ketika kursor diarahkan ke kartu. Properti ini dipilih agar pengguna dapat memperoleh informasi tambahan tanpa membuat tampilan terlalu penuh.
2. **setEnabled(false):** Karakter dengan level 1 dibuat nonaktif secara visual. Properti ini dipilih untuk membedakan karakter yang masih berada pada level awal dari karakter lainnya.

### Mini-Challenge

Karakter dengan level minimal 5 mendapatkan teks level berwarna emas dan tebal. Batas level disimpan dalam konstanta `GOLD_LEVEL_THRESHOLD` agar mudah diatur kembali.

### Analisis Properti dan MVC

Link Google Docs: https://docs.google.com/document/d/1OMnKH35FGkj5YOYqIGkHbRnDroCIB6cUGH4w2wAVTeI/edit?usp=sharing
