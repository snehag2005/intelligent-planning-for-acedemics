/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package intelligent.planning.pkgfor.academics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class aptitudetest1 extends javax.swing.JFrame {

    int sec=60;
    int min=9;
    Timer time;
    
     boolean flag=true;
    
    private int result_sci = 0;
    private int result_com = 0;
    private int result_arts = 0;

    String[] apti_ans_sci = new String[8];
    String[] apti_ans_com = new String[8];
    String[] apti_ans_arts = new String[7];

    /**
     * Creates new form test
     */
    public aptitudetest1() {
        initComponents();
        FetchRecorApti();
        FetchRecorIntrest();
        FetchRecorComm();
        timer(jLabel59,jLabel61);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
    }

    public void FetchRecorApti() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try", "root", "L@yirp6124")) {

                Statement stmt = con.createStatement();
                Statement stmt1 = con.createStatement();
                Statement stmt2 = con.createStatement();
                ResultSet sci = stmt.executeQuery("select * from communication1 WHERE concude = 'sci' order by rand() limit 7 ; ");
                ResultSet com = stmt1.executeQuery("select * from communication1 WHERE concude = 'com' order by rand() limit 7 ; ");
                ResultSet arts = stmt2.executeQuery("select * from communication1 WHERE concude = 'arts' order by rand() limit 6 ; ");
                int count_sci = 0;
                int count_arts = 0;
                int count_com = 0;
                while (sci.next()) {
                    count_sci++;
                    set_label_sci(count_sci, sci);
                }
                while (com.next()) {
                    count_com++;
                    set_label_com(count_com, com);
                }
                while (arts.next()) {
                    count_arts++;
                    set_label_arts(count_arts, arts);
                }

            } catch (Exception ex) {
                Logger.getLogger(aptitudetest1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }

    public void FetchRecorIntrest() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try", "root", "L@yirp6124")) {

                Statement stmt = con.createStatement();
                Statement stmt1 = con.createStatement();
                Statement stmt2 = con.createStatement();
                ResultSet sci = stmt.executeQuery("select * from interest WHERE qtype = 'sci' order by rand() limit 5 ; ");
                ResultSet com = stmt1.executeQuery("select * from interest WHERE qtype = 'com' order by rand() limit 5 ; ");
                ResultSet arts = stmt2.executeQuery("select * from interest WHERE qtype = 'arts' order by rand() limit 5 ; ");
                int count_sci = 0;
                int count_arts = 0;
                int count_com = 0;
                while (sci.next()) {
                    count_sci++;
                    set_label_intrest_sci(count_sci, sci);
                }
                while (com.next()) {
                    count_com++;
                    set_label_intrest_com(count_com, com);
                }
                while (arts.next()) {
                    count_arts++;
                    set_label_intrest_arts(count_arts, arts);
                }

            } catch (Exception ex) {
                Logger.getLogger(aptitudetest1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }

    public void FetchRecorComm() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try", "root", "L@yirp6124")) {

                Statement stmt = con.createStatement();
                ResultSet sci = stmt.executeQuery("select * from communication2 order by rand() limit 20 ; ");
                int count_sci = 0;
                while (sci.next()) {
                    count_sci++;
                    set_label_Comm(count_sci, sci);
                }

            } catch (Exception ex) {
                Logger.getLogger(aptitudetest1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }

    public void set_label_Comm(int count, ResultSet result) throws Exception {

        if (count == 1) {
            jLabel39.setText("1. "+result.getString("question"));
            jRadioButton91.setText(result.getString("option1"));
            jRadioButton92.setText(result.getString("option2"));
            jRadioButton93.setText(result.getString("option3"));
        }
        if (count == 2) {
            jLabel40.setText("2. "+result.getString("question"));
            jRadioButton94.setText(result.getString("option1"));
            jRadioButton95.setText(result.getString("option2"));
            jRadioButton96.setText(result.getString("option3"));
        }
        if (count == 3) {
            jLabel41.setText("3. "+result.getString("question"));
            jRadioButton97.setText(result.getString("option1"));
            jRadioButton98.setText(result.getString("option2"));
            jRadioButton99.setText(result.getString("option3"));
        }
        if (count == 4) {
            jLabel42.setText("4. "+result.getString("question"));
            jRadioButton100.setText(result.getString("option1"));
            jRadioButton101.setText(result.getString("option2"));
            jRadioButton102.setText(result.getString("option3"));
        }

        if (count == 5) {
            jLabel43.setText("5. "+result.getString("question"));
            jRadioButton103.setText(result.getString("option1"));
            jRadioButton104.setText(result.getString("option2"));
            jRadioButton105.setText(result.getString("option3"));
        }
        if (count == 6) {
            jLabel44.setText("6. "+result.getString("question"));
            jRadioButton106.setText(result.getString("option1"));
            jRadioButton107.setText(result.getString("option2"));
            jRadioButton108.setText(result.getString("option3"));
        }
        if (count == 7) {
            jLabel45.setText("7. "+result.getString("question"));
            jRadioButton109.setText(result.getString("option1"));
            jRadioButton110.setText(result.getString("option2"));
            jRadioButton111.setText(result.getString("option3"));
        }
        if (count == 8) {
            jLabel46.setText("8. "+result.getString("question"));
            jRadioButton112.setText(result.getString("option1"));
            jRadioButton113.setText(result.getString("option2"));
            jRadioButton114.setText(result.getString("option3"));
        }
        if (count == 9) {
            jLabel47.setText("9. "+result.getString("question"));
            jRadioButton115.setText(result.getString("option1"));
            jRadioButton116.setText(result.getString("option2"));
            jRadioButton117.setText(result.getString("option3"));
        }
        if (count == 10) {
            jLabel48.setText("10. "+result.getString("question"));
            jRadioButton118.setText(result.getString("option1"));
            jRadioButton119.setText(result.getString("option2"));
            jRadioButton120.setText(result.getString("option3"));
        }
        if (count == 11) {
            jLabel49.setText("11. "+result.getString("question"));
            jRadioButton121.setText(result.getString("option1"));
            jRadioButton122.setText(result.getString("option2"));
            jRadioButton123.setText(result.getString("option3"));
        }
        if (count == 12) {
            jLabel50.setText("12. "+result.getString("question"));
            jRadioButton124.setText(result.getString("option1"));
            jRadioButton125.setText(result.getString("option2"));
            jRadioButton126.setText(result.getString("option3"));
        }
        if (count == 13) {
            jLabel51.setText("13. "+result.getString("question"));
            jRadioButton127.setText(result.getString("option1"));
            jRadioButton128.setText(result.getString("option2"));
            jRadioButton129.setText(result.getString("option3"));
        }
        if (count == 14) {
            jLabel52.setText("14. "+result.getString("question"));
            jRadioButton130.setText(result.getString("option1"));
            jRadioButton131.setText(result.getString("option2"));
            jRadioButton132.setText(result.getString("option3"));
        }
        if (count == 15) {
            jLabel53.setText("15. "+result.getString("question"));
            jRadioButton133.setText(result.getString("option1"));
            jRadioButton134.setText(result.getString("option2"));
            jRadioButton135.setText(result.getString("option3"));
        }
        if (count == 16) {
            jLabel54.setText("16. "+result.getString("question"));
            jRadioButton136.setText(result.getString("option1"));
            jRadioButton137.setText(result.getString("option2"));
            jRadioButton138.setText(result.getString("option3"));
        }
        if (count == 17) {
            jLabel55.setText("17. "+result.getString("question"));
            jRadioButton139.setText(result.getString("option1"));
            jRadioButton140.setText(result.getString("option2"));
            jRadioButton141.setText(result.getString("option3"));
        }
        if (count == 18) {
            jLabel56.setText("18. "+result.getString("question"));
            jRadioButton142.setText(result.getString("option1"));
            jRadioButton143.setText(result.getString("option2"));
            jRadioButton144.setText(result.getString("option3"));
        }
        if (count == 19) {
            jLabel57.setText("19. "+result.getString("question"));
            jRadioButton145.setText(result.getString("option1"));
            jRadioButton146.setText(result.getString("option2"));
            jRadioButton147.setText(result.getString("option3"));
        }
        if (count == 20) {
            jLabel58.setText("20. "+result.getString("question"));
            jRadioButton148.setText(result.getString("option1"));
            jRadioButton149.setText(result.getString("option2"));
            jRadioButton150.setText(result.getString("option3"));
        }

    }

    public void set_label_intrest_arts(int count, ResultSet result) throws Exception {

        if (count == 1) {
            jLabel25.setText("3."+result.getString("question"));
            jRadioButton65.setText(result.getString("option1"));
            jRadioButton66.setText(result.getString("option2"));
        }
        if (count == 2) {
            jLabel28.setText("6. "+result.getString("question"));
            jRadioButton71.setText(result.getString("option1"));
            jRadioButton72.setText(result.getString("option2"));
        }
        if (count == 3) {
            jLabel31.setText("9. "+result.getString("question"));
            jRadioButton77.setText(result.getString("option1"));
            jRadioButton78.setText(result.getString("option2"));
        }
        if (count == 4) {
            jLabel34.setText("12. "+result.getString("question"));
            jRadioButton83.setText(result.getString("option1"));
            jRadioButton84.setText(result.getString("option2"));
        }
        if (count == 5) {
            jLabel37.setText("15. "+result.getString("question"));
            jRadioButton89.setText(result.getString("option1"));
            jRadioButton90.setText(result.getString("option2"));
        }
    }

    public void set_label_intrest_com(int count, ResultSet result) throws Exception {

        if (count == 1) {
            jLabel24.setText("2. "+result.getString("question"));
            jRadioButton63.setText(result.getString("option1"));
            jRadioButton64.setText(result.getString("option2"));
        }
        if (count == 2) {
            jLabel27.setText("5. "+result.getString("question"));
            jRadioButton69.setText(result.getString("option1"));
            jRadioButton70.setText(result.getString("option2"));
        }
        if (count == 3) {
            jLabel30.setText("8. "+result.getString("question"));
            jRadioButton75.setText(result.getString("option1"));
            jRadioButton76.setText(result.getString("option2"));
        }
        if (count == 4) {
            jLabel33.setText("11. "+result.getString("question"));
            jRadioButton81.setText(result.getString("option1"));
            jRadioButton82.setText(result.getString("option2"));
        }
        if (count == 5) {
            jLabel36.setText("14. "+result.getString("question"));
            jRadioButton87.setText(result.getString("option1"));
            jRadioButton88.setText(result.getString("option2"));
        }

    }

    public void set_label_intrest_sci(int count, ResultSet result) throws Exception {

        if (count == 1) {
            jLabel23.setText("1. "+result.getString("question"));
            jRadioButton61.setText(result.getString("option1"));
            jRadioButton62.setText(result.getString("option2"));
        }
        if (count == 2) {
            jLabel26.setText("4. "+result.getString("question"));
            jRadioButton67.setText(result.getString("option1"));
            jRadioButton68.setText(result.getString("option2"));
        }
        if (count == 3) {
            jLabel29.setText("7. "+result.getString("question"));
            jRadioButton73.setText(result.getString("option1"));
            jRadioButton74.setText(result.getString("option2"));
        }
        if (count == 4) {
            jLabel32.setText("10. "+result.getString("question"));
            jRadioButton79.setText(result.getString("option1"));
            jRadioButton80.setText(result.getString("option2"));
        }
        if (count == 5) {
            jLabel35.setText("13."+result.getString("question"));
            jRadioButton85.setText(result.getString("option1"));
            jRadioButton86.setText(result.getString("option2"));
        }

    }

    private void set_label_arts(int count, ResultSet result) throws Exception {

        apti_ans_arts[count] = result.getString("correctanswer");
        if (count == 1) {
            jLabel3.setText("3. "+result.getString("question"));
            jRadioButton7.setText(result.getString("option1"));
            jRadioButton8.setText(result.getString("option2"));
            jRadioButton9.setText(result.getString("option3"));

        }

        if (count == 2) {
            jLabel6.setText("6. "+result.getString("question"));
            jRadioButton16.setText(result.getString("option1"));
            jRadioButton17.setText(result.getString("option2"));
            jRadioButton18.setText(result.getString("option3"));

        }

        if (count == 3) {
            jLabel9.setText("9. "+result.getString("question"));
            jRadioButton25.setText(result.getString("option1"));
            jRadioButton26.setText(result.getString("option2"));
            jRadioButton27.setText(result.getString("option3"));

        }

        if (count == 4) {
            jLabel12.setText("12. "+result.getString("question"));
            jRadioButton34.setText(result.getString("option1"));
            jRadioButton35.setText(result.getString("option2"));
            jRadioButton36.setText(result.getString("option3"));

        }

        if (count == 5) {
            jLabel15.setText("15. "+result.getString("question"));
            jRadioButton43.setText(result.getString("option1"));
            jRadioButton44.setText(result.getString("option2"));
            jRadioButton45.setText(result.getString("option3"));

        }

        if (count == 6) {
            jLabel18.setText("18. "+result.getString("question"));
            jRadioButton52.setText(result.getString("option1"));
            jRadioButton53.setText(result.getString("option2"));
            jRadioButton54.setText(result.getString("option3"));

        }

    }

    private void set_label_com(int count, ResultSet result) throws Exception {
        apti_ans_com[count] = result.getString("correctanswer");

        if (count == 1) {
            jLabel2.setText("2. "+result.getString("question"));
            jRadioButton4.setText(result.getString("option1"));
            jRadioButton5.setText(result.getString("option2"));
            jRadioButton6.setText(result.getString("option3"));
        }

        if (count == 2) {
            jLabel5.setText("5. "+result.getString("question"));
            jRadioButton13.setText(result.getString("option1"));
            jRadioButton14.setText(result.getString("option2"));
            jRadioButton15.setText(result.getString("option3"));

        }

        if (count == 3) {
            jLabel8.setText("8. "+result.getString("question"));
            jRadioButton22.setText(result.getString("option1"));
            jRadioButton23.setText(result.getString("option2"));
            jRadioButton24.setText(result.getString("option3"));

        }

        if (count == 4) {
            jLabel11.setText("11. "+result.getString("question"));
            jRadioButton31.setText(result.getString("option1"));
            jRadioButton32.setText(result.getString("option2"));
            jRadioButton33.setText(result.getString("option3"));

        }

        if (count == 5) {
            jLabel14.setText("14. "+result.getString("question"));
            jRadioButton40.setText(result.getString("option1"));
            jRadioButton41.setText(result.getString("option2"));
            jRadioButton42.setText(result.getString("option3"));

        }

        if (count == 6) {
            jLabel17.setText("17. "+result.getString("question"));
            jRadioButton49.setText(result.getString("option1"));
            jRadioButton50.setText(result.getString("option2"));
            jRadioButton51.setText(result.getString("option3"));

        }

        if (count == 7) {
            jLabel20.setText("20. "+result.getString("question"));
            jRadioButton58.setText(result.getString("option1"));
            jRadioButton59.setText(result.getString("option2"));
            jRadioButton60.setText(result.getString("option3"));

        }

    }

    private void set_label_sci(int count, ResultSet result) throws Exception {

        apti_ans_sci[count] = result.getString("correctanswer");
        System.out.println(result.getString("correctanswer"));

        if (count == 1) {
            jLabel1.setText("1."+result.getString("question"));
            jRadioButton1.setText(result.getString("option1"));
            jRadioButton2.setText(result.getString("option2"));
            jRadioButton3.setText(result.getString("option3"));
        }
        if (count == 2) {
            jLabel4.setText("4."+result.getString("question"));
            jRadioButton10.setText(result.getString("option1"));
            jRadioButton11.setText(result.getString("option2"));
            jRadioButton12.setText(result.getString("option3"));
        }
        if (count == 3) {
            jLabel7.setText("7. "+result.getString("question"));
            jRadioButton19.setText(result.getString("option1"));
            jRadioButton20.setText(result.getString("option2"));
            jRadioButton21.setText(result.getString("option3"));
        }
        if (count == 4) {
            jLabel10.setText("10. "+result.getString("question"));
            jRadioButton28.setText(result.getString("option1"));
            jRadioButton29.setText(result.getString("option2"));
            jRadioButton30.setText(result.getString("option3"));
        }
        if (count == 5) {
            jLabel13.setText("13. "+result.getString("question"));
            jRadioButton37.setText(result.getString("option1"));
            jRadioButton38.setText(result.getString("option2"));
            jRadioButton39.setText(result.getString("option3"));
        }
        if (count == 6) {
            jLabel16.setText("16. "+result.getString("question"));
            jRadioButton46.setText(result.getString("option1"));
            jRadioButton47.setText(result.getString("option2"));
            jRadioButton48.setText(result.getString("option3"));
        }
        if (count == 7) {
            jLabel19.setText("19. "+result.getString("question"));
            jRadioButton55.setText(result.getString("option1"));
            jRadioButton56.setText(result.getString("option2"));
            jRadioButton57.setText(result.getString("option3"));

        }
    }

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button1 = buttons.nextElement();

            if (button1.isSelected()) {
                return button1.getText();
            }
        }

        return null;
    }
    
    public String getSelectedButtonText1(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return "null";
    }

    public Boolean get_sci_result() {
         Boolean all=true;
        if(getSelectedButtonText(buttonGroup1)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_sci[1].substring(0, 1).equals(getSelectedButtonText(buttonGroup1).substring(0, 1))) {
            result_sci += 1;
        }
        if(getSelectedButtonText(buttonGroup4)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_sci[2].substring(0, 1).equals(getSelectedButtonText(buttonGroup4).substring(0, 1))) {
            result_sci += 1;
        }
        if(getSelectedButtonText(buttonGroup7)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_sci[3].substring(0, 1).equals(getSelectedButtonText(buttonGroup7).substring(0, 1))) {
            result_sci += 1;
        }
        if(getSelectedButtonText(buttonGroup10)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_sci[4].substring(0, 1).equals(getSelectedButtonText(buttonGroup10).substring(0, 1))) {
            result_sci += 1;
        }
        if(getSelectedButtonText(buttonGroup13)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_sci[5].substring(0, 1).equals(getSelectedButtonText(buttonGroup13).substring(0, 1))) {
            result_sci += 1;
        }
        if(getSelectedButtonText(buttonGroup16)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_sci[6].substring(0, 1).equals(getSelectedButtonText(buttonGroup16).substring(0, 1))) {
            result_sci += 1;
        }
        if(getSelectedButtonText(buttonGroup19)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_sci[7].substring(0, 1).equals(getSelectedButtonText(buttonGroup19).substring(0, 1))) {
            result_sci += 1;
        }
return all;
    }

    public Boolean get_com_result() {
         Boolean all=true;
        if(getSelectedButtonText(buttonGroup2)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (apti_ans_com[1].substring(0, 1).equals(getSelectedButtonText(buttonGroup2).substring(0, 1))) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup5)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!"); all=false;
        }else if (apti_ans_com[2].substring(0, 1).equals(getSelectedButtonText(buttonGroup5).substring(0, 1))) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup8)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
        }else if (apti_ans_com[3].substring(0, 1).equals(getSelectedButtonText(buttonGroup8).substring(0, 1))) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup11)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_com[4].substring(0, 1).equals(getSelectedButtonText(buttonGroup11).substring(0, 1))) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup14)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_com[5].substring(0, 1).equals(getSelectedButtonText(buttonGroup14).substring(0, 1))) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup17)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_com[6].substring(0, 1).equals(getSelectedButtonText(buttonGroup17).substring(0, 1))) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup20)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_com[7].substring(0, 1).equals(getSelectedButtonText(buttonGroup20).substring(0, 1))) {
            result_com += 1;
        }
