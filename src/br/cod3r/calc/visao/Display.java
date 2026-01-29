package br.cod3r.calc.visao;

import br.cod3r.calc.modelo.Memoria;
import br.cod3r.calc.modelo.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador {

    private JLabel label;

    public Display() {
        setBackground(new Color(46, 49,50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
        add(label);

        Memoria.getInstancia().adicionarObservador(this);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
