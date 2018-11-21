package Gestores;

import Entidades.Licencia;
import Pantallas.EmitirLicencia;
import java.io.File;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import static javassist.CtMethod.ConstParameter.string;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Permite gestionar todos los aspectos que tengan que ver con las licencias.
 * @author Nico y Mati
 */
public class GestorLicencias {
        /*
	Menores de 21 años: 1 año la primera vez y 3 años las siguientes.
-        Hasta 46 años: 5 años
-        Hasta 60 años: 4 años
-        Hasta 70 años: 3 años
-        Mayores de 70 años: 1 año
	*/
    
    //private static Map<Character, Vector> mapaCostos = new HashMap<Character, Vector>();
    
    public GestorLicencias () {
        /*Vector costoA = new Vector();
        Vector costoB = new Vector();
        Vector costoC = new Vector();
        Vector costoE = new Vector();
        Vector costoG = new Vector();
        
        costoA.add(40);
        costoA.add(30);
        costoA.add(25);
        costoA.add(20);
        
        costoB.add(40);
        costoB.add(30);
        costoB.add(25);
        costoB.add(20);
        
        costoC.add(47);
        costoC.add(35);
        costoC.add(30);
        costoC.add(23);
        
        costoE.add(59);
        costoE.add(44);
        costoE.add(39);
        costoE.add(29);
        
        costoG.add(40);
        costoG.add(30);
        costoG.add(25);
        costoG.add(20);
        
        mapaCostos.put('A', costoA);
        mapaCostos.put('B', costoB); 
        mapaCostos.put('C', costoC); 
        mapaCostos.put('E', costoE); 
        mapaCostos.put('G', costoG); */
    }
    /***
     * abre una nueva ventana en la que se puede visualizar y descarga la licencia. el datasource debe ser una lista en la que se 
     * @param datasource 
     */
    public static void imprimirLicencia(Licencia nuevaLicencia){
        
        String imagenClose = new File(".").getAbsolutePath().replace(".", "") + "src\\Resource\\";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List <Map<String,String>> datasource = new ArrayList<Map<String,String>>();
        Map <String, String> row = new HashMap<String, String>();
        row.put("id_licencia", nuevaLicencia.getIdLicencia().toString());
        row.put("nombre", nuevaLicencia.getTitular().getNombre());
        row.put("apellido", nuevaLicencia.getTitular().getApellido());
        row.put("domicilio", nuevaLicencia.getTitular().getDomicilio());
        row.put("fecha_nac", formato.format(nuevaLicencia.getTitular().getFechaNac()));
        row.put("fecha_registro", formato.format(nuevaLicencia.getFechaRegistro()));
        row.put("fecha_venc", formato.format(nuevaLicencia.getFechaVenc()));
        row.put("clase", nuevaLicencia.getClase());
        row.put("costo", calculcarCostoLicencia(nuevaLicencia).toString());
        datasource.add(row);
        Map parametros = new HashMap<String,Object>();
        parametros.put("imagen", imagenClose + "Ejemplo_Licencia_Conducir.jpg");
          
        try{ 
        JRDataSource a = new JRBeanCollectionDataSource(datasource);
        //JasperReport reporJasper = (JasperReport) JRLoader.loadObject(imagenClose + "reporteLicencias.jasper");
        JasperReport reporJasper = JasperCompileManager.compileReport("src\\Resource\\reporteLicencias.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporJasper,parametros, a);
        JasperViewer viewer = new JasperViewer(jasperPrint,false);
        viewer.setVisible(true);
        jasperPrint.setName("Reporte");
        }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    /**
     * Calcula la nueva fecha de vencimiento de la Licencia própiamente dicha.
     * Es un método estatico.
     * @param ld_fecha_nacimiento Fecha de Nacimiento del interesado
     * @param ld_fecha_expiracion Fecha de expiración de la licencia, en caso de ser la primera vez 'null'
     * @return La nueva fecha de vencimiento de la licencia.
     */
    public static Date calcularFechaLicencia(Date ld_fecha_nacimiento, Date ld_fecha_expiracion){
        Date ld_fecha_actual = new Date();
        boolean lb_primera_vez = true;
        Date ld_fecha_final = (Date) ld_fecha_nacimiento.clone();
        Date ld_fecha_cumple = calcularFechaCumpleaños(ld_fecha_actual, (Date) ld_fecha_nacimiento.clone());
        boolean lb_cumplio_anios = cumplioAños(ld_fecha_cumple, ld_fecha_actual);
        int li_meses_cumpleaños = Integer.max(restarFechas(ld_fecha_actual, ld_fecha_cumple)/30, restarFechas(ld_fecha_cumple, ld_fecha_actual)/30);


        //Si es null, saca por primera vez
        if(!(ld_fecha_expiracion == null)){
                int li_anio_fecha_exp_vieja = ld_fecha_expiracion.getYear();
                lb_primera_vez = false;


        }
        //Si no es null, saca por primera vez
        else{
            int li_anios_actual = restarFechas(ld_fecha_nacimiento,ld_fecha_actual)/365;
                //menor de 21
            if(li_anios_actual < 21){
                if(li_meses_cumpleaños<= 3){
                    if(!lb_primera_vez){
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+1);
                    }
                    else{
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+3);
                    
                    }
                }
                else{
                    if(lb_cumplio_anios){
                        if(lb_primera_vez){
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+1);

                        }

                        else{
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+3);
                        }
                    }
                    else{
                        if(lb_primera_vez){
                            ld_fecha_final.setYear(ld_fecha_actual.getYear());

                        }

                        else{
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+2);
                        }
                    }
                }

                }
            else if(li_anios_actual <= 46){
                if(li_meses_cumpleaños<=3){

                    ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 5);
                }
                else{
                    if(lb_cumplio_anios){
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 5);
                    }
                    else{
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 4);
                    }
                }
            }
            else if(li_anios_actual <= 60){
                if(li_meses_cumpleaños<=3){
                    ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 4);
                }
                else{
                    if(lb_cumplio_anios){
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 4);
                    }
                    else{
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 3);
                    }
                }
            }
            else if(li_anios_actual<=70){
                if(li_meses_cumpleaños<=3){
                    ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 3);
                }
                else{
                    if(lb_cumplio_anios){
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 3);
                    }
                    else{
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 2);
                    }
                    
                }
            }
            else{
                if(li_meses_cumpleaños<=3){
                    ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 1);
                }
                else{
                    if(lb_cumplio_anios){
                        ld_fecha_final.setYear(ld_fecha_actual.getYear()+1);
                    }
                    else{
                        ld_fecha_final.setYear(ld_fecha_actual.getYear());
                    }
                }
            }
        }
        return ld_fecha_final;
    }
    /**
     * Calcula la cantidad de dias que pasan entre la Fecha Inicial y la Final.
     * @param fechaIn Fecha Inicial
     * @param fechaFinal Fecha Final
     * @return Total de días transcurridos entre las fechas.
     */
    public static int restarFechas(Date fechaIn, Date fechaFinal) {
		GregorianCalendar fechaInicio = new GregorianCalendar();
		fechaInicio.setTime(fechaIn);
		GregorianCalendar fechaFin = new GregorianCalendar();
		fechaFin.setTime(fechaFinal);
		int dias = 0;
			
	if (fechaFin.get(Calendar.YEAR) == fechaInicio.get(Calendar.YEAR)) {
			dias = (fechaFin.get(Calendar.DAY_OF_YEAR) - fechaInicio.get(Calendar.DAY_OF_YEAR)) + 1;
		} 
		else {
			int rangoAnyos = fechaFin.get(Calendar.YEAR) - fechaInicio.get(Calendar.YEAR);
			for (int i = 0; i <= rangoAnyos; i++) {
				int diasAnio = fechaInicio.isLeapYear(fechaInicio.get(Calendar.YEAR)) ? 366 : 365;
				if (i == 0) {
					dias = 1 + dias + (diasAnio - fechaInicio.get(Calendar.DAY_OF_YEAR));
				} else if (i == rangoAnyos) {
					dias = dias + fechaFin.get(Calendar.DAY_OF_YEAR);
				} else {
					dias = dias + diasAnio;
				}
			}
		}

		return dias;
    }

    private static Date calcularFechaCumpleaños(Date ld_fecha_actual, Date ld_fecha_cumple) {
        
        Date ld_actual_cumple = (Date) ld_fecha_cumple.clone();
        ld_actual_cumple.setYear(ld_fecha_actual.getYear());
        Date ld_anterior_cumple = (Date) ld_fecha_cumple.clone();
        ld_anterior_cumple.setYear(ld_fecha_actual.getYear() - 1);
        Date ld_siguiente_cumple = (Date) ld_fecha_cumple.clone();
        ld_siguiente_cumple.setYear(ld_fecha_actual.getYear() +1 );
        
        int ahora = Integer.max(restarFechas(ld_fecha_actual,ld_actual_cumple), restarFechas(ld_actual_cumple,ld_fecha_actual));
        int despues = Integer.max(restarFechas(ld_fecha_actual,ld_siguiente_cumple), restarFechas(ld_siguiente_cumple,ld_fecha_actual));
        int antes = Integer.max(restarFechas(ld_fecha_actual,ld_anterior_cumple), restarFechas(ld_anterior_cumple,ld_fecha_actual));
        
        if(ahora <= despues && ahora <= antes){
            return ld_actual_cumple;
        }
        else if(despues <= ahora && despues <= antes){
            return ld_siguiente_cumple;         
        }
        else if (antes <= despues && antes <= ahora){
            return ld_anterior_cumple;
        }
        else{
            return ld_fecha_cumple;
        }
        
    }

    private static boolean cumplioAños(Date ld_fecha_cumple, Date ld_fecha_actual) {
        
        if(ld_fecha_actual.getYear() < ld_fecha_cumple.getYear()){
                return true;
            }
        else if(ld_fecha_actual.getYear() > ld_fecha_cumple.getYear()){
            return false;
        }
        else if(ld_fecha_actual.getMonth() > ld_fecha_cumple.getMonth()){
            return true;
        }
        else if(ld_fecha_actual.getMonth() < ld_fecha_cumple.getMonth()){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static Integer calculcarCostoLicencia(Licencia licencia){
        Integer costo = 0;
        Integer duracionLicencia = 0;
        Map<Character, Vector> mapaCostos = new HashMap<Character, Vector>();
        Vector costoA = new Vector();
        Vector costoB = new Vector();
        Vector costoC = new Vector();
        Vector costoE = new Vector();
        Vector costoG = new Vector();
        
        costoA.add(40);
        costoA.add(30);
        costoA.add(25);
        costoA.add(20);
        
        costoB.add(40);
        costoB.add(30);
        costoB.add(25);
        costoB.add(20);
        
        costoC.add(47);
        costoC.add(35);
        costoC.add(30);
        costoC.add(23);
        
        costoE.add(59);
        costoE.add(44);
        costoE.add(39);
        costoE.add(29);
        
        costoG.add(40);
        costoG.add(30);
        costoG.add(25);
        costoG.add(20);
        
        mapaCostos.put('A', costoA);
        mapaCostos.put('B', costoB); 
        mapaCostos.put('C', costoC); 
        mapaCostos.put('E', costoE); 
        mapaCostos.put('G', costoG); 
        Vector costos = new Vector();
        Date fechaRegistro = licencia.getFechaRegistro();
        Date fechaVencimiento = licencia.getFechaVenc();
        String clase = licencia.getClase();
        char letra = licencia.getClase().charAt(0);
        duracionLicencia = restarFechas(fechaRegistro, fechaVencimiento);
        
        costos = mapaCostos.get(letra);
        
        duracionLicencia = duracionLicencia / 365;
        
        costo = (Integer) costos.get(duracionLicencia);
        
        costo +=8;
        
        return costo;
    }
}
