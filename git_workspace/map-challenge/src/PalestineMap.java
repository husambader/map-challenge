import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class PalestineMap extends JFrame {

	public static JPanel mypanel2 = new JPanel();
	private static int x1 = 0;
	private static int y1 = 0;

	public static JLabel heb = new JLabel("H");
   public static int countercit;
   public static JTextArea cit = new JTextArea(10, 5);
	 public static JTextArea result = new JTextArea(4,6);

	public static void main(String[] args) throws IOException {
        Digistra  di = new Digistra();
        ArrayList<String> CitiesNames = new ArrayList<String>();
    	
        final Graphs.Edge[] GRAPH = {
            
     		   
      		   new Graphs.Edge("HEBRON", "BETHLEHEM",27),
      		   
      		   new Graphs.Edge("BETHLEHEM", "HEBRON",27),

     		   new Graphs.Edge("NASRAH", "SAFAD", 37),
     		   new Graphs.Edge("SAFAD","NASRAH" ,37),
     		   new Graphs.Edge("NATANYA", "NASRAH", 60),
     		   new Graphs.Edge("NASRAH","NATANYA", 60),
     		   new Graphs.Edge("NATANYA", "ACKA",71),
     		   new Graphs.Edge("ACKA","NATANYA",71),
     		   new Graphs.Edge("NATANYA", "HAIFA",54),
     		   new Graphs.Edge( "HAIFA","NATANYA",54),
     		   new Graphs.Edge("ACKA", "SAFAD",39),
     		   new Graphs.Edge( "SAFAD","ACKA",39),
     		   new Graphs.Edge("ACKA", "NASRAH",33),
     		   new Graphs.Edge( "NASRA","ACKA",33),
     		   new Graphs.Edge("ACKA", "HAIFA",26),
     		   new Graphs.Edge( "HAIFA","ACKA",26),
     		  
     		   new Graphs.Edge("TABAREYAH", "HAIFA",51),
     		   new Graphs.Edge("HAIFA","TABAREYAH", 51),
     		   new Graphs.Edge("nazareth", "HAIFA",32), 
     		   new Graphs.Edge( "HAIFA","NASRAH",32),
     		   new Graphs.Edge("NASRAH", "SAFAD",59),
     		   new Graphs.Edge( "SAFAD","NASRAH",59),
     		   new Graphs.Edge("NASRAH", "TABAREYAH",31),
     		   new Graphs.Edge("TABAREYAH", "SAFAD",36),
     		   new Graphs.Edge( "SAFAD","TABAREYAH",36),
     		   new Graphs.Edge("NASRAH", "JINEEN",26),
     		   new Graphs.Edge( "JINEEN","NASRAH",26),  
     		   new Graphs.Edge("NASRAH", "KHDERA",36),
     		   new Graphs.Edge( "KHDERA","NASRAH",36),
     		   new Graphs.Edge( "KHDERA","TABAREYAH",70),
     		   new Graphs.Edge( "TABAREYAH","KHDERA",70),
     		   new Graphs.Edge( "KDERA","JINEEN",36),
     		   new Graphs.Edge( "JINEEN","KDERA",36),
     		   new Graphs.Edge( "JINEEN","tubas",17),
     		   new Graphs.Edge( "tubas","JINEEN",17),
     		   new Graphs.Edge( "JINEEN","TOLKAREM",31),
     		   new Graphs.Edge( "TOLKAREM","JINEEN",31),
     		   new Graphs.Edge( "JINEEN","TABAREYAH",43),
     		   new Graphs.Edge( "TABAREYAH","JINEEN",43),	   
     		   new Graphs.Edge( "TOLKAREM","KHDERA",17),
     		   new Graphs.Edge( "KHDERA","TOLKAREM",17),
     		   new Graphs.Edge( "TULKAREM","NABLUS",24),
     		   new Graphs.Edge( "NABLUS","TOLKAREM",24),
     		   new Graphs.Edge( "NABLUS","TUBAS",15),
     		   new Graphs.Edge( "TUBAS","NABLUS",15),
     		   new Graphs.Edge( "NATANYA","NABLUS",40),
     		   new Graphs.Edge( "NABLUS","NATANYA",40),
     		   new Graphs.Edge( "YAFA","NATANYA",22),
     		   new Graphs.Edge( "NATANYA","YAFA",22),
     
     
     		   new Graphs.Edge( "LED","ASHDUD",27),
     		   new Graphs.Edge( "ASHDUD","LED",27),
     		   new Graphs.Edge( "LED","YAFA",18),
     		   new Graphs.Edge( "YAFA","LED",18),
     		   new Graphs.Edge( "LED","ASQALAN",43),
     		   new Graphs.Edge( "ASQALAN","LED",43),
     		   new Graphs.Edge( "LED","RAMLEH",3),
     		   new Graphs.Edge( "RAMLEH","LED",3),
     		   new Graphs.Edge( "LED","RAMALLAH",30),
     		   new Graphs.Edge( "RAMALLAH","LED",30),
     		   new Graphs.Edge( "LED","JERUSALEM",37),
     		   new Graphs.Edge( "JERUSALEM","LED",37),
     		   new Graphs.Edge( "JERUSALEM","RAMLEH",38),
     		   new Graphs.Edge( "RAMLEH","JERUSALEM",38),
     		   new Graphs.Edge( "JERUSALEM","RAMALLAH",15),
     		   new Graphs.Edge( "RAMLEH","JERUSALEM",15),
     		   new Graphs.Edge( "RAMALLAH","JERICHO",25),
     		   new Graphs.Edge( "JERICHO","RAMALLAH",25),
     		   new Graphs.Edge( "JERICHO","JERUSALEM",25),
     		   new Graphs.Edge( "JERUSALEM","JERICHO",25),
     		   new Graphs.Edge( "JERICHO","tubas",52),
     		   new Graphs.Edge( "tubas","JERICHO",52),
     		   new Graphs.Edge( "ASQALAN","QAZA",15),
     		   new Graphs.Edge( "QAZA","ASQALAN",15),
     		   new Graphs.Edge( "ASQALAN","ASHDUD",9),
     		   new Graphs.Edge( "ASHDUD","ASQALAN",9),
     		   new Graphs.Edge( "JERUSALEM","QAZA",77),
     		   new Graphs.Edge( "QAZA","JERUSALEM",77),
     		   new Graphs.Edge( "JERUSALEM","BETHLEHEM",7),
     		   new Graphs.Edge( "BETHLEHEM","JERUSALEM",7),
     		   new Graphs.Edge( "QAZA","BETHLEHEM",28),
     		   new Graphs.Edge( "BETHLEHEM","QAZA",28),
     		   new Graphs.Edge( "BEER SABEE","HEBRON",43),
     		   new Graphs.Edge( "HEBRON","BEER SABEE",43),
     		   new Graphs.Edge( "BEER SABE","GAZA",41),
     		   new Graphs.Edge( "GAZA","BEER SABE",41),
     		   new Graphs.Edge( "HEBRON","JERUSALEM",34),
     		   new Graphs.Edge( "JERUSALEM","HEBRON",34),

 
     		
     		   new Graphs.Edge( "KHAN YOUNES","GAZA",23),
     		   new Graphs.Edge( "GAZA","KNAN YOUNES",23),
     		   new Graphs.Edge( "KHAN YOUNES","RAFAH",10),
     		   new Graphs.Edge( "RAFAH","KHAN YOUNES",10),};
        
        
        
        
        
		JFrame myframe = new JFrame("Palestine Map");
		JPanel mypanel = new JPanel();
		JPanel mypanel3 = new JPanel();

		myframe.setVisible(true);
		myframe.setSize(1230, 740);
		myframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mypanel.setBorder(BorderFactory.createTitledBorder("Options"));
		mypanel.setLayout(new GridLayout(5, 1, 20, 120));
		mypanel3.setLayout(new GridLayout(7, 2, 50, 20));

		mypanel2.setBorder(BorderFactory.createTitledBorder("Palestine Map "));
		mypanel3.setBorder(BorderFactory.createTitledBorder("Result  "));

		JLabel heb = new JLabel("H");

		JLabel b = new JLabel("B");
		JLabel j = new JLabel("J");
		JLabel r = new JLabel("R");
		JLabel led = new JLabel("LD");

		JLabel n = new JLabel("N");
		JLabel a = new JLabel("A");
		JLabel jer = new JLabel("Jer");
		JLabel safad = new JLabel("S");
		JLabel gaza = new JLabel("G");
		JLabel beer = new JLabel("bs");
		JLabel tab = new JLabel("T");
		JLabel KY = new JLabel("KY");
		JLabel raf = new JLabel("rfh");
		JLabel nab = new JLabel("nab");
		JLabel tolk = new JLabel("T");
		JLabel haifa = new JLabel("Hfa");
		JLabel rafah = new JLabel("rfh");
		JLabel asqalan = new JLabel("ASQ");
		JLabel ramleh = new JLabel("Rm");
		JLabel yafa = new JLabel("Y");
		JLabel Ashdud= new JLabel("Ashd");
		JLabel talabeeb = new JLabel("Tb");
		JLabel kh = new JLabel("KH");
		JLabel Jinen = new JLabel("Jn");
		JLabel beesan = new JLabel("bs");
		JLabel nasreh = new JLabel("Ns");
		JLabel tabarayh = new JLabel("Tbr");
		JLabel jalel = new JLabel("NAS");
		JLabel eilat = new JLabel("E");
		
		
		JLabel source = new JLabel("Source");
		JTextField src = new JTextField(5);
		JLabel dest = new JLabel(" Destination");
		JTextField de = new JTextField(5);
		JLabel w1 = new JLabel("  Õ–Ì— : ⁄·Ìﬂ «·‰ﬁ— „—… Ê«ÕœÂ ·„⁄—› «·„œÌ‰… «·„’œ— ");
		JLabel w2 = new JLabel(" «‰ﬁ— „— Ì‰ ··„œÌ‰… «·Âœ› ");

		JScrollPane scrol = new JScrollPane(cit);
		scrol.setVerticalScrollBarPolicy(scrol.VERTICAL_SCROLLBAR_ALWAYS);
		scrol.setSize(20, 50);
		cit.setBounds(100, 100, 300, 200);

		JButton sortpath = new JButton("Shortest Path");
		sortpath.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == sortpath) {
					cit.append("<<<   :  ·ﬁœ „——  »·„œ‰ «· «·Ì…  >>> ");
				 //  String START= src.getText();
                  //  String END = de.getText();
					String START = src.getText();
					   String END = de.getText();
                    Graphs g = new Graphs(GRAPH);
                    g.dijkstra(START);
                    g.printPath(END);
                  //  g.printAllPaths();
                    
                    for (int i = 0; i < CitiesNames.size(); i++) {
                		System.err.println(CitiesNames.get(i)+"--+");
                	//	cit.setText(CitiesNames.get(i)+"--");
                        int countercit =CitiesNames.size();

                	}
                  				}
			}
		});
     
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == exit) {
					System.exit(0);
				}
			}
		});

		JLabel shortpath = new JLabel("Shortest Path :");
		JLabel coord = new JLabel("coordinates :");
		JTextField xy = new JTextField(20);
		ImageIcon pic = new ImageIcon("C:\\Users\\DELL\\Desktop\\PalestineMap\\map1.jpg");
        JButton clear = new JButton("CLEAR");
        
        clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==clear){
					cit.setText("");
				}
			}
		});
		JLabel img = new JLabel();
		img.setLayout(new FlowLayout(FlowLayout.CENTER));
		img.setIcon(pic);

		img.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			public void sourcepressed() {
				haifa.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if(e.getClickCount()%2==1){
							src.setText("HAIFA");
						}
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				ramleh.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if(e.getClickCount()%2==1){
							src.setText("RAMLEH");
						}
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
               heb.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
 					if(e.getClickCount()%2==1){
 						src.setText("HEBRON");
 					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               b.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("BETHLEHEM");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               beer.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("BEER SABE");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               rafah.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("RAFAH");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               KY.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("KHAN YOUNES");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               r.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("RAMALLAH");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               j.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("JERUSALEM");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               led.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
                 if(e.getClickCount()%2==1){
                	 src.setText("LED");
                 }
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               nab.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("NABLUS");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               n.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("NATANYA");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               jer.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("JERICHO");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               safad.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("SAFAD");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               tolk.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("TOLKAREM");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               gaza.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("GAZA");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               a.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("ACKA");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               asqalan.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
                 if(e.getClickCount()%2==1){
                	 src.setText("ASQALAN");
                 }
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               Ashdud.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getClickCount()%2==1){
						src.setText("ASHDUD");
					}
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               yafa.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("YAFA");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               talabeeb.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("TAL ABEEB");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               kh.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("KHDERA");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               Jinen.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("JINEEN");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               beesan.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("BEESAN");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               nasreh.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("NASRAH");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               tabarayh.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if(e.getClickCount()%2==1){
						src.setText("TABAREYAH");
					}
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
               
			}
            public  void destinationpressed() {
            	  heb.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
       					if(e.getClickCount()%2==0){
       						de.setText("HEBRON");
       						src.setText("");
       					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     b.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("BETHLEHEM");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     r.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("RAMALLAH");
      					
       						src.setText("");
      					}
      					
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     j.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("JERUSALEM");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     led.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
                       if(e.getClickCount()%2==0){
                      	 de.setText("LED");
    						src.setText("");

                       }
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     nab.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("NABLUS");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     ramleh.addMouseListener(new MouseListener() {
						
						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub
							if(e.getClickCount()%2==0){
								de.setText("RAMLEH");
								src.setText(" ");
							}
						}
						
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
                     n.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("NATANYA");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     jer.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("JERICHO");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                   jalel.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if(e.getClickCount()%2==1){
							src.setText("NASRAH");
						}
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
                     safad.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("SAFAD");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     tolk.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("TOLKAREM");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     jalel.addMouseListener(new MouseListener() {
						
						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub
							if(e.getClickCount()%2==0){
								src.setText("");
								de.setText("NASRAH");
							}
						}
						
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
                     gaza.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("GAZA");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     a.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("ACKA");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     asqalan.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
                       if(e.getClickCount()%2==0){
                      	 de.setText("ASQALAN");
    						src.setText("");

                       }
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     Ashdud.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					if(e.getClickCount()%2==0){
      						de.setText("ASHDUD");
       						src.setText("");

      					}
      					
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     yafa.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					// TODO Auto-generated method stub
      					if(e.getClickCount()%2==0){
      						de.setText("YAFA");
       						src.setText("");

      					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     talabeeb.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					// TODO Auto-generated method stub
      					if(e.getClickCount()%2==0){
      						de.setText("TAL ABEEB");
       						src.setText("");

      					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     kh.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					// TODO Auto-generated method stub
      					if(e.getClickCount()%2==0){
      						de.setText("KHDERA");
       						src.setText("");

      					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     Jinen.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					// TODO Auto-generated method stub
      					if(e.getClickCount()%2==0){
      						de.setText("JINEEN");
       						src.setText("");

      					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     beesan.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					// TODO Auto-generated method stub
      					if(e.getClickCount()%2==0){
      						de.setText("BEESAN");
       						src.setText("");

      					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     nasreh.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					// TODO Auto-generated method stub
      					if(e.getClickCount()%2==0){
      						de.setText("NASRAH");
       						src.setText("");

      					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
                     tabarayh.addMouseListener(new MouseListener() {
      				
      				@Override
      				public void mouseReleased(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mousePressed(MouseEvent e) {
      					// TODO Auto-generated method stub
      					if(e.getClickCount()%2==0){
      						de.setText("TABAREYAH");
       						src.setText("");

      					}
      				}
      				
      				@Override
      				public void mouseExited(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseEntered(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      				
      				@Override
      				public void mouseClicked(MouseEvent e) {
      					// TODO Auto-generated method stub
      					
      				}
      			});
            	
            	beer.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if(e.getClickCount()%2==0){
							de.setText("BEER SABEE");
							src.setText("");
						}
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
            	haifa.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						if(e.getClickCount()%2==0){
							src.setText("");
							de.setText("HAIFA");
						}
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
            	

			}
			public void citiescorrdinates() {

				Point point = MouseInfo.getPointerInfo().getLocation();
				// double X = point.getX();
				// double Y = point.getY();
				point.getX();
				point.getY();
				System.out.println(point.getX() + "" + " " + point.getY());
				xy.setText("x=" + point.getX() + " , " + "y=" + point.getY());

				                                                  // set the location of jlabel on map
				heb.setLocation(250, 335);

				heb.setToolTipText("Â–Â „œÌ‰… «·Œ·Ì·  »⁄œ ÕÊ«·Ì 29ﬂ„  ⁄‰ «·⁄«’„… ");
				b.setLocation(285, 307);
				j.setLocation(285, 290);
				led.setLocation(235, 260);
				r.setLocation(285, 275);
				n.setLocation(235, 207);
				tolk.setLocation(260,197);
				jer.setLocation(300, 285);
				nab.setLocation(285,220);
				safad.setLocation(320,110);
				gaza.setLocation(190,335); 
				a.setLocation(260,117);
				asqalan.setLocation(195,320);
				ramleh.setLocation(215,290);
				kh.setLocation(230,180);
				beer.setLocation(210, 380);
				Jinen.setLocation(290,180);
				beesan.setLocation(310,175);
				nasreh.setLocation(280,190);
				tabarayh.setLocation(320,140);
				jalel.setLocation(290,150);
				yafa.setLocation(225,255);
				haifa.setLocation(250,130);
				KY.setLocation(160,360);
				talabeeb.setLocation(225, 241);
				rafah.setLocation(160, 370);
				Ashdud.setLocation(200,300);
				
				rafah.setForeground(Color.red);

				yafa.setForeground(Color.red);
				haifa.setForeground(Color.red);
				KY.setForeground(Color.red);
				beesan.setForeground(Color.red);
				talabeeb.setForeground(Color.red);
                beer.setForeground(Color.red);
				asqalan.setForeground(Color.red);
				Ashdud.setForeground(Color.red);
				kh.setForeground(Color.red);
				Jinen.setForeground(Color.red);
				nasreh.setForeground(Color.red);
				tabarayh.setForeground(Color.red);
				jalel.setForeground(Color.red);
               ramleh.setForeground(Color.red);
				gaza.setForeground(Color.red);                                            // set colors of the jlabels to red
				heb.setForeground(Color.red);
				b.setForeground(Color.red);
				j.setForeground(Color.red);
				led.setForeground(Color.red);
				r.setForeground(Color.red);
				jer.setForeground(Color.red);
				n.setForeground(Color.red);
				nab.setForeground(Color.red);
				safad.setForeground(Color.red);
				tolk.setForeground(Color.red);
				a.setForeground(Color.red);
				
			}

			double count = 0;

			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getSource() == img) {
					count++;
					citiescorrdinates();
					Point point = MouseInfo.getPointerInfo().getLocation();
					sourcepressed();
                    destinationpressed();
					Graphics g1 = mypanel2.getGraphics();
					Graphics2D g2 = (Graphics2D) g1;
					g2.setColor(Color.red);
					Point point1 = MouseInfo.getPointerInfo().getLocation();


				}
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		img.add(heb);
		mypanel.add(source);
		mypanel.add(src);
		mypanel.add(dest);

		mypanel.add(de);
		mypanel.add(sortpath);

		mypanel.add(exit);

		mypanel2.add(b);

		mypanel2.add(heb);
		mypanel2.add(j);
		mypanel2.add(r);
		mypanel2.add(n);
		mypanel2.add(led);
		mypanel2.add(jer);
		mypanel2.add(nab);
		mypanel2.add(safad);
		mypanel2.add(tolk);
		mypanel2.add(gaza);
		mypanel2.add(a);
		mypanel2.add(haifa);
		mypanel2.add(beer);
		mypanel2.add(KY);
		mypanel2.add(rafah);
		mypanel2.add(asqalan);
		mypanel2.add(Ashdud);
		mypanel2.add(yafa);
		mypanel2.add(talabeeb);
		mypanel2.add(kh);
		mypanel2.add(Jinen);
		mypanel2.add(beesan);
		mypanel2.add(ramleh);
		mypanel2.add(tabarayh);
		mypanel2.add(jalel);








		mypanel2.add(img);
		mypanel3.add(shortpath);
		mypanel3.add(result);
		mypanel3.add(coord);
		mypanel3.add(xy);
		mypanel3.add(scrol);
		mypanel3.add(clear);
		mypanel3.add(w1);
		mypanel3.add(w2);
		myframe.add(mypanel2);
		myframe.add(mypanel, BorderLayout.WEST);
		myframe.add(mypanel3, BorderLayout.EAST);
		// myframe.add(mypanel2, BorderLayout.CENTER);

	}
}