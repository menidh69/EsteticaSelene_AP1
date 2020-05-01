/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas_buscador;

import ctrl.c.registros_dia;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author propietario
 */
public class Ventana_busqueda_calendar {
    int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
	JLabel l = new JLabel("", JLabel.CENTER);
	String day = "";
	JDialog d;
	JButton[] button = new JButton[49];
        
        
        
    public void mostrar_V(){
        
   
        Ventana_busqueda_calendar ventana = new Ventana_busqueda_calendar();
        JFrame v = new JFrame();
        JPanel panel = new JPanel();
        panel.setBounds(20, 20, 500, 500);   
        v.add(panel, BorderLayout.CENTER);
        
        JTextField fecha = new JTextField("");
        JLabel label = new JLabel("Fecha seleccionada:");
        label.setBounds(700, 50, 150, 30);
        fecha.setBounds(700, 100, 100, 30);
        ventana.show(panel, ventana, fecha);
        
        
        JLabel introducir = new JLabel("Introducir fecha");
        JTextField año = new JTextField();
        JTextField mes = new JTextField();
        JTextField dia = new JTextField();
        
        JLabel laño = new JLabel("Año");
        JLabel lmes = new JLabel("Mes");
        JLabel ldia = new JLabel("Dia");
        
        introducir.setBounds(710, 215, 100, 30);
        año.setBounds(700, 250, 50, 30);
        mes.setBounds(750, 250, 50, 30);
        dia.setBounds(800, 250, 50, 30);
        laño.setBounds(710, 285, 50, 30);
        lmes.setBounds(760, 285, 50, 30);
        ldia.setBounds(810, 285, 50, 30);
        
        JButton mostrar = new JButton("Mostrar");
        JButton mostrar1 = new JButton("Mostrar");
        JButton mostrar2 = new JButton("Mostrar");

        
        JButton regresa = new JButton("Regresar");
        
        
        mostrar.setBounds(700, 550, 200, 100);
        regresa.setBounds(350, 550, 200, 100);
        JTextField idbuscar = new JTextField("");
        JLabel idlabel = new JLabel("Buscar por ID:");
        idbuscar.setBounds(700, 450, 100, 30);
        idlabel.setBounds(700, 420, 100, 30);
        
        
        
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if (e.getSource()==regresa){
                     
                 }
                  if (e.getSource()==mostrar){
                     if (fecha.getText().equals("")){
                        
                            JOptionPane.showMessageDialog(null, "Selecciona o introduce una fecha"); 
                         }else{
                         registros_dia r = new registros_dia(fecha.getText());
                         r.setVisible(false);
                         r.showR();
                         r.setVisible(true);
                         v.dispose();
                     }
                 }
                  
                  if (e.getSource()==mostrar1){
                       if (año.getText().equals("") || mes.getText().equals("") || dia.getText().equals("")) {
                      JOptionPane.showMessageDialog(null, "Selecciona o introduce una fecha"); 
                       }else{
                           String date = año.getText()+"-"+mes.getText()+"-"+dia.getText();
                           registros_dia r = new registros_dia(fecha.getText());
                         r.setVisible(false);
                         r.showR();
                         r.setVisible(true);
                         v.dispose();
                     
                       }
                  }
                  
                  if (e.getSource()==mostrar2){
                      if(idbuscar.getText().equals("")){
                      JOptionPane.showMessageDialog(null, "Selecciona o introduce una fecha");     
                      }
                  }
                  
            }
        };
        regresa.addActionListener(listener);
        mostrar.addActionListener(listener);
        v.add(idbuscar);
        v.add(idlabel);
        v.add(mostrar);
        v.add(regresa);
        v.add(año);
        v.add(dia);
        v.add(mes);
        v.add(laño);
        v.add(ldia);
        v.add(lmes);
        v.add(introducir);
        v.add(label);
        v.add(fecha);
        v.setLayout(null);
        v.setResizable(false);
        v.setSize(1000,700);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
        v.setVisible(true);
        
    }
    
    public void show(JPanel parent, Ventana_busqueda_calendar v, JTextField fecha) {
		d = new JDialog();
		d.setModal(true);
		String[] header = { "Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab" };
		JPanel p1 = new JPanel(new GridLayout(7, 7));
		p1.setPreferredSize(new Dimension(430, 430));

		for (int x = 0; x < button.length; x++) {
			final int selection = x;
			button[x] = new JButton();
			button[x].setFocusPainted(false);
			button[x].setBackground(Color.white);
			if (x > 6)
				button[x].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						day = button[selection].getActionCommand();
						fecha.setText(v.setPickedDate());
					}
				});
			if (x < 7) {
				button[x].setText(header[x]);
				button[x].setForeground(Color.red);
			}
			p1.add(button[x]);
		}
		JPanel p2 = new JPanel(new GridLayout(1, 3));
		JButton previous = new JButton("<< Previous");
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				month--;
				displayDate();
			}
		});
		p2.add(previous);
		p2.add(l);
		JButton next = new JButton("Next >>");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				month++;
				displayDate();
			}
		});
		p2.add(next);
		parent.add(p1, BorderLayout.CENTER);
		parent.add(p2, BorderLayout.SOUTH);
		
                
		displayDate();
		parent.setVisible(true);
                
    }
    public void displayDate() {
		for (int x = 7; x < button.length; x++)
			button[x].setText("");
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"MMMM yyyy");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month, 1);
		int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
		int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
		for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
			button[x].setText("" + day);
		l.setText(sdf.format(cal.getTime()));
		d.setTitle("Date Picker");
	}

	public String setPickedDate() {
		if (day.equals(""))
			return day;
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month, Integer.parseInt(day));
		return sdf.format(cal.getTime());
	}
}
    
//    
//    public void show(JPanel parent){
//        
//                 d = new JDialog();
//		d.setModal(true);
//		String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
//		JPanel p1 = new JPanel(new GridLayout(7, 7));
//		p1.setPreferredSize(new Dimension(430, 430));
//
//		for (int x = 0; x < button.length; x++) {
//			final int selection = x;
//			button[x] = new JButton();
//			button[x].setFocusPainted(false);
//			button[x].setBackground(Color.white);
//			if (x > 6)
//				button[x].addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent ae) {
//						day = button[selection].getActionCommand();
//						d.dispose();
//					}
//				});
//			if (x < 7) {
//				button[x].setText(header[x]);
//				button[x].setForeground(Color.red);
//			}
//			p1.add(button[x]);
//		}
//		JPanel p2 = new JPanel(new GridLayout(1, 3));
//		JButton previous = new JButton("<< Previous");
//		previous.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				month--;
//				displayDate();
//			}
//		});
//		p2.add(previous);
//		p2.add(l);
//		JButton next = new JButton("Next >>");
//		next.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				month++;
//				displayDate();
//			}
//		});
//		p2.add(next);
//		parent.add(p1, BorderLayout.CENTER);
//		parent.add(p2, BorderLayout.SOUTH);
//		
//                
//		displayDate();
//		parent.setVisible(true);
//                
//    }
//    public void displayDate() {
//		for (int x = 7; x < button.length; x++)
//			button[x].setText("");
//		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
//				"MMMM yyyy");
//		java.util.Calendar cal = java.util.Calendar.getInstance();
//		cal.set(year, month, 1);
//		int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
//		int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
//		for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
//			button[x].setText("" + day);
//		l.setText(sdf.format(cal.getTime()));
//		d.setTitle("Date Picker");
//	}

