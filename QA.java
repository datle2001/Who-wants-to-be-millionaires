/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.model;
/**
 *
 * @author datqu
 */
public class QA {
   private String quest;
   private String[] answers;

    public QA(String quest, String[] answers) {
        this.quest = quest;
        this.answers = answers;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    
   
}
