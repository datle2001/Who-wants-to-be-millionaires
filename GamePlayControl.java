/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.middle;

import java.io.IOException;
import millionaires.model.Helper;
import millionaires.model.Player;

/**
 *
 * @author datqu
 */
public class GamePlayControl {
    private QAGameLoader QALoader;
    private Player player;
    private Helper helper;
    
    public GamePlayControl() throws IOException{
        QALoader = new QAGameLoader();
        player = new Player();
        helper = new Helper();
    }
    
    public Player getPlayer() {
        return player;
    }

    public Helper getHelper() {
        return helper;
    }

    public QAGameLoader getQALoader() {
        return QALoader;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
}
