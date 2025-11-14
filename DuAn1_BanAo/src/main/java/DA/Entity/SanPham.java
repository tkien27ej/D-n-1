/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA.Entity;

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
public class SanPham {
   
    private String ma;
    private String ten;
    private String maChatLieu;
    private String maCoAo;
    private String maTayAO;
    private int trangThai;
    
}
