/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lollypop.accounting;

public class AccountingException extends Exception {

    public AccountingException(Throwable cause) {
        super(cause);
    }

    public AccountingException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountingException(String message) {
        super(message);
    }

    public AccountingException() {
    }

}
