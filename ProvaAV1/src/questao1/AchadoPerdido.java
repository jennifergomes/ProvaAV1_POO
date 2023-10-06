package questao1;

import javax.swing.*;

public class AchadoPerdido implements Publicacao{
    private String titulo, descricao, foto, tipo, local_achado, data_hora, status;

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
    }

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String local_achado, String data_hora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
        this.status = status;
    }

    @Override
    public String buscarTitulo(String titulo) {
        return "titulo: " + titulo + ", descricao: " + this.descricao + ", local achado: " + this.local_achado;
    }

    @Override
    public void visualizarDetalhes() {
        JOptionPane pane = new JOptionPane();

        pane.showMessageDialog(null, "titulo: " + this.titulo + ", foto: " + this.foto + ", local achado: " + this.local_achado + ", tipo: " + this.tipo + ", status: " + this.status);
    }
}