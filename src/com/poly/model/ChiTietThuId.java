package com.poly.model;
// Generated Dec 7, 2019 5:52:52 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ChiTietThuId generated by hbm2java
 */
@Embeddable
public class ChiTietThuId  implements java.io.Serializable {


     private int mahdthu;
     private int loaithu;

    public ChiTietThuId() {
    }

    public ChiTietThuId(int mahdthu, int loaithu) {
       this.mahdthu = mahdthu;
       this.loaithu = loaithu;
    }
   


    @Column(name="mahdthu", nullable=false)
    public int getMahdthu() {
        return this.mahdthu;
    }
    
    public void setMahdthu(int mahdthu) {
        this.mahdthu = mahdthu;
    }


    @Column(name="loaithu", nullable=false)
    public int getLoaithu() {
        return this.loaithu;
    }
    
    public void setLoaithu(int loaithu) {
        this.loaithu = loaithu;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ChiTietThuId) ) return false;
		 ChiTietThuId castOther = ( ChiTietThuId ) other; 
         
		 return (this.getMahdthu()==castOther.getMahdthu())
 && (this.getLoaithu()==castOther.getLoaithu());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMahdthu();
         result = 37 * result + this.getLoaithu();
         return result;
   }   


}


