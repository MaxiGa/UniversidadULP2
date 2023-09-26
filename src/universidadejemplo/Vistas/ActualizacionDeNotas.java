
package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidad.acceso_a_datos.AlumnoData;
import universidad.acceso_a_datos.InscripcionData;
import universidad.acceso_a_datos.MateriaData;
import universidad.entidades.Alumno;
import universidad.entidades.Inscripcion;
import universidad.entidades.Materia;


public class ActualizacionDeNotas extends javax.swing.JInternalFrame {
    
     private DefaultTableModel modelo = new DefaultTableModel(){
     @Override
        public boolean isCellEditable(int f, int c) {
            return c == 2;
        }
     };
     private MateriaData materia = new MateriaData();
     private InscripcionData inscripcion = new InscripcionData();
     private AlumnoData alumno = new AlumnoData();

   
    public ActualizacionDeNotas() {
        initComponents();
        cargarCombo();
        cargarCabecera();
        llenarTabla();
        
        
    }
   
    
    
     private void cargarCabecera() {
        modelo.addColumn("CODIGO"); //columna0
        modelo.addColumn("NOMBRE"); //columna 1
        modelo.addColumn("NOTA"); // columna 2
        jtAlumnos.setModel(modelo);
    }
     
    
    private void llenarTabla(){
        Alumno alumnos = (Alumno)jcAlumnos.getSelectedItem();
        Inscripcion ins = new Inscripcion();
        modelo.setRowCount(0);
        List<Materia>matCursadas = inscripcion.obtenerMateriasCursadas(alumnos.getIdAlumno());
            
            
            
            for (Materia m : matCursadas) {
                modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),ins.getNota()});
            
        }
            
    }
    
    
     private void cargarCombo() {
         
         List<Alumno>alumnos = alumno.listarAlumno();
         for (Alumno a : alumnos) {
             jcAlumnos.addItem(a);
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Carga de Notas");

        jDEscritorio.setBackground(new java.awt.Color(51, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno");

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

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritorio.setLayer(jcAlumnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritorio.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDEscritorio.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritorioLayout.createSequentialGroup()
                .addGroup(jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDEscritorioLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1))
                    .addGroup(jDEscritorioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDEscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(104, 104, 104)
                                .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDEscritorioLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jbGuardar)
                        .addGap(173, 173, 173)
                        .addComponent(jButton2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEscritorioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
        
        llenarTabla();
    }//GEN-LAST:event_jcAlumnosActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Inscripcion in = new Inscripcion();
          int filaS = jtAlumnos.getSelectedRow();//fila seleccionada en la tabla
        int idM = (int)jtAlumnos.getValueAt(filaS, 0);//
         //double nota = Double.parseDouble(jtAlumnos.getValueAt(filaS, 2).toString());
         double nota = Double.parseDouble( jtAlumnos.getValueAt(filaS, 2).toString()) ;
       
        Alumno alumnos = new Alumno();
        alumnos = (Alumno)jcAlumnos.getSelectedItem();
        
        int ID = alumnos.getIdAlumno();
         
         
           inscripcion.actualizarNota(ID, idM,nota ); 
        
       
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Alumno> jcAlumnos;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
}
