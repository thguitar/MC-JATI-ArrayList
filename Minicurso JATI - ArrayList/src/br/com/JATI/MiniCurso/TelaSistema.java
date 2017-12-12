package br.com.JATI.MiniCurso;


import javax.swing.JFrame;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.JButton;

import br.com.JATI.MiniCurso.DAO.ClienteDAO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaSistema extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7811890098097789405L;
	private static final String NOME_SISTEMA = "Minicurso Jasper III JATI"; 
	private ClienteDAO clienteDAO;

	public static void main(String[] args) {
		new TelaSistema();
	}

	public TelaSistema() {
		initialize();
		clienteDAO = new ClienteDAO();
		setVisible(true);
	}


	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnNewButton_1 = new JButton("Gerar Relat\u00F3rio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gerarRelatorio();
			}
		});
		btnNewButton_1.setBounds(215, 61, 150, 40);
		getContentPane().add(btnNewButton_1);
	}

	public void gerarRelatorio(){
		JasperPrint print = null;
		JRBeanCollectionDataSource list = new JRBeanCollectionDataSource(clienteDAO.getClientes());
		try {
			print = JasperFillManager.fillReport("relatorios/report1.jasper", null, list);
			JasperViewer viewer = new JasperViewer(print);
			viewer.setVisible(true);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