return all;
    }

    public Boolean get_arts_result() {
        Boolean all=true;
        if(getSelectedButtonText(buttonGroup3)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_arts[1].substring(0, 1).equals(getSelectedButtonText(buttonGroup3).substring(0, 1))) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup6)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_arts[2].substring(0, 1).equals(getSelectedButtonText(buttonGroup6).substring(0, 1))) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup9)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_arts[3].substring(0, 1).equals(getSelectedButtonText(buttonGroup9).substring(0, 1))) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup12)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
        }else if (apti_ans_arts[4].substring(0, 1).equals(getSelectedButtonText(buttonGroup12).substring(0, 1))) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup15)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_arts[5].substring(0, 1).equals(getSelectedButtonText(buttonGroup15).substring(0, 1))) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup18)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (apti_ans_arts[6].substring(0, 1).equals(getSelectedButtonText(buttonGroup18).substring(0, 1))) {
            result_arts += 1;
        }
return all;
    }

    public Boolean get_intrest_sci_result() {
        Boolean all=true;
         if(getSelectedButtonText(buttonGroup21)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (getSelectedButtonText(buttonGroup21).equals("yes")) {
            result_sci += 1;
        }
         if(getSelectedButtonText(buttonGroup24)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (getSelectedButtonText(buttonGroup24).equals("yes")) {
            result_sci += 1;
        }
         if(getSelectedButtonText(buttonGroup35)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (getSelectedButtonText(buttonGroup35).equals("yes")) {
            result_sci += 1;
        }
         if(getSelectedButtonText(buttonGroup29)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");all=false;
        }else if (getSelectedButtonText(buttonGroup29).equals("yes")) {
            result_sci += 1;
        }
          if(getSelectedButtonText(buttonGroup32)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup32).equals("yes")) {
            result_sci += 1;
        }
return all;
    }   

    public Boolean get_intrest_com_result() {
        Boolean all=true;
        if(getSelectedButtonText(buttonGroup22)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup22).equals("yes")) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup25)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup25).equals("yes")) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup27)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup27).equals("yes")) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup30)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup30).equals("yes")) {
            result_com += 1;
        }
        if(getSelectedButtonText(buttonGroup33)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup33).equals("yes")) {
            result_com += 1;
        }
