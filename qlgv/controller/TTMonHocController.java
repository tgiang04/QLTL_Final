package qlgv.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import qlgv.model.MonHoc;
import qlgv.service.MonHocService;
import qlgv.service.MonHocServiceImpl;

public class TTMonHocController {
    
    private final JButton btnSubmitMH;
    private final JTextField jtfMaMon;
    private final JTextField jtfTenMon;
    private final JTextField jtfTongSoTiet;
    private final JTextField jtfKinhPhi;
    private MonHoc monHoc = null;
    private JLabel jlbMsg;
    
    private MonHocService monHocService = null;

    public TTMonHocController(JButton btnSubmitMH, JTextField jtfMaMon, JTextField jtfTenMon, JTextField jtfTongSoTiet, JTextField jtfKinhPhi, JLabel jlbMsg) {
        this.btnSubmitMH = btnSubmitMH;
        this.jtfMaMon = jtfMaMon;
        this.jtfTenMon = jtfTenMon;
        this.jtfTongSoTiet = jtfTongSoTiet;
        this.jtfKinhPhi = jtfKinhPhi;
        this.jlbMsg = jlbMsg;
        
        this.monHocService = new MonHocServiceImpl();
    }
    


    
    public void setViewMH(MonHoc monHoc){
        this.monHoc = monHoc;
        jtfMaMon.setText(monHoc.getMa_mon());
        jtfTenMon.setText(monHoc.getTen_mon());
        jtfTongSoTiet.setText(String.valueOf(monHoc.getTong_so_tiet()));
        jtfKinhPhi.setText(String.valueOf(monHoc.getKinh_phi()));
        
    }
    
    public void setEventMH(){
        btnSubmitMH.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jtfTenMon.getText().length() == 0 || jtfMaMon.getText().length() == 0 || jtfTongSoTiet.getText().length() == 0 || jtfKinhPhi.getText().length() == 0 ){
                    jlbMsg.setText("Vui lòng nhập đủ dữ liệu");
                } else {
                    monHoc.setTen_mon(jtfTenMon.getText());
                    monHoc.setMa_mon(jtfMaMon.getText());
                    monHoc.setTong_so_tiet(jtfTongSoTiet.getText());
                    monHoc.setKinh_phi(jtfKinhPhi.getText());
                    monHocService.createOrUpdateMH(monHoc);
                    jlbMsg.setText("Xử lý cập nhật dữ liệu thành công!");
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmitMH.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmitMH.setBackground(new Color(0, 200, 83));
            }
            
            
        });
        
    }
    
    
    
}
