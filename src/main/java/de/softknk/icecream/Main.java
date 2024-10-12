/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package de.softknk.icecream;

import de.softknk.icecream.decorator.Cream;
import de.softknk.icecream.decorator.Sprinkles;

/**
 *
 * @author DKUENKE
 */
public class Main {

    public static void main(String[] args) {

        IceCream iceCream = new Sprinkles(new Cream(new ConeIceCream(2)));
        float totalCost = iceCream.computeTotal();

        System.out.println(iceCream.computeTotal());
        float hallo = totalCost;
    }
}
