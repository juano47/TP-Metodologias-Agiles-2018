/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoAdministrativo;
import Entidades.Administrativo;
import Pantallas.GestionAdministrativos;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnit44Runner;

/**
 *
 * @author Juan Ignacio de la Iglesia
 */

public class GestorAdministrativoTest {

    public GestorAdministrativoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {   
    }
    
    @After
    public void tearDown() {
        
    }


    /**
     * Test of validarAdministrativo method, of class GestorAdministrativo.
     */
    @Test
    public void testValidarAdministrativo() {
        GestorAdministrativo instance = GestorAdministrativo.getInstance();        

        //probamos que validando con datos que no estan en la BD, el metodo devuelve 0
        System.out.println("validarAdministrativo - probamos user y pass incorrectos");
        String username = "usuario";
        String password = "pass";
        
        int expResult = 0;
        int result = instance.validarAdministrativo(username, password);
        assertEquals(expResult, result);
        
        //probamos que validando con datos que estan en la BD, el metodo devuelve 1
        System.out.println("validarAdministrativo - probamos user y pass correctos");
        
        //creamos un administrativo de prueba
        Administrativo administrativoGuardado = new Administrativo();
        
        String nombre = "Nombre";
        String apellido = "Apellido";
        String dni = "12345678";
        username = "username";
        password = "pass";
        int superuser = 1;
        int user_nuevo = 0;
        
        administrativoGuardado.setNombre(nombre);
        administrativoGuardado.setApellido(apellido);
        administrativoGuardado.setDni(dni);
        administrativoGuardado.setUsername(username);
        administrativoGuardado.setPassword(password);
        administrativoGuardado.setSuperuser(superuser);
        administrativoGuardado.setUser_nuevo(user_nuevo);
        
        GestorAdministrativo.getInstance().guardarAdministrativo(administrativoGuardado);
        
        int ultimo_registro = instance.buscarAdministrativos().size();
        Administrativo administrativo = instance.buscarAdministrativos().get(ultimo_registro-1);
        username = administrativo.getUsername();
        password = administrativo.getPassword();
        expResult = 1;
        result = instance.validarAdministrativo(username, password);
        assertEquals(expResult, result);
        
        //borramos el registro de prueba
        DaoAdministrativo daoAdministrativo = new DaoAdministrativo();
        daoAdministrativo.delete(administrativoGuardado);  
    }

