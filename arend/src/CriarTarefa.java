import javax.swing.*;
import java.awt.*;


public class CriarTarefa extends JFrame {



    public CriarTarefa(){

        setTitle("Cadastro de tarefas");
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
        
    }

    public void configurarJanela(){

        JPanel painel = new JPanel();
        GroupLayout TheBox = new GroupLayout(painel);
        painel.setLayout(TheBox);
        TheBox.setAutoCreateGaps(true);
        TheBox.setAutoCreateContainerGaps(true);


        JLabel labelCaixaEntrada = new JLabel("Tarefa");
        JTextArea areaTarefa = new JTextArea(5,5);
        areaTarefa.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel labelPrioridade = new JLabel("Prioridade");
        String[] seletores = {"Alta", "Media", "Baixa"};
        JComboBox comboPrioridade = new JComboBox(seletores);
        comboPrioridade.setSelectedIndex(2);

        JCheckBox checkBoxFinalizado = new JCheckBox("Finalizado");


        JButton botaoCancelar = new JButton("Cancelar");
        JButton botaoSalvar = new JButton("Salvar");
        



        //* Configurar posição dos aspectos do programa*/
     
        TheBox.setVerticalGroup(

            TheBox.createSequentialGroup()

                    .addComponent(labelCaixaEntrada)
                    .addComponent(areaTarefa)
                    .addComponent(labelPrioridade)
                    .addComponent(comboPrioridade)
                    .addComponent(checkBoxFinalizado)
                    .addGroup(TheBox.createParallelGroup()
                            .addComponent(botaoCancelar)
                            .addComponent(botaoSalvar))
        );
        TheBox.setHorizontalGroup(

            TheBox.createParallelGroup()

                        .addComponent(labelCaixaEntrada)
                        .addComponent(areaTarefa)
                        .addComponent(labelPrioridade)
                        .addComponent(comboPrioridade)
                        .addComponent(checkBoxFinalizado)
                        .addGroup(TheBox.createSequentialGroup()
                                .addComponent(botaoCancelar)
                                .addComponent(botaoSalvar))
                                    
            );
            
            add(painel);
    }
}

    

