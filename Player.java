/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author datqu
 */
public class Player {
    private String name;
    private int    age;
    private String nationality;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player() {
        this.name = "";
        this.age = 0;
        this.nationality = "";
        score = 0;
    }

    public void savePlayer() {
        try {
            FileWriter writer = new FileWriter("Players.csv", true);
            writer.append(name);
            writer.append(',');
            writer.append(Integer.toString(age));
            writer.append(',');
            writer.append(nationality);
            writer.append(',');
            writer.append(Integer.toString(getScore()));
            writer.append(',');
            writer.append('\n');
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
