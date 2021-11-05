
package jogadavelha21;


public class CalcularJogo {
    
     // declaracao de variaveis de instancia

    private int jogadorDaVez;
    private int jogadorVencedor;
    private int[][] jogo = new int[3][3];


    // construtor
    public void CalcularJogo() {
        // zera as variaveis de instancia
        this.jogadorDaVez = 1;
        this.jogadorVencedor = 0;
        // conencaoes na matriz
        // valor ZERO rotulo do botao vazio
        // valor UM rotulo do botao "O"
        // valor DOIS rodtulo do botao "X"
        // linha 1 1
        this.jogo[0][0] = 0;
        this.jogo[0][1] = 0;
        this.jogo[0][2] = 0;
        // linha 2
        this.jogo[1][0] = 0;
        this.jogo[1][1] = 0;
        this.jogo[1][2] = 0;
        // linha 3
        this.jogo[2][0] = 0;
        this.jogo[2][1] = 0;
        this.jogo[2][2] = 0;
    }
    
        public void CalcularJogo2() {
        // zera as variaveis de instancia
        this.jogadorDaVez = 1;
        this.jogadorVencedor = 0;
        // conencaoes na matriz
        // valor ZERO rotulo do botao vazio
        // valor UM rotulo do botao "O"
        // valor DOIS rodtulo do botao "X"
        // linha 1 1
        this.jogo[0][0] = 1;
        this.jogo[0][1] = 1;
        this.jogo[0][2] = 1;
        // linha 2
        this.jogo[1][0] = 1;
        this.jogo[1][1] = 1;
        this.jogo[1][2] = 1;
        // linha 3
        this.jogo[2][0] = 1;
        this.jogo[2][1] = 1;
        this.jogo[2][2] = 1;
    }

    public int getJogadorDaVez() {
        return jogadorDaVez;
    }
    public void setJogadorDaVez(int jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }
    public int getJogadorVencedor() {
        return jogadorVencedor;
    }
    public void setJogadorVencedor(int jogadorVencedor) {
        this.jogadorVencedor = jogadorVencedor;
    }
    
    public int getJogo(int linha, int coluna){
       return jogo [linha] [coluna]; 
    }
    public void setJogo(int linha, int coluna, int valor){
        this.jogo [linha] [coluna] = valor;
}
    
    public int verificaQuemGanhou() {
        int ganhou = 0;
		// =======================================================
        // verificação para ojogador O/1
        // linha 1
        if  (jogo[0][0] == 1 && jogo[0][1] == 1 && jogo[0][2] == 1) {
            ganhou = 1; }
        // linha 2
        if  (jogo[1][0] == 1 && jogo[1][1] == 1 && jogo[1][2] == 1) {
            ganhou = 1; }
        // linha 3
        if  (jogo[2][0] == 1 && jogo[2][1] == 1 && jogo[2][2] == 1) {
            ganhou = 1; }
			
        // lColuna 1
        if  (jogo[0][0] == 1 && jogo[1][0] == 1 && jogo[2][0] == 1) {
            ganhou = 1; }
        // coluna 2 
        if  (jogo[0][1] == 1 && jogo[1][1] == 1 && jogo[2][1] == 1) {
            ganhou = 1; }
        // coluna 3 
        if  (jogo[0][2] == 1 && jogo[1][2] == 1 && jogo[2][2] == 1) {
            ganhou = 1; }
			
        // diagonal  1 da esquerda superior para dieita inferior
        if  (jogo[0][0] == 1 && jogo[1][1] == 1 && jogo[2][2] == 1) {
            ganhou = 1; }
        // diagonal  2 da direita superior para a esquerda inferior
		if  (jogo[0][2] == 1 && jogo[1][1] == 1 && jogo[2][0] == 1) {
            ganhou = 1; }
			
		// =======================================================
        // verificação para o jogador X/2
        // linha 1
        if  (jogo[0][0] == 2 && jogo[0][1] == 2 && jogo[0][2] == 2) {
            ganhou = 2; }
        // linha 2
        if  (jogo[1][0] == 2 && jogo[1][1] == 2 && jogo[1][2] == 2) {
            ganhou = 2; }
        // linha 3
        if  (jogo[2][0] == 2 && jogo[2][1] == 2 && jogo[2][2] == 2) {
            ganhou = 2; }
			
        // lColuna 1
        if  (jogo[0][0] == 2 && jogo[1][0] == 2 && jogo[2][0] == 2) {
            ganhou = 2; }
        // coluna 2 
        if  (jogo[0][1] == 2 && jogo[1][1] == 2 && jogo[2][1] == 2) {
            ganhou = 2; }
        // coluna 3 
        if  (jogo[0][2] == 2 && jogo[1][2] == 2 && jogo[2][2] == 2) {
            ganhou = 2; }
			
        // diagonal  1 da esquerda superior para dieita inferior
        if  (jogo[0][0] == 2 && jogo[1][1] == 2 && jogo[2][2] == 2) {
            ganhou = 2; }
        // diagonal  2 da direita superior para a esquerda inferior
		if  (jogo[0][2] == 2 && jogo[1][1] == 2 && jogo[2][0] == 2) {
            ganhou = 2; }
	
        
        return ganhou; // Devolve 0, 1 e 2
    }
    
