/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

/**
 *
 * @author Julita
 */
public class DemostracionLista {
    
    public Lista demolista = new Lista();
        public List<Integer> crearDemoLista() {
       
        demolista.add(0, 4);
        demolista.add(0, 3);
        demolista.add(0, 2);
        demolista.add(1, 5);
        demolista.add(1, 6);
        demolista.add(3, 7);
        demolista.add(0, 8);
        
        return demolista;
        }
}
