/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.descompila.gridlayout;

/**
 *
 * @author Aluno
 */
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing. JFrame;
import javax.swing. JButton;

public class GridLayoutFrame extends JFrame implements ActionListener
{
    private JButton[] buttons; // array de botões
    private static final String[] names =
        { "one", "two", "three", "four", "five", "six" };
    private boolean toggle = true; // alterna entre dois layouts
    private Container container; // conteiner do frame
    private GridLayout gridLayout1; // primeiro gridlayout
    private GridLayout gridLayout2; // segundo gridlayout

    // construtor sem argumentos
    public GridLayoutFrame()
    {

        super( "GridLayout Demo" );
        gridLayoutl = new GridLayout( 2, 3, 5, 5 ); // 2 por 3; lacunas de 5
        gridLayout2 = new GridLayout( 3, 2 ); // 3 por 2; nenhuma lacuna
        container = getContentPane(); // obtem painel de conteúdo
        setLayout( gridLayout1 ); // configura o layout JFrame
        buttons = new JButton[ names. length ]; // cria array de JButtons

        for ( int count = 0; count < names. length; count++ ){

            buttons[ count ] = new JButton( names[ count ] ):
            buttons[ count ].addActionListener( this ): // registra listener
            add( buttons[ count ] ): // adiciona o botão ao JFrame
        } // for final
    } // fim do construtor GridLayoutFrame



    // trata eventos de botao alternando entre layouts
    public void actionPerformed( ActionEvent event )
    {
        if ( toggle )
            container.setLayout( gridLayout2 ); // configura layout como segundo
        else
            container.setLayout( gridLayout1 ); // configura layout como primeiro

        toggle = !toggle; // alterna para valor oposto
        container.validate(); // refaz o layout do contéiner
    } // fim do método actionPerforned
}// fim da classe GridLayoutFrame