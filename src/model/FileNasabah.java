/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.oracle.jrockit.jfr.DataType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FileNasabah {
    List<Cicilan> cicilan = new ArrayList<>();
    public static List<Nasabah> getDataNasabah(String filename) throws FileNotFoundException, IOException {
        List<Nasabah> nasabah = new ArrayList<>();
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        while((line = reader.readLine())!=null){
            System.out.println(line);
            String array[] = line.split(",");
            Nasabah nsb = new Nasabah(array[0], Integer.parseInt(array[1].trim()), array[2], array[3]);
            Integer jumlahTanggungan = Integer.parseInt(array[4].trim());
            Cicilan cicil = new Cicilan(jumlahTanggungan, 0.0, 0.0, 0.0, line, 0.0, 0.0, 0.0, 0);
            
            nasabah.add(nsb);
            
            
        }
        return nasabah;
    }

}
