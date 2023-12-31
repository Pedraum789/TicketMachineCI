package com.example.demo.ticketmachine.core;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected Troco troco;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws main.java.com.demo.ticketmachine.exception.PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new main.java.com.demo.ticketmachine.exception.PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<PapelMoeda> getTroco() {
        return troco.getIterator();
    }

    public String imprimir() throws main.java.com.demo.ticketmachine.exception.SaldoInsuficienteException {
        if (saldo < valor) {
            throw new main.java.com.demo.ticketmachine.exception.SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + valor + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
