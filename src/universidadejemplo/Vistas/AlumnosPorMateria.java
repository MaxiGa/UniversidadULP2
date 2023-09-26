/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidad.acceso_a_datos.AlumnoData;
import universidad.acceso_a_datos.InscripcionData;
import universidad.acceso_a_datos.MateriaData;
import universidad.entidades.Alumno;
import universidad.entidades.Materia;


public class AlumnosPorMateria extends javax.swing.JInternalFrame {

    private InscripcionData insData = new InscripcionData();
    private AlumnoData aData = new AlumnoData();
    private DefaultTableModel modelo = new DefaultTableModel();
    private MateriaData mat = new MateriaData();
    
    
    public AlumnosPorMateria() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

   private void cargarCombo(){
       
       jcAlumnos.addItem(new Materia());
       List<Materia> materias = mat.listarMaterias();
       for (Materia m : materias) {
           jcAlumnos.addItem(m);
       }
       
   }
   
    private void armarCabecera() {
        ArrayList<Object> titulo = new ArrayList<>();
        titulo.add("ID");
        titulo.add("DNI");
        titulo.add("APELLIDO");
        titulo.add("NOMBRE");
        for (Object tit : titulo) {
            modelo.addColumn(tit);
        }
        jtAlumnos.setModel(modelo);
    }
    
    private void borrarTabla(){
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDEscritotorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultas");

        jDEscritotorio.setBackground(new java.awt.Color(51, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Alumnos Por Materia");

        jLabel2.setText("Seleccione una Materia");

        jcAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosActionPerformed(evt);
            }
        });

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtAlumnos);

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jDEscritotorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritotorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritotorio.setLayer(jcAlumnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritotorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritotorio.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDEscritotorioLayout = new javax.swing.GroupLayout(jDEscritotorio);
        jDEscritotorio.setLayout(jDEscritotorioLayout);
        jDEscritotorioLayout.setHorizontalGroup(
            jDEscritotorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritotorioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jDEscritotorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jDEscritotorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(78, 78, 78)
                        .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDEscritotorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDEscritotorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDEscritotorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDEscritotorioLayout.createSequentialGroup()
                        .addComponent(jbSalir)
                        .addGap(77, 77, 77))))
        );
        jDEscritotorioLayout.setVerticalGroup(
            jDEscritotorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritotorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jDEscritotorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jbSalir)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDEscritotorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDEscritotorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
        
        Materia materia = (Materia)jcAlumnos.getSelectedItem();
        borrarTabla();
        for (Alumno a : insData.obtenerAlumnosXmateria(materia.getIdMateria())) {
            modelo.addRow(new Object[]{a.getIdAlumno(), a.getDni(),a.getApellido(),a.getNombre()});
        }
        
        
    }//GEN-LAST:event_jcAlumnosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritotorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcAlumnos;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
}
