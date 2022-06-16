import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame implements ActionListener {
	JLabel title, text, banho, dentes, lavar, Rbanho, Rdentes, Rlavar, total;
	JButton information, play, exit, credits, menu, calcularB;
	JTextField Tbanho, Tdentes, Tlavar;

	public Menu() {
		setSize(720, 540);
		setTitle("Meio ambiente");
		setResizable(false);
		setLocation(300, 120);
		setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(21, 140, 125));
		title = new JLabel("Educação ambiental");
		title.setSize(400, 40);
		title.setFont(new Font("Arial", Font.BOLD, 25));
		title.setLocation(210, 25);
		title.setForeground(Color.GREEN);
		text = new JLabel(
				"<html>Seja bem vindo ao nosso aplicativo nele abordaremos os temas ambientais sobre reciclagem, consumo ideal de água, energia renovável, e desmatamneto.  </html>");
		text.setSize(520, 300);
		text.setFont(new Font("Arial", Font.BOLD, 12));
		text.setLocation(130, 60);
		text.setForeground(Color.BLACK);
		banho = new JLabel("Tomar banho");
		banho.setSize(400, 40);
		banho.setFont(new Font("Arial", Font.BOLD, 12));
		banho.setLocation(20, 260);
		banho.setForeground(Color.BLACK);
		banho.setVisible(false);
		Tbanho = new JTextField("");
		Tbanho.setSize(30, 25);
		Tbanho.setLocation(320, 270);
		Tbanho.setVisible(false);
		Rbanho = new JLabel("0 Litros");
		Rbanho.setSize(100, 40);
		Rbanho.setFont(new Font("Arial", Font.BOLD, 12));
		Rbanho.setLocation(400, 260);
		Rbanho.setForeground(Color.BLACK);
		Rbanho.setVisible(false);
		calcularB = new JButton("Calcular");
		calcularB.setSize(100, 25);
		calcularB.setLocation(585, 180);
		calcularB.setFont(new Font("Arial", Font.BOLD, 15));
		calcularB.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		calcularB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				calcularBActionPerformed(evt);
			}
		});
		calcularB.setVisible(false);
		dentes = new JLabel("Deixar a torneira aberta enquanto escova os dentes");
		dentes.setSize(400, 40);
		dentes.setFont(new Font("Arial", Font.BOLD, 12));
		dentes.setLocation(20, 220);
		dentes.setForeground(Color.BLACK);
		dentes.setVisible(false);
		Tdentes = new JTextField("");
		Tdentes.setSize(30, 25);
		Tdentes.setLocation(320, 230);
		Tdentes.setVisible(false);
		Rdentes = new JLabel("0 Litros");
		Rdentes.setSize(100, 40);
		Rdentes.setFont(new Font("Arial", Font.BOLD, 12));
		Rdentes.setLocation(400, 220);
		Rdentes.setForeground(Color.BLACK);
		Rdentes.setVisible(false);
		lavar = new JLabel("Deixar a torneira aberta enquanto lava a louça");
		lavar.setSize(400, 40);
		lavar.setFont(new Font("Arial", Font.BOLD, 12));
		lavar.setLocation(20, 180);
		lavar.setForeground(Color.BLACK);
		lavar.setVisible(false);
		Tlavar = new JTextField("");
		Tlavar.setSize(30, 25);
		Tlavar.setLocation(320, 190);
		Tlavar.setVisible(false);
		Rlavar = new JLabel("0 Litros");
		Rlavar.setSize(100, 40);
		Rlavar.setFont(new Font("Arial", Font.BOLD, 12));
		Rlavar.setLocation(400, 180);
		Rlavar.setForeground(Color.BLACK);
		Rlavar.setVisible(false);
		total = new JLabel("Voce gastou no total 0 litros de água");
		total.setSize(340, 40);
		total.setFont(new Font("Arial", Font.BOLD, 16));
		total.setLocation(250, 320);
		total.setForeground(Color.BLACK);
		total.setVisible(false);
		information = new JButton("Meio ambiente");
		information.setSize(200, 35);
		information.setLocation(100, 450);
		information.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		information.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				informationActionPerformed(evt);
			}
		});
		play = new JButton("Quiz");
		play.setSize(200, 35);
		play.setLocation(410, 450);
		play.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		play.addActionListener(this);
		exit = new JButton("Sair");
		exit.setSize(55, 30);
		exit.setLocation(635, 460);
		exit.setFont(new Font("Arial", Font.BOLD, 10));
		exit.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				exitActionPerformed(evt);
			}
		});
		credits = new JButton("Calcular");
		credits.setSize(80, 20);
		credits.setLocation(5, 460);
		credits.setFont(new Font("Arial", Font.CENTER_BASELINE, 9));
		credits.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		credits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				creditsActionPerformed(evt);
			}
		});
		menu = new JButton("Menu");
		menu.setSize(60, 30);
		menu.setLocation(325, 460);
		menu.setFont(new Font("Arial", Font.CENTER_BASELINE, 9));
		menu.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				menuActionPerformed(evt);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(title);
		getContentPane().add(text);
		getContentPane().add(information);
		getContentPane().add(play);
		getContentPane().add(exit);
		getContentPane().add(credits);
		getContentPane().add(menu);
		getContentPane().add(banho);
		getContentPane().add(dentes);
		getContentPane().add(lavar);
		getContentPane().add(Rbanho);
		getContentPane().add(Rdentes);
		getContentPane().add(Rlavar);
		getContentPane().add(Tbanho);
		getContentPane().add(Tdentes);
		getContentPane().add(Tlavar);
		getContentPane().add(calcularB);
		getContentPane().add(total);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame tela = new Quiz();
		tela.setSize(710, 350);
		tela.setResizable(false);
	}

	public void informationActionPerformed(ActionEvent evt) {
		title.setLocation(210, 1);
		title.setText("Sobre o meio ambiente");
		title.setHorizontalAlignment(JLabel.LEFT);
		text.setSize(520, 400);
		text.setLocation(110, 35);
		text.setFont(new Font("Arial", Font.BOLD, 12));
		text.setText(
				"<html>O meio ambiente, comumente chamado apenas de ambiente, envolve todas as coisas vivas e não-vivas ocorrendo na Terra, ou em alguma região dela, que afetam os ecossistemas e a vida dos humanos.<br/>"
						+ " Desmatamento, também chamado de desflorestamento, consiste na retirada da cobertura vegetal parcial ou total de um determinado lugar. Enquanto alguns enxergam essa prática como uma ação necessária ao suprimento das necessidades do ser humano, outros apontam o desmatamento como um dos maiores problemas ambientais da atualidade.<br/>"
						+ "A reciclagem é o processo de reaproveitamento do lixo descartado, dando origem a um novo produto ou a uma nova matéria-prima com o objetivo de diminuir a produção de rejeitos e o seu acúmulo na natureza, reduzindo o impacto ambiental.<br/>"
						+ "Praticar o consumo consciente de água significa repensar as suas formas de uso da água. Evitar desperdícios, reduzir o consumo sempre que possível, fazer a captação da água da chuva e reaproveitar a água cinza gerada pelo chuveiro e pela máquina de lavar roupas são algumas atitudes que podem ser tomadas para ter um consumo consciente da água.<br/>"
						+ "As energia renováveis são as energias resultantes dos recursos naturais que se renovam, portanto, energias inesgotáveis. Entre as energias renováveis estão a energia solar, hídráulica (ou hidrelétrica ou hídrica), eólica, maremotriz, geotérmica e a biomassa (como substituta do petróleo de combustíveis). \n"
						+ "Quais são as fontes de energia renováveis primárias \n"
						+ "Energia Solar: atua por meio da captação da luz do sol pelos painéis solares fotovoltaicos e a transforma em energia elétrica através do inversor solar; \n"
						+ "Energia Eólica: utiliza aerogeradores para a geração de energia através da força dos ventos; \n"
						+ "Energia Hídrica: é produzida, principalmente, por meio de centrais hidroelétricas associadas a barragens de grande ou média capacidade; \n"
						+ "Energia das Ondas e Marés: a energia gerada provém do aproveitamento das ondas e marés oceânicas; \n"
						+ "Energia da Biomassa: a geração de energia é feita através da queima de materiais orgânicos, utilizando elementos como o bagaço da cana-de-açúcar, madeira e óleos vegetais.</html>");
		lavar.setVisible(false);
		dentes.setVisible(false);
		banho.setVisible(false);
		Rlavar.setVisible(false);
		Rdentes.setVisible(false);
		Rbanho.setVisible(false);
		Tlavar.setVisible(false);
		Tbanho.setVisible(false);
		Tdentes.setVisible(false);
		calcularB.setVisible(false);
		total.setVisible(false);
	}

	public void exitActionPerformed(ActionEvent evt) {
		System.exit(0);
	}

	public void creditsActionPerformed(ActionEvent evt) {
		title.setLocation(210, 25);
		title.setText("            Calculo");
		text.setLocation(140, 100);
		text.setSize(520, 40);
		text.setText("Coloque o tempo(em minutos) para saber quantos litros de água são gatos ao:   ");
		lavar.setVisible(true);
		dentes.setVisible(true);
		banho.setVisible(true);
		Rlavar.setVisible(true);
		Rdentes.setVisible(true);
		Rbanho.setVisible(true);
		Tlavar.setVisible(true);
		Tbanho.setVisible(true);
		Tdentes.setVisible(true);
		calcularB.setVisible(true);
		total.setVisible(true);
	}

	public void menuActionPerformed(ActionEvent evt) {
		title.setLocation(210, 25);
		title.setText("Educação ambiental");
		title.setHorizontalAlignment(JLabel.LEFT);
		text.setSize(520, 300);
		text.setLocation(130, 60);
		text.setFont(new Font("Arial", Font.BOLD, 12));
		text.setText(
				"<html>Seja bem vindo ao nosso aplicativo nele abordaremos os temas ambientais sobre reciclagem, consumo ideal de água, energia renovável, e desmatamneto. </html>");
		lavar.setVisible(false);
		dentes.setVisible(false);
		banho.setVisible(false);
		Rlavar.setVisible(false);
		Rdentes.setVisible(false);
		Rbanho.setVisible(false);
		Tlavar.setVisible(false);
		Tbanho.setVisible(false);
		Tdentes.setVisible(false);
		calcularB.setVisible(false);
		total.setVisible(false);
	}

	Lavar lavarr = new Lavar();
	Dentes dentess = new Dentes();
	Banho banhoo = new Banho();
	Consumo cm = new Consumo();

	public void calcularBActionPerformed(ActionEvent evt) {
		if (Tbanho.getText().equals("")) {
			Tbanho.setText("0");
		}
		if (Tdentes.getText().equals("")) {
			Tdentes.setText("0");
		}
		if (Tlavar.getText().equals("")) {
			Tlavar.setText("0");
		}
		banhoo.calcular(Integer.parseInt(Tbanho.getText()));
		Rbanho.setText(banhoo.getTotalB() + " Litros");
		dentess.calcular(Integer.parseInt(Tdentes.getText()));
		Rdentes.setText(dentess.getTotalD() + " Litros");
		lavarr.calcular(Integer.parseInt(Tlavar.getText()));
		Rlavar.setText(lavarr.getTotalL() + " Litros");
		total.setText("Voce gastou no total " + cm.somar(banhoo.getTotalB(), dentess.getTotalD(), lavarr.getTotalL())
				+ " litros de água");
	}
}