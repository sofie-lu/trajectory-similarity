/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JFileChooser;

import org.jdesktop.swingx.JXMapViewer;

import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.Waypoint;
import org.jdesktop.swingx.mapviewer.WaypointPainter;
import org.jdesktop.swingx.mapviewer.WaypointRenderer;
import org.jdesktop.swingx.painter.CompoundPainter;
import org.jdesktop.swingx.painter.Painter;

import trajectorysimilarity.Coords;
import trajectorysimilarity.TrajectorySimilarity;

/**
 *
 * @author takis
 */
public class TrajectorySimilarityUI extends javax.swing.JFrame {

    /**
     * Creates new form TrajectorySimilarityUI
     */
    public TrajectorySimilarityUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        map = new javax.swing.JFrame();
        jXMapKit1 = new org.jdesktop.swingx.JXMapKit();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        OpenFile1 = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        OpenFile2 = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        Compute = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        epsilon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        delta = new javax.swing.JTextField();
        MostSimilarPart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        paths = new javax.swing.JRadioButton();
        points = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        subsetsimilarity = new javax.swing.JTextField();

        fileChooser.setCurrentDirectory(new java.io.File("/home/takis/NetBeansProjects/TrajectorySimilarity/datasets"));
        fileChooser.setDialogTitle("Choose a File");

        map.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jXMapKit1.setDefaultProvider(org.jdesktop.swingx.JXMapKit.DefaultProviders.OpenStreetMaps);

        javax.swing.GroupLayout mapLayout = new javax.swing.GroupLayout(map.getContentPane());
        map.getContentPane().setLayout(mapLayout);
        mapLayout.setHorizontalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapKit1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        mapLayout.setVerticalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapKit1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Trajectory Similarity"));

        label1.setText("Choose File 1");

