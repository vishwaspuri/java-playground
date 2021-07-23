package compre;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;


public class QuestionTwo extends Frame implements ActionListener{
	TextField tfName, tfID;
	Button submit, search;
	HashMap<Integer, String> hm;
	static final long serialVersionUID = 1;
	QuestionTwo(){
		setLayout(new GridLayout(3,2));
		hm = new HashMap<Integer, String>();
		Label idLabel = new Label("Id: ");
		Label nameLabel = new Label("Name: ");
		tfName = new TextField();
		tfID = new TextField();
		submit = new Button("submit");
		search = new Button("search");
		search.addActionListener(this);
		submit.addActionListener(this);
		add(idLabel);
		add(tfID);
		add(nameLabel);
		add(tfName);
		add(submit);
		add(search);
		setSize(400, 400);
		setVisible(true);
		setTitle("Student DB");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)	{
		String command = ae.getActionCommand();
		if(command == "search") {
			tfName.setText(hm.get(Integer.parseInt(tfID.getText())));
		} else {
			hm.put(Integer.valueOf(Integer.parseInt(tfID.getText())), tfName.getText());
			tfName.setText("");
			tfID.setText("");
		}
	}
	public static void main(String ...args) {
		new QuestionTwo();
	}
}
