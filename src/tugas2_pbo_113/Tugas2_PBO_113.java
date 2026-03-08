/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_pbo_113;

/**
 *
 * @author LENOVO
 */
public class Tugas2_PBO_113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demonstrasi objek valid dan invalid
        Soloist solo1 = new Soloist("Andi", 2);       // penyanyi + 2 kru (valid)
        Band band1 = new Band("The Rock", 4);        // 4 anggota (valid)
        Band band2 = new Band("Metalica", 2);         // 2 anggota (tidak valid)

        // Contoh penanganan IllegalArgumentException dari setter
        try {
            Soloist soloInvalid = new Soloist("Budi", -1); // kru negatif
        } catch (IllegalArgumentException e) {
            System.out.println("Error saat membuat objek: " + e.getMessage());
        }

        System.out.println("\n=== Audisi Soloist ===");
        startAudition(solo1);

        System.out.println("\n=== Audisi Band (valid) ===");
        startAudition(band1);

        System.out.println("\n=== Audisi Band (invalid) ===");
        startAudition(band2);
    }

    // Method polymorphic
    public static void startAudition(Participant p) {
        p.performSoundcheck();
        try {
            p.validateCrew();
            System.out.println("Validasi kru berhasil untuk " + p.getName());
        } catch (InvalidMemberException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }
    }
}
