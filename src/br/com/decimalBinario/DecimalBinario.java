/**
 * Class DecimalBinario
 * @author Fernando Moreira
 */

package br.com.decimalBinario;

import javax.swing.JOptionPane;

public class DecimalBinario {
	
	/*
	 * method toDecimal
	 * @return void
	 */
	public void toDecimal() {

        String numero_entrada;
		Integer divisao = 0, resto;
        String binarStr = "", binario;

        numero_entrada = JOptionPane.showInputDialog("Digite um numero decimal: ");
        int numero = Integer.parseInt(numero_entrada);

        while (numero > 0) {

            if(divisao == 0) {
                resto = (numero%2);
            }
            else {
                resto = (divisao%2);
            }

            int resto_to_str = resto;
            String str = Integer.toString(resto_to_str);
            binarStr = binarStr + "" + str;

            numero = (numero/2);
        }
        
        binario = new StringBuffer(binarStr).reverse().toString();
        JOptionPane.showMessageDialog(null, ("Binario " + binario));

    }	

}
