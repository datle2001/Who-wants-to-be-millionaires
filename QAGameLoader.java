/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.middle;
import  millionaires.model.*;
import  java.util.ArrayList;
import  java.io.IOException;
import java.util.Random;
/**
 *
 * @author datqu
 */
public class QAGameLoader {
    private ArrayList<QA> easy;
    private ArrayList<QA> medium;
    private ArrayList<QA> hard;
    private QABankLoader  bank;
    private final int eNum = 5;
    private final int mNum = 5;
    private final int hNum = 3;
    private Random rand = new Random();
    
    public QAGameLoader() throws IOException{
        bank = new QABankLoader();
        easy = fillQAGame( bank.getEasy(), eNum );
        medium = fillQAGame( bank.getMedium(), mNum );
        hard = fillQAGame( bank.getHard(), hNum );
        
    }

    public int geteNum() {
        return eNum;
    }

    public int getmNum() {
        return mNum;
    }

    public int gethNum() {
        return hNum;
    }

    public Random getRand() {
        return rand;
    }
    public ArrayList<QA> fillQAGame(ArrayList<QA> giver, int length) {
        ArrayList<Integer> index = new ArrayList();
        ArrayList<QA> taker = new ArrayList();
        for (int i = 0; i<giver.size(); i++) {
            index.add(i);
        }
        for (int i = 0; i<length; i++) {
            int r = rand.nextInt( index.size());
            int in = index.get(r);
            index.remove( r );
            taker.add( giver.get(in) );
        }
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

    public QABankLoader getBank() {
        return bank;
    }
    
}
