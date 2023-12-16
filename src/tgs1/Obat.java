package tgs1;

import javax.swing.table.DefaultTableModel;

public class Obat extends informasi implements InfoDisplay {
    private String NamaObat;
    private String Jumlah;
    private String Dosis;

    // Constructors
    public Obat(String NamaObat, String Jumlah, String Dosis) {
        this.NamaObat = NamaObat;
        this.Jumlah = Jumlah;
        this.Dosis = Dosis;
    }

    public Obat() {
        // You can initialize default values if needed
    }

    // Getter and Setter methods
    
    public void setNamaObat(String namaObat) {
        this.NamaObat = namaObat;
    }

    public void setJumlah(String jumlah) {
        this.Jumlah = jumlah;
    }

    public void setDosis(String dosis) {
        this.Dosis = dosis;
    }

    public String getNamaObat() {
        return NamaObat;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public String getDosis() {
        return Dosis;
    }
    
     @Override
    public void tampilkanInfo() {
    }

    // Display information method
   @Override
    public void displayInfo() {
        System.out.println("Nama Obat: " + NamaObat);
        System.out.println("Jumlah: " + Jumlah);
        System.out.println("Dosis: " + Dosis);
    }

    // Process data for a table method
    public void processData(DefaultTableModel tableModel) {
        Object[] rowData = {getNamaObat(), getJumlah(), getDosis()};
        tableModel.addRow(rowData);
    }

    // Generate information method
    public String generateInfo() {
    return "Nama Obat: " + NamaObat + "\n" +
           "Jumlah: " + Jumlah + "\n" +
           "Dosis: " + Dosis + "\n";
}


}
