import javax.swing.*;  
public class JTextAreaEx {
	JTextAreaEx(){  
        JFrame f= new JFrame(); 
        f.setTitle("TextArea Example");
        JTextArea area=new JTextArea("Welcome to javatpoint");  
        area.setBounds(30,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[]) {  
   new JTextAreaEx();  
  }
}
