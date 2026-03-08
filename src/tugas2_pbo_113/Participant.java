/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_pbo_113;

/**
 *
 * @author LENOVO
 */
public abstract class Participant {
    private String name;
    private int totalCrew;

    public Participant(String name, int totalCrew) {
        this.name = name;
        setTotalCrew(totalCrew);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCrew() {
        return totalCrew;
    }

    public void setTotalCrew(int crew) {
        if (crew <= 0) {
            throw new IllegalArgumentException("Jumlah kru tidak valid");
        }
        this.totalCrew = crew;
    }

    public abstract void validateCrew() throws InvalidMemberException;
    public abstract void performSoundcheck();
}
