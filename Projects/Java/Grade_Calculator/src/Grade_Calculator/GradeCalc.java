package Grade_Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GradeCalc extends JFrame 
{
	private double actualGrade, weightActualGrade, finalExamGrade, weightFinalExam;
	private final double finalGrade = 0.65;

	private JPanel contentPane;
	private JTextField tfActualGrade;
	private JTextField tfActualGradeWeight;
	private JTextField tfFinalExamWeight;
	private JTextField tfCalcResult;
	

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					GradeCalc frame = new GradeCalc();
					frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
		
	}


	public GradeCalc() {
		setTitle("Final Grade Calculator");
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 363);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input your actual grade:");
		lblNewLabel.setBounds(10, 49, 157, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblInputTheWeight = new JLabel("Input the weight of your actual grade (assignments weight):");
		lblInputTheWeight.setBounds(10, 90, 377, 13);
		contentPane.add(lblInputTheWeight);
		
		JLabel lblInputTheWeight_2 = new JLabel("Input the weight of the final exam:");
		lblInputTheWeight_2.setBounds(10, 127, 377, 13);
		contentPane.add(lblInputTheWeight_2);
		
		tfActualGrade = new JTextField();
		tfActualGrade.setBounds(10, 61, 96, 19);
		contentPane.add(tfActualGrade);
		tfActualGrade.setColumns(10);
		//String s1 = tfActualGrade.getText();
		
		tfActualGradeWeight = new JTextField();
		tfActualGradeWeight.setColumns(10);
		tfActualGradeWeight.setBounds(10, 104, 96, 19);
		contentPane.add(tfActualGradeWeight);
		//String s2 = tfActualGradeWeight.getText();
		
		tfFinalExamWeight = new JTextField();
		tfFinalExamWeight.setColumns(10);
		tfFinalExamWeight.setBounds(10, 138, 96, 19);
		contentPane.add(tfFinalExamWeight);
		//String s3 = tfFinalExamWeight.getText();
		
		

		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(10, 175, 111, 21);
		contentPane.add(btnCalculate);
		btnCalculate.addActionListener((ActionListener) new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				actualGrade = Double.parseDouble(tfActualGrade.getText().replace("%", "")) / 100;		
				weightActualGrade = Double.parseDouble(tfActualGradeWeight.getText().replace("%", "")) / 100;
				weightFinalExam = Double.parseDouble(tfFinalExamWeight.getText().replace("%", "")) / 100;
				
				finalExamGrade = ((-(actualGrade * weightActualGrade) + finalGrade)/weightFinalExam) * 100;

				
				tfCalcResult = new JTextField("" + Math.round(finalExamGrade) + "%");
				tfCalcResult.setColumns(10);
				tfCalcResult.setBounds(10, 217, 96, 19);
				contentPane.add(tfCalcResult);
			}
		});
		
		
		JLabel lblInputTheWeight_2_1 = new JLabel("Your grade in the final exam should be at least:");
		lblInputTheWeight_2_1.setBounds(10, 202, 377, 13);
		contentPane.add(lblInputTheWeight_2_1);
		
		JLabel lblAllTheValues = new JLabel("All the values should be in percentage, e.g: 90%");
		lblAllTheValues.setBounds(46, 10, 332, 13);
		contentPane.add(lblAllTheValues);
	}
}
