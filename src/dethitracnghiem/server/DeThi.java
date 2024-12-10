/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethitracnghiem.server;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class DeThi {
    private Integer quizID;
    private String tieuDe;

    public DeThi(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public DeThi() {
    }
    
    public Integer getQuizID() {
        return quizID;
    }

    public void setQuizID(Integer quizID) {
        this.quizID = quizID;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    @Override
    public String toString() {
        return "CauHoi{" + "quizID=" + quizID + ", tieuDe=" + tieuDe + '}';
    }
    
    public int save() {
        DBConnection db = new DBConnection();
        Connection conn = null;
        
        try {
            String insertCauHoi = "INSERT INTO DeThi(MonThi) VALUES (?)";
            conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(insertCauHoi, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, this.tieuDe);
            int i = ps.executeUpdate();
            ResultSet keys = ps.getGeneratedKeys();
            
            if(keys.next()) {
                return keys.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
        
        return -1;
    }
    
    public boolean save(ArrayList cauHoi) {
        boolean flag = false;
        this.quizID = this.save();
        return flag;
    }
}
