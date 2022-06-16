import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Quiz extends JFrame implements ActionListener {
	String[][] question = new String[10][6];
	JRadioButton[] jrQuestions = new JRadioButton[4];
	JLabel jlQuestion = new JLabel("");
	JLabel a = new JLabel("                                                                    ");
	JLabel b = new JLabel("                                                                    ");
	JLabel c = new JLabel("                                                                    ");
	JLabel d = new JLabel("                                                                    ");
	JLabel jlPoints = new JLabel("Points: 0            ");
	int current = 0;
	int points = 0;
	JButton jbReply = new JButton("Responder");
	JButton jbExit = new JButton("Sair");
	ButtonGroup bgOp = new ButtonGroup();
	Container container;
	GridLayout gridLayout1;

	public Quiz() {
		super("Quiz");
		gridLayout1 = new GridLayout(10, 1);
		container = getContentPane();
		container.setLayout(gridLayout1);
		setQuestion();
		for (int id = 0; id < 4; id++) {
			jrQuestions[id] = new JRadioButton();
			bgOp.add(jrQuestions[id]);
		}
		setDefaultCloseOperation(Quiz.DISPOSE_ON_CLOSE);
		setScreen();
		jlPoints.setHorizontalAlignment(JTextField.RIGHT);
		add(jlQuestion);
		add(a);
		add(jrQuestions[0]).setCursor((new java.awt.Cursor(Cursor.HAND_CURSOR) {
		}));
		add(b);
		add(jrQuestions[1]).setCursor((new java.awt.Cursor(Cursor.HAND_CURSOR) {
		}));
		add(c);
		add(jrQuestions[2]).setCursor((new java.awt.Cursor(Cursor.HAND_CURSOR) {
		}));
		add(d);
		add(jrQuestions[3]).setCursor((new java.awt.Cursor(Cursor.HAND_CURSOR) {
		}));
		add(jlPoints);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		jrQuestions[0].setBackground(Color.WHITE);
		jrQuestions[1].setBackground(Color.WHITE);
		jrQuestions[2].setBackground(Color.WHITE);
		jrQuestions[3].setBackground(Color.WHITE);
		container.setBackground(Color.WHITE);
		container.setLayout(null);
		container.add(jbReply);
		jbReply.addActionListener(this);
		jbReply.setSize(200, 40);
		jbReply.setLocation(100, 250);
		jbReply.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		container.add(jbExit);
		jbExit.setSize(200, 40);
		jbExit.setLocation(370, 250);
		jbExit.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR) {
		});
		jbExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jbExitActionPerformed(evt);
			}
		});
	}

	public void setQuestion() {
		question[0][0] = "   1-  Uma das formas de colaborar com a preserva��o do meio ambiente � reduzir a produ��o de res�duos. Mas como?     ";
		question[0][1] = "  Optando pela compra de produtos com embalagens recicl�veis.";
		question[0][2] = "  Reutilizando os materiais e objetos sempre que poss�vel.";
		question[0][3] = "  Apoiando iniciativas de reciclagem.";
		question[0][4] = "  Todas as anteriores.";
		question[0][5] = "4";
		question[1][0] = "   2-  Como separar corretamente seu lixo?";
		question[1][1] = "  Juntar tudo na lixeira, pois os pr�dios j� fazem o trabalho de separa��o.";
		question[1][2] = "  Separar o lixo org�nico dos res�duos s�lidos.";
		question[1][3] = "  Deixar pl�sticos sujos junto com lixo org�nico.";
		question[1][4] = "  Juntar todo tipo de lixo e descartar em ponto de coleta.";
		question[1][5] = "2";
		question[2][0] = "   3-  O que � reciclagem?";
		question[2][1] = "  �Jogar fora� o lixo produzido.";
		question[2][2] = "  Coletar todo tipo de material existente em lixos recicl�veis.";
		question[2][3] = "  Nome dado para todo o processo do lixo ap�s seu descarte.";
		question[2][4] = "  Processo de transforma��o de materiais usados em novos produtos para consumo.";
		question[2][5] = "4";
		question[3][0] = "   4-  O que � coleta seletiva?";
		question[3][1] = "  Processo de separa��o e recolhimento dos res�duos para o reaproveitamento por meio de reciclagem.";
		question[3][2] = "  Destina��o de res�duos para lix�es e aterros.";
		question[3][3] = "  Processo de envio de todo o lixo produzido para cooperativas ou entrega para catadores de rua.";
		question[3][4] = "  A escolha aleat�ria do melhor lixo produzido.";
		question[3][5] = "1";
		question[4][0] = "   5-  O que fazer com o lixo eletr�nico � pilhas, baterias e equipamentos quebrados?";
		question[4][1] = "  Recolher, organizar e armazenar em casa o m�ximo de tempo que der.";
		question[4][2] = "  Juntar com pl�sticos e metais.";
		question[4][3] = "  Jogar no lixo comum.";
		question[4][4] = "  Procurar locais espec�ficos para seu descarte.";
		question[4][5] = "4";
		question[5][0] = "   6-  Como consumir de forma consciente?";
		question[5][1] = "  Trocando todos os nossos objetos sempre que um novo do mesmo tipo for lan�ado.";
		question[5][2] = "  Usar a mangueira para lavar o quintal e o carro.";
		question[5][3] = "  Utilizando os recursos naturais para satisfazer nossas necessidades e das gera��es futuras.";
		question[5][4] = "  Adquirindo qualquer tipo de produto se for barato.";
		question[5][5] = "3";
		question[6][0] = "   7-  Como preservar �rvores e florestas?";
		question[6][1] = "  Construindo uma casa na �rvore.";
		question[6][2] = "  Reciclando pap�is, jornais e revistas.";
		question[6][3] = "  Reutilizando metais e vidros.";
		question[6][4] = "  Indo em parques.";
		question[6][5] = "2";
		question[7][0] = "   8-  Qual dos elementos abaixo n�o � utilizado como fonte de energia?";
		question[7][1] = "  �gua corrente";
		question[7][2] = "  Petr�leo";
		question[7][3] = "  Barra de ferro";
		question[7][4] = "  Sol";
		question[7][5] = "3";
		question[8][0] = "   9-  Qual dos gases abaixo n�o � conhecido como um dos gases do efeito estufa (GEE)?";
		question[8][1] = "  N2O � �xido nitroso";
		question[8][2] = "  O2 � oxig�nio";
		question[8][3] = "  CO2 � di�xido de carbono ou g�s carb�nico";
		question[8][4] = "  CH4 � metano";
		question[8][5] = "2";
		question[9][0] = "   10-  Qual alternativa apresenta uma vantagem da energia solar?";
		question[9][1] = "  N�o polui";
		question[9][2] = "  N�o � renov�vel";
		question[9][3] = "  � eficaz em qualquer clima.";
		question[9][4] = "  � dispon�vel a todo momento";
		question[9][5] = "1";
	}

	public void setScreen() {
		jlQuestion.setText(question[current][0]);
		for (int num = 0; num < 4; num++) {
			jrQuestions[num].setText(question[current][num + 1]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int respostaCerta = Integer.parseInt(question[current][5]);
		if (jrQuestions[respostaCerta - 1].isSelected()) {
			points++;
		}
		jlPoints.setText("Points: " + points + "            ");
		if (current < 9) {
			current++;
		} else {
			if (points == 0) {
				JOptionPane.showMessageDialog(this, " Errou todas ");
				this.dispose();
			} else if (points == 1) {
				JOptionPane.showMessageDialog(this, " Que pena acertou  " + points + " pergunta ");
				this.dispose();
			} else if (points <= 4) {
				JOptionPane.showMessageDialog(this, " Que pena acertou  " + points + " perguntas ");
				this.dispose();
			} else if (points < 7) {
				JOptionPane.showMessageDialog(this, " Voce acertou " + points + " perguntas ");
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(this, " Parabens voce acertou " + points + " perguntas ");
				this.dispose();
			}
		}
		bgOp.clearSelection();
		setScreen();
	}

	public void jbExitActionPerformed(ActionEvent e) {
		dispose();
	}
}