/*
    PROJETO DESENVOLVIDO POR: GUSTAVO CABRAL DE SOUZA
    TURMA: 3ºANO INFORMÁTICA.
 */
package sistema_controleagricola;

//Importações das Bibliotecas que irão ser usadas
import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;

public class Sistema_ControleAgricola extends JFrame {
    /**
         Criação dos objetos que serão utilizados.
         */
        JLabel titulo,cod,nome,endereco,bairro,cidade,estado,cep,sexo,celular,telefone,aniversario,cadastro;
        JTextField texto1, texto2,texto3,texto4,texto5,texto6,texto7,texto9,texto10,texto11,texto12;
        JButton incluir,limpar,sair,consultar,consultar_todos;
        ImageIcon icone,icone2,icone3,icone4,icone5;
        JRadioButton feminino, masculino;
        


    public Sistema_ControleAgricola(){
        super("Sistema de Controle de Produção Agrícola");
       Container tela = getContentPane();
       setLayout(null);
     /*Define as construções dos objetos colocados acima,
  IMPORTANTE PARA A NOSSA INTERFACE, POIS É AGORA QUE VOU CONFIGURAR COMO CADA OBJETO SE COMPORTARÁ.*/   
       //De agora em diante eu estanciei os objetos usados e colocar seus respectivos valores
        
        //Atribuição para os textos das Label's 
         titulo = new JLabel("Cadastro de Cliente");
        cod= new JLabel("Código do Cliente ");
        nome = new JLabel("Nome Completo");
        endereco = new JLabel("Endereço");
        bairro = new JLabel("Bairro");
        cidade= new JLabel("Cidade");
        estado = new JLabel("Estado");
        cep = new JLabel("C.E.P.");
        sexo = new JLabel("Sexo ");
        celular = new JLabel("Celular ");
        telefone= new JLabel("Telefone ");
        aniversario = new JLabel("Data do Aniversário");
        cadastro= new JLabel("Data de Cadastro");
        
         //Atribuição para os TextField's e seu valor máximo
         
         feminino = new JRadioButton("Feminino");
         masculino = new JRadioButton("Masculino");
         
        texto1 = new JTextField(5);
        texto2 = new JTextField(50);
        texto3 = new JTextField(50);
        texto4= new JTextField(50);
        texto5 = new JTextField(50);
        texto6 = new JTextField(11);
        texto7 = new JTextField(11);
        texto9 = new JTextField(10);
        texto10 = new JTextField(10);
        texto11 = new JTextField(10);
        texto12 = new JTextField(10);
        
        titulo.setForeground(Color.black);
        cod.setForeground(Color.black);
        nome.setForeground(Color.black);
        endereco.setForeground(Color.black);
        bairro.setForeground(Color.black);
        cidade.setForeground(Color.black);
        estado.setForeground(Color.black);
        cep.setForeground(Color.black);
        sexo.setForeground(Color.black);
        celular.setForeground(Color.black);
        telefone.setForeground(Color.black);
        aniversario.setForeground(Color.black);
        cadastro.setForeground(Color.black);
        
         //CONFIGURANDO AS FONTES DAS LABELS
        
        titulo.setFont(new Font ("Arial",Font.BOLD,14));
        cod.setFont(new Font ("Courier New",Font.BOLD,12));
        nome.setFont(new Font ("Courier New",Font.BOLD,12));
        endereco.setFont(new Font ("Courier New",Font.BOLD,12));
        bairro.setFont(new Font ("Courier New",Font.BOLD,12));
        cidade.setFont(new Font ("Courier New",Font.BOLD,12));
        estado.setFont(new Font ("Courier New",Font.BOLD,12));
        cep.setFont(new Font ("Courier New",Font.BOLD,12));
        sexo.setFont(new Font ("Courier New",Font.BOLD,12));
        celular.setFont(new Font ("Courier New",Font.BOLD,12));
        telefone.setFont(new Font ("Courier New",Font.BOLD,12));
        aniversario.setFont(new Font ("Courier New",Font.BOLD,12));
        cadastro.setFont(new Font ("Courier New",Font.BOLD,12));
      
         //CONFIGURANDO A POSIÇÃO DAS LABELS e TEXTFIELDS NA TELA
        
        titulo.setBounds(20,6,280,25);
        cod.setBounds(20,30,280,35);
        nome.setBounds(20,60,280,35);
        endereco.setBounds(20,90,280,35);
        bairro.setBounds(20,120,280,35);
        cidade.setBounds(20,150,280,35);
        estado.setBounds(20,180,280,35);
        cep.setBounds(20,210,280,35);
        sexo.setBounds(20,240,280,35);
        celular.setBounds(20,270,280,35);
        telefone.setBounds(20,300,280,35);
        aniversario.setBounds(20,330,280,35);
        cadastro.setBounds(20,360,280,35);
        
         //(textfields)
        texto1.setBounds(150,35,280,20);
        texto2.setBounds(150,65,280,20);
        texto3.setBounds(150,95,280,20);
        texto4.setBounds(150,125,280,20);
        texto5.setBounds(150,160,280,20);
        texto6.setBounds(150,190,280,20);
        texto7.setBounds(150,220,280,20);
        texto9.setBounds(150,280,280,20);
        texto10.setBounds(150,310,280,20);
        texto11.setBounds(160,340,280,20);
        texto12.setBounds(150,370,280,20);
          //radioButtons
        feminino.setBounds(150,250,280,20);
        masculino.setBounds(250,250,280,20);
        
        //BOTÕES:
        incluir = new JButton("Incluir");
        incluir.setBounds(20,410,120,20);//Dimensão do botão na tela

        limpar = new JButton("Limpar");
        limpar.setBounds(120,410,120,20);//Dimensão do botão na tela

        sair = new JButton("Sair");
        sair.setBounds(220,410,120,20);//Dimensão do botão na tela
        
        consultar = new JButton("Consultar");
        consultar.setBounds(20,440,120,20);//Dimensão do botão na tela
        
        consultar_todos = new JButton("Consultar Todos");
        consultar_todos.setBounds(120,440,150,20);//Dimensão do botão na tela
        
        tela.add(titulo);
        tela.add(cod);
        tela.add(nome);
        tela.add(endereco);
        tela.add(bairro);
        tela.add(cidade);
        tela.add(estado);
        tela.add(cep);
        tela.add(sexo);
        tela.add(celular);
        tela.add(telefone);
        tela.add(aniversario);
        tela.add(cadastro);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(texto9);
        tela.add(texto10);
        tela.add(texto11);
        tela.add(texto12);
        tela.add(masculino);
        tela.add(feminino);
        tela.add(incluir);
        tela.add(limpar);
        tela.add(sair);
        tela.add(consultar);
        tela.add(consultar_todos);
        
         //Configurando a tela
        tela.setBackground(new Color(220,220,220));
        setSize(520,500);
        setVisible(true); 
        setResizable(false);
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args) {
        Sistema_ControleAgricola app = new Sistema_ControleAgricola();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
