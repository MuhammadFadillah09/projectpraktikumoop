/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author acerN
 */
public class GAJI {
  int Gapok;
  int T_hadir;
 int J_Lembur;
 int Gatot;
  
  public GAJI(){
Gapok = 3200000;
T_hadir = 15000;
J_Lembur = 40000;
}

  int hitgaji(){
      Gatot = Gapok;
      return Gatot;
  }
  
  int hitgaji(int jmlHadir){
      Gatot = Gapok + (jmlHadir + T_hadir);
      return Gatot;
  }
  
    int hitgaji(int jmlHadir, int jmlLembur){
      Gatot = Gapok + (jmlHadir * T_hadir) + (jmlLembur * J_Lembur);
      return Gatot;
  }
}

