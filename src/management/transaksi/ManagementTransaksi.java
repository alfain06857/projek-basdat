/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.transaksi;

import database.Koneksi;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.TransaksiView;

/**
 *
 * @author HP
 */
public class ManagementTransaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ParseException{
        
            new TransaksiView().show();
    }
}
    

