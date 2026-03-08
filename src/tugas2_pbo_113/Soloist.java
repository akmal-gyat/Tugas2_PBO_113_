/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_pbo_113;

/**
 *
 * @author LENOVO
 */
public class Soloist extends Participant {
    public Soloist(String name, int totalCrew) {
        super(name, totalCrew);
    }

    @Override
    public void validateCrew() throws InvalidMemberException {
        if (getTotalCrew() > 3) {
            throw new InvalidMemberException("Penyanyi solo maksimal hanya boleh membawa 2 kru tambahan (total kru maksimal 3)");
        }
    }

    @Override
    public void performSoundcheck() {
        System.out.println("Menyiapkan 1 mic vokal utama untuk " + getName() + "...");
    }
}
