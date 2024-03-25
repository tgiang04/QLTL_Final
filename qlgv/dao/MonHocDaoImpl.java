
package qlgv.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import qlgv.model.MonHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MonHocDaoImpl implements MonHocDAO  {

    @Override
    public List<MonHoc> getList() {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "SELECT * FROM `monhoc`";
            List <MonHoc> list  = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MonHoc monHoc = new MonHoc();
                monHoc.setMa_mon(rs.getString("ma_mon"));
                monHoc.setTen_mon(rs.getString("ten_mon"));
                monHoc.setTong_so_tiet(rs.getString("tong_so_tiet"));
                monHoc.setKinh_phi(rs.getString("kinh_phi"));
                
                
                list.add(monHoc); 
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    return null;
    }
    
    @Override
    public int createOrUpdateMH(MonHoc monHoc) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO monhoc(ma_mon, ten_mon, tong_so_tiet, kinh_phi) VALUES(?, ?, ?, ?) ON DUPLICATE KEY UPDATE ma_mon = VALUES(ma_mon), ten_mon = VALUES(ten_mon), tong_so_tiet = VALUES(tong_so_tiet), kinh_phi = VALUES(kinh_phi);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,monHoc.getMa_mon());
            ps.setString(2, monHoc.getTen_mon());
            ps.setString(3, monHoc.getTong_so_tiet());
            ps.setString(4, monHoc.getKinh_phi());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
    public static void main(String[] args){
        MonHocDAO monHocDAO = new MonHocDaoImpl();
        System.out.println(monHocDAO.getList());
    }
    
    
}
