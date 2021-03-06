/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import Conversores.Numeros;
import ObjetosBackUp.BackUp;
import ObjetosBackUp.Backapear;
import interfaces.Transaccionable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.ConeccionInstalacion;
import objetos.ConeccionLocal;

/**
 *
 * @author mauro
 */
public class Propiedades {
    static String SERVER;
    static String BD;
    static String USUARIO;
    static String CLAVE;
    static String CREADA;
    static String ARCHIVOBK;
    static String NOMBRECOMERCIO;
    static String LOGO;
    static String IMAGEN;
    static String CORREOCIERREDECAJA;
    static String CORREOCC;
    static String CORREOCCC;
    static String VERIF;
    static String VALOR;
    static String ID;
    static String DIRECCION;
    static String TELEFONO;
    static String BK;
    static String ELECTRONICA;
    static String FISCAL;
    static String ACCESOS;
    static String KEY;
    static String CUIT;
    static String INGBRUTOS;
    static String INICIOACT;
    static String PTO;
    static String CONDICION;
    static String SKEY;
    static String DEPOSITO;
    static String PUERTOIMPRESORA;
    static String CORREOSALIENTE;
    static String PASS;
    static String DUMP;

    public static String getDUMP() {
        return DUMP;
    }
    

    public static String getCORREOSALIENTE() {
        return CORREOSALIENTE;
    }

    public static String getPASS() {
        return PASS;
    }
    

    public static String getPUERTOIMPRESORA() {
        return PUERTOIMPRESORA;
    }

    public static void setPUERTOIMPRESORA(String PUERTOIMPRESORA) {
        Propiedades.PUERTOIMPRESORA = PUERTOIMPRESORA;
    }
    

    public static String getSERVER() {
        return SERVER;
    }

    public static void setSERVER(String SERVER) {
        Propiedades.SERVER = SERVER;
    }

    public static String getBD() {
        return BD;
    }

    public static void setBD(String BD) {
        Propiedades.BD = BD;
    }

    public static String getUSUARIO() {
        return USUARIO;
    }

    public static void setUSUARIO(String USUARIO) {
        Propiedades.USUARIO = USUARIO;
    }

    public static String getCLAVE() {
        return CLAVE;
    }

    public static void setCLAVE(String CLAVE) {
        Propiedades.CLAVE = CLAVE;
    }

    public static String getCREADA() {
        return CREADA;
    }

    public static void setCREADA(String CREADA) {
        Propiedades.CREADA = CREADA;
    }

    public static String getARCHIVOBK() {
        return ARCHIVOBK;
    }

    public static void setARCHIVOBK(String ARCHIVOBK) {
        Propiedades.ARCHIVOBK = ARCHIVOBK;
    }

    public static String getNOMBRECOMERCIO() {
        return NOMBRECOMERCIO;
    }

    public static void setNOMBRECOMERCIO(String NOMBRECOMERCIO) {
        Propiedades.NOMBRECOMERCIO = NOMBRECOMERCIO;
    }

    public static String getLOGO() {
        return LOGO;
    }

    public static void setLOGO(String LOGO) {
        Propiedades.LOGO = LOGO;
    }

    public static String getIMAGEN() {
        return IMAGEN;
    }

    public static void setIMAGEN(String IMAGEN) {
        Propiedades.IMAGEN = IMAGEN;
    }

    public static String getCORREOCIERREDECAJA() {
        return CORREOCIERREDECAJA;
    }

    public static void setCORREOCIERREDECAJA(String CORREOCIERREDECAJA) {
        Propiedades.CORREOCIERREDECAJA = CORREOCIERREDECAJA;
    }

    public static String getCORREOCC() {
        return CORREOCC;
    }

    public static void setCORREOCC(String CORREOCC) {
        Propiedades.CORREOCC = CORREOCC;
    }

    public static String getCORREOCCC() {
        return CORREOCCC;
    }

    public static void setCORREOCCC(String CORREOCCC) {
        Propiedades.CORREOCCC = CORREOCCC;
    }

    public static String getVERIF() {
        return VERIF;
    }

    public static void setVERIF(String VERIF) {
        Propiedades.VERIF = VERIF;
    }

    public static String getVALOR() {
        return VALOR;
    }

    public static void setVALOR(String VALOR) {
        Propiedades.VALOR = VALOR;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        Propiedades.ID = ID;
    }

    public static String getDIRECCION() {
        return DIRECCION;
    }

    public static void setDIRECCION(String DIRECCION) {
        Propiedades.DIRECCION = DIRECCION;
    }

    public static String getTELEFONO() {
        return TELEFONO;
    }

    public static void setTELEFONO(String TELEFONO) {
        Propiedades.TELEFONO = TELEFONO;
    }

    public static String getBK() {
        return BK;
    }

    public static void setBK(String BK) {
        Propiedades.BK = BK;
    }

    public static String getELECTRONICA() {
        return ELECTRONICA;
    }

    public static void setELECTRONICA(String ELECTRONICA) {
        Propiedades.ELECTRONICA = ELECTRONICA;
    }

    public static String getFISCAL() {
        return FISCAL;
    }

    public static void setFISCAL(String FISCAL) {
        Propiedades.FISCAL = FISCAL;
    }

    public static String getACCESOS() {
        return ACCESOS;
    }

    public static void setACCESOS(String ACCESOS) {
        Propiedades.ACCESOS = ACCESOS;
    }

    public static String getKEY() {
        return KEY;
    }

    public static void setKEY(String KEY) {
        Propiedades.KEY = KEY;
    }

    public static String getCUIT() {
        return CUIT;
    }

    public static void setCUIT(String CUIT) {
        Propiedades.CUIT = CUIT;
    }

    public static String getINGBRUTOS() {
        return INGBRUTOS;
    }

