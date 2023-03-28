package com.project.musicplayer.entities;

import java.math.BigDecimal;
import java.util.HashMap;

public class Sepet {
   private HashMap<String, BigDecimal> urunList = new HashMap<>();
   private BigDecimal toplamFiyat;

   public Sepet(HashMap<String, BigDecimal> urunList, BigDecimal toplamFiyat) {
      this.urunList = urunList;
      this.toplamFiyat = toplamFiyat;
   }

   public HashMap<String, BigDecimal> getUrunList() {
      return urunList;
   }

   public void setUrunList(HashMap<String, BigDecimal> urunList) {
      this.urunList = urunList;
   }

   public BigDecimal getToplamFiyat() {
      return toplamFiyat;
   }

   public void setToplamFiyat(BigDecimal toplamFiyat) {
      this.toplamFiyat = toplamFiyat;
   }

   @Override
   public String toString() {
      return "Sepet {" +
              "urunList=" + urunList +
              ", toplamFiyat=" + toplamFiyat +
              '}';
   }
}
