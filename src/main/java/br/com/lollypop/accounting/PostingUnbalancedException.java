/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lollypop.accounting;

/**
 * Exception thrown with an unbalanced Posting was attempted to be posted.
 */
public class PostingUnbalancedException extends AccountingException {

    public PostingUnbalancedException(Posting p) {
        super("Posting was unbalanced.");
    }
}
