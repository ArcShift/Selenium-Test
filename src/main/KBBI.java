/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import selenium.Setup;

public class KBBI {
  Setup ss;
  
  public KBBI() {
    ss= new Setup("http://kbbi.co.id/daftar-kata");
    ss.webDriver.close();
  }
  
  public static void main(String[] args) {
    new KBBI();
  }
  
}