        OpenFile1.setText("File1");
        OpenFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFile1ActionPerformed(evt);
            }
        });

        label2.setText("Choose File 2");

        OpenFile2.setText("FIle 2");
        OpenFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFile2ActionPerformed(evt);
            }
        });

        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        Compute.setText("Compute");
        Compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeActionPerformed(evt);
            }
        });

        jLabel1.setText("Epsilon:");

        epsilon.setText("0.01");
        epsilon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epsilonActionPerformed(evt);
            }
        });

        jLabel2.setText("Similarity:");

        jLabel3.setText("Delta:");

        delta.setText("500");

        MostSimilarPart.setText("Go");
        MostSimilarPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostSimilarPartActionPerformed(evt);
            }
        });

        jLabel4.setText("Find the most similar part of S and Q");

        buttonGroup1.add(paths);
        paths.setSelected(true);
        paths.setText("Paths");

        buttonGroup1.add(points);
        points.setText("Points");

        jLabel5.setText("Subset Similarity:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(3, 3, 3)
                        .addComponent(OpenFile1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(label2)
                        .addGap(4, 4, 4)
                        .addComponent(OpenFile2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(epsilon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(time)
                                .addGap(32, 32, 32)
                                .addComponent(Compute))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MostSimilarPart))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(paths)
                                .addGap(18, 18, 18)
                                .addComponent(points))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subsetsimilarity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(OpenFile1)
                    .addComponent(label2)
                    .addComponent(OpenFile2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(epsilon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Compute)
                    .addComponent(time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paths)
                    .addComponent(points))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(delta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(subsetsimilarity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostSimilarPart)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFile1ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //          textarea.read(new FileReader(file.getAbsolutePath()), null);
            label1.setText(file.getName());

            try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String sCurrentLine;
                ArrayList<Coords> temp = new ArrayList<>();
                while ((sCurrentLine = br.readLine()) != null) {
                    String[] split = sCurrentLine.split(",");
                    Coords coord = new Coords(Double.parseDouble(split[2]), Double.parseDouble(split[3]));
                    temp.add(coord);
                }
                Coords[] array = new Coords[temp.size()];
                TrajectorySimilarity.setFirst(temp.toArray(array));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenFile1ActionPerformed

    private void OpenFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFile2ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //          textarea.read(new FileReader(file.getAbsolutePath()), null);
            label2.setText(file.getName());

            try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                String sCurrentLine;
                ArrayList<Coords> temp = new ArrayList<>();
                while ((sCurrentLine = br.readLine()) != null) {
                    String[] split = sCurrentLine.split(",");
                    Coords coord = new Coords(Double.parseDouble(split[2]), Double.parseDouble(split[3]));
                    temp.add(coord);
                }
                Coords[] array = new Coords[temp.size()];
                TrajectorySimilarity.setSecond(temp.toArray(array));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenFile2ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void ComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeActionPerformed
        TrajectorySimilarity.setEpsilon(Double.parseDouble(epsilon.getText()));
        long start = System.currentTimeMillis();
        Double similarity = TrajectorySimilarity.computeSimilarity();
        if (similarity != null) {
            text.setText(TrajectorySimilarity.computeSimilarity() + "");
            time.setText((System.currentTimeMillis() - start) + "ms");
            map.pack();
            map.setVisible(true);
            if(points.isSelected()){
               drawAsPoints(); 
            }
            else{
               drawAsPath();
            }

            
        }


    }//GEN-LAST:event_ComputeActionPerformed

    private void drawAsPoints() {
        jXMapKit1.setAddressLocation(new GeoPosition(39.94226, 116.30256));
        Set<MyWaypoint> waypoints = new HashSet<>();
        for (Coords coord : TrajectorySimilarity.getFirst()) {
            waypoints.add(new MyWaypoint("a".charAt(0), coord.getLatitude(), coord.getLongtitude()));
        }
        for (Coords coord : TrajectorySimilarity.getSecond()) {
            waypoints.add(new MyWaypoint("b".charAt(0), coord.getLatitude(), coord.getLongtitude()));
        }
        if (TrajectorySimilarity.getSubset() != null) {
            for (Coords coord : TrajectorySimilarity.getSubset()) {
                waypoints.add(new MyWaypoint("c".charAt(0), coord.getLatitude(), coord.getLongtitude()));
            }
        }

        //crate a WaypointPainter to draw the points
        WaypointPainter painter = new WaypointPainter();

        painter.setRenderer(new WaypointRenderer() {
            @Override
            public boolean paintWaypoint(Graphics2D g, JXMapViewer map, Waypoint wp) {
                MyWaypoint mw = (MyWaypoint) wp;
                if (mw.getId() == 'a') {
                    g.setColor(Color.RED);
                } else if (mw.getId() == 'b') {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.GREEN);
                }

                g.drawLine(-5, -5, +5, +5);
                g.drawLine(-5, +5, +5, -5);
                return true;
            }
        });
        jXMapKit1.getMainMap().setOverlayPainter(painter);
        painter.setWaypoints(waypoints);
    }

    private void drawAsPath() {
        jXMapKit1.setAddressLocation(new GeoPosition(39.94226, 116.30256));
        final List<GeoPosition> region = new ArrayList<>();
        for (Coords coord : TrajectorySimilarity.getFirst()) {
            region.add(new GeoPosition(coord.getLatitude(), coord.getLongtitude()));
        }
        final List<GeoPosition> region2 = new ArrayList<>();
        for (Coords coord : TrajectorySimilarity.getSecond()) {
            region2.add(new GeoPosition(coord.getLatitude(), coord.getLongtitude()));
        }
        final List<GeoPosition> region3 = new ArrayList<>();
        if (TrajectorySimilarity.getSubset() != null) {
            
            for (Coords coord : TrajectorySimilarity.getSubset()) {
                region3.add(new GeoPosition(coord.getLatitude(), coord.getLongtitude()));
            }
        }

        Painter<JXMapViewer> pathOverlay = new Painter<JXMapViewer>() {
            @Override
            public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
                g = (Graphics2D) g.create();
                //convert from viewport to world bitmap

                Rectangle rect = map.getViewportBounds();
                g.translate(-rect.x, -rect.y);

                GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                        region.size());
                boolean flag = true;
                for (GeoPosition gp : region) {
                    //convert geo to world bitmap pixel
                    Point2D pt = map.getTileFactory().geoToPixel(gp, map.getZoom());

                    if (flag) {
                        path.moveTo(pt.getX(), pt.getY());
                        flag = false;
                    } else {
                        path.lineTo(pt.getX(), pt.getY());
                    }

                }

                //do the drawing
                g.setStroke(new BasicStroke(2.0f));
                g.setColor(Color.RED);

                g.draw(path);
                g.dispose();
            }
        };

        Painter<JXMapViewer> pathOverlay2 = new Painter<JXMapViewer>() {
            @Override
            public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
                g = (Graphics2D) g.create();
                //convert from viewport to world bitmap

                Rectangle rect = map.getViewportBounds();
                g.translate(-rect.x, -rect.y);

                GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                        region.size());
                boolean flag = true;
                for (GeoPosition gp : region2) {
                    //convert geo to world bitmap pixel
                    Point2D pt = map.getTileFactory().geoToPixel(gp, map.getZoom());

                    if (flag) {
                        path.moveTo(pt.getX(), pt.getY());
                        flag = false;
                    } else {
                        path.lineTo(pt.getX(), pt.getY());
                    }

                }

                //do the drawing
                g.setStroke(new BasicStroke(2.0f));
                g.setColor(Color.BLUE);

                g.draw(path);
                g.dispose();
            }
        };
        Painter<JXMapViewer> pathOverlay3 = null;
        if (TrajectorySimilarity.getSubset() != null) {

            pathOverlay3 = new Painter<JXMapViewer>() {
                @Override
                public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
                    g = (Graphics2D) g.create();
                    //convert from viewport to world bitmap

                    Rectangle rect = map.getViewportBounds();
                    g.translate(-rect.x, -rect.y);

                    GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                            region.size());
                    boolean flag = true;
                    for (GeoPosition gp : region3) {
                        //convert geo to world bitmap pixel
                        Point2D pt = map.getTileFactory().geoToPixel(gp, map.getZoom());

                        if (flag) {
                            path.moveTo(pt.getX(), pt.getY());
                            flag = false;
                        } else {
                            path.lineTo(pt.getX(), pt.getY());
                        }

                    }

                    //do the drawing
                    g.setStroke(new BasicStroke(2.0f));
                    g.setColor(Color.GREEN);

                    g.draw(path);
                    g.dispose();
                }
            };

        }

