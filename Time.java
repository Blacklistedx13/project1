
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Khushdeep singh
 */
public class Time {

    private int numOfHours;
    private int numOfMinutes;
    private int numOfSeconds;

    /**
     *
     * @param sec
     */
    public Time(int totalSeconds) {
        numOfHours = totalSeconds / 3600;
        numOfMinutes = (totalSeconds % 3600) / 60;
        numOfSeconds = (totalSeconds % 3600) % 60;

    }

    public int getNumberOfSeconds() {
        return numOfSeconds;
    }

    public int getNumberOfHours() {
        return numOfHours;
    }

    public int getNumberOfMinutes() {
        return numOfMinutes;
    }
}
