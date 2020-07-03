package com.poly.model;
// Generated Dec 7, 2019 5:52:52 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NguoiDung generated by hbm2java
 */
@Entity
@Table(name="NguoiDung"
    ,schema="dbo"
    ,catalog="DuAn1"
)
public class NguoiDung  implements java.io.Serializable {


     private String username;
     private Boolean gioitinh;
     private String hoten;
     private Date ngaysinh;
     private String password;
     private String sodienthoai;
     private Boolean vaitro;
     private String hinh;
     private Set<HoaDonChi> hoaDonChis = new HashSet<HoaDonChi>(0);
     private Set<HoaDonThu> hoaDonThus = new HashSet<HoaDonThu>(0);

    public NguoiDung() {
    }

	
    public NguoiDung(String username) {
        this.username = username;
    }
    public NguoiDung(String username, Boolean gioitinh, String hoten, Date ngaysinh, String password, String sodienthoai, Boolean vaitro, String hinh, Set<HoaDonChi> hoaDonChis, Set<HoaDonThu> hoaDonThus) {
       this.username = username;
       this.gioitinh = gioitinh;
       this.hoten = hoten;
       this.ngaysinh = ngaysinh;
       this.password = password;
       this.sodienthoai = sodienthoai;
       this.vaitro = vaitro;
       this.hinh = hinh;
       this.hoaDonChis = hoaDonChis;
       this.hoaDonThus = hoaDonThus;
    }
   
     @Id 

    
    @Column(name="username", unique=true, nullable=false, length=10)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="gioitinh")
    public Boolean getGioitinh() {
        return this.gioitinh;
    }
    
    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    
    @Column(name="hoten", length=50)
    public String getHoten() {
        return this.hoten;
    }
    
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ngaysinh", length=23)
    public Date getNgaysinh() {
        return this.ngaysinh;
    }
    
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    
    @Column(name="password", length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="sodienthoai", length=10)
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    
    @Column(name="vaitro")
    public Boolean getVaitro() {
        return this.vaitro;
    }
    
    public void setVaitro(Boolean vaitro) {
        this.vaitro = vaitro;
    }

    
    @Column(name="hinh", length=100)
    public String getHinh() {
        return this.hinh;
    }
    
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nguoiDung")
    public Set<HoaDonChi> getHoaDonChis() {
        return this.hoaDonChis;
    }
    
    public void setHoaDonChis(Set<HoaDonChi> hoaDonChis) {
        this.hoaDonChis = hoaDonChis;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nguoiDung")
    public Set<HoaDonThu> getHoaDonThus() {
        return this.hoaDonThus;
    }
    
    public void setHoaDonThus(Set<HoaDonThu> hoaDonThus) {
        this.hoaDonThus = hoaDonThus;
    }




}

