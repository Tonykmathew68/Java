import java.awt.*;
import java.awt.event.*;

public class awt {
    public static void main(String[] args) {
       
        Frame frame = new Frame("Find Maximum Among Three Numbers");
        

        Label label1 = new Label("Enter three numbers: ");
        TextField text1 = new TextField(15);  
        TextField text2 = new TextField(15); 
        TextField text3 = new TextField(15);  
        Label resultLabel = new Label("Result: ");
        Button button = new Button("Find Maximum");

        frame.setLayout(new GridLayout(5, 2, 10, 10)); 

      
        frame.add(label1);
        frame.add(new Label(""));  
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(button);
        frame.add(new Label("")); 
        frame.add(resultLabel);

        
        button.addActionListener(e -> {
            try {
                
                int num1 = Integer.parseInt(text1.getText());
                int num2 = Integer.parseInt(text2.getText());
                int num3 = Integer.parseInt(text3.getText());

               
                resultLabel.setText("Result: " + Math.max(num1, Math.max(num2, num3)));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter valid numbers.");
            }
        });

        
        frame.setSize(400, 250); 

    
        frame.setVisible(true);

      
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) { 
                System.exit(0); 
            } 
        });
    }
}

