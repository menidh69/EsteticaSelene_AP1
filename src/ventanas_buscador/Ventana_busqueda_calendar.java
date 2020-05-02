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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
        
    public static void main(String[] args) {
        Ventana_busqueda_calendar n = new Ventana_busqueda_calendar();
        n.mostrar_V();
    }
    
        
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
        
        String [] dias31 = new String[] {"01","02","03","04","05","06","07","08","09","10",
            "11","12","13","14","15","16","17","18","19","20",
        "21","22","23","24","25","26","27","28","29","30","31"};
        String [] dias30 = new String[] {"01","02","03","04","05","06","07","08","09","10",
            "11","12","13","14","15","16","17","18","19","20",
        "21","22","23","24","25","26","27","28","29","30"};;
        String [] dias28 = new String[] {"01","02","03","04","05","06","07","08","09","10",
            "11","12","13","14","15","16","17","18","19","20",
        "21","22","23","24","25","26","27","28", "29"};;
        
        
        JLabel introducir = new JLabel("Introducir fecha");
        JComboBox año = new JComboBox<>();
        JComboBox mes = new JComboBox<>();
        JComboBox dia = new JComboBox<>();
        año.addItem("Año");
        año.addItem("2020");
        año.addItem("2019");
        año.addItem("2018");
        año.addItem("2017");
        mes.addItem("Mes");
        mes.addItem("01");
        mes.addItem("02");
        mes.addItem("03");
        mes.addItem("04");
        mes.addItem("05");
        mes.addItem("06");
        mes.addItem("07");
        mes.addItem("08");
        mes.addItem("09");
        mes.addItem("10");
        mes.addItem("11");
        mes.addItem("12");
        dia.addItem("Dia");
        JLabel laño = new JLabel("Año");
        JLabel lmes = new JLabel("Mes");
        JLabel ldia = new JLabel("Dia");
        
        introducir.setBounds(710, 215, 100, 30);
        año.setBounds(650, 250, 100, 30);
        mes.setBounds(760, 250, 80, 30);
        dia.setBounds(850, 250, 80, 30);
        laño.setBounds(650, 285, 50, 30);
        lmes.setBounds(760, 285, 50, 30);
        ldia.setBounds(850, 285, 50, 30);
        
        JButton mostrar = new JButton("Mostrar");
        JButton mostrar1 = new JButton("Mostrar");
        JButton mostrar2 = new JButton("Mostrar");

        
        JButton regresa = new JButton("Regresar");
        
        
        mostrar.setBounds(700, 550, 200, 100);
        regresa.setBounds(350, 550, 200, 100);
       
        
        mes.addItemListener(new ItemListener(){
            @Override
             public void itemStateChanged(ItemEvent e) {
                 
                 if(mes.getSelectedItem().equals("Mes")){
                     dia.removeAllItems();
                     dia.addItem("Dia");
                 }
                 if(mes.getSelectedItem().equals("01") || mes.getSelectedItem().equals("03") ||
                         mes.getSelectedItem().equals("05") || mes.getSelectedItem().equals("07") || mes.getSelectedItem().equals("08") ||
                         mes.getSelectedItem().equals("10") || mes.getSelectedItem().equals("12")){
                        dia.setModel(new DefaultComboBoxModel(dias31));
                 }if(mes.getSelectedItem().equals("02")){
                     dia.setModel(new DefaultComboBoxModel(dias28));
                 }
                 if(mes.getSelectedItem().equals("04") || mes.getSelectedItem().equals("06") ||
                         mes.getSelectedItem().equals("09") || mes.getSelectedItem().equals("11") ){
                     dia.setModel(new DefaultComboBoxModel(dias30));
                 }
                 
             }
        
    });
        
        
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if (e.getSource()==regresa){
                     
                 }
                  if (e.getSource()==mostrar){
                      
                     if (!fecha.getText().equals("")){
                         registros_dia r = new registros_dia(fecha.getText());
                         
                         r.setVisible(false);
                         r.showR();
                         
                         r.setVisible(true);
                         v.dispose();
                             
                         }else{
                         if (año.getSelectedItem().equals("Año") || mes.getSelectedItem().equals("Mes") || dia.getSelectedItem().equals("Dia")) {
                         JOptionPane.showMessageDialog(null, "Selecciona o introduce una fecha");
                         }else{
                         String date = año.getSelectedItem().toString()+"-"+mes.getSelectedItem().toString()+"-"+dia.getSelectedItem().toString();
                             System.out.println(date);
                         registros_dia r = new registros_dia(date);
                         r.setVisible(false);
                         r.showR();
                         r.setVisible(true);
                         v.dispose();
                         }
                     }
                 }
                  
                 
                  
                  
                  
            }
        };
        regresa.addActionListener(listener);
        mostrar.addActionListener(listener);
       
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