    public static void setINGBRUTOS(String INGBRUTOS) {
        Propiedades.INGBRUTOS = INGBRUTOS;
    }

    public static String getINICIOACT() {
        return INICIOACT;
    }

    public static void setINICIOACT(String INICIOACT) {
        Propiedades.INICIOACT = INICIOACT;
    }

    public static String getPTO() {
        return PTO;
    }

    public static void setPTO(String PTO) {
        Propiedades.PTO = PTO;
    }

    public static String getCONDICION() {
        return CONDICION;
    }

    public static void setCONDICION(String CONDICION) {
        Propiedades.CONDICION = CONDICION;
    }

    public static String getSKEY() {
        return SKEY;
    }

    public static void setSKEY(String SKEY) {
        Propiedades.SKEY = SKEY;
    }

    public static String getDEPOSITO() {
        return DEPOSITO;
    }

    public static void setDEPOSITO(String DEPOSITO) {
        Propiedades.DEPOSITO = DEPOSITO;
    }
    
    
    
    public static void CargarPropiedades() throws FileNotFoundException, IOException{
        File archivo = new File ("Configuracion\\bbsGestion.properties");
        Properties p=new Properties();
         if(archivo.exists()){
            try {
                //Process px=Runtime.getRuntime().exec("c:/xampp/xampp_start.exe");
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        int verificado=0;
        
            p.load(new FileReader(archivo));
            Enumeration<Object> keys = p.keys();

            while (keys.hasMoreElements()){
               Object key = keys.nextElement();
               System.out.println(key + " = "+ p.get(key));
            }   
         
            
         //FileReader fr = null;
            
                //fr = new FileReader (archivo);
                //BufferedReader br = new BufferedReader(fr);
                // Lectura del fichero
                String linea;
                int renglon=0;
                //Transaccionable tra=new Conecciones();
                //while((linea=br.readLine())!=null){
                    
                    
                    
                            CREADA=p.getProperty("CREADA");
                            SERVER=p.getProperty("SERVER");
                            BD=p.getProperty("BD");
                            USUARIO=p.getProperty("USUARIO");
                            CLAVE=p.getProperty("CLAVE");
                        
                            ARCHIVOBK=p.getProperty("ARCHIVOBK");
                        
                            NOMBRECOMERCIO=p.getProperty("NOMBRECOMERCIO");
                            DEPOSITO=p.getProperty("DEPOSITO");
                            LOGO=p.getProperty("LOGO");
                        
                            IMAGEN=p.getProperty("IMAGEN");
                        
                            VERIF=p.getProperty("VERIF");
                       
                            CORREOCIERREDECAJA=p.getProperty("MAIL");
                        
                            VALOR=p.getProperty("VALOR");
                        
                            ID=p.getProperty("ID");
                        
                            CORREOCC=p.getProperty("MAILCC");
                            
                            CORREOCCC=p.getProperty("MAILCCO");
                            
                            DIRECCION=p.getProperty("DIRECCION");
                            
                            TELEFONO=p.getProperty("TELEFONO");
                        
                            BK=p.getProperty("BK");
                            FISCAL=p.getProperty("FISCAL");
                            ELECTRONICA=p.getProperty("ELECTRONICA");
                            KEY=p.getProperty("KEY");
                            
                            CUIT=p.getProperty("CUIT");
                            INGBRUTOS=p.getProperty("INGBRUTOS");
                            INICIOACT=p.getProperty("INICIOACT");
                            PTO=p.getProperty("PTO");
                            CONDICION=p.getProperty("CONDICION");
                            SKEY=p.getProperty("SKEY");
                            PUERTOIMPRESORA=p.getProperty("PUERTOIMPRESORA");
                            CORREOSALIENTE="bambusuite@bambusoft.com.ar";
                            PASS="bambuSoft001";
                            DUMP=p.getProperty("DUMP");
                        
                    
                    //System.out.println(renglon+" // "+linea);
                    // if(tra.guardarRegistro(linea));
                   
                
                    
                    
                    //JOptionPane.showMessageDialog(null,"NO SE HA PODIDO ESTABLECER CONEXION CON INTERNET, POR FAVOR VERIFIQUE DICHA CONEXION");
                            
                            Date fecha=Numeros.ConvertirStringEnDate(VERIF);
                            DecimalFormat fr1=new DecimalFormat("00");
                            Calendar c1=Calendar.getInstance();
                            Calendar c2=new GregorianCalendar();
                            String dia=Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
                            String mes=Integer.toString(c2.get(Calendar.MONTH));
                            String ano=Integer.toString(c2.get(Calendar.YEAR));

                            int da=Integer.parseInt(dia);
                            int me=Integer.parseInt(mes);
                            me++;
                            dia=fr1.format(da);
                            mes=fr1.format(me);
                            String fechaDia=ano+"-"+mes+"-"+dia;
                            //System.err.println(fechaDia);
                            //fecha="23/12/2011";
                            String fh=ano+"-"+mes+"-"+dia;
                            SimpleDateFormat ff=new SimpleDateFormat("yyyy-MM-dd");
                            Date fechaVal = null;    

                                fechaVal = Numeros.ConvertirStringEnDate(fh);
                                //fechaVal = ff.parse(fh);

/*
                           if(fechaVal.after(fecha)){
            System.exit(0);
        }else{
            //System.exit(0);
        }
         */                   //if(CREADA.equals("0")){

                                            //Transaccionable tra=new ConeccionInstalacion();


                              //          }
            
            
         
        }
        //BD="siglox";
        
        
        
    }
    private void CrearBase(){
        Boolean veridi=false;
        Transaccionable tra=new ConeccionInstalacion();
        tra.guardarRegistro("create database "+BD);
        
        //return veridi;
    }
}
