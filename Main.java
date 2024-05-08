import java.util.Scanner;

/**
 * Kelas Main untuk menjalankan program interaktif dengan BinaryTree2.
 * Program ini diadaptasi dari sumber: https://www.sanfoundry.com/java-program-implement-binary-tree/
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna

        /* Membuat objek pohon biner */
        BinaryTree2 bt = new BinaryTree2();

        /* Memberi tahu pengguna bahwa ini adalah program Binary Tree */
        System.out.println("Binary Tree Test\n");

        char ch; // Untuk menyimpan pilihan pengguna (lanjut atau tidak)

        /* Memulai loop untuk antarmuka interaktif */
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");   // Pilihan untuk menambahkan elemen ke pohon
            System.out.println("2. search");   // Pilihan untuk mencari elemen dalam pohon
            System.out.println("3. count nodes"); // Pilihan untuk menghitung jumlah simpul
            System.out.println("4. check empty"); // Pilihan untuk memeriksa apakah pohon kosong

            /* Membaca pilihan pengguna dari konsol */
            int choice = scan.nextInt();
            scan.nextLine(); // Mengosongkan sisa baris setelah membaca integer

            /* Menjalankan operasi sesuai dengan pilihan pengguna */
            switch (choice) {
                case 1:
                    System.out.println("Masukkan elemen untuk ditambahkan");
                    bt.insert(scan.nextLine()); // Menambahkan elemen ke pohon
                    break;
                case 2:
                    System.out.println("Masukkan elemen untuk dicari");
                    // Mencari elemen dalam pohon dan menampilkan hasil
                    System.out.println("Hasil pencarian: " + bt.search(scan.nextLine()));
                    break;
                case 3:
                    System.out.println("Jumlah simpul = " + bt.countNodes()); // Menghitung jumlah simpul
                    break;
                case 4:
                    System.out.println("Apakah pohon kosong? " + bt.isEmpty()); // Memeriksa apakah pohon kosong
                    break;
                default:
                    // Jika pilihan tidak dikenal, beri tahu pengguna
                    System.out.println("Masukkan salah, coba lagi \n");
                    break;
            }

            /* Menampilkan hasil traversal pohon setelah setiap operasi */
            System.out.print("\nPost order: ");
            bt.postorder(); // Traversal post-order
            System.out.print("\nPre order: ");
            bt.preorder(); // Traversal pre-order
            System.out.print("\nIn order: ");
            bt.inorder(); // Traversal in-order

            /* Menanyakan apakah pengguna ingin melanjutkan atau keluar */
            System.out.println("\n\nIngin melanjutkan? (ketik 'y' atau 'n')\n");
            ch = scan.next().charAt(0); // Membaca karakter dari input pengguna
        } while (ch == 'Y' || ch == 'y'); // Lanjutkan jika pengguna memasukkan 'y' atau 'Y'

        scan.close(); // Tutup scanner untuk menghindari kebocoran sumber daya
    }
}
