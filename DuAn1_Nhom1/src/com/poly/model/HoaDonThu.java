package com.poly.model;
// Generated Dec 2, 2019 1:22:06 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HoaDonThu generated by hbm2java
 */
@Entity
@Table(name="HoaDonThu"
    ,schema="dbo"
    ,catalog="DuAn1"
)
public class HoaDonThu  implements java.io.Serializable {


     private int idhdthu;
     private NguoiDung nguoiDung;
     private Date ngaythu;
     private Set<ChiTietThu> chiTietThus = new HashSet<ChiTietThu>(0);

    public HoaDonThu() {
    }

	
    public HoaDonThu(int idhdthu, Date ngaythu) {
        this.idhdthu = idhdthu;
        this.ngaythu = ngaythu;
    }
    public HoaDonThu(int idhdthu, NguoiDung nguoiDung, Date ngaythu, Set<ChiTietThu> chiTietThus) {
       this.idhdthu = idhdthu;
       this.nguoiDung = nguoiDung;
       this.ngaythu = ngaythu;
       this.chiTietThus = chiTietThus;
    }
   
     @Id 

    
    @Column(name="idhdthu", unique=true, nullable=false)
    public int getIdhdthu() {
        return this.idhdthu;
    }
    
    public void setIdhdthu(int idhdthu) {
        this.idhdthu = idhdthu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="username")
    public NguoiDung getNguoiDung() {
        return this.nguoiDung;
    }
    
    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ngaythu", nullable=false, length=10)
    public Date getNgaythu() {
        return this.ngaythu;
    }
    
    public void setNgaythu(Date ngaythu) {
        this.ngaythu = ngaythu;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="hoaDonThu")
    public Set<ChiTietThu> getChiTietThus() {
        return this.chiTietThus;
    }
    
    public void setChiTietThus(Set<ChiTietThu> chiTietThus) {
        this.chiTietThus = chiTietThus;
    }




}


