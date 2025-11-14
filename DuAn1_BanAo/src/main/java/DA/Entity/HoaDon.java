/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA.Entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HoaDon {
    private String maHoaDon;
    private String thanhToan;
    private Date ngayTao;
    private String tenKhachHang;
    private String sdtKhachHang;
    private Double tienBanDau;
    private Double tienSauGiam;
    private Boolean trangThai;
    private String maVoucher;
    private String maKhachHang;
    private String maNhanVien;
   

}
