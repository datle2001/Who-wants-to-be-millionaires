/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.middle;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import millionaires.model.QA;
import millionaires.model.QABank;

/**
 *
 * @author datqu
 */
public class QABankLoader {
    private ArrayList<QA> easy;
    private ArrayList<QA> medium;
    private ArrayList<QA> hard;
    private final int LENGTH = 4;
    private QABank  bank;
    
    public QABankLoader() throws IOException {
        easy = fillQABank( "EasyQuest.csv");
        medium = fillQABank( "MediumQuest.csv" );
        hard = fillQABank( "HardQuest.csv" );
        bank = new QABank(easy, medium, hard);
    }
    public ArrayList<QA> fillQABank(String fileName) throws IOException{
        ArrayList<QA> taker = new ArrayList();
        Scanner sc = new Scanner( new FileReader(fileName));
        while (sc.hasNext()) {
            String quest = sc.nextLine().replace(",", "").replace("\"", "");
            String[] ans = sc.nextLine().replace("\"", "").split(",");
            for(int i = 0; i<LENGTH; i++) {
                ans[i] = ans[i].trim();
            }
            taker.add( new QA(quest, ans));
        }
        sc.close();
        return taker;
    }
    

    public ArrayList<QA> getEasy() {
        return easy;
    }

    public ArrayList<QA> getMedium() {
        return medium;
    }

    public ArrayList<QA> getHard() {
        return hard;
    }

    public QABank getBank() {
        return bank;
    }
    
}

