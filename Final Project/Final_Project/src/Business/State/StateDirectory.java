/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import java.util.ArrayList;

/**
 *
 * @author shinychenw
 */
public class StateDirectory {
    private ArrayList <State> stateList;

    public StateDirectory() {
        stateList = new ArrayList();
    }
    
    public State createState() {
        State state = new State();
        stateList.add(state);
        return state;
    }
    
    public void deleteState(State state){
        stateList.remove(state);
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }
    
    
}
