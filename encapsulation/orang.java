class orang {
    private String nama;
    private int umur;

    public orang(String Nama, int Umur){
        nama = Nama;
        umur = Umur;
    }

    public String setNama(String Nama){
        return this.nama = Nama;
    }

    public String getNama(){
         return this.nama;
    }

    public int setUmur(int Umur){
        return this.umur = Umur;
    }

    public int getUmur(){
         return this.umur;
    }
}

