package com.poly.model;
// Generated Dec 2, 2019 1:22:06 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LoaiChi generated by hbm2java
 */
@Entity
@Table(name="LoaiChi"
    ,schema="dbo"
    ,catalog="DuAn1"
)
public class LoaiChi  implements java.io.Serializable {


     private int maloaichi;
     private Serializable tenloai;
     private Serializable mota;
     private Set<ChiTietChi> chiTietChis = new HashSet<ChiTietChi>(0);

    public LoaiChi() {
    }

	
    public LoaiChi(int maloaichi, Serializable mota) {
        this.maloaichi = maloaichi;
        this.mota = mota;
    }
    public LoaiChi(int maloaichi, Serializable tenloai, Serializable mota, Set<ChiTietChi> chiTietChis) {
       this.maloaichi = maloaichi;
       this.tenloai = tenloai;
       this.mota = mota;
       this.chiTietChis = chiTietChis;
    }
   
     @Id 

    
    @Column(name="maloaichi", unique=true, nullable=false)
    public int getMaloaichi() {
        return this.maloaichi;
    }
    
    public void setMaloaichi(int maloaichi) {
        this.maloaichi = maloaichi;
    }

    
    @Column(name="tenloai")
    public Serializable getTenloai() {
        return this.tenloai;
    }
    
    public void setTenloai(Serializable tenloai) {
        this.tenloai = tenloai;
    }

    
    @Column(name="mota", nullable=false)
    public Serializable getMota() {
        return this.mota;
    }
    
    public void setMota(Serializable mota) {
        this.mota = mota;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="loaiChi")
    public Set<ChiTietChi> getChiTietChis() {
        return this.chiTietChis;
    }
    
    public void setChiTietChis(Set<ChiTietChi> chiTietChis) {
        this.chiTietChis = chiTietChis;
    }




}


