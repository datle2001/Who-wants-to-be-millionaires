/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.model;
import java.util.ArrayList;
/**
 *
 * @author datqu
 */
public class QABank {
    private ArrayList<QA> easy;
    private ArrayList<QA> medium;
    private ArrayList<QA> hard;

    public QABank(ArrayList<QA> easy, ArrayList<QA> medium, ArrayList<QA> hard) {
        this.easy = easy;
        this.medium = medium;
        this.hard = hard;
    }

}
