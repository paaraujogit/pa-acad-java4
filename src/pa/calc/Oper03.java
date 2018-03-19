/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.calc;

/**
 *
 * @author lpiedade
 */
public class Oper03 implements ItfOper {
    @Override
    public double oper(double op1, double op2){
        return ((op1+op2)/2);
    }
}
