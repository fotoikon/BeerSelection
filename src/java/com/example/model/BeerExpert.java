/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.model;

import java.util.*;

public class BeerExpert {
   public List getBrands(String color) {

     List types = new ArrayList();

       switch (color) {
           case "amber":
               types.add("Tröegs Nugget Nectar");
               types.add("Tocobaga Red Ale");
               break;
           case "dark":
               types.add("Gulden Draak");
               types.add("St. Bernardus Abt 12");
               types.add("Dogfish Head");
               break;
           case "light":
               types.add("Amstel Light");
               types.add("Bud Light");
               break;
           case "brown":
               types.add("Cubano-Style Espresso Brown Ale");
               types.add("Samuel Smith's Nut Brown Ale");
               break;
           default:
               break;
       }
     return(types);
   }
}