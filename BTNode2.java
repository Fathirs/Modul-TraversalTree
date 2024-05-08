/* Kelas yang mewakili simpul (node) dalam pohon biner */
class BTNode2<E> {
    private BTNode2<E> left;  // Referensi ke anak kiri simpul
    private BTNode2<E> right; // Referensi ke anak kanan simpul
    private E data;           // Data yang disimpan dalam simpul

    /* Konstruktor default, membuat simpul kosong tanpa data dan anak */
    public BTNode2() {
        this.left = null;   // Tidak ada anak kiri
        this.right = null;  // Tidak ada anak kanan
        this.data = null;   // Tidak ada data yang disimpan
    }

    /* Konstruktor dengan data, inisiasi simpul dengan data tertentu */
    public BTNode2(E item) {
        this.left = null;   // Belum ada anak kiri
        this.right = null;  // Belum ada anak kanan
        this.data = item;   // Simpan data yang diberikan
    }

    /* Setter untuk anak kiri */
    public void setLeft(BTNode2<E> left) {
        this.left = left; // Tetapkan anak kiri dengan simpul yang diberikan
    }

    /* Setter untuk anak kanan */
    public void setRight(BTNode2<E> right) {
        this.right = right; // Tetapkan anak kanan dengan simpul yang diberikan
    }

    /* Getter untuk anak kiri */
    public BTNode2<E> getLeft() {
        return left; // Kembalikan referensi ke anak kiri
    }

    /* Getter untuk anak kanan */
    public BTNode2<E> getRight() {
        return right; // Kembalikan referensi ke anak kanan
    }

    /* Setter untuk data dalam simpul */
    public void setData(E data) {
        this.data = data; // Tetapkan data yang disimpan dalam simpul
    }

    /* Getter untuk data dalam simpul */
    public E getData() {
        return data; // Kembalikan data yang disimpan dalam simpul
    }
}
