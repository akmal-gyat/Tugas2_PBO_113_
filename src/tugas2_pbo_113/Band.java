 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_pbo_113;

/**
 *
 * @author LENOVO
 */
public class Band extends Participant {
    public Band(String name, int totalCrew) {
        super(name, totalCrew);
    }

    @Override
    public void validateCrew() throws InvalidMemberException {
        if (getTotalCrew() < 3) {
            throw new InvalidMemberException("Band minimal harus memiliki 3 anggota/kru");
        }
    }

    @Override
    public void performSoundcheck() {
        System.out.println("Menyiapkan set drum, ampli gitar, dan mic untuk grup " + getName() + "...");
    }
}
