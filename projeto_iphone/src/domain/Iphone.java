package domain;

public class Iphone{
    // Telefone
    private NavegadorWeb web;
    private AparelhoTelefonico tel;
    private ReprodutorMusica music;
    
    public Iphone(){
        this.web = new NavegadorWeb();
        this.tel = new AparelhoTelefonico();
        this.music = new ReprodutorMusica();
    }

    public void exibirPag(){
        this.web.exibirPagina();
    }
    public void adicionarNAba(){
        this.web.adicionarNovaAba();
    }
    public void attPagina(){
        this.web.atualizarPagina();
    }
    public void call(){
        this.tel.ligar();
    }
    public void answer(){
        this.tel.atender();
    }
    public void voiceMail(){
        this.tel.iniciarCorreioVoz();
    
    }
    public void playMusic(){
        this.music.tocar();
    }
    public void pauseMusic(){
        this.music.pausar();
    }
    public void selectMusic(){
        this.music.selecionarMusica();
    }
}
