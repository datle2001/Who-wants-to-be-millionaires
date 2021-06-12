/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.model;

import java.util.ArrayList;
import javax.swing.JButton;
import java.util.Random;

/**
 *
 * @author datqu
 */
public class Helper {
    private JButton helper;
    private Random rand;
    public Helper() {
    }
    public void help(JButton[] ansBoxes, JButton rightAns) {
        JButton[] wrongAns = new JButton[3];
        for (int i = 0, p = 0; i<ansBoxes.length; i++) {
            if (ansBoxes[i] != rightAns) {
                wrongAns[p] = ansBoxes[i];
                p++;
            }
        }
        ArrayList<Integer> index = new ArrayList();
        for(int i = 0; i<3; i++) {
            index.add(i);
        }
        int ran = rand.nextInt(index.size());
        index.remove(ran);
        wrongAns[ran].setEnabled(false);
        wrongAns[rand.nextInt(index.size())].setEnabled(false);
        helper.setEnabled(false);
    }
}
