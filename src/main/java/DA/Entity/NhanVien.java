/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
/**
 *
 * @author THE KIEN
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private int Sdt;
    private Boolean gioiTinh;
    private String email;
    private String diaChi;
    private String tenDangNhap;
    private String matKhau;
    private String maChucVu;
    private boolean trangThai;
     @Override
    public String toString() {
        return tenNhanVien;
    }
}
