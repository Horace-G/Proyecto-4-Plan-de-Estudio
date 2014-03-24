/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Horacio Galdamez
 */
public class ventanaProyecto extends javax.swing.JFrame {

    /**
     * Creates new form ventanaProyecto
     */
    public ventanaProyecto() {
        initComponents();
       //ArrayList <Clase> listaDeClases =new ArrayList();
       
       
        /*Éstas dos clases (claseVacía y claseVacía2) están hechas solo para representar requisitos vacíos,
         * o sea, se utilizan en clases con un requisito como Algebra (requisito1, claseVacía2), porque algebra 
         * sólo tiene un requisito, como como intro a la compu (claseVacia,claseVacía2), porque no tiene ningun
         * requisito
         */
        
        
       Clase claseVacia=new Clase("nada");
       Clase claseVacia2=new Clase("nada2");
            /*
             * A continuación, clases que fueron creadas sólamente para simular la lectura de los archivos de texto.
             * 
             * A la hora de leer los archivos de texto, mientras el archivo de texto tenga más lineas de
             * información (while scannerArchivo.hasNext()), deberemos hacer split de cada linea, e ingresar cada
             * linea de tokens a una instancia de clase (newClase(fileArray[0],fileArray[1], etc))
             * 
             * posteriormente, debemos agregar esa nueva instancia a la lista "listaDeClases" (.add(clase))
             * 
             * luego, debemos crear un vertice en el grafo, llamado organigrama (organigrama.addVertex())
             * 
             * luego, conectar esa clase a sus requisitos (organigrama.addEdge("a1",progra1,algebra))
             *                                             (organigrama.addEdge("a2",progra2,intro Compu))
             * 
             * EL ORDEN EN QUE METAMOS LAS 2 CLASES A CONECTAR EN EL ADDEDGE() NO IMPORTA
             * 
             * Por último debemos distinguir las clases normales (las que tienen requisitos y/o abren otras clases)
             * de las clases "flotantes", aquellas que no abren nada ni tienen requisitos, como Español, Sociología, 
             * Ecología, etc. ESTE PASO YA ESTÁ HECHO, NO TENES QUE HACERLO
             */
            
            //creacion de clases, la linea 57-72 van a ser eliminadas sólamente hasta que logremos leer de los archivos de 
            //texto
            
            //algunas clases tienen atributos en true, solo para simularlas como que ya estan aprobadas, solo para probar
            //si la aplicacion funciona correctamente
            
        try {
            Scanner scanner=new Scanner(archivo);
            while(scanner.hasNext()){
                Object [] arreglo=scanner.nextLine().split(",");
            }//fin del while que lee el archivo te texto
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ventanaProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
          Clase espaniol = new Clase("Español",false,false,claseVacia,claseVacia2,0);
          Clase ofi1 = new Clase("Ofimatica 1",false,false,claseVacia,claseVacia2,1);
          Clase ofi2 = new Clase("Ofimatica 2",false,false,ofi1,claseVacia2,1);
           Clase ofi3 = new Clase("Ofimatica 3",false,false,ofi2,claseVacia2,1);
           Clase historia = new Clase("Historia de Honduras",false,false,claseVacia,claseVacia2,0);
       Clase admi = new Clase("Administracion 1",false,false,claseVacia,claseVacia2,0);
       Clase idioma1 = new Clase("Idioma Extranjero 1",false,false,claseVacia,claseVacia2,1);
       Clase idioma2 = new Clase("Idioma Extranjero 2",false,false,idioma1,claseVacia2,1);
        Clase idioma3 = new Clase("Idioma Extranjero 3",false,false,idioma2,claseVacia2,1);
        Clase idioma4 = new Clase("Idioma Extranjero 4",false,false,idioma3,claseVacia2,1);
               Clase sociologia = new Clase("Sociologia",false,false,claseVacia,claseVacia2,0);
               Clase filo  = new Clase("Filosofia",false,false,claseVacia,claseVacia2,0); 
                Clase arte = new Clase("Electiva de Arte o Deporte",false,false,claseVacia,claseVacia2,0);
       Clase conta1 = new Clase("Analisis Contable 1",false,false,claseVacia,claseVacia2,1);
       Clase sistemas = new Clase("Sistemas de Informacion",false,false,claseVacia,claseVacia2,1);
       Clase ciencia = new Clase("Electiva de CCNN",false,false,claseVacia,claseVacia2,0);
       Clase conta2 = new Clase("Analisis Contable 2",false,false,conta1,claseVacia2,11);
        
       Clase introAlgebra = new Clase("Introduccion al Algebra",false,false,claseVacia,claseVacia2,1);
       Clase algebra = new Clase("Aalgebra",false,false,introAlgebra,claseVacia2,1);
       Clase geometria = new Clase("Geometria y Trigonometria",false,false,algebra,claseVacia2,1);
       Clase lineal = new Clase("Algebra lineal",false,false,geometria,claseVacia2,1);
       Clase diferencial = new Clase("Calculo Diferencial",false,false,geometria,claseVacia2,1);
       Clase integral = new Clase("Calculo Integral",false,false,diferencial,claseVacia2,1);
       Clase calculo2 = new Clase("Calculo 2",false,false,integral,claseVacia2,1);
        Clase fisica1 = new Clase("Fisica 1",false,false,integral,claseVacia2,1);
        Clase estadistica = new Clase("Estadistica Matematica",false,false,integral,claseVacia2,1);
        Clase ecua = new Clase("Ecuaciones Diferenciales",false,false,calculo2,lineal,1);
        Clase fisica2 = new Clase("Fisica 2",false,false,fisica1,claseVacia2,1);
        Clase discretas = new Clase("Matematicas Discretas",false,false,ecua,claseVacia2,1);
        Clase fisica3 = new Clase("Fisica 3",false,false,fisica2,claseVacia2,1);
        Clase metodos = new Clase("Metodos Numericos",false,false,discretas,claseVacia2,1);
        
        
 
       Clase introCompu = new Clase("Introduccion a la Computacion",false,false,claseVacia,claseVacia2,1);
        Clase progra1 = new Clase("Programacion 1",false,false,introCompu,algebra,1);
        Clase progra2 = new Clase("Programacion 2",false,false,progra1,claseVacia2,1);
       Clase progra3 = new Clase("Programacion 3",false,false,progra2,claseVacia2,1);
       Clase estructuras = new Clase("Estructuras de Datos",false,false,progra3,ofi3,1);
       Clase orga = new Clase("Organizacion de Archivos",false,false,estructuras,claseVacia2,1);
       Clase progra4 = new Clase("Programacion 4",false,false,orga,claseVacia2,1);
       Clase analisis = new Clase("Analisis de Algoritmos",false,false,metodos,progra4,1);
       Clase disenio = new Clase("Diseño Logico Digital",false,false,estructuras,fisica3,1);
       Clase bases1 = new Clase("Teoria de Bases de Datos 1",false,false,sistemas,progra4,1);
       Clase orgaCompus = new Clase("Organizacion de Computadoras",false,false,disenio,claseVacia2,1);
       Clase bases2 = new Clase("Teoria de Bases de Datos 2",false,false,bases1,claseVacia2,1);
       Clase lenguajes = new Clase("Lenguajes de Programacion",false,false,metodos,progra4,1);
       Clase teoria = new Clase("Teoria de la Computacion",false,false,lenguajes,claseVacia2,1);
       Clase analisis1 = new Clase("Analisis y Diseño de Sistemas 1",false,false,conta2,bases1,1);
       Clase sistemas1 = new Clase("Sistemas Operativos 1",false,false,orgaCompus,claseVacia2,1);
       Clase redes = new Clase("Redes",false,false,analisis1,claseVacia2,1);
       Clase analisis2 = new Clase("Analisis y Diseño de Sistemas 2",false,false,analisis1,claseVacia2,1);
       Clase sistemas2 = new Clase("Sistemas Operativos 2",false,false,sistemas1,claseVacia2,1);
       Clase ing = new Clase("Ingenieria de Software",false,false,analisis2,claseVacia2,1);
       Clase compiladores1 = new Clase("Compiladores 1",false,false,teoria,claseVacia2,1);
             Clase empresas = new Clase("Generacion de Empresas 1",false,false,orgaCompus,claseVacia2,1);
       Clase electiva = new Clase("Electiva de Formacion Especifica 1",false,false,analisis2,claseVacia2,1);
       Clase electiva1 = new Clase("Electiva de Formacion Especifica 2",false,false,electiva,claseVacia2,1);
       Clase compiladores2 = new Clase("Compiladores 2",false,false,compiladores1,claseVacia2,1);
       Clase proye1 = new Clase("Proyecto de Graduacion 1",false,false,compiladores2,claseVacia2,1);
        Clase proye2 = new Clase("Proyecto de Graduacion 2",false,false,proye1,claseVacia2,1);
       
       organigrama.addVertex(introAlgebra);
       listaDeClases.add(introAlgebra);
       organigrama.addVertex(algebra);
       listaDeClases.add(algebra);
       organigrama.addVertex(espaniol);
       listaDeClases.add(espaniol);
       organigrama.addVertex(introCompu);
       listaDeClases.add(introCompu);
       organigrama.addVertex(ofi1);
       listaDeClases.add(ofi1);
       organigrama.addVertex(geometria);
       listaDeClases.add(geometria);
       organigrama.addVertex(historia);
       listaDeClases.add(historia);
       organigrama.addVertex(progra1);
       listaDeClases.add(progra1);
       organigrama.addVertex(ofi2);
       listaDeClases.add(ofi2);
       organigrama.addVertex(diferencial);
       listaDeClases.add(diferencial);
       organigrama.addVertex(admi);
       listaDeClases.add(admi);
       organigrama.addVertex(progra2);
       listaDeClases.add(progra2);
       organigrama.addVertex(ofi3);
       listaDeClases.add(ofi3);
       organigrama.addVertex(integral);
       listaDeClases.add(integral);
       organigrama.addVertex(lineal);
       listaDeClases.add(lineal);
       organigrama.addVertex(progra3);
       listaDeClases.add(progra3);
       organigrama.addVertex(idioma1);
       listaDeClases.add(idioma1);
       organigrama.addVertex(calculo2);
       listaDeClases.add(calculo2);
       organigrama.addVertex(fisica1);
       listaDeClases.add(fisica1);
       organigrama.addVertex(estructuras);
       listaDeClases.add(estructuras);
       organigrama.addVertex(idioma2);
       listaDeClases.add(idioma2);
       organigrama.addVertex(ecua);
       listaDeClases.add(ecua);
       organigrama.addVertex(fisica2);
       listaDeClases.add(fisica2);
       organigrama.addVertex(orga);
       listaDeClases.add(orga);
       organigrama.addVertex(idioma3);
       listaDeClases.add(idioma3);
       organigrama.addVertex(discretas);
       listaDeClases.add(discretas);
       organigrama.addVertex(fisica3);
       listaDeClases.add(fisica3);
       organigrama.addVertex(progra4);
       listaDeClases.add(progra4);
       organigrama.addVertex(idioma4);
       listaDeClases.add(idioma4);
       organigrama.addVertex(metodos);
       listaDeClases.add(metodos);
       organigrama.addVertex(estadistica);
       listaDeClases.add(estadistica);
       organigrama.addVertex(sistemas);
       listaDeClases.add(sistemas);
       organigrama.addVertex(sociologia);
       listaDeClases.add(sociologia);
       organigrama.addVertex(analisis);
       listaDeClases.add(analisis);
       organigrama.addVertex(disenio);
       listaDeClases.add(disenio);
       organigrama.addVertex(bases1);
       listaDeClases.add(bases1);
       organigrama.addVertex(filo);
       listaDeClases.add(filo);
       organigrama.addVertex(orgaCompus);
       listaDeClases.add(orgaCompus);
       organigrama.addVertex(bases2);
       listaDeClases.add(bases2);
       organigrama.addVertex(arte);
       listaDeClases.add(arte);
       organigrama.addVertex(conta1);
       listaDeClases.add(conta1);
       organigrama.addVertex(lenguajes);
       listaDeClases.add(lenguajes);
       organigrama.addVertex(ciencia);
       listaDeClases.add(ciencia);
       organigrama.addVertex(conta2);
       listaDeClases.add(conta2);
       organigrama.addVertex(teoria);
       listaDeClases.add(teoria);
       organigrama.addVertex(empresas);
       listaDeClases.add(empresas);
       organigrama.addVertex(analisis1);
       listaDeClases.add(analisis1);
       organigrama.addVertex(sistemas1);
       listaDeClases.add(sistemas1);
       organigrama.addVertex(redes);
       listaDeClases.add(redes);
       organigrama.addVertex(analisis2);
       listaDeClases.add(analisis2);
       organigrama.addVertex(sistemas2);
       listaDeClases.add(sistemas2);
       organigrama.addVertex(electiva);
       listaDeClases.add(electiva);
       organigrama.addVertex(ing);
       listaDeClases.add(ing);
       organigrama.addVertex(compiladores1);
       listaDeClases.add(compiladores1);
       organigrama.addVertex(proye1);
       listaDeClases.add(proye1);
       organigrama.addVertex(electiva1);
       listaDeClases.add(electiva1);
       organigrama.addVertex(compiladores2);
       listaDeClases.add(compiladores2);
       organigrama.addVertex(proye2);
       listaDeClases.add(proye2);
       
       ArrayList <Clase>eliminadas=new ArrayList();
       eliminadas.add(espaniol);
       eliminadas.add(historia);
       eliminadas.add(admi);
       eliminadas.add(sociologia);
       eliminadas.add(filo);
       eliminadas.add(arte);
       eliminadas.add(ciencia);
       
       clasesFlotantes.add(espaniol);
       clasesFlotantes.add(historia);
       clasesFlotantes.add(admi);
       clasesFlotantes.add(sociologia);
       clasesFlotantes.add(filo);
       clasesFlotantes.add(arte);
       clasesFlotantes.add(ciencia);
       
      for(int i=0;i<listaDeClases.size();i++)
          for(int j=0;j<eliminadas.size();j++)
              if(eliminadas.get(j).equals(listaDeClases.get(i)))
                  listaDeClases.remove(listaDeClases.get(i));
      
      ArrayList<Clase> req2=new ArrayList();
      for(Clase clase:listaDeClases){
          if(!clase.getRequisito1().equals(claseVacia)&& (!clase.getRequisito2().equals(claseVacia2))){
              req2.add(clase);
              System.out.println(clase.getNombre()+" tiene 2 requisitos");
          }
      }
        
    }//fin del constructor de la clase
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoIngenierias = new javax.swing.ButtonGroup();
        grupoLicenciaturas = new javax.swing.ButtonGroup();
        grupoGlobal = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        botonDibujarPlanDeEstudio = new javax.swing.JButton();
        botonGenerarPlanDeEstudio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonDibujarPlanDeEstudio.setText("Dibujar Plan de Estudio");
        botonDibujarPlanDeEstudio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDibujarPlanDeEstudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDibujarPlanDeEstudioMouseClicked(evt);
            }
        });

        botonGenerarPlanDeEstudio.setText("Generar Plan de Estudio");
        botonGenerarPlanDeEstudio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGenerarPlanDeEstudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGenerarPlanDeEstudioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGenerarPlanDeEstudio)
                    .addComponent(botonDibujarPlanDeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botonDibujarPlanDeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonGenerarPlanDeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Generación de Plan", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGenerarPlanDeEstudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGenerarPlanDeEstudioMouseClicked
        // botón que al presionarse, se calculan las clases y son agregadas a la tabla

        Clase t;
        int contadorClasesPorPeriodo=0;//numero de clases por periodo, debe llegar hasta 4 por cada vuelta que da
        Clase [] arreglo={null,null,null,null};//arreglo de todas las clases del plan
        //Object [] clasesDelPeriodoATabla={null,null,null,null};
        ArrayList<Clase>clasesDelPeriodoATabla=new ArrayList();//arreglo que tiene las 4 clases que van a ser agregadas
        //a la tabla

        rellenarGrafo(listaDeClases);

        while(!termina){

            arreglo=(Clase[]) organigrama.getVertices().toArray(arreglo);//arreglo de los vertices del grafo

            if(contadorClasesPorPeriodo<=3)//validacion para que solo sean 4 clases por periodo
            for(Clase actual:arreglo){//recorrido especial del arreglo de clases de todo el  plan
                t=actual;

                //******************************************************************************************//
                //**************************CLASES CON 1 REQUISITO ****************************************//
                //******************************************************************************************//
                if((t.getRequisito1().getNombre().compareTo("nada")!=0)){//si existe un primer requisito...
                    if(t.getRequisito1().isAprobado())//si ese requisito esta aprobado...
                    if(t.getRequisito2().getNombre().equalsIgnoreCase("nada2")){//si no existe un segundo requisito...
                        if(!t.isAprobado()){//si la clase no ha sido aprobada todavia...

                            clasesDelPeriodoATabla.add(t);//se agrega la clase a las clases por cursar de ése periodo
                            contadorClasesPorPeriodo++;//se suma el numero de clases que se van a llevar (debe llegar a 4 clases)
                        }//fin si la clase todavia no ha sido aprobada, o sea, falta por cursar
                    }//fin if para agregar clases con un solo requisito
                }//fin del primer if de los 3

                //******************************************************************************************//
                //**************************CLASES CON 2 REQUISITOS ****************************************//
                //******************************************************************************************//

                if(t.getRequisito1().getNombre().compareTo("nada")!=0){//si existe un primer requisito...
                    if(t.getRequisito1().isAprobado()){//si ése requisito está aprobado...
                        if(t.getRequisito2().getNombre().compareTo("nada2")!=0){//si existe un segundo requisito...
                            if(t.getRequisito2().isAprobado()){//si ese requisito tambien esta aprobado...
                                if(!t.isAprobado()){//si la clase todavia no ha sido aprobada...

                                    clasesDelPeriodoATabla.add(t);//se agrega la clase a las clases por cursar de ése periodo
                                    contadorClasesPorPeriodo++;
                                }//fin si la clase no ha sido aprobada, o sea, falta por cursar
                            }//fin si el segundo requisito ya ha sido aprobado
                        }//fin if si existe un segundo requisito
                    }//fin si el primer requisito ya ha sido aprobado
                }//fin if si existe un primer requisito

                //******************************************************************************************//
                //**************************CLASES QUE NO TIENEN REQUISITOS ****************************************//
                //******************************************************************************************//

                if(t.getRequisito1().getNombre().equalsIgnoreCase("nada")){//si no existe un primer requisito...
                    if(t.getRequisito2().getNombre().equalsIgnoreCase("nada2")){//si no existe un segundo requisito...
                        if(t.getDegree()>=1){//si no es flotante...
                            if(!t.isAprobado()){//si la clase todavi a no ha sido aprobada...
                                clasesDelPeriodoATabla.add(t);//se agrega la clase
                                contadorClasesPorPeriodo++;
                            }//fin si la clase todavia no ha sido aprobada
                        }//fin si esta clase abre alguna otra
                    }//fin si no existe un segundo requisito
                }//fin si no existe un primer requisito

            }//fin del for que recorre toda la lista de clases que no son flotantes

            for(int i=0;i<clasesDelPeriodoATabla.size();i++)
            for(int j=0;j<listaDeClases.size();j++){
                if(clasesDelPeriodoATabla.get(i).getNombre().equalsIgnoreCase(listaDeClases.get(j).getNombre())){
                    listaDeClases.get(j).setAprobado(true);
                    //listaDeClases.get(i).setAprobado(true);
                }
            }

            //******************************************************************************************//
            //**************************CLASES FLOTANTES ****************************************//
            //******************************************************************************************//

            while(contadorClasesPorPeriodo<=3)//si todavia no se han llenado las 4 clases, procedemos a agregar
            // clases flotantes para terminar de rellenar, si es que todavía quedan
            //clases flotantes que todavia no han sido aprobadas
            if(clasesFlotantes.size()>=1){//si existen clases flotantes que no gan sido aprobadas...
                clasesDelPeriodoATabla.add(clasesFlotantes.get(0));//se agregan a la lista de las 4 clases a cursar
                clasesFlotantes.remove(0);//se elimina de la lista de clases flotantes
                contadorClasesPorPeriodo++;//se aumenta el contador que debe llegar a 3 (4 clases)
            }//fin while

            for(int i=0;i<clasesDelPeriodoATabla.size();i++)
            for(int j=0;j<listaDeClases.size();j++){
                if(clasesDelPeriodoATabla.get(i).getNombre().equalsIgnoreCase(listaDeClases.get(j).getNombre())){
                    listaDeClases.get(j).setAprobado(true);
                    listaDeClases.get(i).setAprobado(true);
                }
            }

            System.out.println("Rows: ");//impresión en consola de la tabla
            for(int i=0;i<clasesDelPeriodoATabla.size();i++)//se recorren las 4 clases a cursar
            System.out.print(clasesDelPeriodoATabla.get(i).getNombre()+", ");
            System.out.println();

            clasesDelPeriodoATabla.clear(); //se limpia la lista para empezar la otra vuelta del while
            contadorClasesPorPeriodo=0;//de reinicia el contador de las 4 clases para la nueva vuelta del while
            System.out.println("*******************************************************");

            rellenarGrafo(listaDeClases);

            int contadorAprobadas=0;
            for(int i=0;i<listaDeClases.size();i++){
                if (listaDeClases.get(i).isAprobado()){
                    contadorAprobadas++;
                    if(contadorAprobadas==listaDeClases.size()){
                        termina=true;
                    }
                }
            }
            contadorGlobal++;

            if (contadorGlobal==11)
            break;

        }//fin del while

        if(contadorGlobal==11){
            for(Clase clase:listaDeClases){
                if(!clase.isAprobado()){
                    System.out.print(clase.getNombre()+", ");
                }
            }
        }
        System.out.println();
        System.out.println("Plan terminado!");
    }//GEN-LAST:event_botonGenerarPlanDeEstudioMouseClicked

    private void botonDibujarPlanDeEstudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDibujarPlanDeEstudioMouseClicked
        //dibujar el grafo aqui
    }//GEN-LAST:event_botonDibujarPlanDeEstudioMouseClicked

    public void rellenarGrafo(ArrayList<Clase>lista){
        for(int i=0;i<organigrama.getVertexCount();i++){
            organigrama.removeVertex(i);
        }
        
        for(int i=0;i<listaDeClases.size();i++){
            organigrama.addVertex(listaDeClases.get(i));
        }
        
        //System.out.println("numero de vertices: "+organigrama.getVertexCount());
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaProyecto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDibujarPlanDeEstudio;
    private javax.swing.JButton botonGenerarPlanDeEstudio;
    private javax.swing.ButtonGroup grupoGlobal;
    private javax.swing.ButtonGroup grupoIngenierias;
    private javax.swing.ButtonGroup grupoLicenciaturas;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
    Graph organigrama = new DirectedSparseGraph<String, RouteEdge>();//Grafo Dirigido
    ArrayList <Clase> listaDeClases =new ArrayList();//lista global todas las clases del plan
    ArrayList <Clase> clasesFlotantes = new ArrayList();//lista de las clases flotantes (español, sociología, ecología, etc)
    boolean termina=false;
    Clase intro;
    
    File archivo=new File("./archivo.txt");
    int contadorGlobal=0;
}