return all;
    }

    public Boolean get_intrest_arts_result() {
        Boolean all=true;
        if(getSelectedButtonText(buttonGroup23)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup23).equals("yes")) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup26)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup26).equals("yes")) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup28)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup28).equals("yes")) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup31)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup31).equals("yes")) {
            result_arts += 1;
        }
        if(getSelectedButtonText(buttonGroup34)==null){
            JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
            all=false;
        }else if (getSelectedButtonText(buttonGroup34).equals("yes")) {
            result_arts += 1;
        }
return all;
    }

    public Boolean get_comm_result() {
        Boolean all=true;
        switch (getSelectedButtonText1(buttonGroup36).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }

        switch (getSelectedButtonText1(buttonGroup37).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup38).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup39).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup40).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup41).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup42).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup43).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup44).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup45).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup46).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup47).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup48).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup49).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup50).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup51).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup52).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup53).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup54).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }
        switch (getSelectedButtonText1(buttonGroup55).substring(0, 1)) {
            case "a" ->
                result_arts += 1;
            case "b" ->
                result_com += 1;
            case "c" ->
                result_sci += 1;
            case "n" ->{
                JOptionPane.showMessageDialog(rootPane, "Please select an Option!");
                all=false;}
            default -> {
            }
        }

     return all;

    }
    
    private void timer(JLabel jLabel591, JLabel jLabel611){
      time = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {
            setForeground(Color.BLACK);
            setForeground(Color.BLACK);
            
            if(sec==0){
                sec=60;
                min--;
            }
            
            if(min==0){
                setForeground(Color.RED);
                setForeground(Color.RED);
                
            }
            
            if(min<0){
                JOptionPane.showMessageDialog(rootPane,"Times Up","Stopped",0);
                min=0;
                sec=0;
                time.stop();
            }else{
                
                sec--;
                if(sec<10){
                    jLabel611.setText("0"+sec);
                    flag=false;
                    
                }
                if(min<10){
                    jLabel591.setText("0"+min);
                    if(sec<10){
                        jLabel611.setText("0"+sec);
                    }
                    else{
                        jLabel611.setText(""+sec);
                    }
                    flag=false;
                    
                }
                if(flag){
                    jLabel591.setText(""+min);
                    jLabel611.setText(""+sec);
                }}
        }
    });
    time.start();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        buttonGroup31 = new javax.swing.ButtonGroup();
        buttonGroup32 = new javax.swing.ButtonGroup();
        buttonGroup33 = new javax.swing.ButtonGroup();
        buttonGroup34 = new javax.swing.ButtonGroup();
        buttonGroup35 = new javax.swing.ButtonGroup();
        buttonGroup36 = new javax.swing.ButtonGroup();
        buttonGroup37 = new javax.swing.ButtonGroup();
        buttonGroup38 = new javax.swing.ButtonGroup();
        buttonGroup39 = new javax.swing.ButtonGroup();
        buttonGroup40 = new javax.swing.ButtonGroup();
        buttonGroup41 = new javax.swing.ButtonGroup();
        buttonGroup42 = new javax.swing.ButtonGroup();
        buttonGroup43 = new javax.swing.ButtonGroup();
        buttonGroup44 = new javax.swing.ButtonGroup();
        buttonGroup45 = new javax.swing.ButtonGroup();
        buttonGroup46 = new javax.swing.ButtonGroup();
        buttonGroup47 = new javax.swing.ButtonGroup();
        buttonGroup48 = new javax.swing.ButtonGroup();
        buttonGroup49 = new javax.swing.ButtonGroup();
        buttonGroup50 = new javax.swing.ButtonGroup();
        buttonGroup51 = new javax.swing.ButtonGroup();
        buttonGroup52 = new javax.swing.ButtonGroup();
        buttonGroup53 = new javax.swing.ButtonGroup();
        buttonGroup54 = new javax.swing.ButtonGroup();
        buttonGroup55 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton69 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton71 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton101 = new javax.swing.JRadioButton();
        jRadioButton102 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        jRadioButton103 = new javax.swing.JRadioButton();
        jRadioButton104 = new javax.swing.JRadioButton();
        jRadioButton105 = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        jRadioButton106 = new javax.swing.JRadioButton();
        jRadioButton107 = new javax.swing.JRadioButton();
        jRadioButton108 = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jRadioButton109 = new javax.swing.JRadioButton();
        jRadioButton110 = new javax.swing.JRadioButton();
        jRadioButton111 = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jRadioButton112 = new javax.swing.JRadioButton();
        jRadioButton113 = new javax.swing.JRadioButton();
        jRadioButton114 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jRadioButton115 = new javax.swing.JRadioButton();
        jRadioButton116 = new javax.swing.JRadioButton();
        jRadioButton117 = new javax.swing.JRadioButton();
        jLabel48 = new javax.swing.JLabel();
        jRadioButton118 = new javax.swing.JRadioButton();
        jRadioButton119 = new javax.swing.JRadioButton();
        jRadioButton120 = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        jRadioButton121 = new javax.swing.JRadioButton();
        jRadioButton122 = new javax.swing.JRadioButton();
        jRadioButton123 = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        jRadioButton124 = new javax.swing.JRadioButton();
        jRadioButton125 = new javax.swing.JRadioButton();
        jRadioButton126 = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        jRadioButton127 = new javax.swing.JRadioButton();
        jRadioButton128 = new javax.swing.JRadioButton();
        jRadioButton129 = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();
        jRadioButton130 = new javax.swing.JRadioButton();
        jRadioButton131 = new javax.swing.JRadioButton();
        jRadioButton132 = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        jRadioButton133 = new javax.swing.JRadioButton();
        jRadioButton134 = new javax.swing.JRadioButton();
        jRadioButton135 = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        jRadioButton136 = new javax.swing.JRadioButton();
        jRadioButton137 = new javax.swing.JRadioButton();
        jRadioButton138 = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        jRadioButton139 = new javax.swing.JRadioButton();
        jRadioButton140 = new javax.swing.JRadioButton();
        jRadioButton141 = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        jRadioButton142 = new javax.swing.JRadioButton();
        jRadioButton143 = new javax.swing.JRadioButton();
        jRadioButton144 = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        jRadioButton145 = new javax.swing.JRadioButton();
        jRadioButton146 = new javax.swing.JRadioButton();
        jRadioButton147 = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        jRadioButton148 = new javax.swing.JRadioButton();
        jRadioButton149 = new javax.swing.JRadioButton();
        jRadioButton150 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 2500));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("jLabel4");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setFocusPainted(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("jRadioButton6");

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton7");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton8");

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("jRadioButton9");

        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setText("jRadioButton10");

        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setText("jRadioButton11");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setText("jRadioButton12");

        buttonGroup5.add(jRadioButton13);
        jRadioButton13.setText("jRadioButton13");

        buttonGroup5.add(jRadioButton14);
        jRadioButton14.setText("jRadioButton14");

        buttonGroup5.add(jRadioButton15);
        jRadioButton15.setText("jRadioButton15");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("jLabel6");

        buttonGroup6.add(jRadioButton16);
        jRadioButton16.setText("jRadioButton16");

        buttonGroup6.add(jRadioButton17);
        jRadioButton17.setText("jRadioButton17");

        buttonGroup6.add(jRadioButton18);
        jRadioButton18.setText("jRadioButton18");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("jLabel7");

        buttonGroup7.add(jRadioButton19);
        jRadioButton19.setText("jRadioButton19");

        buttonGroup7.add(jRadioButton20);
        jRadioButton20.setText("jRadioButton20");

        buttonGroup7.add(jRadioButton21);
        jRadioButton21.setText("jRadioButton21");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("jLabel8");

        buttonGroup8.add(jRadioButton22);
        jRadioButton22.setText("jRadioButton22");

        buttonGroup8.add(jRadioButton23);
        jRadioButton23.setText("jRadioButton23");

        buttonGroup8.add(jRadioButton24);
        jRadioButton24.setText("jRadioButton24");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("jLabel9");

        buttonGroup9.add(jRadioButton25);
        jRadioButton25.setText("jRadioButton25");

        buttonGroup9.add(jRadioButton26);
        jRadioButton26.setText("jRadioButton26");

        buttonGroup9.add(jRadioButton27);
        jRadioButton27.setText("jRadioButton27");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("jLabel10");

        buttonGroup10.add(jRadioButton28);
        jRadioButton28.setText("jRadioButton28");

        buttonGroup10.add(jRadioButton29);
        jRadioButton29.setText("jRadioButton29");

        buttonGroup10.add(jRadioButton30);
        jRadioButton30.setText("jRadioButton30");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("jLabel11");

        buttonGroup11.add(jRadioButton31);
        jRadioButton31.setText("jRadioButton31");

        buttonGroup11.add(jRadioButton32);
        jRadioButton32.setText("jRadioButton32");

        buttonGroup11.add(jRadioButton33);
        jRadioButton33.setText("jRadioButton33");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("jLabel12");

        buttonGroup12.add(jRadioButton34);
        jRadioButton34.setText("jRadioButton34");

        buttonGroup12.add(jRadioButton35);
        jRadioButton35.setText("jRadioButton35");

        buttonGroup12.add(jRadioButton36);
        jRadioButton36.setText("jRadioButton36");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("jLabel13");

        buttonGroup13.add(jRadioButton37);
        jRadioButton37.setText("jRadioButton37");

        buttonGroup13.add(jRadioButton38);
        jRadioButton38.setText("jRadioButton38");

        buttonGroup13.add(jRadioButton39);
        jRadioButton39.setText("jRadioButton39");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("jLabel14");

        buttonGroup14.add(jRadioButton40);
        jRadioButton40.setText("jRadioButton40");

        buttonGroup14.add(jRadioButton41);
        jRadioButton41.setText("jRadioButton41");

        buttonGroup14.add(jRadioButton42);
        jRadioButton42.setText("jRadioButton42");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("jLabel15");

        buttonGroup15.add(jRadioButton43);
        jRadioButton43.setText("jRadioButton43");

        buttonGroup15.add(jRadioButton44);
        jRadioButton44.setText("jRadioButton44");

        buttonGroup15.add(jRadioButton45);
        jRadioButton45.setText("jRadioButton45");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("jLabel16");

        buttonGroup16.add(jRadioButton46);
        jRadioButton46.setText("jRadioButton46");

        buttonGroup16.add(jRadioButton47);
        jRadioButton47.setText("jRadioButton47");

        buttonGroup16.add(jRadioButton48);
        jRadioButton48.setText("jRadioButton48");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("jLabel17");

        buttonGroup17.add(jRadioButton49);
        jRadioButton49.setText("jRadioButton49");

        buttonGroup17.add(jRadioButton50);
        jRadioButton50.setText("jRadioButton50");

        buttonGroup17.add(jRadioButton51);
        jRadioButton51.setText("jRadioButton51");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("jLabel18");

        buttonGroup18.add(jRadioButton52);
        jRadioButton52.setText("jRadioButton52");

        buttonGroup18.add(jRadioButton53);
        jRadioButton53.setText("jRadioButton53");

        buttonGroup18.add(jRadioButton54);
        jRadioButton54.setText("jRadioButton54");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("jLabel19");

        buttonGroup19.add(jRadioButton55);
        jRadioButton55.setText("jRadioButton55");

        buttonGroup19.add(jRadioButton56);
        jRadioButton56.setText("jRadioButton56");

        buttonGroup19.add(jRadioButton57);
        jRadioButton57.setText("jRadioButton57");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("jLabel20");

        buttonGroup20.add(jRadioButton58);
        jRadioButton58.setText("jRadioButton58");

        buttonGroup20.add(jRadioButton59);
        jRadioButton59.setText("jRadioButton59");

        buttonGroup20.add(jRadioButton60);
        jRadioButton60.setText("jRadioButton60");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("SAVE & NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel21.setText("APTITUDE TEST");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel59.setText("00");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel60.setText(":");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel61.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton9)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton12)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton14)
                            .addComponent(jRadioButton15)
                            .addComponent(jLabel6)
                            .addComponent(jRadioButton16)
                            .addComponent(jRadioButton17)
                            .addComponent(jRadioButton18)
                            .addComponent(jLabel7)
                            .addComponent(jRadioButton19)
                            .addComponent(jRadioButton20)
                            .addComponent(jRadioButton21)
                            .addComponent(jLabel8)
                            .addComponent(jRadioButton22)
                            .addComponent(jRadioButton23)
                            .addComponent(jRadioButton24)
                            .addComponent(jLabel9)
                            .addComponent(jRadioButton25)
                            .addComponent(jRadioButton26)
                            .addComponent(jRadioButton27)
                            .addComponent(jLabel10)
                            .addComponent(jRadioButton28)
                            .addComponent(jRadioButton29)
                            .addComponent(jRadioButton30)
                            .addComponent(jLabel11)
                            .addComponent(jRadioButton31)
                            .addComponent(jRadioButton32)
                            .addComponent(jRadioButton33)
                            .addComponent(jLabel12)
                            .addComponent(jRadioButton34)
                            .addComponent(jRadioButton35)
                            .addComponent(jRadioButton36)
                            .addComponent(jLabel13)
                            .addComponent(jRadioButton37)
                            .addComponent(jRadioButton38)
                            .addComponent(jRadioButton39)
                            .addComponent(jLabel14)
                            .addComponent(jRadioButton40)
                            .addComponent(jRadioButton41)
                            .addComponent(jRadioButton42)
                            .addComponent(jLabel15)
                            .addComponent(jRadioButton43)
                            .addComponent(jRadioButton44)
                            .addComponent(jLabel16)
                            .addComponent(jRadioButton45)
                            .addComponent(jRadioButton46)
                            .addComponent(jRadioButton47)
                            .addComponent(jRadioButton48)
                            .addComponent(jLabel17)
                            .addComponent(jRadioButton49)
                            .addComponent(jRadioButton50)
                            .addComponent(jRadioButton51)
                            .addComponent(jLabel18)
                            .addComponent(jRadioButton52)
                            .addComponent(jRadioButton53)
                            .addComponent(jRadioButton54)
                            .addComponent(jLabel19)
                            .addComponent(jRadioButton55)
                            .addComponent(jRadioButton56)
                            .addComponent(jRadioButton57)
                            .addComponent(jLabel20)
                            .addComponent(jRadioButton58)
                            .addComponent(jRadioButton59)
                            .addComponent(jRadioButton60))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel21)))
                .addGap(155, 155, 155)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel60)
                .addGap(0, 0, 0)
                .addComponent(jLabel61)
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addGap(27, 27, 27))
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton12)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton15)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton18)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton21)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton24)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton27)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton30)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton33)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton36)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton39)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton42)
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton45)
                .addGap(30, 30, 30)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton48)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton51)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton54)
                .addGap(29, 29, 29)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton57)
                .addGap(36, 36, 36)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 2500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel22.setText("INTEREST");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("jLabel23");

        buttonGroup21.add(jRadioButton61);
        jRadioButton61.setText("jRadioButton61");

        buttonGroup21.add(jRadioButton62);
        jRadioButton62.setText("jRadioButton62");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("jLabel24");

        buttonGroup22.add(jRadioButton63);
        jRadioButton63.setText("jRadioButton63");

        buttonGroup22.add(jRadioButton64);
        jRadioButton64.setText("jRadioButton64");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("jLabel25");

        buttonGroup23.add(jRadioButton65);
        jRadioButton65.setText("jRadioButton65");

        buttonGroup23.add(jRadioButton66);
        jRadioButton66.setText("jRadioButton66");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("jLabel26");

        buttonGroup24.add(jRadioButton67);
        jRadioButton67.setText("jRadioButton67");

        buttonGroup24.add(jRadioButton68);
        jRadioButton68.setText("jRadioButton68");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("jLabel27");

        buttonGroup25.add(jRadioButton69);
        jRadioButton69.setText("jRadioButton69");

        buttonGroup25.add(jRadioButton70);
        jRadioButton70.setText("jRadioButton70");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("jLabel28");

        buttonGroup26.add(jRadioButton71);
        jRadioButton71.setText("jRadioButton71");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("jLabel29");

        buttonGroup26.add(jRadioButton72);
        jRadioButton72.setText("jRadioButton72");

        buttonGroup35.add(jRadioButton73);
        jRadioButton73.setText("jRadioButton73");

        buttonGroup35.add(jRadioButton74);
        jRadioButton74.setText("jRadioButton74");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("jLabel30");

        buttonGroup27.add(jRadioButton75);
        jRadioButton75.setText("jRadioButton75");

        buttonGroup27.add(jRadioButton76);
        jRadioButton76.setText("jRadioButton76");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("jLabel31");

        buttonGroup28.add(jRadioButton77);
        jRadioButton77.setText("jRadioButton77");

        buttonGroup28.add(jRadioButton78);
        jRadioButton78.setText("jRadioButton78");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("jLabel32");

        buttonGroup29.add(jRadioButton79);
        jRadioButton79.setText("jRadioButton79");

        buttonGroup29.add(jRadioButton80);
        jRadioButton80.setText("jRadioButton80");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("jLabel33");

        buttonGroup30.add(jRadioButton81);
        jRadioButton81.setText("jRadioButton81");

        buttonGroup30.add(jRadioButton82);
        jRadioButton82.setText("jRadioButton82");
        jRadioButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton82ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("jLabel34");

        buttonGroup31.add(jRadioButton83);
        jRadioButton83.setText("jRadioButton83");

        buttonGroup31.add(jRadioButton84);
        jRadioButton84.setText("jRadioButton84");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("jLabel35");

        buttonGroup32.add(jRadioButton85);
        jRadioButton85.setText("jRadioButton85");

        buttonGroup32.add(jRadioButton86);
        jRadioButton86.setText("jRadioButton86");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("jLabel36");

        buttonGroup33.add(jRadioButton87);
        jRadioButton87.setText("jRadioButton87");

        buttonGroup33.add(jRadioButton88);
        jRadioButton88.setText("jRadioButton88");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("jLabel37");

        buttonGroup34.add(jRadioButton89);
        jRadioButton89.setText("jRadioButton89");

        buttonGroup34.add(jRadioButton90);
        jRadioButton90.setText("jRadioButton90");

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("SAVE & NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel62.setText("00");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel63.setText(":");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel64.setText("00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton62)
                            .addComponent(jLabel24)
                            .addComponent(jRadioButton61)
                            .addComponent(jLabel23)
                            .addComponent(jRadioButton63)
                            .addComponent(jRadioButton64)
                            .addComponent(jLabel25)
                            .addComponent(jRadioButton65)
                            .addComponent(jRadioButton66)
                            .addComponent(jLabel26)
                            .addComponent(jRadioButton67)
                            .addComponent(jRadioButton68)
                            .addComponent(jLabel27)
                            .addComponent(jRadioButton69)
                            .addComponent(jRadioButton70)
                            .addComponent(jLabel28)
                            .addComponent(jRadioButton71)
                            .addComponent(jLabel29)
                            .addComponent(jRadioButton72)
                            .addComponent(jRadioButton73)
                            .addComponent(jRadioButton74)
                            .addComponent(jLabel30)
                            .addComponent(jRadioButton75)
                            .addComponent(jRadioButton76)
                            .addComponent(jLabel31)
                            .addComponent(jRadioButton77)
                            .addComponent(jRadioButton78)
                            .addComponent(jLabel32)
                            .addComponent(jRadioButton79)
                            .addComponent(jRadioButton80)
                            .addComponent(jLabel33)
                            .addComponent(jRadioButton81)
                            .addComponent(jRadioButton82)
                            .addComponent(jLabel34)
                            .addComponent(jRadioButton83)
                            .addComponent(jRadioButton84)
                            .addComponent(jLabel35)
                            .addComponent(jRadioButton85)
                            .addComponent(jRadioButton86)
                            .addComponent(jLabel36)
                            .addComponent(jRadioButton87)
                            .addComponent(jRadioButton88)
                            .addComponent(jLabel37)
                            .addComponent(jRadioButton89)
                            .addComponent(jRadioButton90)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel22)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel62)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel63)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel64)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64))
                .addGap(30, 30, 30)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton62)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton64)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton66)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton68)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton70)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton71)
                .addGap(2, 2, 2)
                .addComponent(jRadioButton72)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton74)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton76)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton78)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton80)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton82)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton84)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton86)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton88)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2510, 820, 1420));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(808, 3070));

        jLabel38.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel38.setText("COMMUNNICATION SKILL TEST");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("jLabel39");

        buttonGroup36.add(jRadioButton91);
        jRadioButton91.setText("jRadioButton91");

        buttonGroup36.add(jRadioButton92);
        jRadioButton92.setText("jRadioButton92");

        buttonGroup36.add(jRadioButton93);
        jRadioButton93.setText("jRadioButton93");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("jLabel40");

        buttonGroup37.add(jRadioButton94);
        jRadioButton94.setText("jRadioButton94");

        buttonGroup37.add(jRadioButton95);
        jRadioButton95.setText("jRadioButton95");

        buttonGroup37.add(jRadioButton96);
        jRadioButton96.setText("jRadioButton96");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("jLabel41");

        buttonGroup38.add(jRadioButton97);
        jRadioButton97.setText("jRadioButton97");

        buttonGroup38.add(jRadioButton98);
        jRadioButton98.setText("jRadioButton98");

        buttonGroup38.add(jRadioButton99);
        jRadioButton99.setText("jRadioButton99");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("jLabel42");

        buttonGroup39.add(jRadioButton100);
        jRadioButton100.setText("jRadioButton100");

        buttonGroup39.add(jRadioButton101);
        jRadioButton101.setText("jRadioButton101");

        buttonGroup39.add(jRadioButton102);
        jRadioButton102.setText("jRadioButton102");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("jLabel43");

        buttonGroup40.add(jRadioButton103);
        jRadioButton103.setText("jRadioButton103");

        buttonGroup40.add(jRadioButton104);
        jRadioButton104.setText("jRadioButton104");

        buttonGroup40.add(jRadioButton105);
        jRadioButton105.setText("jRadioButton105");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setText("jLabel44");

        buttonGroup41.add(jRadioButton106);
        jRadioButton106.setText("jRadioButton106");

        buttonGroup41.add(jRadioButton107);
        jRadioButton107.setText("jRadioButton107");

        buttonGroup41.add(jRadioButton108);
        jRadioButton108.setText("jRadioButton108");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("jLabel45");

        buttonGroup42.add(jRadioButton109);
        jRadioButton109.setText("jRadioButton109");

        buttonGroup42.add(jRadioButton110);
        jRadioButton110.setText("jRadioButton110");

        buttonGroup42.add(jRadioButton111);
        jRadioButton111.setText("jRadioButton111");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("jLabel46");

        buttonGroup43.add(jRadioButton112);
        jRadioButton112.setText("jRadioButton112");

        buttonGroup43.add(jRadioButton113);
        jRadioButton113.setText("jRadioButton113");

        buttonGroup43.add(jRadioButton114);
        jRadioButton114.setText("jRadioButton114");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setText("jLabel47");

        buttonGroup44.add(jRadioButton115);
        jRadioButton115.setText("jRadioButton115");

        buttonGroup44.add(jRadioButton116);
        jRadioButton116.setText("jRadioButton116");

        buttonGroup44.add(jRadioButton117);
        jRadioButton117.setText("jRadioButton117");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setText("jLabel48");

        buttonGroup45.add(jRadioButton118);
        jRadioButton118.setText("jRadioButton118");

        buttonGroup45.add(jRadioButton119);
        jRadioButton119.setText("jRadioButton119");

        buttonGroup45.add(jRadioButton120);
        jRadioButton120.setText("jRadioButton120");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setText("jLabel49");

        buttonGroup46.add(jRadioButton121);
        jRadioButton121.setText("jRadioButton121");

        buttonGroup46.add(jRadioButton122);
        jRadioButton122.setText("jRadioButton122");

        buttonGroup46.add(jRadioButton123);
        jRadioButton123.setText("jRadioButton123");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setText("jLabel50");

        buttonGroup47.add(jRadioButton124);
        jRadioButton124.setText("jRadioButton124");
        jRadioButton124.setAutoscrolls(true);

        buttonGroup47.add(jRadioButton125);
        jRadioButton125.setText("jRadioButton125");
        jRadioButton125.setAutoscrolls(true);

        buttonGroup47.add(jRadioButton126);
        jRadioButton126.setText("jRadioButton126");
        jRadioButton126.setAutoscrolls(true);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setText("jLabel51");

        buttonGroup48.add(jRadioButton127);
        jRadioButton127.setText("jRadioButton127");

        buttonGroup48.add(jRadioButton128);
        jRadioButton128.setText("jRadioButton128");

        buttonGroup48.add(jRadioButton129);
        jRadioButton129.setText("jRadioButton129");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setText("jLabel52");

        buttonGroup49.add(jRadioButton130);
        jRadioButton130.setText("jRadioButton130");

        buttonGroup49.add(jRadioButton131);
        jRadioButton131.setText("jRadioButton131");

        buttonGroup49.add(jRadioButton132);
        jRadioButton132.setText("jRadioButton132");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setText("jLabel53");

        buttonGroup50.add(jRadioButton133);
        jRadioButton133.setText("jRadioButton133");

        buttonGroup50.add(jRadioButton134);
        jRadioButton134.setText("jRadioButton134");

        buttonGroup50.add(jRadioButton135);
        jRadioButton135.setText("jRadioButton135");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setText("jLabel54");

        buttonGroup51.add(jRadioButton136);
        jRadioButton136.setText("jRadioButton136");

        buttonGroup51.add(jRadioButton137);
        jRadioButton137.setText("jRadioButton137");

        buttonGroup51.add(jRadioButton138);
        jRadioButton138.setText("jRadioButton138");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel55.setText("jLabel55");

        buttonGroup52.add(jRadioButton139);
        jRadioButton139.setText("jRadioButton139");

        buttonGroup52.add(jRadioButton140);
        jRadioButton140.setText("jRadioButton140");

        buttonGroup52.add(jRadioButton141);
        jRadioButton141.setText("jRadioButton141");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setText("jLabel56");

        buttonGroup53.add(jRadioButton142);
        jRadioButton142.setText("jRadioButton142");

        buttonGroup53.add(jRadioButton143);
        jRadioButton143.setText("jRadioButton143");

        buttonGroup53.add(jRadioButton144);
        jRadioButton144.setText("jRadioButton144");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setText("jLabel57");

        buttonGroup54.add(jRadioButton145);
        jRadioButton145.setText("jRadioButton145");

        buttonGroup54.add(jRadioButton146);
        jRadioButton146.setText("jRadioButton146");

        buttonGroup54.add(jRadioButton147);
        jRadioButton147.setText("jRadioButton147");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel58.setText("jLabel58");

        buttonGroup55.add(jRadioButton148);
        jRadioButton148.setText("jRadioButton148");
        jRadioButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton148ActionPerformed(evt);
            }
        });

        buttonGroup55.add(jRadioButton149);
        jRadioButton149.setText("jRadioButton149");

        buttonGroup55.add(jRadioButton150);
        jRadioButton150.setText("jRadioButton150");

        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel65.setText("00");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel66.setText(":");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel67.setText("00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton91)
                    .addComponent(jLabel39)
                    .addComponent(jRadioButton92)
                    .addComponent(jRadioButton93)
                    .addComponent(jLabel40)
                    .addComponent(jRadioButton94)
                    .addComponent(jRadioButton95)
                    .addComponent(jRadioButton96)
                    .addComponent(jLabel41)
                    .addComponent(jRadioButton97)
                    .addComponent(jRadioButton98)
                    .addComponent(jRadioButton99)
                    .addComponent(jLabel42)
                    .addComponent(jRadioButton100)
                    .addComponent(jRadioButton101)
                    .addComponent(jRadioButton102)
                    .addComponent(jLabel43)
                    .addComponent(jRadioButton103)
                    .addComponent(jRadioButton104)
                    .addComponent(jRadioButton105)
                    .addComponent(jLabel44)
                    .addComponent(jRadioButton106)
                    .addComponent(jRadioButton107)
                    .addComponent(jRadioButton108)
                    .addComponent(jLabel45)
                    .addComponent(jRadioButton109)
                    .addComponent(jRadioButton110)
                    .addComponent(jRadioButton111)
                    .addComponent(jLabel46)
                    .addComponent(jRadioButton112)
                    .addComponent(jRadioButton113)
                    .addComponent(jRadioButton114)
                    .addComponent(jLabel47)
                    .addComponent(jRadioButton115)
                    .addComponent(jRadioButton116)
                    .addComponent(jRadioButton117)
                    .addComponent(jLabel48)
                    .addComponent(jRadioButton118)
                    .addComponent(jRadioButton119)
                    .addComponent(jRadioButton120)
                    .addComponent(jLabel49)
                    .addComponent(jRadioButton121)
                    .addComponent(jRadioButton122)
                    .addComponent(jRadioButton123)
                    .addComponent(jLabel50)
                    .addComponent(jRadioButton124)
                    .addComponent(jRadioButton125)
                    .addComponent(jRadioButton126)
                    .addComponent(jLabel51)
                    .addComponent(jRadioButton127)
                    .addComponent(jRadioButton128)
                    .addComponent(jRadioButton129)
                    .addComponent(jLabel52)
                    .addComponent(jRadioButton130)
                    .addComponent(jRadioButton131)
                    .addComponent(jRadioButton132)
                    .addComponent(jLabel53)
                    .addComponent(jRadioButton133)
                    .addComponent(jRadioButton134)
                    .addComponent(jRadioButton135)
                    .addComponent(jLabel54)
                    .addComponent(jRadioButton136)
                    .addComponent(jRadioButton137)
                    .addComponent(jRadioButton138)
                    .addComponent(jLabel55)
                    .addComponent(jRadioButton139)
                    .addComponent(jRadioButton140)
                    .addComponent(jRadioButton141)
                    .addComponent(jLabel56)
                    .addComponent(jRadioButton142)
                    .addComponent(jRadioButton143)
                    .addComponent(jRadioButton144)
                    .addComponent(jLabel57)
                    .addComponent(jRadioButton145)
                    .addComponent(jRadioButton146)
                    .addComponent(jRadioButton147)
                    .addComponent(jLabel58)
                    .addComponent(jRadioButton150)
                    .addComponent(jRadioButton148)
                    .addComponent(jRadioButton149))
                .addContainerGap(682, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(77, 77, 77)
                .addComponent(jLabel65)
                .addGap(0, 0, 0)
                .addComponent(jLabel66)
                .addGap(0, 0, 0)
                .addComponent(jLabel67)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton93)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton96)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton99)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton102)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton105)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton108)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton111)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton114)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton117)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton120)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton123)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton126)
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton129)
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton132)
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton133)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton135)
                .addGap(18, 18, 18)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton136)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton138)
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton140)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton141)
                .addGap(18, 18, 18)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton143)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton144)
                .addGap(18, 18, 18)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton147)
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton148)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(625, 625, 625))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3930, 820, 3070));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if(get_comm_result()){

        jPanel4.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);

        conclusion con = new conclusion();
        con.setdata( result_sci, result_com, result_arts);
        con.setVisible(true);
        this.dispose();}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//         
