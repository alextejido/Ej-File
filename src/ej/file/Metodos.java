/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author atejidosolla
 */
public class Metodos {
     File arquivosdir = new File("/home/local/DANIELCASTELAO/atejidosolla/NetBeansProjects/arquivos/arquivosdir");
     File fichero = new File("/home/local/DANIELCASTELAO/atejidosolla/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
     File subdir = new File("/home/local/DANIELCASTELAO/atejidosolla/NetBeansProjects/arquivos/arquivosdir/subdir");
     File fichero2 = new File("/home/local/DANIELCASTELAO/atejidosolla/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");
    
     public void CreaDirec(){
      if(arquivosdir.exists()) {
        System.out.println("Error, esta carpeta o directorio ya existe");
} else {
    arquivosdir.mkdirs();
    }
    }
       
    public void CreaFich() throws IOException{
        if(fichero.exists()) {
        System.out.println("Error, este fichero ya existe");
} else {
    fichero.createNewFile();
    }
    }
    
    public void Comprobar(){
        if (arquivosdir.isDirectory()) {
            System.out.println("Directorio existente");   
        }
        if (fichero.isFile()) {
            System.out.println("Fichero existente");
        }
    }
    
        public void CreaDirec2(){
      if(subdir.exists()) {
        System.out.println("Error, esta carpeta o directorio ya existe");
} else {
    subdir.mkdirs();
    }
    }
       
    public void CreaFich2() throws IOException{
        if(fichero2.exists()) {
        System.out.println("Error, este fichero ya existe");
} else {
    fichero2.createNewFile();
    }
    }
    
    public void Mostrar(){
        
        
    arquivosdir.getName();
    arquivosdir.getPath();
    }
    
    
    
}
