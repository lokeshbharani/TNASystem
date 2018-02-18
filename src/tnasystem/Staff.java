/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnasystem;

/**
 *
 * @author lokes_r
 */
public class Staff {
    
    private int id;
    private String name;
    private boolean[][] availability = new boolean[3][7];

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void searchStaff(int id){
        
    }
    
    
}
