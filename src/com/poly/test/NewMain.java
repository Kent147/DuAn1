/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.test;

import com.poly.dao.ThongKeDAO;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author THANHLONG
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThongKeDAO thongKeDAO = new ThongKeDAO();
        System.out.println(thongKeDAO.sp_getTotalChi(0, 12, 2019));
    }

}
