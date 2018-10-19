package Gestores;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
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
	public static Date calcularFechaLicencia(Date ld_fecha_nacimiento, Date ld_fecha_expiracion){
		Date ld_fecha_actual = new Date();
		boolean lb_primera_vez = true;
                Date ld_fecha_final = (Date) ld_fecha_nacimiento.clone();
                Date ld_fecha_cumple = (Date)ld_fecha_nacimiento.clone();
                ld_fecha_cumple.setYear(ld_fecha_actual.getYear());
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
                        if(li_meses_cumpleaños<=3){
                            if(lb_primera_vez){
                                ld_fecha_final.setYear(ld_fecha_actual.getYear() + 2 );

                            }
                            
                            else{
                                ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 4);
                            }
                        }
                        else{
                            if(lb_primera_vez){
                                ld_fecha_final.setYear(ld_fecha_actual.getYear()+1);

                            }
                            
                            else{
                                ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 3);
                            }
                        }
                            
                        }
                    else if(li_anios_actual <= 46){
                        if(li_meses_cumpleaños<=3){
                            
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 6);
                        }
                        else{
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 5);
                        }
                    }
                    else if(li_anios_actual <= 60){
                        if(li_meses_cumpleaños<=3){
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 5);
                        }
                        else{
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 4);
                        }
                    }
                    else if(li_anios_actual<=70){
                        if(li_meses_cumpleaños<=3){
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 4);
                        }
                        else{
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 3);
                        }
                    }
                    else{
                        if(li_meses_cumpleaños<=3){
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+ 2);
                        }
                        else{
                            ld_fecha_final.setYear(ld_fecha_actual.getYear()+1);
                        }
                    }
		}
		return ld_fecha_final;
	}

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
}