//        jXMapKit1.getMainMap().setOverlayPainter(pathOverlay);
        CompoundPainter cp = new CompoundPainter();
        if (TrajectorySimilarity.getSubset() != null) {
            cp.setPainters(pathOverlay, pathOverlay2, pathOverlay3);
        } else {
            cp.setPainters(pathOverlay, pathOverlay2);
        }

        cp.setCacheable(false);
        jXMapKit1.getMainMap().setOverlayPainter(cp);
    }


    private void epsilonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epsilonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epsilonActionPerformed

    private void MostSimilarPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostSimilarPartActionPerformed
        // TODO add your handling code here:
        TrajectorySimilarity.setEpsilon(Double.parseDouble(epsilon.getText()));
        int Delta = Integer.parseInt(delta.getText());
        long start = System.currentTimeMillis();
        Double similarity = TrajectorySimilarity.getMostSimilarSubset(Delta);
        if (similarity != null) {
            //text.setText(TrajectorySimilarity.computeSimilarity() + "");
            time.setText((System.currentTimeMillis() - start) + "ms");
            text.setText(TrajectorySimilarity.computeSimilarity() + "");
            subsetsimilarity.setText(similarity + "");
            map.pack();
            map.setVisible(true);

            if(points.isSelected()){
               drawAsPoints(); 
            }
            else{
               drawAsPath();
            }
        }
        TrajectorySimilarity.setSubset(null);
    }//GEN-LAST:event_MostSimilarPartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrajectorySimilarityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrajectorySimilarityUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compute;
    private javax.swing.JButton MostSimilarPart;
    private javax.swing.JButton OpenFile1;
    private javax.swing.JButton OpenFile2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField delta;
    private javax.swing.JTextField epsilon;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXMapKit jXMapKit1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JFrame map;
    private javax.swing.JRadioButton paths;
    private javax.swing.JRadioButton points;
    private javax.swing.JTextField subsetsimilarity;
    private javax.swing.JTextField text;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