    public int verificaQuemGanhou2() {
		// =======================================================
        // verificação para ojogador O/1
        // linha 1
        if  (jogo[0][0] == 1 && jogo[0][1] == 1 && jogo[0][2] == 1) {
            this.jogadorVencedor = 1; }
        // linha 2
        if  (jogo[1][0] == 1 && jogo[1][1] == 1 && jogo[1][2] == 1) {
            this.jogadorVencedor = 1; }
        // linha 3
        if  (jogo[2][0] == 1 && jogo[2][1] == 1 && jogo[2][2] == 1) {
            this.jogadorVencedor = 1; }
			
        // lColuna 1
        if  (jogo[0][0] == 1 && jogo[1][0] == 1 && jogo[2][0] == 1) {
            this.jogadorVencedor = 1; }
        // coluna 2 
        if  (jogo[0][1] == 1 && jogo[1][1] == 1 && jogo[2][1] == 1) {
            this.jogadorVencedor = 1; }
        // coluna 3 
        if  (jogo[0][2] == 1 && jogo[1][2] == 1 && jogo[2][2] == 1) {
            this.jogadorVencedor = 1; }
			
        // diagonal  1 da esquerda superior para dieita inferior
        if  (jogo[0][0] == 1 && jogo[1][1] == 1 && jogo[2][2] == 1) {
            this.jogadorVencedor = 1; }
        // diagonal  2 da direita superior para a esquerda inferior
		if  (jogo[0][2] == 1 && jogo[1][1] == 1 && jogo[2][0] == 1) {
            this.jogadorVencedor = 1; }
			
	// =======================================================
        // verificação para ojogador X/2
        // linha 1
        if  (jogo[0][0] == 2 && jogo[0][1] == 2 && jogo[0][2] == 2) {
            this.jogadorVencedor = 2; }
        // linha 2
        if  (jogo[1][0] == 2 && jogo[1][1] == 2 && jogo[1][2] == 2) {
            this.jogadorVencedor = 2; }
        // linha 3
        if  (jogo[2][0] == 2 && jogo[2][1] == 2 && jogo[2][2] == 2) {
            this.jogadorVencedor = 2; }
			
        // lColuna 1
        if  (jogo[0][0] == 2 && jogo[1][0] == 2 && jogo[2][0] == 2) {
            this.jogadorVencedor = 2; }
        // coluna 2 
        if  (jogo[0][1] == 2 && jogo[1][1] == 2 && jogo[2][1] == 2) {
            this.jogadorVencedor = 2; }
        // coluna 3 
        if  (jogo[0][2] == 2 && jogo[1][2] == 2 && jogo[2][2] == 2) {
            this.jogadorVencedor = 2; }
			
        // diagonal  1 da esquerda superior para dieita inferior
        if  (jogo[0][0] == 2 && jogo[1][1] == 2 && jogo[2][2] == 2) {
            this.jogadorVencedor = 2; }
        // diagonal  2 da direita superior para a esquerda inferior
		if  (jogo[0][2] == 2 && jogo[1][1] == 2 && jogo[2][0] == 2) {
            this.jogadorVencedor = 2; }
                
                return jogadorVencedor;
   
    }
    
    
    
    
}
