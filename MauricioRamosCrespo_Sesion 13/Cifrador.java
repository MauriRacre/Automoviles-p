import java.util.*;
/**
 * Write a description of class Cifrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cifrador
{
    String mensaje,clave;
    char[][] mat;
    public Cifrador(String mensaje,String clave){
        mat=new char[5][5];
        this.mensaje=mensaje;
        this.clave=clave;
        llenarMatriz(); 
    }
    public String getMensaje(){
        return mensaje;
    }
    public String cifrar(){
        String res="";
        for(int i=0; i<mensaje.length();i++){
            char m =mensaje.charAt(i);
            if(m=='J'){
                m='I';
                if(m==' '){
                    res=res+" ";
                }else{
                    for(int j=0; j<5; j++){
                        for(int k=0;k<5;k++){
                            if(mat[j][k]==m){
                                res=res+clave.charAt(j)+clave.charAt(k);
                            }
                        }
                    }
                }
            }
            return res;
        }
        return res;
    }
    private void llenarMatriz(){
        char ini='A';
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(ini=='I'){
                    ini++;
                }
                mat[i][j]=ini;
                ini++;
            }
        }
    }
}
