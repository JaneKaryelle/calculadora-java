package br.cod3r.calc.visao;

import br.cod3r.calc.modelo.Memoria;

import javax.swing.JButton;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("courier", Font.PLAIN, 25));

        addActionListener(e -> {
            Memoria.getInstancia().processarComando(texto);
        });
    }

}
