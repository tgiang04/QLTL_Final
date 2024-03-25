
package qlgv.service;

import java.util.List;
import qlgv.model.MonHoc;


public interface MonHocService {
    public List<MonHoc> getList();
    
    public int createOrUpdateMH(MonHoc monHoc);
    
}