    /**
     * Test of getAdministrativo method, of class GestorAdministrativo.
     */
    @Test
    public void testGetAdministrativo() {
        System.out.println("getAdministrativo");
        
        // generamos un mock de un objeto administrativo mediante el metodo mock
        Administrativo mockAdministrativoTest = mock(Administrativo.class);
        
        //generamos un mock para una instancia del GestorAdministrativo
        GestorAdministrativo gestorAdministrativo = mock(GestorAdministrativo.getInstance().getClass());
        
        //cuando a la clase GestorAdministrativo se le pide la variable administrativo, devolvemos el administrativo mockeado por nosotros
        when(gestorAdministrativo.getAdministrativo()).thenReturn(mockAdministrativoTest);
        
        //definimos el objeto esperado
        Administrativo expResult = mockAdministrativoTest;
        
        //definimos el resultado esperado (objetivo de este test)
        Administrativo result = gestorAdministrativo.getAdministrativo();
        
        //comparamos los resultados
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarAdministrativos method, of class GestorAdministrativo.
     */
    @Test
    public void testBuscarAdministrativos_0args() {
        System.out.println("buscarAdministrativos");
        
        //creamos un mock de un Administrativo
        Administrativo administrativoGuardado = mock(Administrativo.class);
        
        //armamos una lista con 2 administrativos
        List<Administrativo> listaAdministrativos = new ArrayList<Administrativo>();
        
        String nombre = "Nombre";
        String apellido = "Apellido";
        String dni = "12345678";
        String username = "username";
        String password = "pass";
        int superuser = 1;
        int user_nuevo = 0;
        
        administrativoGuardado.setNombre(nombre);
        administrativoGuardado.setApellido(apellido);
        administrativoGuardado.setDni(dni);
        administrativoGuardado.setUsername(username);
        administrativoGuardado.setPassword(password);
        administrativoGuardado.setSuperuser(superuser);
        administrativoGuardado.setUser_nuevo(user_nuevo);
        
        listaAdministrativos.add(administrativoGuardado);
        
        nombre = "Nombre 2";
        apellido = "Apellido 2";
        dni = "12345678";
        username = "username 2";
        password = "pass 2";
        superuser = 1;
        user_nuevo = 0;
        
        administrativoGuardado.setNombre(nombre);
        administrativoGuardado.setApellido(apellido);
        administrativoGuardado.setDni(dni);
        administrativoGuardado.setUsername(username);
        administrativoGuardado.setPassword(password);
        administrativoGuardado.setSuperuser(superuser);
        administrativoGuardado.setUser_nuevo(user_nuevo);
        
        listaAdministrativos.add(administrativoGuardado);
        
        //creamos un mock de la instancia de GestorAdministrativo
        GestorAdministrativo instance = mock(GestorAdministrativo.getInstance().getClass());
        
        //ponemos como salida la lista que definimos
        List<Administrativo> expResult = listaAdministrativos;
        
        //simulamos la busqueda de administrativos sin acceder a la BD
        when(instance.buscarAdministrativos()).thenReturn(listaAdministrativos);
        
        //definimos el resultado esperado
        List<Administrativo> result = instance.buscarAdministrativos();
        
        //tests:
        
        //probamos una busqueda correcta
        assertEquals(expResult, result);
        
        //probamos que el metodo no devuelva null
        assertNotNull(result);
        
        //probamos que el primer administrativo de la lista coincida
        assertEquals(listaAdministrativos.get(0), result.get(0));
        
        //probamos que el segundo administrativo de la lista coincida
        assertEquals(listaAdministrativos.get(1), result.get(1));
        
        //verificamos que solo haya dos elementos en la lista
        assertEquals(2, result.size());
        
        }

    /**
     * Test of buscarAdministrativos method, of class GestorAdministrativo.
     */
    @Test
    public void testBuscarAdministrativos_3args() {
        System.out.println("buscarAdministrativos");
        
        
        Administrativo administrativoGuardado = new Administrativo();
  
        String nombre = "Nombre";
        String apellido = "Apellido";
        String dni = "12345678";
        String username = "username";
        String password = "pass";
        int superuser = 1;
        int user_nuevo = 0;
  
        administrativoGuardado.setNombre(nombre);
        administrativoGuardado.setApellido(apellido);
        administrativoGuardado.setDni(dni);
        administrativoGuardado.setUsername(username);
        administrativoGuardado.setPassword(password);
        administrativoGuardado.setSuperuser(superuser);
        administrativoGuardado.setUser_nuevo(user_nuevo);
        
        GestorAdministrativo.getInstance().guardarAdministrativo(administrativoGuardado);
 
        GestorAdministrativo instance = GestorAdministrativo.getInstance();
         
        //usamos el metodo a probar y definimos el resultado esperado
        List<Administrativo> result = instance.buscarAdministrativos("Nombre", "Apellido", "12345678");
        
        //tests:
        //probamos una busqueda correcta
        assertEquals(administrativoGuardado.getApellido(),result.get(0).getApellido());
        assertEquals(administrativoGuardado.getDni(),result.get(0).getDni());
        assertEquals(administrativoGuardado.getNombre(),result.get(0).getNombre());
        assertEquals(administrativoGuardado.getPassword(),result.get(0).getPassword());
        assertEquals(administrativoGuardado.getSuperuser(),result.get(0).getSuperuser());
        assertEquals(administrativoGuardado.getUser_nuevo(),result.get(0).getUser_nuevo());
        assertEquals(administrativoGuardado.getUsername(),result.get(0).getUsername());
        
        //probamos que el metodo no devuelva null
        assertNotNull(result);
   
        //verificamos que solo haya un elementos en la lista
        assertEquals(1, result.size());
        
        //borramos el registro de prueba
        DaoAdministrativo daoAdministrativo = new DaoAdministrativo();
        daoAdministrativo.delete(administrativoGuardado); 
    }

    /**
     * Test of modificarAdministrativo method, of class GestorAdministrativo.
     */
    @Test
    public void testModificarAdministrativo() {
        System.out.println("modificarAdministrativo");
        //creamos un administrativo de prueba
        Administrativo administrativoGuardado = new Administrativo();
        
        String nombre = "Nombre";
        String apellido = "Apellido";
        String dni = "12345678";
        String username = "username";
        String password = "pass";
        int superuser = 1;
        int user_nuevo = 0;
        
        administrativoGuardado.setNombre(nombre);
        administrativoGuardado.setApellido(apellido);
        administrativoGuardado.setDni(dni);
        administrativoGuardado.setUsername(username);
        administrativoGuardado.setPassword(password);
        administrativoGuardado.setSuperuser(superuser);
        administrativoGuardado.setUser_nuevo(user_nuevo);
        
        //guardamos el administrativo en la BD
        GestorAdministrativo.getInstance().guardarAdministrativo(administrativoGuardado);
        
        //le cambiamos todos los datos en memoria
        String nombre_modificado = "Nombre modificado";
        String apellido_modificado = "Apellido modificado";
        String dni_modificado = "11223344";
        String username_modificado = "usermod";
        String password_modificado = "passmod";
        int superuser_modificado = 0;
        int user_nuevo_modificado = 1;
        
        administrativoGuardado.setNombre(nombre_modificado);
        administrativoGuardado.setApellido(apellido_modificado);
        administrativoGuardado.setDni(dni_modificado);
        administrativoGuardado.setUsername(username_modificado);
        administrativoGuardado.setPassword(password_modificado);
        administrativoGuardado.setSuperuser(superuser_modificado);
        administrativoGuardado.setUser_nuevo(user_nuevo_modificado);
        
        //usamos el metodo modificar del gestor
        GestorAdministrativo.getInstance().modificarAdministrativo(administrativoGuardado);
        
        //hacemos los tests previo a traer el administrativo desde la BD
        DaoAdministrativo daoAdministrativo = new DaoAdministrativo();
        Integer idAdministrativo = daoAdministrativo.findPorUsernameYClave(username_modificado, password_modificado);
        Administrativo resultadoObtenido = daoAdministrativo.buscarAdministrativo(idAdministrativo);
        
        assertEquals(administrativoGuardado.getApellido(),resultadoObtenido.getApellido());
        assertEquals(administrativoGuardado.getDni(),resultadoObtenido.getDni());
        assertEquals(administrativoGuardado.getNombre(),resultadoObtenido.getNombre());
        assertEquals(administrativoGuardado.getPassword(),resultadoObtenido.getPassword());
        assertEquals(administrativoGuardado.getSuperuser(),resultadoObtenido.getSuperuser());
        assertEquals(administrativoGuardado.getUser_nuevo(),resultadoObtenido.getUser_nuevo());
        assertEquals(administrativoGuardado.getUsername(),resultadoObtenido.getUsername());
        
        //borramos el registro de prueba
        daoAdministrativo.delete(administrativoGuardado);
    }

    /**
     * Test of guardarAdministrativo method, of class GestorAdministrativo.
     */
    @Test
    public void testGuardarAdministrativo() {
        System.out.println("guardarAdministrativo");
        
        //creamos un administrativo de prueba
        Administrativo administrativoGuardado = new Administrativo();
        
        String nombre = "Nombre";
        String apellido = "Apellido";
        String dni = "12345678";
        String username = "username";
        String password = "pass";
        int superuser = 1;
        int user_nuevo = 0;
        
        administrativoGuardado.setNombre(nombre);
        administrativoGuardado.setApellido(apellido);
        administrativoGuardado.setDni(dni);
        administrativoGuardado.setUsername(username);
        administrativoGuardado.setPassword(password);
        administrativoGuardado.setSuperuser(superuser);
        administrativoGuardado.setUser_nuevo(user_nuevo);
        
        //usamos el metodo de guardado del gestor
        GestorAdministrativo.getInstance().guardarAdministrativo(administrativoGuardado);
        
        //buscamos el objeto guardado y lo comparamos con el que creamos en memoria
        DaoAdministrativo daoAdministrativo = new DaoAdministrativo();
        Integer idAdministrativo = daoAdministrativo.findPorUsernameYClave("username", "pass");
        Administrativo resultadoObtenido = daoAdministrativo.buscarAdministrativo(idAdministrativo);
        assertEquals(administrativoGuardado.getApellido(),resultadoObtenido.getApellido());
        assertEquals(administrativoGuardado.getDni(),resultadoObtenido.getDni());
        assertEquals(administrativoGuardado.getNombre(),resultadoObtenido.getNombre());
        assertEquals(administrativoGuardado.getPassword(),resultadoObtenido.getPassword());
        assertEquals(administrativoGuardado.getSuperuser(),resultadoObtenido.getSuperuser());
        assertEquals(administrativoGuardado.getUser_nuevo(),resultadoObtenido.getUser_nuevo());
        assertEquals(administrativoGuardado.getUsername(),resultadoObtenido.getUsername());
               
        //borramos el registro de prueba
        daoAdministrativo.delete(administrativoGuardado);
    }
    
}
