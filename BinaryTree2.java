//Kode Dengan penjelasan



class BinaryTree2<E> {
    private BTNode2<E> root; // Simpul akar pohon biner

    /* Konstruktor yang membuat pohon biner kosong */
    public BinaryTree2() {
        root = null; // Menginisiasi root sebagai null
    }

    /* Metode untuk memeriksa apakah pohon biner kosong */
    public boolean isEmpty() {
        return root == null; // Pohon kosong jika root adalah null
    }

    /* Metode untuk menambahkan simpul baru dengan data */
    public void insert(E data) {
        root = insert(root, data); // Memanggil metode rekursif untuk menambahkan simpul
    }

    /* Metode rekursif untuk menambahkan simpul ke dalam pohon */
    private BTNode2<E> insert(BTNode2<E> node, E data) {
        if (node == null) {
            // Jika simpul saat ini null, buat simpul baru dengan data
            return new BTNode2<>(data);
        } else {
            // Jika simpul saat ini tidak null, tambahkan ke anak kiri jika kosong
            if (node.getLeft() == null) {
                node.setLeft(insert(node.getLeft(), data));
            } else {
                // Jika anak kiri tidak kosong, tambahkan ke anak kanan
                node.setRight(insert(node.getRight(), data));
            }
            return node; // Kembalikan simpul yang sudah diupdate
        }
    }

    /* Metode untuk menghitung jumlah simpul di dalam pohon */
    public int countNodes() {
        return countNodes(root); // Memanggil metode rekursif untuk menghitung simpul
    }

    /* Metode rekursif untuk menghitung jumlah simpul di dalam pohon */
    private int countNodes(BTNode2<E> node) {
        if (node == null) {
            // Jika simpul saat ini null, jumlahnya adalah 0
            return 0;
        } else {
            // Kalau enggak null, tambahkan 1 dan hitung simpul di anak kiri dan kanan
            return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
        }
    }

    /* Metode untuk mencari apakah data tertentu ada dalam pohon */
    public boolean search(E val) {
        return search(root, val); // Memanggil metode rekursif untuk mencari data
    }

    /* Metode rekursif untuk mencari data dalam pohon */
    private boolean search(BTNode2<E> node, E val) {
        if (node == null) {
            // Jika simpul saat ini null, data tidak ditemukan
            return false;
        }
        if (node.getData().equals(val)) {
            // Jika data simpul saat ini cocok dengan yang dicari, data ditemukan
            return true;
        }
        // Kalau belum ketemu, coba cari di anak kiri atau anak kanan
        return search(node.getLeft(), val) || search(node.getRight(), val);
    }

    /* Metode untuk melakukan traversal in-order pada pohon */
    public void inorder() {
        inorder(root); // Memanggil metode rekursif untuk traversal in-order
    }

    /* Metode rekursif untuk traversal in-order */
    private void inorder(BTNode2<E> node) {
        if (node != null) {
            // Kunjungi anak kiri, lalu simpul saat ini, kemudian anak kanan
            inorder(node.getLeft());
            System.out.print(node.getData() + " "); // Cetak data simpul
            inorder(node.getRight());
        }
    }

    /* Metode untuk melakukan traversal pre-order pada pohon */
    public void preorder() {
        preorder(root); // Memanggil metode rekursif untuk traversal pre-order
    }

    /* Metode rekursif untuk traversal pre-order */
    private void preorder(BTNode2<E> node) {
        if (node != null) {
            // Cetak data simpul, lalu kunjungi anak kiri dan kanan
            System.out.print(node.getData() + " "); 
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    /* Metode untuk melakukan traversal post-order pada pohon */
    public void postorder() {
        postorder(root); // Memanggil metode rekursif untuk traversal post-order
    }

    /* Metode rekursif untuk traversal post-order */
    private void postorder(BTNode2<E> node) {
        if (node != null) {
            // Kunjungi anak kiri, kemudian anak kanan, baru cetak data simpul
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData() + " "); 
        }
    }
}