//                if (jPanel3.isVisible()) {
//                    jPanel3.setVisible(false);
//                    jPanel2.setVisible(true);
//                    jPanel4.setVisible(false);
//                } else if (jPanel3.isVisible()) {
//                    jPanel3.setVisible(true);
//                    jPanel2.setVisible(false);
//                    jPanel4.setVisible(false);
//                } else {
//                    jPanel3.setVisible(true);
//                    jPanel2.setVisible(false);
//                    jPanel3.setVisible(false);
//                }

       if(get_intrest_sci_result()&&
        get_intrest_com_result()&&
        get_intrest_arts_result()){
           time.stop();
           min=9;
            sec=60;
            flag=true;
            timer(jLabel65,jLabel67);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        
       }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton82ActionPerformed

    private void jRadioButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton148ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton148ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code her

        //                if (jPanel2.isVisible()) {
            //                    jPanel2.setVisible(false);
            //                    jPanel3.setVisible(true);
            //                    jPanel4.setVisible(false);
            //
            //                } else {
            //                    jPanel2.setVisible(true);
            //                    jPanel3.setVisible(false);
            //                    jPanel4.setVisible(false);
            //                }
        //        get_sci_result();
        //        get_com_result();
        //        get_arts_result();
        //
        if(get_sci_result()&& get_com_result() && get_arts_result()){
            time.stop();
            min=9;
            sec=60;
            flag=true;
            timer(jLabel62,jLabel64);
            jPanel2.setVisible(false);
            jPanel3.setVisible(true);
            jPanel4.setVisible(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(aptitudetest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aptitudetest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aptitudetest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aptitudetest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aptitudetest1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup31;
    private javax.swing.ButtonGroup buttonGroup32;
    private javax.swing.ButtonGroup buttonGroup33;
    private javax.swing.ButtonGroup buttonGroup34;
    private javax.swing.ButtonGroup buttonGroup35;
    private javax.swing.ButtonGroup buttonGroup36;
    private javax.swing.ButtonGroup buttonGroup37;
    private javax.swing.ButtonGroup buttonGroup38;
    private javax.swing.ButtonGroup buttonGroup39;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup40;
    private javax.swing.ButtonGroup buttonGroup41;
    private javax.swing.ButtonGroup buttonGroup42;
    private javax.swing.ButtonGroup buttonGroup43;
    private javax.swing.ButtonGroup buttonGroup44;
    private javax.swing.ButtonGroup buttonGroup45;
    private javax.swing.ButtonGroup buttonGroup46;
    private javax.swing.ButtonGroup buttonGroup47;
    private javax.swing.ButtonGroup buttonGroup48;
    private javax.swing.ButtonGroup buttonGroup49;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup50;
    private javax.swing.ButtonGroup buttonGroup51;
    private javax.swing.ButtonGroup buttonGroup52;
    private javax.swing.ButtonGroup buttonGroup53;
    private javax.swing.ButtonGroup buttonGroup54;
    private javax.swing.ButtonGroup buttonGroup55;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton103;
    private javax.swing.JRadioButton jRadioButton104;
    private javax.swing.JRadioButton jRadioButton105;
    private javax.swing.JRadioButton jRadioButton106;
    private javax.swing.JRadioButton jRadioButton107;
    private javax.swing.JRadioButton jRadioButton108;
    private javax.swing.JRadioButton jRadioButton109;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton110;
    private javax.swing.JRadioButton jRadioButton111;
    private javax.swing.JRadioButton jRadioButton112;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton114;
    private javax.swing.JRadioButton jRadioButton115;
    private javax.swing.JRadioButton jRadioButton116;
    private javax.swing.JRadioButton jRadioButton117;
    private javax.swing.JRadioButton jRadioButton118;
    private javax.swing.JRadioButton jRadioButton119;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton120;
    private javax.swing.JRadioButton jRadioButton121;
    private javax.swing.JRadioButton jRadioButton122;
    private javax.swing.JRadioButton jRadioButton123;
    private javax.swing.JRadioButton jRadioButton124;
    private javax.swing.JRadioButton jRadioButton125;
    private javax.swing.JRadioButton jRadioButton126;
    private javax.swing.JRadioButton jRadioButton127;
    private javax.swing.JRadioButton jRadioButton128;
    private javax.swing.JRadioButton jRadioButton129;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton130;
    private javax.swing.JRadioButton jRadioButton131;
    private javax.swing.JRadioButton jRadioButton132;
    private javax.swing.JRadioButton jRadioButton133;
    private javax.swing.JRadioButton jRadioButton134;
    private javax.swing.JRadioButton jRadioButton135;
    private javax.swing.JRadioButton jRadioButton136;
    private javax.swing.JRadioButton jRadioButton137;
    private javax.swing.JRadioButton jRadioButton138;
    private javax.swing.JRadioButton jRadioButton139;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton140;
    private javax.swing.JRadioButton jRadioButton141;
    private javax.swing.JRadioButton jRadioButton142;
    private javax.swing.JRadioButton jRadioButton143;
    private javax.swing.JRadioButton jRadioButton144;
    private javax.swing.JRadioButton jRadioButton145;
    private javax.swing.JRadioButton jRadioButton146;
    private javax.swing.JRadioButton jRadioButton147;
    private javax.swing.JRadioButton jRadioButton148;
    private javax.swing.JRadioButton jRadioButton149;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton150;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
