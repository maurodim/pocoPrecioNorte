package Impresiones;

import Configuracion.Propiedades;
import java.io.*;

/**
* Class declaration
*
*
* @author
* @version 1.10, 08/04/00
*/
public class impresoraEpson {
//Variables de  acceso   al dispositivo
private FileWriter fw;
private BufferedWriter bw;
private PrintWriter pw;
private String dispositivo="";
/** Esta funcion inicia el  dispositivo donde se va a imprimir */
public  void setDispositivo( String texto ) {
dispositivo=texto;
if(texto.trim().length()<=0){//Si el    dispositivo viene en  blanco el  sistema tratara de definirlo
dispositivo=Propiedades.getPUERTOIMPRESORA();//;//Esto si  es windows

}
try{
fw = new FileWriter(dispositivo);
bw = new BufferedWriter (fw);
pw = new PrintWriter (bw);
}catch(Exception e){
System.out.print(e);
}
}
public  void escribir( String texto ) {
try{
pw.println(texto);
}catch(Exception e){
System.out.print(e);
}
}
public  void cortar( ) {
try{
char[] ESC_CUT_PAPER = new char[] { 0x1B, 'm'};
if(!this.dispositivo.trim().equals("pantalla.txt")){
pw.write(ESC_CUT_PAPER);
}
}catch(Exception e){
System.out.print(e);
}
}
public  void avanza_pagina( ) {
try{
if(!this.dispositivo.trim().equals("pantalla.txt")){
pw.write(0x0C);
}
}catch(Exception e){
System.out.print(e);
}
}
public  void setRojo( ) {
try{
char[] ESC_CUT_PAPER = new char[] { 0x1B, 'r',1};
if(!this.dispositivo.trim().equals("pantalla.txt")){
pw.write(ESC_CUT_PAPER);
}
}catch(Exception e){
System.out.print(e);
}
}
public  void setNegro( ) {
try{
char[] ESC_CUT_PAPER = new char[] { 0x1B, 'r',0};
if(!this.dispositivo.trim().equals("pantalla.txt")){
pw.write(ESC_CUT_PAPER);
}
}catch(Exception e){
System.out.print(e);
}
}
public  void setTipoCaracterLatino( ) {
try{
char[] ESC_CUT_PAPER = new char[] { 0x1B, 'R',18};
if(!this.dispositivo.trim().equals("pantalla.txt")){
pw.write(ESC_CUT_PAPER);
}
}catch(Exception e){
System.out.print(e);
}
}
public  void setFormato(int formato ) {
try{
char[] ESC_CUT_PAPER = new char[] { 0x1B, '!',(char)formato};
if(!this.dispositivo.trim().equals("pantalla.txt")){
pw.write(ESC_CUT_PAPER);
}
}catch(Exception e){
System.out.print(e);
}
}
public  void correr(int fin){
try{
int i=0;
for(i=1;i<=fin;i++){
this.salto();
}
}catch(Exception e){
System.out.print(e);
}
}
public  void salto() {
try{
pw.println("");
}catch(Exception e){
System.out.print(e);
}
}
public void dividir(){
escribir("—————————————-");
}
public  void cerrarDispositivo(  ){
try{
pw.close();
if(this.dispositivo.trim().equals("pantalla.txt")){
java.io.File archivo=new java.io.File("pantalla.txt");
java.awt.Desktop.getDesktop().open(archivo);
}
}catch(Exception e){
System.out.print(e);
}
}
public static void main(String args[]) {
impresoraEpson p=new impresoraEpson();
p.setDispositivo("COM1");
p.escribir((char)27+"m");
p.setTipoCaracterLatino();
p.setRojo();
p.escribir("Esto es una prueba");
p.setNegro();
p.escribir("esto es negro"+(char)130);
p.setFormato(24);
p.escribir("esto es negro con formato");
p.setFormato(1);
p.escribir("esto es negro con formato");
p.correr(10);
p.cortar();
p.cerrarDispositivo();
}
}