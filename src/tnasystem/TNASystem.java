package tnasystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author lokes_r
 */
public class TNASystem {

    private static String id = "a";
    private static String password = "a";
    private static HashMap<String, ArrayList> timeTable = new HashMap();
    private static LinkedList<Staff> staff = new LinkedList<Staff>();

    public static HashMap<String, ArrayList> getTimeTable() {
        return timeTable;
    }
    
    public static boolean checkMan(String a, String b) {
        if (a.equalsIgnoreCase(getId()) && b.equalsIgnoreCase(getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public static String getId() {
        return id;
    }

    public static String getPassword() {
        return password;
    }

    public static void addStaff(int id, String name) {
        staff.add(new Staff(id, name));
    }

    public static boolean checkStaff(int id) {
        for (int i = 0; i < staff.size(); i++) {
            if (id == staff.get(i).getId()) {
                return true;
            }
        }
        return false;

    }

    public static String staffDetails() {
        return staff.get(0).getName();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TNASystem tn = new TNASystem();
        Main g = new Main();
        g.setVisible(true);
    }

}
