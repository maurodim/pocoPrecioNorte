/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

import interfaceGraficas.Inicio;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauro
 */
public class Numeros {
    private static String doble;
    private static String flotante;
    private static String fecha;
    
    public static String ConvertirNumero(Double num){
        DecimalFormat formato=new DecimalFormat("####.#");
        doble=formato.format(num);
        return doble;
    }
    public static String ConvetirNumeroCuatroDigitos(Double num){
        DecimalFormat formato=new DecimalFormat("####.####");
        doble=formato.format(num);
        return doble;
    }
    public static String ConvetirNumeroDosDigitos(Double num){
        DecimalFormat formato=new DecimalFormat("####.00");
        doble=formato.format(num);
        return doble;
    }
    public static String ConvertirFecha(Date ff){
        DecimalFormat fr=new DecimalFormat("00");
        Calendar c1=Calendar.getInstance();
	Calendar c2=new GregorianCalendar();
	String dia=Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
	String mes=Integer.toString(c2.get(Calendar.MONTH));
	String ano=Integer.toString(c2.get(Calendar.YEAR));
	
        int da=Integer.parseInt(dia);
        int me=Integer.parseInt(mes);
        me++;
        dia=fr.format(da);
        mes=fr.format(me);
        fecha=ano+"-"+mes+"-"+dia;
        
        return fecha;
    }
    public static String ConvertirFechaFiscal(){
        DecimalFormat fr=new DecimalFormat("00");
        Calendar c1=Calendar.getInstance();
	Calendar c2=new GregorianCalendar();
	String dia=Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
	String mes=Integer.toString(c2.get(Calendar.MONTH));
	String ano=Integer.toString(c2.get(Calendar.YEAR));
	
        int da=Integer.parseInt(dia);
        int me=Integer.parseInt(mes);
        me++;
        dia=fr.format(da);
        mes=fr.format(me);
        fecha=ano+mes+dia;
        
        return fecha;
    }
    public static String ConvertirFechaLeidaDeDateChooser(Calendar dateC){
        DecimalFormat fr=new DecimalFormat("00");
        DecimalFormat formato=new DecimalFormat("####.####");
        //SiderconCapaatos.listaPedidos.clear();
        SimpleDateFormat dia=new SimpleDateFormat("dd/mm/yyyy");
        //Date mes=Calendar.getInstance().getTime();
        //dateChooserCombo1.setDateFormat(dia);
        Calendar fechaNueva=dateC;
        int ano=fechaNueva.get(Calendar.YEAR);
        int mes=fechaNueva.get(Calendar.MONTH);
        mes++;
        int dd=fechaNueva.get(Calendar.DAY_OF_MONTH);
        String fecha1=ano+"-"+mes+"-"+dd;
        return fecha1;
    }
    public static Date ConvertirStringEnDate(String ff){
        SimpleDateFormat fh=new SimpleDateFormat("yyyy-mm-dd");
        Date fechaVal = null;    
        try {
            fechaVal = fh.parse(ff);
        } catch (ParseException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaVal;
    }
    public static Double ConvertirStringADouble(String num){
        if(num.equals("")){
            num="0.00";
        }
        num=num.replace(",",".");
        System.out.println(" rsultado "+num);
        Double dd=Double.parseDouble(num);
        return dd;
    }
    
    public static Integer ConvertirStringAInteger(String num){
        num=num.replace(".0","");
        //System.out.println(" rsultado "+num);
        Integer dd=Integer.parseInt(num);
        return dd;
    }
    public static String ConvertirNumeroExcell(Double num){
        DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
        simbolo.setDecimalSeparator(',');
        DecimalFormat formato=new DecimalFormat("####.#",simbolo);
        doble=formato.format(num);
        return doble;
    }
    public static String InsertarTextoEnFormato(int cantidad,String texto){
        String resultado="";
        int tamam=texto.length();
        String[] listado=texto.split("");
         for(int a=0;a < cantidad;a++){
              if(a < tamam){  
                resultado+=listado[a];
              }else{
                  resultado+=" ";
              }
            }
        return resultado;
    }
    public static String InsertarTextoEnFormatoInverso(int cantidad,String texto){
        String resultado="";
        int tamam=texto.length();
        int b=0;
        String[] listado=texto.split("");
         for(int a=cantidad;a > 0;a--){
              if(a < tamam){
                  
                resultado+=listado[b];
                b++;
              }else{
                  resultado+=" ";
              }
            }
        return resultado;
    }
}
